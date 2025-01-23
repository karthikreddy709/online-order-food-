package food_app;

import java.util.Scanner;

public class Order {
	
	private static String[] menu = {"1.Biriyani = ₹ 200 ","2.veg meals = ₹ 100","3.Veg Fried Rice = ₹ 80","4.Chicken Fried rice = ₹ 120"};
	
	private static int[] cost = {200,100,80,120};
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Welcome to online order System");
		
		System.out.println("/n Menu");
		for(String item : menu) {
			System.out.println(item);
		}
		
		System.out.println("Enter the number you Want food");
		int choise = scan. nextInt();
		
		if(choise < 1 || choise > menu.length  ) {
			System.out.println("Invalid choise , pls be restart a program");
			
			return;
			
		}
		
		
		int price = cost[choise -1] ;
		
		System.out.println("enter the quanty of food :  ");
		int quantity = scan.nextInt();
		
		int Total_price = quantity * price;
		
		
		System.out.println("ordrer Summary");
		System.out.println("Food item " + menu[choise -1] );
		System.out.println("Quantaty " + quantity );
		System.out.println("Total prize " + Total_price);
		
		
		
		System.out.println("\n Would you like to Confirm order : Yes / No ");
		scan.nextLine();
		String Conformation = scan.nextLine();
		
		if(Conformation.equalsIgnoreCase("yes")) {
			System.out.println("your order has been placed, Thank you");
		}
		
		else {
			System.out.println("Your order has been Canceled, Thank you");
		}
		

	}

}
