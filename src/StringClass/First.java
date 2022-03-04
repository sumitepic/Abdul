package StringClass;

public class First {

	public void f1(){
		String a ="LONDON";
		char[] b=a.toCharArray();
		System.out.println();
		for (int i = 0; i<b.length; i++) {
			System.out.println("Single Character="+b[i]);
		}
	}
	
	public void f2(){
		String a ="LONDON";
		String b ="india";
		System.out.println(a.toLowerCase());
		String c =b.toUpperCase();
		System.out.println(c);
	}
	
	public void f3(){
		String a ="ABDUL,LONDON";
		// convert String into a String array
	}
	
	public int f(){
		return 0;
	}
	
	public static void main(String[] args) {
		First obj = new First();
		obj.f2();
	}
}
