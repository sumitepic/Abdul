
public class First {
	
	public void f2(){
		System.out.println("Sumit");
		System.out.println("Sumit");
		f1();
		f1();
	}
	
	public static void f1(){
		System.out.println("Abdul");
		System.out.println("Abdul");
		System.out.println("Abdul");
	}
	
	public static void main(String[] args) {
		First abdul = new First(); // Object
		abdul.f2();
		f1();
		
	}

}
