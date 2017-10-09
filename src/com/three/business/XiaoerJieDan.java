package com.three.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.two.operation.ElementOperation;

public class XiaoerJieDan {
	ElementOperation xaioerJieDan=new ElementOperation();
	public void xiaoerJieDan(WebDriver webDriver,String propFile,WebDriverWait wait,Actions actions){
		//读取配置文件
		xaioerJieDan.readProperties(propFile);
		//点击工单管理
		xaioerJieDan.setXiaoerGongDanGuanli(webDriver, wait);
		//点击工单工作台
		xaioerJieDan.setXiaoerGongDanGongZuoTai(webDriver,actions);
		//切换iframe
		//webDriver.switchTo().frame("tabs_iframe");
		//选择一条记录，点击接单按钮
		
		
		
	}

}
