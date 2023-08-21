package FinalProjectPackage;

import java.util.Scanner;

public class Products extends Customer {
	

	  public void products() {
		System.out.println("What kind of products you want?\n");
		System.out.println(" To purchase  Electrical products press 1 \n To purchase Cloths press 2\n To purchase Beauty products press 3");
try {
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		if(i==1||i==2||i==3) {
		switch( i) {
	case 1 :
			System.out.println("TV \tRadio\t FAN \n");
			System.out.println("To purshase TV press 1\n To purshase Radio press 2\n To purchase FAN press 3");
			Scanner input2=new Scanner(System.in);
			int j=input2.nextInt();
			if(j==1||j==2||j==3) {
			switch(j) {
			case 1 :
				System.out.println("TV\nBrand Name:Walton");
				System.out.println("Size : 39 inch\t Price : 40000 \t purchase code: 101");
				System.out.println("TV\nBrand Name:Jamuna");
				System.out.println("Size : 80 inch\t Price : 50000 \t purchase code: 102");
				order();
				break;
			
			
			case 2: 
				
				System.out.println("Radio\nName:Walton");
				System.out.println("Size : 20 inch\t Price : 4000 \t purchase code: 201");
				System.out.println("Radio\nBrand Name:Jamuna");
				System.out.println("Size : 30 inch\t Price : 5000 \t purchase code: 202");
				
				order();
				break;
			case 3:
			
				System.out.println("FAN\nName:Walton\n");	
				System.out.println("Size : 30 inch\t Price : 2500 \t purchase code: 301");
				System.out.println("Radio\nBrand Name:Jamuna");
				System.out.println("Size : 30 inch\t Price : 3500 \t purchase code: 302");
				
				order();
				break;
			}
			}
			else {
				System.out.println("Sorry this code doesn't match any purchase code");
				Products p=new Products();
				p.products();
			}
			
			break;
		
			
	case 2:
		
			System.out.println("Shirt \tJeans\t Shoes \n");
			System.out.println("To purshase Shirt press 1\n To purshase Jeans press 2\n To purchase Shoes press 3");
			Scanner input3=new Scanner(System.in);
			int k=input3.nextInt();
			if(k==1||k==2||k==3) {
			switch(k) {
			case 1:
				System.out.println("Shirt\nBrandName:RichMan\n");
				System.out.println("Size : xxl\t price : 10000 \t purchase code: 401");
				System.out.println("Shirt\nBrandName:BDGarments\n");
				System.out.println("Size : xxl\t price : 2000 \t purchase code: 402");
				order();
				break;
			
			case 2: 
				System.out.println("Jeans\nBrandName:Yellow\n");
				System.out.println("Size : xxl\t price : 3000 \t purchase code: 501");
				System.out.println("Jeans\nBrandName:Creative_Garments\n");
				System.out.println("Size : xxl\t price : 2000 \t purchase code: 502");
				order();
				break;
			
			case 3: 
				System.out.println("Shoes\nBrandName:Lotto\n");
				System.out.println("Size : xxl\t price : 3000 \t purchase code: 601");
				System.out.println("Shoes\nBrandName:BATA\n");
				System.out.println("Size : xxl\t price : 2000 \t purchase code: 602");
				order();
				break;
				}
			}
			else {
				System.out.println("Sorry it is an mismatch");
				Products p=new Products();
				p.products();
			}
			break;
	case 3: 
			System.out.println("SkinCare \tMakeUp\t SPA \n");
			System.out.println("To purshase SkinCare press 1\n To purshase MakeUp press 2\n To purchase SPA press 3");
			Scanner input4=new Scanner(System.in);
			int l=input4.nextInt();
			if(l==1||l==2||l==3) {
			switch(l) {
			case 1:
				System.out.println("SkinCare\nBrandName:The body shop\n");
				System.out.println("price : 5000 \t purchase code: 701");
				System.out.println("SkinCare\nBrandName:The Cathy Doll\n");
				System.out.println("price : 5000 \t purchase code: 702");
				order();
				break;
			
			case 2:
				System.out.println("MakeUp\nBrandName:Huda Beauty\n");
				System.out.println("price : 3000 \t purchase code : 801");
				System.out.println("MakeUp\nBrandName:NYX\n");
				System.out.println("price : 5000 \t purchase code : 802");
				order();
				break;
			
			case 3: 
				System.out.println("SPA\nBrandName:Matrix\n");
				System.out.println("price : 2000 \t purchase code: 901");
				System.out.println("SPA\nBrandName:Tenso\n");
				System.out.println("price : 3000 \t purchase code: 902");
				order();
				break;
		}
			}
			else {
				System.out.println("Sorry it is an mismatch");
				Products p=new Products();
				p.products();
			}
		}
		}
		
		else {
			System.out.println("Sorry this code doesn't match any purchase code");
			Products p=new Products();
			p.products();
			}
		}
catch(Exception e)
		{
		System.out.println("Sorry it is an mismatch");
	    Products p=new Products();
		products();	
		}
}
}

	


