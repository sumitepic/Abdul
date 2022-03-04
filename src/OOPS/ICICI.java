package OOPS;

public class ICICI extends RBI{

	public void bankInterest(){ // overriding
		System.out.println("6%");
	}
	
	public void f1(){
		System.out.println("F1");
		bankInterest();
	}
	
	public void f2(){
		
	}
}
