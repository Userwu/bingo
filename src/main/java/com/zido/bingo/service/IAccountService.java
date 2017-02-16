package com.zido.bingo.service;

import com.zido.bingo.common.exception.ServiceException;
import com.zido.bingo.entity.Account;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 账户 服务类
 * </p>
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>
 * @since 2017-02-16
 */
public interface IAccountService extends IService<Account> {
    public void increaseMoney(long id,int money) throws ServiceException;
    public void decreaseMoney(long id,int money);
    public void addAccount(Account account);
}
