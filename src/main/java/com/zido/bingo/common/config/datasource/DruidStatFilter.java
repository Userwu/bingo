package com.zido.bingo.common.config.datasource;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid监控拦截器.
 * Date: 2017/2/16 0016
 * Time: 23:23
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
    initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略
    }
)
public class DruidStatFilter extends WebStatFilter {
}
