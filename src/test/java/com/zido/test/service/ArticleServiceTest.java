package com.zido.test.service;

import com.zido.bingo.common.exception.ServiceException;
import com.zido.bingo.service.IAccountService;
import com.zido.test.base.BaseServiceTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * bingo.
 * Date: 2017/2/16 0016
 * Time: 12:42
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
public class ArticleServiceTest extends BaseServiceTest{
    @Resource
    private IAccountService accountService;

    @Test
    public void testInsertArticle(){
        for(int i = 0; i < 5; i++){
            new Thread(() -> {
                try {
                    accountService.increaseMoney(1,100);
                } catch (ServiceException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
