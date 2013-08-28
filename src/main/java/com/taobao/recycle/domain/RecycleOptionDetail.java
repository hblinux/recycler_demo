package com.taobao.recycle.domain;

import java.io.Serializable;

/**
 * @author 南江
 */
public class RecycleOptionDetail implements Serializable{

	private static final long serialVersionUID = -170852805057765708L;
	/**
	 * 选项id
	 */
	private long propertyId;
	/**
	 * 选项名称
	 */
	private String propertyName;
	/**
	 * 选项值id
	 */
	private long valueId;
	/**
	 * 选项值名称
	 */
	private String valueName;
	/**
	 * @return 选项id
	 */
	public long getPropertyId() {
		return propertyId;
	}
	/**
	 * 选项id
	 * @param propertyId 
	 */
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return 选项名称
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * 选项名称
	 * @param propertyName 
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * @return 选项值id
	 */
	public long getValueId() {
		return valueId;
	}
	/**
	 * 选项值id
	 * @param valueId 
	 */
	public void setValueId(long valueId) {
		this.valueId = valueId;
	}
	/**
	 * @return 选项值名称
	 */
	public String getValueName() {
		return valueName;
	}
	/**
	 * 选项值名称
	 * @param valueName 
	 */
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
}
