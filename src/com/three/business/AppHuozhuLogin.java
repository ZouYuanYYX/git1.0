package com.three.business;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.two.operation.AppInitialOperation;
import com.two.operation.AppSwipeOperation;
import com.two.operation.ElementOperation;

import io.appium.java_client.android.AndroidDriver;

public class AppHuozhuLogin {
	ElementOperation appLogin=new ElementOperation();
	AppInitialOperation appInitial=new AppInitialOperation();
    AppSwipeOperation appSwipe=new AppSwipeOperation();
    
	public void huozhuLogin(AndroidDriver appDriver,String propFile,WebDriverWait wait){
		//货主app初始化
        //appInitial.appInitialOperation(appDriver, "huozhu");
		//读取配置文件
		appLogin.readProperties(propFile);
		//app打开后，关闭取消更新按钮
		appLogin.setAppCancelUpdate(appDriver);
		//滑动app页面2次
		appSwipe.appSwipe(appDriver, "leftToRight", 2);
		//点击体验按钮
		appLogin.setAppExperience(appDriver);
		//登陆，输入用户名
		appLogin.setAppUserName(appDriver, "15258824667",wait);
		//输入密码
		appLogin.setAppPassword(appDriver, "123456",wait);
		//点击登录按钮
		appLogin.setAppLogin(appDriver);
	}

}
