package com.taobao.recycle.domain;

import java.io.Serializable;

/**
 * @author �Ͻ�
 */
public class RecyclePrice implements Serializable{

	private static final long serialVersionUID = -743505920684774085L;
	/**
	 * ���ڱ�ʶ��Ӧ��Ʒ�Ƿ�֧�ֻ��ա�code��1����ʾ֧�ֻ��գ�code��2����ʾ��֧�ֻ���
	 */
	private int code;
	/**
	 * ���ռ۸�
	 */
	private long price;
	/**
	 * @return ���ڱ�ʶ��Ӧ��Ʒ�Ƿ�֧�ֻ��ա�code��1����ʾ֧�ֻ��գ����ڱ�ʶ��Ӧ��Ʒ�Ƿ�֧�ֻ��ա�code��1����ʾ֧�ֻ��գ�code��2����ʾ��֧�ֻ��գ�2����ʾ��֧�ֻ���
	 */
	public int getCode() {
		return code;
	}
	/**
	 * ���ڱ�ʶ��Ӧ��Ʒ�Ƿ�֧�ֻ��ա�code��1����ʾ֧�ֻ��գ�code��2����ʾ��֧�ֻ���
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return ���ռ۸�
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * ���ռ۸�
	 * @param price 
	 */
	public void setPrice(long price) {
		this.price = price;
	}
}
