package com.one.object.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebInitial {
	//各种浏览器打开前要操作的东西
	//谷歌
	public void webChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:/selenium/selenium_chrome/chromedriver.exe");
		//webDriver=new ChromeDriver();
	}
	//ie
	public void webIEBrowser(){
		System.setProperty("webdriver.ie.driver", "D:/selenium/selenium_ie/IEDriverServer.exe");
		//webDriver=new InternetExplorerDriver();		
	}
	//火狐
	public void webFireFoxBrowser(){
		System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		//webDriver=new FirefoxDriver();	
	}
	

}
