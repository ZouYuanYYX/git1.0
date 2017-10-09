package com.two.operation;

import com.one.object.library.AppInitial;

import io.appium.java_client.android.AndroidDriver;

public class AppInitialOperation {
	AppInitial appInitial=new AppInitial();
	public void appInitialOperation(AndroidDriver appDriver,String appCategory){
		//货主app初始化
		if(appCategory.toLowerCase().equals("huozhu")){
			appInitial.androidHuoZhuInitial(appDriver);
		}
		else if(appCategory.toLowerCase().equals("chezhu")){
			appInitial.androidCheZhuInitial(appDriver);
		}
		else
			System.out.println("app启动失败");
		
	}

}
