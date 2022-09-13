package Com.TE.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionDemo {  
	
	   public static void main(String[] args) {
      ArrayList<Object> arraylist=new ArrayList<>();
      arraylist.add(10);
      arraylist.add("Dhiraj");
      arraylist.add(20.0);
      arraylist.add(null);
      arraylist.add(true);
      arraylist.add('a');
       System.out.println("===========using for loop===========");
       for(int i=0;i<arraylist.size();i++)
       {
    	   System.out.println(arraylist.get(i));
    	   
       }
       System.out.println("===========using advance for loop=============");
       for(Object obj:arraylist)
    	   System.out.println(obj);
	  
      Iterator<Object> iter=arraylist.iterator();
      while(iter.hasNext())
      {
    	  System.out.println(iter.next());
      }
      
	}

}
