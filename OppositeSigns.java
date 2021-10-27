import java.util.*;
class OppositeSigns{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter First Number:");
		 int num1=sc.nextInt();
		 System.out.print("Enter Second Number:");
		 int num2=sc.nextInt();
		 
		 if((num1 < 0)? (num2 >= 0): (num2 < 0)){	
			 System.out.println("Signs are opposite"); 
		 }
        else{
            System.out.println("Signs are not opposite"); 
		 }
	}
}