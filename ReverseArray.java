public class ReverseArray{
	public static void main(String args[]){
		int a[]={11,12,13,14};
		System.out.println("The reverse is:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
		
		
		System.out.println("The reverse is:");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
			}
	}
}