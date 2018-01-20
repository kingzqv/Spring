package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.IPerson;;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean(实例名)方法获取ChineseImpl实例的引用
		IPerson person = (IPerson) context.getBean("chinese");
		//调用ChineseImpl实例的方法
		person.Say();
		
		//获取AmericanImpl实例的引用
		person = (IPerson) context.getBean("american");
		//调用AmericanImpl实例的方法
		person.Say();
		
		//关闭资源
		((AbstractApplicationContext) context).close();
		
	}

}
