package P2;

public class returningfromfunction {
	
	public int f3(){
		int a =19;
		return a;
	}
	
	public void f4(){
		int b= f3();
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		returningfromfunction obj =new returningfromfunction();
		obj.f4();
	}

}
