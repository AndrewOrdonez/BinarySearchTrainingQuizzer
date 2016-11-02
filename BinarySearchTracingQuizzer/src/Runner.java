import java.util.ArrayList;
import java.util.Scanner;
public class Runner
	{
static Scanner scan = new Scanner(System.in);
static int r=0;
static ArrayList<Integer> q=new ArrayList<Integer>(0);





		public static void main(String[] args)
			{
				System.out.println("Hello, please type numbers to be put into an array. \nThe program will continue when you input -1. \nAll other numbers input must be between 1 and 20 inclusive.");
				while (true){
					r=scan.nextInt();
					if (r==-1){
						break;
					}
					else if (r>=1&&r<=20){
						q.add(r);
						System.out.println("Thank you, please  input another number, or input '-1' if you would like to stop.");
					}
					else {System.out.println("that was not a valid number, try better next time");}
					
				}
				q.sort(null);
				for (int i:q){
					System.out.print(i+"  ");
				}
				System.out.println();
			
				int t=(int)(Math.random()*q.size());
				System.out.println("your target is "+q.get(t)+".\n");
			}

	}
