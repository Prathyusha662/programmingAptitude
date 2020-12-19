package com.xworkzz.programs;

public class RightTri {

	public static void main(String[] args) {
		int num=4;
		for(int i = 0;i<=num;i++) {
			for(int j = 0;j<=num;j++) {
				if(i==4||j==4||i+j==num)
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

//if(i==mid||i+j<=num&&j>=i)
//if(j==0||i==mid||i==2&&j==4||i==0||j==num||i==num)
//if(j==0||i==0||i==num)
//if(i==0||i==num||j==num||j==1)

