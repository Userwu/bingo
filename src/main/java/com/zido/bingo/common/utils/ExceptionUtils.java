package com.zido.bingo.common.utils;

import com.zido.bingo.common.exception.ServiceException;

/**
 * bingo.
 * Date: 2017/2/16 0016
 * Time: 15:00
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
public class ExceptionUtils {
    /**
     * 封装异常方法，保证异常链
     * @param msg 错误信息
     * @param e 原始异常
     * @return 服务异常
     */
    public static ServiceException createServiceException(String msg,Exception e){
        final ServiceException serviceException = new ServiceException(msg);
        serviceException.initCause(e);
        return serviceException;
    }
    /**
     * 封装异常方法，保证异常链
     * @param msg 错误信息
     * @return 服务异常
     */
    public static ServiceException createServiceException(String msg){
        return createServiceException(msg,null);
    }
}
