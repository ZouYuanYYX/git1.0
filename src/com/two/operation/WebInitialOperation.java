package com.two.operation;

import org.openqa.selenium.WebDriver;

import com.one.object.library.WebInitial;

public class WebInitialOperation {
	WebInitial webInitial=new WebInitial();
	public void webInitialOperation(String browser){
		if(browser.toLowerCase().equals("chrome")){
			webInitial.webChromeBrowser();
		}
		else if(browser.toLowerCase().equals("ie")){
			webInitial.webIEBrowser();
		}
		else if(browser.toUpperCase().equals("firefox")){
			webInitial.webFireFoxBrowser();
		}
		else
			System.out.println("打开web浏览器失败");
	}

}
