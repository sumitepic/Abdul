package OOPS;

public class SBI extends RBI{

	public void bankInterest(){
		System.out.println("5.5%");
		
	}
	
	public void f1(){ // physical
		System.out.println("SBI F1");
	}
	
	
	
	public static void main(String[] args) {
		RBI obj = new SBI();
		obj.bankInterest();
	}
	
}
