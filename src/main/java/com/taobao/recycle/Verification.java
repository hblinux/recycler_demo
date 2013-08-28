package com.taobao.recycle;


/**
 * @author �Ͻ�
 */
public class Verification {

	public static boolean verify(String signature,String ... args){
		String _signature =  Crypto.SHA1(args);
		return _signature!=null && _signature.equals(signature);
	}

	/**
	 * 1. ��token��timestamp��recycle_num�������������ֵ������� <br>
	 * 2. �����������ַ���ƴ�ӳ�һ���ַ�������sha1����
	 * @param token
	 * @param timestamp
	 * @param recycleNum
	 * @return
	 */
	public static String signature(String token,String timestamp,String recycleNum){
		return Crypto.SHA1(token,timestamp,recycleNum);
	}
	
}
