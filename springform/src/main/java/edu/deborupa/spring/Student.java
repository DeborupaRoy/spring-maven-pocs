package edu.deborupa.spring;

public class Student {
private int age;
private String name;
private int id;

public void setname(String name) {
	this.name =name;
}

public void setid(int id) {
	this.id =id;
}

public void setage(int age) {
	this.age =age;
}

public String getname()
{
	return name;
}

public int getid()
{
	return id;
}

public int getage()
{
	return age;
}
}
