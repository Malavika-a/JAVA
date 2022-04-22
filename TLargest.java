public class TLargest {
   public static void main(String args[]){
      int temp, s;
      int array[] = {10, 20, 25, 63, 96, 57};
      s = array.length;

      for(int i = 0; i<s; i++ ){
         for(int j = i+1; j<s; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("Third second largest number is:: "+array[s-2]);
   }
}