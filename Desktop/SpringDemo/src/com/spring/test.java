package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.IPerson;;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��getBean(ʵ����)������ȡChineseImplʵ��������
		IPerson person = (IPerson) context.getBean("chinese");
		//����ChineseImplʵ���ķ���
		person.Say();
		
		//��ȡAmericanImplʵ��������
		person = (IPerson) context.getBean("american");
		//����AmericanImplʵ���ķ���
		person.Say();
		
		//�ر���Դ
		((AbstractApplicationContext) context).close();
		
	}

}
