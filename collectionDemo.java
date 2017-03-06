package assign2Session9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class collectionDemo {
	
	public static void main(String[] args) {
		List<Integer> strList = new ArrayList<>();
		strList.add(1);
		strList.add(20);
		strList.add(13);
		strList.add(43);
		strList.add(2);
		strList.add(56);
		strList.add(1);
		strList.add(43);
		strList.add(56);

		System.out.println(strList.size());
		
		Iterator<Integer> i = strList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		//To Copy strList in New set collection to have duplicate entries remvoed.
		System.out.println("=================================");
		Set<Integer> set = new HashSet<>();
		
		Iterator<Integer> cp = strList.iterator();
		while(cp.hasNext())
		{
			set.add(cp.next());
		}
		
		
		Iterator<Integer> setdata = set.iterator();
		while(setdata.hasNext())
		{
			System.out.println(setdata.next());
		}
	}

}
