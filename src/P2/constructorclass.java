package P2;

public class constructorclass {
	
	public constructorclass(){
		System.out.println("Constructor");
	}
	
	public void f1(){
		System.out.println("Abdul");
	}
	
	
	public static void main(String[] args) {
		constructorclass obj = new constructorclass();
		obj.f1();
	}

}
