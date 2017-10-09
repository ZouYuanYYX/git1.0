package com.two.operation;

import org.openqa.selenium.Dimension;

import com.one.object.library.AppSwipeCategory;

import io.appium.java_client.android.AndroidDriver;

public class AppSwipeOperation {
	AppSwipeCategory swipe=new AppSwipeCategory();
	public void appSwipe(AndroidDriver appDriver,String swipeType,int num){
		//获取屏幕分辨率
		Dimension d=appDriver.manage().window().getSize();
		//获取屏幕x轴、y轴的最大值
		int x=d.getWidth();
		int y=d.getHeight();
		//num用来定义滑动次数
		//从左往右滑
		if(swipeType.toLowerCase().equals("lefttoright")){
			for(int i=0;i<num;i++){
				swipe.swipeLeftToRight(appDriver, x, y);
			}
		}
		//从右往左滑
		else if(swipeType.toLowerCase().equals("righttoleft")){
			for(int i=0;i<num;i++){
				swipe.swipeRightToLeft(appDriver, x, y);
			}
		}
		//从上往下滑
		else if(swipeType.toLowerCase().equals("uptodown")){
			for(int i=0;i<num;i++){
				swipe.swipeUpToDown(appDriver, x, y);
			}
		}
		//从下往上滑
		else if(swipeType.toLowerCase().equals("downtoup")){
			for(int i=0;i<num;i++){
				swipe.swipeDownToUp(appDriver, x, y);
			}
		}
		else 
			System.out.println("滑动失败");
	}

}
