package com.taobao.recycle;


/**
 * @author 南江
 */
public class Verification {

	public static boolean verify(String signature,String ... args){
		String _signature =  Crypto.SHA1(args);
		return _signature!=null && _signature.equals(signature);
	}

	/**
	 * 1. 将token、timestamp、recycle_num三个参数进行字典序排序 <br>
	 * 2. 将三个参数字符串拼接成一个字符串进行sha1加密
	 * @param token
	 * @param timestamp
	 * @param recycleNum
	 * @return
	 */
	public static String signature(String token,String timestamp,String recycleNum){
		return Crypto.SHA1(token,timestamp,recycleNum);
	}
	
}
