package com.xworkzz.programs;

public class Right {

	public static void main(String[] args) {
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<4;j++) {
				if(j<=i)
				//if((i>j)||(j<=i))
				{System.out.print("*");
			}
			else
			{
				System.out.print(" -");
			}
		}

			System.out.println();
		}
	}

}
