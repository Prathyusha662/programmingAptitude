package com.xworkzz.programs;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		for(int i = 0;i<num;i++) {
			for(int j = 0;j<num;j++) {
				if(i==0||i==7||i==0||j==0||i==6||i==0||i==0||j==6)
				{
				System.out.print("*");
			}else {
			System.out.print(" ");
		}
			
		}
			System.out.println();
	}

	}

}
