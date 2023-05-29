
import java.util.Scanner;
public class simpleCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------CALCULATOR------------------");
		System.out.println("Enter two number:");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("enter operator + - * / %");
		String operator = input.next();
		double result = 0.0;
		switch (operator) {
		case "+" :
			result = a+b;
			break;
		case "-" :
			result = a-b;
			break;
		case "* ":
			result = a*b;
			break;
		case "/" :
			result = a/b;
			break;
		case "%" :
			result = a%b;
			break;
			default:
				System.out.println("invalid");
				return;
				
			
		}
		System.out.println(a +" " +operator +" " +b+ " "+ "=" +" "+ result);
		input.close();
		

	}

}
