package P2;

public class variable {
	int b =20;// Global variable
	
	public void f1(){
		int a=19; //local variable
		System.out.println(a);
		b=a;// assigning 
		System.out.println(b);
	}
	
	public void f2(){
		System.out.println(b);
	}
	
	
	public static void f55(){
		variable obj = new variable();
		obj.f2();
	}
	
	public static void main(String[] args) {
		variable obj = new variable();
		obj.f2();
		obj.f1();
		obj.f2();
		System.out.println(obj.b);
	}
}
