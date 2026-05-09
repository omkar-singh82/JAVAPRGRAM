import java.util.*;
class BankingSystem{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int balance =10000;
		int choice;
		while(true){
			System.out.println("welcome to my bank thank you");			
			System.out.println("what you want please choose option");			
			System.out.println("1 check your balance  ");			
			System.out.println("2 Deposit amount ");			
			System.out.println("3 withdraw your amount ");			
			System.out.println("4 EXIT ");	
			choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("your current balance = "+balance);
					
			break;
			case 2:
				System.out.println("Enter your amount to deposit please");
				int deposit=sc.nextInt();
				if(deposit>0){
					System.out.println("your current balance to deposit  = "+balance);
					balance=balance+deposit;
					System.out.println("you deposited this amount = "+deposit);
					System.out.println("now your total balance = "+balance);
					}
					else
					{
				   System.out.println("invalid number  please positive number");
					}
			
				
			break;
			case 3:{
				System.out.println("Enter amount to withdraw");
				int withdraw=sc.nextInt();
				System.out.println("your current balance = "+balance);
				if(withdraw>0 && withdraw<=balance){
				balance=balance-withdraw;
				System.out.println("you withdrawed balance = "+withdraw);
				System.out.println("your total balance = "+balance);
				}
				else if(withdraw<=0){
					System.out.println("invalid number! please enter positive number");
				}
				else{
					System.out.println("Insuficien balance");
				}
			}
			break;
			case 4:
				System.out.println(" you are Logged out  ");
				System.out.println("Thank you for visiting my bank");
				sc.close();
				return;
			
			default:{
				System.out.println("you entred wrong number");
				
			}
			 System.out.println("<------------------------>");
                         System.out.println("<------------------------>");
			}
           			
	 } 
}
}