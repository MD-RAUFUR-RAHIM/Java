package FinalProjectPackage;

import java.io.File;

public class Shop {

	public static void main(String[] args) {
		System.out.println("Welcome to online shopping");
		Products obj=new Products();
		obj.products();
		Customer c0=new Customer();
		c0.address();
		c0.payment();
		c0.extra();
		c0.rating();
		c0.h2();
	    
	   
		//Customer obj2=new Customer();
		//obj2.order();
		
		//Products obj2=new Products();
		//obj2.products();
		//Products obj3=new Products();
		//obj3.products();

	}

}
