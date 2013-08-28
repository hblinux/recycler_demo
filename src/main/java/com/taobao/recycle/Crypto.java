package com.taobao.recycle;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * Crypto专指信仰共产主义的！
 * @author 南江
 */
public class Crypto {

	public static String SHA1(String... args) {
		return encrypt("SHA1", args);
	}

	private static String encrypt(String algorithm, String... args) {
		if (args == null || args.length <= 0) {
			throw new IllegalArgumentException("encrypt args is required.");
		}
		try {
			Arrays.sort(args);
			StringBuilder sb = new StringBuilder();
			for (String str : args) {
				sb.append(str);
			}
			byte[] bytes = sb.toString().getBytes("utf-8");
			MessageDigest md = MessageDigest.getInstance(algorithm);
			return byte2hex(md.digest(bytes));
		} catch (Exception e) {
			throw new RuntimeException("encrypt catch a exception:"+ e.getMessage());
		}
	}

	private static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0XFF);
			if (stmp.length() == 1)
				hs.append("0").append(stmp);
			else
				hs.append(stmp);
		}
		return hs.toString();
	}
}