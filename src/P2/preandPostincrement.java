package P2;

public class preandPostincrement {
	
	public void f1(){
		int a =1;
		System.out.println(a++); //1
		System.out.println(a);//2
	}
	
	public void f2(){
		int a =1;
		System.out.println(++a);//2
	} 
	
	public static void main(String[] args) {
		preandPostincrement obj = new preandPostincrement();
		obj.f1();
		obj.f2();
	}

}
