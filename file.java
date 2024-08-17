import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter celcius: ");
		int C = input.nextInt();

		System.out.print("enter fehrehite: ");
		int F= input.nextInt();

		int T = C-(F-32)*5/9;

		System.out.print("temperature is: "+T);
	}
}