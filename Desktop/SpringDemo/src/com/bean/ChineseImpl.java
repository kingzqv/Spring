package com.bean;

public class ChineseImpl implements IPerson {
	private String name;
	private int age;
	
	@Override
	public void Say() {
		// TODO Auto-generated method stub
		System.out.println("中国人，姓名： "+this.name+"，年龄："+this.age);
	}

	public String getName()	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge()	{
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
