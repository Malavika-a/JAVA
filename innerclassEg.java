class Outer{
	int x=10;
	class Inner{
		int y=5;
		
	}
}
public class innerclassEg{
	public static void main(String args[]){
		Outer outerobj=new Outer();
		Outer.Inner innerobj=outerobj.new Inner();
		System.out.println(outerobj.x);
		System.out.println(innerobj.y);
		
	}
}
