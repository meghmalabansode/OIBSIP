import java.util.Scanner;

public class AtmInfo {

	Scanner sc = new Scanner(System.in);
	
	String transactionH = "";
	int count=0;
	
	public int WithDraw(int amount) {
		System.out.println("Enter Amount  : ");
		int num = sc.nextInt();
		try {
			if (num < amount && num>0) {
				System.out.println("Amount Withdrawn successfully..!!");
				amount = amount - num;
				String str = num + " Amount Withdrawn";
				transactionH = transactionH.concat(str)+"\n";
				count++;
			}
			else if (num > amount ){
				System.out.println("You have insufficient account balance!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return amount;
	}

	public int Deposit(int amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amt = sc.nextInt();
		try {
			if (amt < 100000) {
                System.out.println(" "+amt+" amount deposited successfully...!!");
				amount = amount + amt;
				String str = amt + "Amount Depositted";
				transactionH = transactionH.concat(str)+"\n";
				count++;
			}
			else {
				System.out.print("Limit Exceeded...Please enter amount below 100000.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return amount;
	}

	
	public int Transfer(int amount) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Receipent name : ");
		String receipent = sc.nextLine();
		System.out.println(" Enter Account account : ");
    	int accno=sc.nextInt();
    	System.out.println(" IFSC Code : ");
    	String ifsc=sc.next();
		System.out.print("Enter Transfer amount : ");
		int t = sc.nextInt();
			try {
				if (t < 50000 && t<amount) {
					amount = amount - t;
        			System.out.println("Transaction Successful...!!");
					System.out.print("\nSuccessfully transfered to " + receipent);
					String str = t + "Rs. Transfer";
					transactionH = transactionH.concat(str)+"\n";
					count++;
				}
				else {
					System.out.print("Limit Exceeded...Please enter emount below 50000");
				}
			}catch (Exception e) {
				System.out.println(e);
			}
		return amount;
	}
	

	public void showTransaction(int amount) {
		if (count > 0) {
			System.out.print(count + "\nTransaction History : " + transactionH + " \n");
		} else {
			System.out.print("No Transaction History");
		}
	}
}
