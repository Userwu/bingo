package com.zido.bingo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zido.bingo.common.exception.ServiceException;
import com.zido.bingo.entity.Account;
import com.zido.bingo.mapper.AccountMapper;
import com.zido.bingo.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 账户 服务实现类
 * </p>
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>
 * @since 2017-02-16
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Resource
    private AccountMapper accountMapper;

    private static final Object lock = new Object();

    @Override
    @Transactional(rollbackForClassName = {"ServiceException"}, isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void increaseMoney(long id, int money/* money = 100*/) throws ServiceException {
        synchronized (lock){
            final long l = System.currentTimeMillis();
            System.out.printf("\n\n\n\ntime=%s开始\n", l);
            final Account account = accountMapper.selectById(id);
            //金钱增加100
            account.setMoney(account.getMoney() + money);
            accountMapper.updateById(account);
            System.out.printf("time=%s结束\n\n\n\n", l);
        }
    }

    @Override
    public void decreaseMoney(long id, int money) {
        final Account account = accountMapper.selectById(id);
        account.setMoney(account.getMoney() - money);
        accountMapper.updateById(account);
    }

    @Override
    @Transactional
    public void addAccount(Account account) {
        accountMapper.insert(account);
        accountMapper.insert(account);
    }
}
