package com.xworkzz.programs;

public class ASymbol {

	public static void main(String[] args) {
		int num = 4;
		int mid=num/2;
		
			for (int i = 0; i <= num; i++) {
				for (int j = 0; j <= num; j++) {
					if(i==mid||((j==0&&i!=0&&i!=1)||i+j==2)||(j==4&&i!=0&&i!=1)||(i==1&&j==3)||(i==0&&j==num/2))
						
					{
						System.out.print("*");
					} 
					else 
					{
						System.out.print(" ");
					}
				}
 
				System.out.println();

			}

		}

	}

