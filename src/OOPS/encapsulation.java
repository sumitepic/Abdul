package OOPS;

public class encapsulation {
	int a ;
	
	public void setA(int a){
		this.a=a;
	}
	
	public void getA(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
		obj.setA(20);
		obj.getA();
		
		obj.setA(200);
		obj.getA();
	}

}
