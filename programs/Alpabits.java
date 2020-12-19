package com.xworkzz.programs;

public class Alpabits {

	public static void main(String[] args) {
		int num=//if(j==0||i==mid||i==2&&j==4||i==0||j==num||i==num)
				//if(j==0||i==0||i==num)
				//4;
		int mid=num/2;
		for(int i = 0;i<=num;i++) {
			for(int j = 0;j<=num;j++) {
				//if(i==mid||i+j<=num&&j>=i)
				if(i==0||i==num||j==num||j==1)

				//if(i==mid||i==0||j==0||i==4)//forE
				//if(i==0||j==0||i==mid)//forF
				//if(i==0||j==0||(i==num)&&(j!=3&&j!=4)||j==mid&&(i!=1)&&(j!=2))
				//if(j==0||j==num||i==mid)//forH
				//if(i==0||i==num||j==mid)//forI
				if(i==0||j==mid||i==4&&(j!=3&&j!=4)||j==0&&(i!=0&&i!=1))//for j
				// if(j==mid||i+j==num&&(j!=0&&j!=1)||i==j&&(i!=0&&i!=1))
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
	
