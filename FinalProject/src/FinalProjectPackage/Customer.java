package FinalProjectPackage;
import java.util.*;
import java.io.*;
public class Customer extends Manager {
	//private String house_name;
	//private int road_no,house_no,mobile_no;
	public int product_code;
	public void order() {
		try
		{
			System.out.println("Enter product code");
			Scanner input=new Scanner(System.in);
			product_code=input.nextInt();
			int p=product_code;
	if(	p==101|| p==102|| p==201|| p==202|| p==301|| p==302|| p==401|| p==402|| p==501|| p==502|| p==601|| p==602|| p==701|| p==702|| p==801|| p==802|| p==901|| p==902)
		{	
		switch(p){
			case 101:	
				System.out.println("Walton\tTV\t Price:40000 ");
				break;
			case 102:	
				System.out.println("Jamuna\tTV\t50000");
				break;
			case 201:	
				System.out.println("Walton\tRADIO\t4000");
				break;
			case 202:	
				System.out.println("Jamuna\tRADIO\t5000");
				break;
			case 301:	
				System.out.println("Walton\t FAN\t2500");
				break;
			case 302:	
				System.out.println("Jamuna\tFAN\t3000");
				break;
			case 401:	
				System.out.println("Richman\t10000");
				break;
			case 402:	
				System.out.println("BDGarments\t2000");
				break;
			case 501:	
				System.out.println("Yellow\t3000");
				break;
			case 502:	
				System.out.println("Creative_Garments\t2000");
				break;
			case 601:	
				System.out.println("Lotto\t3000");
				break;
			case 602:	
				System.out.println("BATA\t2000");
				break;
			case 701:	
				System.out.println("The body Shop\t5000");
				break;	
			case 702:	
				System.out.println("The Cathy Doll\t5000");
				break;	
			case 801:	
				System.out.println("Huda Beauty\t3000");
				break;	
			case 802:	
				System.out.println("NYX\t5000");
				break;	
			case 901:	
				System.out.println("Matrix\t2000");
				break;	
			case 902:	
				System.out.println("Tenso\t3000");
				break;			
		}
		}
		else {
			System.out.println("Error");
			System.out.println("Try again");
			//Products p1=new Products();
			//p1.products();
			//Customer a=new Customer();
			order();
			}
		}
		catch(Exception e)
		{
		
				System.out.println("Sorry it is an mismatch");
				
				
				System.out.println("Enter Correct Input");
				//Products p1=new Products();
				//p1.products();
				//Customer a=new Customer();
				order();}	
		}
		
	
	public void address() {
		try {
		int y;
		System.out.println("To confirm press 1\nTo see the main menu press 2");
		Scanner input=new Scanner(System.in);
		y=input.nextInt();
		if(y==1) {
			
			System.out.println("Provide House name");
			Customer obj2=new Customer();
		
			Scanner input2=new Scanner(System.in); 
			String x=input2.nextLine();
			obj2.setname(x);
			System.out.println("Provide House no");
			Customer obj3=new Customer();
			Scanner input3=new Scanner(System.in); 
			int x2=input3.nextInt();
			obj3.sethouseNo(x2);
			
			System.out.println("Provide Road No");
			Customer obj4=new Customer();
			Scanner input4=new Scanner(System.in); 
			int x3=input4.nextInt();
			obj4.setroadNo(x3);
			
			System.out.println("Provide mobile number");
			Customer obj5=new Customer();
			Scanner input5=new Scanner(System.in); 
			int x4=input5.nextInt();
			obj5.setmobile(x4);
			
		}
		else if(y==2) {
			Products b=new Products();
			b.products();
			//Customer c=new Customer();
			address();
		}
		else {
			System.out.println("Sorry input doesn't match try again");
			address();
		}
		
	}
		catch(Exception addre) {
		System.out.println("Sorry it is an mismatch \nTry again"+addre);
		//Customer c=new Customer();
		address();
		}
			
	}
	
	public void payment() {
		try {
			final int  phn=1768406413;
			final String phn2="+8801713550986";
		int u;
		System.out.println("How do you want to pay? in cash or in online??\nIf you want pay online then Press 1 \n If not then press 2");
		Scanner input6=new Scanner(System.in);
		u=input6.nextInt();
		
		if( u==1) {
			
			System.out.println("Pay the bill in bkash number +88"+phn);
			System.out.println("Pay the bill in Rocket number "+phn2);
			System.out.println("Thanks for shopping from our shop");
		}
		else if(u==2){
		System.out.println("Pay the bill to delivary boy");
		System.out.println("Thanks for shopping from our shop");
		}
		}
		catch(Exception b){
			System.out.println("It is a mismatch\nPlease Enter the correct code");
			//Customer p=new Customer();
			payment();
		}
		
		
		
	}
	public void h2() {
		try {
		FileReader h5=new FileReader("C:/Users/Lenovo/eclipse-workspace/FinalProject/new.txt");
		Scanner h6=new Scanner(h5);
		while(h6.hasNextLine()) {
			System.out.println(h6.nextLine());
		}
		h6.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	public void extra() {
		System.out.println("Would you like to shop more? then press 1\nTo exit press 2");
		try {
			Scanner input=new Scanner(System.in);
			int x=input.nextInt();
			if(x==1) {
				Products p=new Products();
				p.products();
				//Customer c=new Customer();
				address();
				payment();
				extra();
			}
			else if(x==2) {
				System.out.println("Thanks a lot for shopping from our shop");
			}
		}catch(Exception e) {
			
		}
			
	}
	public void rating() {
		System.out.println("Please rate the service of Java online shop\nHow much score you will give for our service?\n1 worse\n2 Bad\n3 good\n4 Best");
		try {
		Scanner input =new Scanner(System.in);
		int x=input.nextInt();
		if(x==1) {
			System.out.println("Sorry we will try to be better next time :(");
		}
		else if(x==2) {
			System.out.println("Sorry we will try to be better next time :(");
		}
		else if(x==3) {
			System.out.println("Thanks for supporting us :)");
		}
		else if(x==4) {
			System.out.println("Thanks for supporting us :)");
		}
		else{
			System.out.println("Sorry this input doesn't match");
			Customer c=new Customer();
			c.rating();
		}
		}catch(Exception e) {
			System.out.println("We are sorry cordially ");
			//Customer c=new Customer();
			rating();
		}
		
	}
	
}
