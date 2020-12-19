package com.xworkzz.programs;

public class Symbols {

	public static void main(String[] args) {
		int num = 4;
		
			for (int i = 0; i <= num; i++) {
				for (int j = 0; j <= num; j++) {
			
					if(i+j==num||i==j)
					{
						System.out.print("*");
					} 
					else if(i==1 && j==num/2||i==num/2 && j==1||i==3 &&j==num/2||i==num/2&&j==3)
					{
						System.out.print("-");
					}
					else
					{
						System.out.print("@");
					}
			
				}

				System.out.println();

			}

		}

	}

