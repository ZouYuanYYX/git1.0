package com.one.object.library;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppInitial {
	/*
	 * 两个app在一个设备上操作会不稳定，所以建议使用多个设备来实现一个app下单，一个app接单
	 */
	public void androidHuoZhuInitial(AndroidDriver appDriver){
		//设置apk路径
		  File classpathRoot=new File(System.getProperty("user.dir"));
		  File appDir=new File(classpathRoot,"apps");
		  File app=new File(appDir,"huoYunZhan-release.apk");
		  //设置自动化相关参数
		  DesiredCapabilities capa=new DesiredCapabilities();
		  capa.setCapability(CapabilityType.BROWSER_NAME, "");
		  capa.setCapability("platformName", "Android");
		  capa.setCapability("deviceName","127.0.0.1:62001");
		  //设置安卓系统版本
		  capa.setCapability("platformVersion", "4.4.2");
		  //使用的平台
		  capa.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		  //设置apk路径
		  capa.setCapability("app", app.getAbsolutePath());
		  capa.setCapability("unicodeKeyboard", "True");  
	      capa.setCapability("resetKeyboard", "True");  
		  //初始化
		  try{
		      appDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa); 
		      System.out.println("app is launched");
			  Thread.sleep(3000);
		  }catch(Exception e){
			  e.printStackTrace();
		  }	
	}
	
	public void androidCheZhuInitial(AndroidDriver appDriver){
		//设置apk路径
		  File classpathRoot=new File(System.getProperty("user.dir"));
		  File appDir=new File(classpathRoot,"apps");
		  File app=new File(appDir,"wuliudidi-2.3.1.apk");
		  //设置自动化相关参数
		  DesiredCapabilities capa2=new DesiredCapabilities();
		  capa2.setCapability(CapabilityType.BROWSER_NAME, "");
		  capa2.setCapability("platformName", "Android");
		  capa2.setCapability("deviceName","127.0.0.1:62001");
		  //设置安卓系统版本
		  capa2.setCapability("platformVersion", "4.4.2");
		  //使用的平台
		  capa2.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		  //设置apk路径
		  capa2.setCapability("app", app.getAbsolutePath());
		  capa2.setCapability("unicodeKeyboard", "True");  
	      capa2.setCapability("resetKeyboard", "True");  
		  //初始化
	      try{
	          appDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa2); 
		      System.out.println("app is launched");
			  Thread.sleep(3000);
		  }catch(Exception e){
			  e.printStackTrace();
		  }	
	}

}
