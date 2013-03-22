package Task2;
import java.util.Scanner;


public class class2 {


	public static void main(String[] args) {
		System.out.println("Enter two integers");
	Scanner scan = new Scanner (System.in);
	int x= scan.nextInt();
	int y=scan.nextInt();
	
	if (x!=y){
		if (x>y)
			System.out.println(x+(" is larger than "+ y));
		else 
			System.out.println(x+(" is lower than "+y));
			
	}
		
	else if (x==y)
		System.out.println("First and secound number are equal");
	
	
	}

}
