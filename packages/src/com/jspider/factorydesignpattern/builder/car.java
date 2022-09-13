package com.jspider.factorydesignpattern.builder;

public class car {
	String name;
	String color;
	String price;
	float mileage;
	String fuel;
	String type;
	
	public car(String name,String color,String price,float mileage,String fuel,String type)
	
	{
		super();
		this.name=name;
		this.color=color;
		this.price=price;
		this.mileage=mileage;
		this.fuel=fuel;
		this.type=type;
	}
		
		public String toString() {
			return "car(name="+name+",color="+color+",price="+price+",mileage="+mileage+",fuel="+fuel+",type="+type+");
		
		
	}
	

}
