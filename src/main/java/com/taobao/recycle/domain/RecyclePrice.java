package com.taobao.recycle.domain;

import java.io.Serializable;

/**
 * @author 南江
 */
public class RecyclePrice implements Serializable{

	private static final long serialVersionUID = -743505920684774085L;
	/**
	 * 用于标识对应商品是否支持回收。code：1，表示支持回收；code：2，表示不支持回收
	 */
	private int code;
	/**
	 * 回收价格
	 */
	private long price;
	/**
	 * @return 用于标识对应商品是否支持回收。code：1，表示支持回收；用于标识对应商品是否支持回收。code：1，表示支持回收；code：2，表示不支持回收：2，表示不支持回收
	 */
	public int getCode() {
		return code;
	}
	/**
	 * 用于标识对应商品是否支持回收。code：1，表示支持回收；code：2，表示不支持回收
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return 回收价格
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * 回收价格
	 * @param price 
	 */
	public void setPrice(long price) {
		this.price = price;
	}
}
