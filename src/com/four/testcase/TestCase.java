package com.four.testcase;

import org.testng.annotations.Test;
import com.three.business.AppHuozhuLogin;
import com.three.business.HuoZhuFaHuo;
import com.three.business.XiaoerJieDan;
import com.three.business.XiaoerLogin;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCase {
  
  //声明及变量定义
  AppHuozhuLogin huoZhu=new AppHuozhuLogin();
  AndroidDriver appDriver;
  WebDriver webDriver;
  HuoZhuFaHuo huoZhuFaHuo=new HuoZhuFaHuo();
  XiaoerLogin xiaoerLogin=new XiaoerLogin();
  XiaoerJieDan jiedan=new XiaoerJieDan();
  String propFile="F:\\Users\\Administrator\\"
		+ "workspace\\PracticeAppAndWebAutomation170920\\src\\element.properties";
  
  @BeforeClass
  public void beforeClass() { 
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

  @Test(priority=0)
  public void huoZhuAppExceution(){
	  //登陆货主app
	  WebDriverWait wait=new WebDriverWait(appDriver,10,2000);
	  huoZhu.huozhuLogin(appDriver, propFile,wait);
	  //货主发货
	  huoZhuFaHuo.huoZhuFaHuo(appDriver,propFile, "石灰石", "1",wait);

  }
  @Test(priority=1)
  public void xaioErExceution(){
	  //登陆小二
	  System.setProperty("webdriver.chrome.driver", "D:/selenium/selenium_chrome/chromedriver.exe");
	  webDriver=new ChromeDriver();
	  WebDriverWait wait=new WebDriverWait(webDriver,10);
	  Actions actions=new Actions(webDriver);
	  xiaoerLogin.xiaoErLogin(webDriver,propFile,wait);
	  //小二接单
	  jiedan.xiaoerJieDan(webDriver, propFile, wait,actions);
	  
  
  }
  
  

  @AfterClass()
  public void afterClass() {
	  appDriver.quit();
	  webDriver.quit();
  }

}
