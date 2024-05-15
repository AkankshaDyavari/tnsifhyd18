package com.si.sample;

public class Sample1 {
	String batsman="virat";
	static String bowler="jadeja";
	void display() {
System.out.println("batsman");
	}
static String display1() {
	return "bowler";
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample1 s1=new Sample1();
System.out.println(s1.batsman);
s1.display();
System.out.println(Sample1.bowler);
Sample1.display1();
	}

}
