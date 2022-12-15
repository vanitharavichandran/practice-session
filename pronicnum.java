package test;

import java.util.Scanner;

public class pronicnum {

	public static void main(String[] args) {
		boolean b = false;
		 Scanner sc = new Scanner(System.in);
			System.out.println("enter an integer");
			int num =sc.nextInt();
			for(int i=1; i<=(num/2); i++)
			{
				if(num==(i*(i+1)))
				{
					 b=true;
					
				}
			}
			
			if(b)
			{
				System.out.println(num+" is pronic number");
				
			}
			else
			{
				System.out.println(num+" is  not pronic number");
			}
		}
	}
