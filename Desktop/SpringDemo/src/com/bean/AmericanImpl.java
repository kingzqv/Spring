package com.bean;

public class AmericanImpl implements IPerson {
	private String name;
	private int age;
	
	@Override
	public void Say() {
		// TODO Auto-generated method stub
		System.out.println("American,Name is "+this.name+","+this.age+" years old");
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
