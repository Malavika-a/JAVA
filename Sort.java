import java.util.Scanner; 
public class Sort 
{ 
	public static void main(String[] args) 
	{ 
		int n; 
		String temp; 
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter number of names you want to enter:"); n = s.nextInt(); 
		String string[] = new String[n]; 
		Scanner s1 = new Scanner(System.in); 
		System.out.println("Enter all the names:"); 
		for(int i = 0; i < n; i++) 
		{ 
			string[i] = s1.nextLine(); 
		} 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = i + 1; j < n; j++) 
			{ 
				if (string[i].compareTo(string[j])>0) 
				{ 
					temp = string[i]; string[i] = string[j]; string[j] = temp; 
				} 
			} 
		} 
		System.out.print("Names in Sorted Order:"); for (int i = 0; i < n - 1; i++) 
		{ 
			System.out.print(string[i] + ","); 
		} 
		System.out.print(string[n - 1]); 
	} 
} 
