package com.jspider.factorydesignpattern.builder;

public class cartinfo {
		car car1=new carbuilder().name("tata").color("blue").price("10lakhs").mileage(15.5).fuel("petrol").type("suv").build();
		System.out.println(car);
	}

}
