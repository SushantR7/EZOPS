package com.srccodes.example;

public class HelloWorld {
	
	public static void main(String[] args){
		System.out.println(checkAction());
	}
	
	public static String checkAction(){
		try{
			System.out.print("Hello ");
			return "!";
		}
		catch (Exception e){
			System.out.println("ERROR!");
		}
		finally{
			System.out.print("World");
		}
	}
}