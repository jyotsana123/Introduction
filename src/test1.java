import java.util.ArrayList;

import org.testng.annotations.Test;

public class test1 {

	//Print the counts of names which start with letter "A"
			@Test
			public void regular()
			{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Amit");
			names.add("Ansh");
			names.add("Neelu");
			names.add("Divya");
			names.add("Ashu");
			names.add("Nishu");
			names.add("Annu");
			
			int count = 0;
			for(int i=0; i<names.size(); i++)
			{
				String person = names.get(i);
				if(person.startsWith("A"));
				{
					count++;
				}
		
			}
			System.out.println(names);
			
		}
	}

