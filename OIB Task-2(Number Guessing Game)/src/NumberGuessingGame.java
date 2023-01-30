
import java.util.Random;
import java.util.*;
public class NumberGuessingGame {
    
	public static void main(String[] args){
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t--------Welcome--------");
        System.out.println("\n\t\tRule-You have limited trials to guess the number in the game. ");
        int ch=0;
        do
        {
            System.out.println("\n\t\tSelect level to play the game :");
            System.out.println("\t\t1.Easy Level\t2.Midium Level\t3.Hard Level\t4.Exit the Game");
            System.out.print("\n\t\tEnter level to play :");
            ch=sc.nextInt();
            if(ch==4){
                System.out.println("Thanks For Playing..!!");
                break;
            }
           switch(ch)
            {
               case 1:
               {
                   System.out.println("A number is chosen between 1 to 10. Guess the number within 3 trials.");
	                int i=0,b=0,K=3;
	                b=1 + (int)(10* Math.random());
	                for( i=0;i<K;i++)
	                {
	                    System.out.println("Guess the number :");
	                	int number=sc.nextInt();
			            if(b==number){
			                System.out.println("Congratulations! You guessed the number.");
			                break;
			            }
			            else if(b>number&& i != K - 1){
			            	System.out.println("The number is greater than " + number);
			            }
			            else if(b<number&& i != K - 1){
			                System.out.println("The number is less than " + number);
			            }
	                }
	                if(i==K){
	                    System.out.println("Sorry..!! You have exhausted all 3 trials.");

	                    System.out.println("The number was : "+b);
	                }
	                break;
	           }
               case 2:
               {
            	   System.out.println("A number is chosen between 1 to 50. Guess the number within 3 trials.");
                   int i=0,b=0,K=3;
                   b=1+(int)(50* Math.random());
	               for(i=0;i<K;i++)
	               {
	                   System.out.println("Guess the number :");
	            	   int number=sc.nextInt();
			           if(number==b){
			                System.out.println("Congratulations! You guessed the number.");
			                break;
			           }
			           else if(b>number&& i != K - 1){
			            	System.out.println("The number is greater than " + number);
			            }
			            else if(b<number&& i != K - 1){
			                System.out.println("The number is less than " + number);
			            }
	              }
                  if(i==K){
	                    System.out.println("Sorry..!! You have exhausted all 3 trials.");

	                    System.out.println("The number was :"+b);
	              }
                  break;
               }
               case 3:
               {
                   int i=0,b=0,K=5;
                   b=1 + (int)(100* Math.random());
                   System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
	               for( i=0;i<5;i++)
	               {
	                   System.out.println("Guess the number :");
		               int number=sc.nextInt();
			           if(number==b){
			                System.out.println("Congratulations! You guessed the number.");
		                    break;
			           }
			           else if(b>number&& i != K - 1){
			            	System.out.println("The number is greater than " + number);
			            }
			           else if(b<number&& i != K - 1){
			        	   System.out.println("The number is less than " + number);
			            }
	               }
                    if(i==K){
	                    System.out.println("Sorry..!! You have exhausted all 5 trials.");

	                    System.out.println("The number was :"+b);
                    }
                    break;
               }
            }
        }while(true);
    }  
}