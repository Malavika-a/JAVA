import java.util.ArrayList;
import java.util.Collections;

class Mycls {
public static void main(String[] args) {
        		ArrayList<String> data = new ArrayList<String>();
        		data.add("A");
       		 data.add("B");
        		data.add("C");
        		data.add("D");
       		 data.set(1, "BB");
        		System.out.println(data);
        		System.out.println(data.get(0));
        		System.out.println(data.get(1));
        		data.remove(0);
        		System.out.println(data);
        		System.out.println(data.size());

        
        		for (String d : data) {
            		System.out.println(d);
        		}
       		 Collections.sort(data);
       		 System.out.println(data);
        		data.clear();
       		System.out.println(data);
  	 }
}	
