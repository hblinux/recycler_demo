package com.taobao.recycle.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author �Ͻ�
 */
public class RecycleOptions implements Serializable {

	private static final long serialVersionUID = -7113956852004829193L;
	/** ʱ��� */
	private long timestamp;
	/** ѡ��id */
	private String optionId;
	/** Ҷ����Ŀid */
	private long categoryId;
	/** Ҷ����Ŀ���� */
	private String categoryName;
	/** spuId */
	private long spuId;
	/** spu ���� */
	private String spuName;
	/** ѡ����ϸ */
	private List<RecycleOptionDetail> optionDetail;

	/**
	 * @return ʱ���
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * ʱ���
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return ѡ��id
	 */
	public String getOptionId() {
		return optionId;
	}

	/**
	 * ѡ��id
	 * 
	 * @param optionId
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return Ҷ����Ŀid
	 */
	public long getCategoryId() {
		return categoryId;
	}

	/**
	 * Ҷ����Ŀid
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return Ҷ����Ŀ����
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Ҷ����Ŀ����
	 * 
	 * @param categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return spuId
	 */
	public long getSpuId() {
		return spuId;
	}

	/**
	 * spuId
	 * 
	 * @param spuId
	 */
	public void setSpuId(long spuId) {
		this.spuId = spuId;
	}

	/**
	 * @return spu����
	 */
	public String getSpuName() {
		return spuName;
	}

	/**
	 * spu����
	 * 
	 * @param spuName
	 */
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	/**
	 * @return ѡ����ϸ
	 */
	public List<RecycleOptionDetail> getOptionDetail() {
		return optionDetail;
	}

	/**
	 * ѡ����ϸ
	 * 
	 * @param optionDetail
	 */
	public void setOptionDetail(List<RecycleOptionDetail> optionDetail) {
		this.optionDetail = optionDetail;
	}
}
