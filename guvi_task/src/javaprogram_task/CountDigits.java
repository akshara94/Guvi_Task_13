package javaprogram_task;
import java.util.Scanner;
public class CountDigits 
{
	public static void main(String[] args) 
		{
														// TODO Auto-generated method stub
				System.out.println("Enter the number greater than 0");
				Scanner sc = new Scanner(System.in);  
		        int num = sc.nextInt();
		        int digit = 0;
				while(num!= 0)
				{
													//pick last digit of the number and count one by one
					digit++;
					num = num/10;
				}

				//display number of digits
				System.out.print("Number of Digits = "+digit);
				sc.close();
		}

	}