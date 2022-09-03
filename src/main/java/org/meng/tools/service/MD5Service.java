package org.meng.tools.service;

import org.meng.tools.utils.MD5Util;

/**
 * @Description: MD5Service
 * @create by meng on 17:10 2022/9/2
 */
public class MD5Service {
	public String getMD5(String input) {
		return MD5Util.getMD5(input.getBytes());
	}
}
