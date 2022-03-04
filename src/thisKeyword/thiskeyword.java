package thisKeyword;

public class thiskeyword {
	
	int a  = 10;
	
	public void f2(){
		int a =19;
		System.out.println(a);
		thiskeyword obj = new thiskeyword(); 
		System.out.println(obj.a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		thiskeyword obj = new thiskeyword();
		obj.f2();
	}
}
