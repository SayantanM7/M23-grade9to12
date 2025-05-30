package helloWorld;
import java.util.*;
public class helloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
			System.out.println("Hello User please Enter your Name: ");
			String name=sc.nextLine();
			System.out.println("Enter your lucky number");
			int lucky=sc.nextInt();
			System.out.println("Hello "+name +", Your lucky number " +lucky +" shows you are really hardworking.Keep it up!");

	}

}
