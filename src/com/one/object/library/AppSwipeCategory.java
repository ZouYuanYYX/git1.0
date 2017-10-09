package com.one.object.library;

import io.appium.java_client.android.AndroidDriver;

public class AppSwipeCategory {
	//从左往右滑
	public void swipeLeftToRight(AndroidDriver appDriver,int x,int y){
		appDriver.swipe(x*9/10, y/2, x/10, y/2, 500);
	}
	//从右往左滑
	public void swipeRightToLeft(AndroidDriver appDriver,int x,int y){
		appDriver.swipe(x/10, y/2, x*9/10, y/2, 500);
	}
	//从上往下滑
	public void swipeUpToDown(AndroidDriver appDriver,int x,int y){
		appDriver.swipe(x/2, y/10, x/2, y*9/10, 500);
	}
	//从下往上滑
	public void swipeDownToUp(AndroidDriver appDriver,int x,int y){
		appDriver.swipe(x/2, y*9/10, x/2, y/10, 500);
	}

}
