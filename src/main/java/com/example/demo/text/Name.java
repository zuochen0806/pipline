package com.example.demo.text;

public class Name {
	private int age;
	private String name;
	private int testint;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestint() {
		return testint;
	}
	public void setTestint(int testint) {
		this.testint = testint;
	}
	public Name(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("hello" + name + "i am" + age);
    }
 
    private Name(String name) {
        this.name = name;
        System.out.println("My Name is" +
                name);
    }
    
    public Name() {
    }
    
    private void welcome(String tips){
        System.out.println(tips);
    }
}
