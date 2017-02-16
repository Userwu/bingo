package com.zido.bingo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 账户
 * </p>
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>
 * @since 2017-02-16
 */
@TableName("bingo_account")
public class Account extends Model<Account> {

    private static final long serialVersionUID = 1L;

    /**
     * 账户id
     */
	private Long id;
    /**
     * 账户余额
     */
	private Integer money;


	public Long getId() {
		return id;
	}

	public Account setId(Long id) {
		this.id = id;
		return this;
	}

	public Integer getMoney() {
		return money;
	}

	public Account setMoney(Integer money) {
		this.money = money;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
