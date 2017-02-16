package com.zido.bingo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 文章表
 * </p>
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>
 * @since 2017-02-16
 */
@TableName("bingo_article")
public class Article extends Model<Article> {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
	private Long id;
	private String articleTitle;
	private Integer viewNum;


	public Long getId() {
		return id;
	}

	public Article setId(Long id) {
		this.id = id;
		return this;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public Article setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
		return this;
	}

	public Integer getViewNum() {
		return viewNum;
	}

	public Article setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
