package com.taobao.recycle.domain;

import java.io.Serializable;

/**
 * @author �Ͻ�
 */
public class RecycleOptionDetail implements Serializable{

	private static final long serialVersionUID = -170852805057765708L;
	/**
	 * ѡ��id
	 */
	private long propertyId;
	/**
	 * ѡ������
	 */
	private String propertyName;
	/**
	 * ѡ��ֵid
	 */
	private long valueId;
	/**
	 * ѡ��ֵ����
	 */
	private String valueName;
	/**
	 * @return ѡ��id
	 */
	public long getPropertyId() {
		return propertyId;
	}
	/**
	 * ѡ��id
	 * @param propertyId 
	 */
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return ѡ������
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * ѡ������
	 * @param propertyName 
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * @return ѡ��ֵid
	 */
	public long getValueId() {
		return valueId;
	}
	/**
	 * ѡ��ֵid
	 * @param valueId 
	 */
	public void setValueId(long valueId) {
		this.valueId = valueId;
	}
	/**
	 * @return ѡ��ֵ����
	 */
	public String getValueName() {
		return valueName;
	}
	/**
	 * ѡ��ֵ����
	 * @param valueName 
	 */
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
}
