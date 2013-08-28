package com.taobao.recycle.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author 南江
 */
public class RecycleOptions implements Serializable {

	private static final long serialVersionUID = -7113956852004829193L;
	/** 时间戳 */
	private long timestamp;
	/** 选项id */
	private String optionId;
	/** 叶子类目id */
	private long categoryId;
	/** 叶子类目名称 */
	private String categoryName;
	/** spuId */
	private long spuId;
	/** spu 名称 */
	private String spuName;
	/** 选项详细 */
	private List<RecycleOptionDetail> optionDetail;

	/**
	 * @return 时间戳
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * 时间戳
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return 选项id
	 */
	public String getOptionId() {
		return optionId;
	}

	/**
	 * 选项id
	 * 
	 * @param optionId
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return 叶子类目id
	 */
	public long getCategoryId() {
		return categoryId;
	}

	/**
	 * 叶子类目id
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return 叶子类目名称
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * 叶子类目名称
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
	 * @return spu名称
	 */
	public String getSpuName() {
		return spuName;
	}

	/**
	 * spu名称
	 * 
	 * @param spuName
	 */
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	/**
	 * @return 选项详细
	 */
	public List<RecycleOptionDetail> getOptionDetail() {
		return optionDetail;
	}

	/**
	 * 选项详细
	 * 
	 * @param optionDetail
	 */
	public void setOptionDetail(List<RecycleOptionDetail> optionDetail) {
		this.optionDetail = optionDetail;
	}
}
