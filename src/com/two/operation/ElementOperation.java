package com.two.operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.one.object.library.ElementLocation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ElementOperation {
	ElementLocation locator=new ElementLocation();
	//读取配置文件
	public void readProperties(String propFile){
		locator.elementProperties(propFile);
	}
	//app取消更新按钮
	public void setAppCancelUpdate(AndroidDriver appDriver){
		appDriver.findElement(locator.expressionWays("cancel")).click();
	}
	//app引导页体验按钮
	public void setAppExperience(AndroidDriver appDriver){
		appDriver.findElement(locator.expressionWays("experience")).click();
	}
	//app登陆的用户名
	//显示等待是否可以从页面获取文字输入框对象，如果可以获取，则执行后续测试逻辑
	public void setAppUserName(AndroidDriver appDriver,String userName,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("appUserName"));
           }
		}).sendKeys(userName);
	}
	//app登陆的密码
	public void setAppPassword(AndroidDriver appDriver,String password,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("appPassword"));
           }
		}).sendKeys(password);
	}
	//app登陆的登陆按钮
	public void setAppLogin(AndroidDriver appDriver){
		appDriver.findElement(locator.expressionWays("appLogin")).click();
		System.out.println("app登陆成功");
	}
	//货主app点击新增发货按钮
	public void setHuoZhuFaHuo(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("sendGoods"));
           }
		}).click();
	}
	//货主app新增发货选择发货方
	public void setHuoZhuSender(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("sender"));
           }
		}).click();
	}
	//货主app新增发货选择发货方的发货人
	public void setHuoZhuSenderCustomer(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("sendCustomer"));
           }
		}).click();
	}
	//货主app新增收货选择收货方
	public void setHuoZhuReceiver(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("receiver"));
           }
		}).click();
	}
	//货主app新增发货选择收货方的收货人
	public void setHuoZhuReceiverCustomer(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("recevieCustomer"));
           }
		}).click();
	}
	//货主app新增发货填写货品名称
	public void setHuoZhuGoodsName(AndroidDriver appDriver,String goods,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("goodsName"));
           }
		}).sendKeys(goods);
	}
	//货主app新增发货填写运量，吨单位
	public void setHuoZhuGoodsAmount(AndroidDriver appDriver,String amount,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("goodsAmount"));
           }
		}).sendKeys(amount);
	}
	//货主app新增发货选择结算方式
	public void setHuoZhuSettlement(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("settlementWays"));
           }
		}).click();
	}
	//货主app新增发货选择余额发货
	public void setHuoZhuBalanceWays(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("balanceWays"));
           }
		}).click();
	}
	//货主app新增发货选择发布时间
	public void setHuoZhuDeliveryTime(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("deliveryTime"));
           }
		}).click();
	}
	//货主app新增发货发布时间选择当前
	public void setHuoZhuTime(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("time"));
           }
		}).click();
	}
	//货主app点击发货按钮
	public void setHuoZhuReleaseGoods(AndroidDriver appDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return appDriver.findElement(locator.expressionWays("release"));
           }
		}).click();
	}
	
	
	//小二相关参数
	//小二登陆的用户名
	public void setXiaoerUserName(WebDriver webDriver,String userName,WebDriverWait wait){
		//WebDriverWait wait = new WebDriverWait(appDriver, 10, 2000);
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return webDriver.findElement(locator.expressionWays("xiaoerUserName"));
           }
		}).sendKeys(userName);
	}
	//小二登陆的密码
	public void setXiaoerPassword(WebDriver webDriver,String password,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return webDriver.findElement(locator.expressionWays("xiaoerPassword"));
           }
		}).sendKeys(password);
	}
	//小二登陆的登陆按钮
	public void setXiaoerLogin(WebDriver webDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return webDriver.findElement(locator.expressionWays("xiaoerLogin"));
           }
		}).click();
		System.out.println("小二登陆成功");
	}
	//小二接单
	//点击工单管理
	public void setXiaoerGongDanGuanli(WebDriver webDriver,WebDriverWait wait){
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				    return webDriver.findElement(locator.expressionWays("menu"));
           }
		}).click();
	}
	public void setXiaoerGongDanGongZuoTai(WebDriver webDriver,Actions actions){
		actions.moveToElement(webDriver.findElement(locator.expressionWays("submenu"))).build().perform();
		//鼠标移动到工单工作台上后再做click操作
		webDriver.findElement(locator.expressionWays("submenu")).click();
	}
	
//	public void setXiaoerGongDanGongZuoTai(WebDriver webDriver,WebDriverWait wait){
//		WebElement a=webDriver.findElement(locator.expressionWays("submenu"));
//		wait.until(ExpectedConditions.elementToBeClickable(a)).click();
//	}
	
	//点击工单工作台
//	public void setXiaoerGongDanGongZuoTai(WebDriver webDriver,WebDriverWait wait){
//		wait.until(new ExpectedCondition<WebElement>() {
//			@Override
//			public WebElement apply(WebDriver arg0) {
//				    return webDriver.findElement(locator.expressionWays("gongdangongzuotai"));
//           }
//		}).click();
//	}
	//选择一条记录，点击接单按钮
//	public void setXiaoerJiedan(WebDriver webDriver,WebDriverWait wait){
//		WebElement jiedan=webDriver.findElements();
//		
//	}
	
	
	
	
	

	
	
	

}
