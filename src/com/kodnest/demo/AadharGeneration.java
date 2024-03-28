package com.kodnest.demo;

public class AadharGeneration {
	public static void main(String[] args) {
		Aadhar a1=new Aadhar("raksha",22);
		Aadhar a2=new Aadhar("yashwanth",22);
		Aadhar a3=new Aadhar("rahul",29);
		Aadhar a4=new Aadhar("bittu",22);
		Aadhar a5=new Aadhar("kd",24);
		System.out.println(a1.age+"-"+a1.name+"-"+a1.nationality);
		System.out.println(a2.age+"-"+a2.name+"-"+Aadhar.nationality);
		System.out.println(a3.age+"-"+a3.name+"-"+a3.nationality);
		System.out.println(a4.age+"-"+a4.name+"-"+a4.nationality);
		System.out.println(a5.age+"-"+a5.name+"-"+a5.nationality);
		
	}

}
class Aadhar
{  public Aadhar(String name,int age)
	{
	   this.name=name;
	   this.age=age;
	}
    static String nationality="Indian";
	String name;
	int age;
	
}
