package com.three.business;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.two.operation.ElementOperation;

import io.appium.java_client.android.AndroidDriver;

public class HuoZhuFaHuo {
	ElementOperation appOperation=new ElementOperation();
	public void huoZhuFaHuo(AndroidDriver appDriver,String propFile,String goods,String amount,WebDriverWait wait){
		//读取配置文件
		appOperation.readProperties(propFile);
		//点击新增发货按钮
		appOperation.setHuoZhuFaHuo(appDriver,wait);
		//货主app新增发货选择发货方
		appOperation.setHuoZhuSender(appDriver,wait);
		//货主app新增发货选择发货方的发货人
		appOperation.setHuoZhuSenderCustomer(appDriver,wait);
		//货主app新增收货选择收货方
		appOperation.setHuoZhuReceiver(appDriver,wait);
		//货主app新增发货选择收货方的收货人
		appOperation.setHuoZhuReceiverCustomer(appDriver,wait);
		//货主app新增发货填写货品名称
		appOperation.setHuoZhuGoodsName(appDriver, goods,wait);
		//货主app新增发货填写运量，吨单位
		appOperation.setHuoZhuGoodsAmount(appDriver, amount,wait);
		//货主app新增发货选择结算方式
		appOperation.setHuoZhuSettlement(appDriver,wait);
		//货主app新增发货选择余额发货
		appOperation.setHuoZhuBalanceWays(appDriver,wait);
		//货主app新增发货选择发布时间
		//appOperation.setHuoZhuDeliveryTime(appDriver,wait);
		//货主app新增发货发布时间选择当前
		//appOperation.setHuoZhuTime(appDriver,wait);
		//货主app点击发货按钮
		appOperation.setHuoZhuReleaseGoods(appDriver,wait);
		System.out.println("货主发货成功");
	}

}
