package P2;

public class Array {
	
	public void f1(){
		String[] a = {"Abdul","B","C","D",};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}
	
	public void f2(){
		String[] a = {"Abdul","B","C","D",};
		for (int i = 3; i >=0; i--) {
			System.out.print("Index is="+i);
			System.out.println(a[i]);
			
			System.out.println("Index is="+i+" "+a[i]);
		}
	}
	
	public void f5(){
		String a ="A";
		String b ="bdul";
		System.out.println(a+b);
				
	}
	
	public void f6(){
		int a =1;
		int b =2;
		System.out.println(a+b);
				
	}
	// i=0 0<4 true  Abdul
	// 
	
	public void f3(int a){
		System.out.println(" Table of "+a);
		for (int i = 1; i < 11; i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
	
	
	//5*1 =5
	//5*2=10
	public static void main(String[] args) {
		Array obj = new Array();
		obj.f3(41);
	}

}
