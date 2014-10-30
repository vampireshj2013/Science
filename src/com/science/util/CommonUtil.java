package com.science.util;
/**
 * 工具类
 * @author WHJ
 *
 */
public class CommonUtil {
	public static boolean NotBlank(String str){
		if(str==null||str.equals("")){
			return false;
		}else{
			return true;
		}
	}

}
