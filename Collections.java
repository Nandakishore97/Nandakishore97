
//ArrayList to Array Conversion
/*
import java.util.*;

public class Collections {
    public static void main(String args[]) {

  ArrayList<String> values= new ArrayList<String>();
  values.add("Blr");
  values.add("Mysore");
  values.add("Tumkur");
  values.add("KBS");

  String array[] = new String[values.size()];              
  for(int j =0;j<values.size();j++){
    array[j] = values.get(j);
  }

  for(String o: array)
  {
   System.out.println(o);
  }
  }
}  
*/



//iterate HashSet using for each loop
/*
import java.util.*;

 public class Collections {
    public static void main(String args[]) {
        
    HashSet<String> values = new HashSet<String>();

    values.add("ABC");
    values.add("DEF");
    values.add("GHI");
    values.add("JKL");
    values.add("XYZ");
    
    System.out.println("HashSet contains :");
 
    for(String str : values){
        System.out.println(str);
    }
  }
 }
*/

//TreeSet using while loop after iterator 
/*
import java.util.Collection;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
	TreeSet<Integer> values=new TreeSet<>();

	values.add(5);       //object type
	values.add(4);
	values.add(3);
	values.add(2);
	
	Iterator i=values.descendingIterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
  }
}
*/



//LinkedList
/*
import java.util.Collection;
import java.util.*;

 class Collections {
    public static void main(String args[]) {
     
    LinkedList<String> values=new LinkedList<String>();
    
    values.add("peter");
    values.add("harry"); 
    values.add("john");
    values.add("lilly");
    
    for(Object o: values)
	{
		System.out.println(values);
	}
  }
}
*/

//HashSet to check values present or not
/*
import java.util.Collection;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
	HashSet<Integer> values=new HashSet<>();
	
	values.add(5);       //object type
	values.add(4);
	values.add(3);
	values.add(2);
	values.add(2);
	values.add(5);
	
	for(int i=1; i<10; i++)
	{
		if(values.contains(i))
		{
			System.out.println(i+ "is present");
		}
		else
		{
			System.out.println(i+ "is not present");
		}
	}		
  }	
}
*/

//VECTOR
/*
import java.util.Collection;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
    	
        Vector<String> values= new Vector<>();
        
        values.add("ABC");
        values.add("XYZ");
        values.add("PQR");

        
        String element = values.get(2);
        System.out.println("Values at index 2: " + element);

        
        Iterator<String> iterate = values.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
*/