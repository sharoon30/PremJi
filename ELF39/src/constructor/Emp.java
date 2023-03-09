package constructor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Emp {
	public static void main(String[] args) {
		int arr[] = {1,3,2,3,4,5,6,3};
		HashMap l1 = new HashMap();
		for(int i=0;i<arr.length;i++) {
			l1.put(arr[i],"");
		}
		Set s1 = l1.keySet();
		for(Object o : s1) {
			System.out.println(o);
		}
	}
}
