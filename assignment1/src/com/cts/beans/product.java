package com.cts.beans;

public class product {
	int code;
	String name;
	double price;


public void Setproduct(int c,String n,double p)
{
	this.code=c;
	this.name=n;
	this.price=p;
	
}
public void display()
{
	System.out.println("Product code="+code);
	System.out.println("Product name="+name);
	System.out.println("Product price="+price);
	
}
}