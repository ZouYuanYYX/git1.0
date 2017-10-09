package com.one.object.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;

public class ElementLocation {
	Properties properties=new Properties();
	public void elementProperties(String propFile){
	//读取配置文件中定位元素的表达式
	try{
		FileInputStream in=new FileInputStream(propFile);
		properties.load(in);
		in.close();
		System.out.println("配置文件读取成功");
//		查找key
//		Iterator<String> it=properties.stringPropertyNames().iterator();
//		while(it.hasNext()){
//		    String key=it.next();
//		    System.out.println(key+":"+properties.getProperty(key));
		//}
	}catch(IOException e){
		e.printStackTrace();
	}	
   }
	public By expressionWays(String key){

		//返回表达式
		String value=properties.getProperty(key);
		String type=value.split(",")[0];
		String strValue=value.split(",")[1];

		try{
			//转换编码
			String expression=new String(strValue.getBytes("ISO-8859-1"),"UTF-8");
			System.out.println("type为："+type+"表达式为："+expression);
			if(type.toLowerCase().equals("id")){
				return By.id(expression);
			}
			else if(type.toLowerCase().equals("xpath")){
				return By.xpath(expression);
			}
			else if(type.toLowerCase().equals("class")){
				return By.className(expression);
			}
			else if(type.toLowerCase().equals("name")){
				return By.name(expression);
			}
			else if(type.toLowerCase().equals("css")){
				return By.cssSelector(expression);
			}
			else{
				return By.tagName(expression);

			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}
