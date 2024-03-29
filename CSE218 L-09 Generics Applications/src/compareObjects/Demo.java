package compareObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		Country c1 = new Country("A", 200.0);
		Country c2 = new Country("Z", 100.0);
		Country c3 = new Country("M", 500.0);
		
		Country[] countryArray = {c1, c2, c3};
		CountryComparator cc = new CountryComparator();
		Arrays.sort(countryArray, cc);
		System.out.println(Arrays.toString(countryArray));
		
		ArrayList<Country> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		Collections.sort(list, cc);
		System.out.println(list);
		
	}

}
