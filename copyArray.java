public class copyArray {
  public static void main(String[] args) {
    int[] a = {5, 4, 3, 2, 1};
    int[] copyA = new int[a.length];
    
    
    for(int i = 0; i<a.length; i++)
       copyA[i] = a[i];
    
    System.out.println("The original array is: ");
    for (int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
  
    System.out.println("\nContents of the copied array is");
    for (int i = 0; i < copyA.length; i++)
        System.out.print(copyA[i]+" ");
  }
}