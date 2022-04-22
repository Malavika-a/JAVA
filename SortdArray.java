import java.util.Arrays;
public class SortdArray{
	public static void main(String args[]){
		int array[]={11,22,12,1,89,77};
		int temp=0;
		System.out.println("The original array is:");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("The Sorted array in Descending order:");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	
	}
}
