package p1_Strings;

import java.util.HashSet;

public class Demo 
{
	public static void main(String[] args)
	{
		String name1 = "John"; // intern
		//String name2 = "John";
		String name2 = new String("John");
	//	System.out.println(name1 == name2);
		HashSet<String> nameSet = new HashSet<>();
		nameSet.add(name1);
		nameSet.add(name2);
		for(String s : nameSet)
		{
			System.out.println(s);
		}
		
	}

}
