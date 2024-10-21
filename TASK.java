import java.util.InputMismatchException;
import java.util.Scanner;
public class TASK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_1,num_2,ans;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number : ");
			num_1 = sc.nextInt();
			System.out.print("Enter second number : ");
			num_2 = sc.nextInt();
			ans= num_1/num_2;
			System.out.println(+num_1+" divide by "+num_2+" = "+ans);
		}
		catch(ArithmeticException ei) {
			System.out.println("Cannot divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Exception...");
		}
	}
}
