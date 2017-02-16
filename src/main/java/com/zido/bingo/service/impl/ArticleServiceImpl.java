package com.zido.bingo.service.impl;

import com.zido.bingo.entity.Article;
import com.zido.bingo.mapper.ArticleMapper;
import com.zido.bingo.service.IArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>
 * @since 2017-02-16
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {
	
}
