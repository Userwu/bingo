package com.zido.bingo.common.config.datasource;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid监控页面处理servlet.
 * Date: 2017/2/16 0016
 * Time: 23:22
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name="allow",value="192.168.16.110,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
        @WebInitParam(name="deny",value="192.168.16.111"),// IP黑名单 (存在共同时，deny优先于allow)
        @WebInitParam(name="loginUsername",value="shanhy"),// 用户名
        @WebInitParam(name="loginPassword",value="shanhypwd"),// 密码
        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidView extends StatViewServlet {
}
