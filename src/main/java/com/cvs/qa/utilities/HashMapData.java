package com.cvs.qa.utilities;

import java.util.HashMap;

import com.cvs.qa.testbase.TestBase;

public class HashMapData extends TestBase{
	
	public static HashMap<String, String> getUserLoginInfo(){
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("correctUserName", "shuwaibliaquat@hotmail.com_hhb12345");
		userMap.put("wrongUserName", "ABDURRAHMAN@GMAIL.COM_WrongPwd");
		
		return userMap;
		
	}
}
