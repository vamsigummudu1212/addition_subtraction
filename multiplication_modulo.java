package com.git_demo.git_demo;

public class multiplication_modulo {
	public int multiply(int u ,int v) {
		return u *v;
	}
	public int modulo(int k,int z)
	{
		return k%z;
	}
	public static void main(String args []) {
		multiplication_modulo m=new multiplication_modulo();
		int q=m.multiply(90,2);
		int w=m.modulo(90,3 );
		System.out.println("the total interest was :"+q);
		System.out.println("the rate of interest was :"+w);
		
	}
}
