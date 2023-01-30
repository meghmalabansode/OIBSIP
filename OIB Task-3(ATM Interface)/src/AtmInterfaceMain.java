import java.util.Scanner;

public class AtmInterfaceMain {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Register r=new Register();
        AtmInfo ainfo=new AtmInfo();
        
        int amount=500000;
        int deposit,withdraw;
        int userId,pin;
       
        System.out.print("\n-------------------Welcome to ATM-------------------\n");
	    r.Registration();
        
        System.out.print("\n\n-------------------Welcome to "+r.bName+" ATM-------------------\n");
             	
        if(r.checkLogin()) {
            System.out.println("\n------Welcome to ATM--------");  
            while(true)
            {
                System.out.println("\n1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.QUIT");        
                System.out.print("\nPlease select option : ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
	                    ainfo.showTransaction(amount);
	                    break;
                    case 2:
                    	ainfo.WithDraw(amount);  		
	                    break;
                    case 3:
                    	ainfo.Deposit(amount);
	                    break;
                    case 4:
                    	ainfo.Transfer(amount);
                    	break;
                    case 5:
	                    System.out.println("\n\t-----Thanks for using "+r.bName+" ATM------");
	                    System.exit(0);
                }
            }
    	} 
	}
}
