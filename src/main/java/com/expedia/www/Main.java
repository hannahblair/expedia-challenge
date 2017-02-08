package com.expedia.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    	System.out.println("Welcome to the Expedia challenge");
		//System.out.println("Nick And Bianca Branch");
		System.out.println("Enter 1 to edit a webpage");
		System.out.println("Enter 2 to edit reporting");
		System.out.println("Enter 3 to exit application");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		if(input==3)
		{
			System.exit(1);
		}
		else if(input == 1)
		{

		}



    }
}