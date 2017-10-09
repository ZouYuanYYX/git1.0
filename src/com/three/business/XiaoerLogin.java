package com.three.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.two.operation.ElementOperation;
import com.two.operation.WebInitialOperation;

public class XiaoerLogin {
	WebInitialOperation webInitial=new WebInitialOperation();
	ElementOperation xiaoerLogin=new ElementOperation();
	public void xiaoErLogin(WebDriver webDriver,String propFile,WebDriverWait wait){
		//webInitial.webInitialOperation("chrome");
		String url="http://crm.redlion56.com/";
		webDriver.get(url);
		webDriver.manage().window().maximize();
		//读取配置文件
		xiaoerLogin.readProperties(propFile);
		//输入用户名
		xiaoerLogin.setXiaoerUserName(webDriver, "zouyuan@qq.com", wait);
		//输入密码
		xiaoerLogin.setXiaoerPassword(webDriver, "zy5201", wait);
		//点击登录按钮
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		xiaoerLogin.setXiaoerLogin(webDriver,wait);			
	}

}
