package employee;
import java.util.Scanner;
public class Login_Details
{
	public static void login() 
	{
		Scanner scan = new Scanner(System.in);
		String user_name = "Anusha";
		String pass_word = "0345@";
		System.out.println("enter username");
		String user_name1 = scan.nextLine();
		System.out.println("enter password");
		String password1 = scan.nextLine();
		if (user_name.equals("Anusha") && pass_word.equals("0345@")) 
		{
			System.out.println("login successfully");
			Employee_Menu emp=new Employee_Menu();
			emp.Menu();
		} 
		else
		{
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
}
