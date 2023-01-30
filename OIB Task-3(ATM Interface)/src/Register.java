import java.util.Scanner;

public class Register {
	Scanner sc = new Scanner(System.in);
	
	String name;
	String userId;
	String UserPin;
	String account;
	String bName;
	
	
	public void Registration() {
		System.out.print("\nEnter Name : ");
		bName = sc.nextLine();
		
		System.out.print("\nEnter UserId : ");
		userId = sc.next();

		System.out.print("\nEnter Password : ");
		UserPin= sc.next();

		System.out.print("\nEnter Account number : ");
		account = sc.next();
		
		System.out.println("\nEnter Bank Name : ");
		bName=sc.next();
		
		System.out.print("\nRegistration Completed Successfully..!!");
	}
	


	public boolean checkLogin() {
			
			boolean islogin = false;
			
			while (!islogin) {
				System.out.println("\nEnter user id  : ");
				String n = sc.next();
				if (userId.equals(n)) {
					while (!islogin) {
						System.out.println("\nEnter password :");
						String p = sc.next();
						if (UserPin.equals(p)) {
							System.out.println("\nYou have successfully logged in..!!");
							islogin = true;
						} else {
							System.out.print("\nWrong pin entered....Please! Enter correct pin");
						}
					}
				} else {
					System.out.print("\nUserId Not Found..Please enter correct UserId");
				}
			}
			return islogin;
		}
		
	
	
	
	
}
