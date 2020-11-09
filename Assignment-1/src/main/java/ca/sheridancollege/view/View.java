package ca.sheridancollege.view;

import ca.sheridancollege.Store.Database;
import ca.sheridancollege.createarray.Input;

public class View {
	


	public static void viewJarray(Input s)
	{  
		System.out.println("Rows="+s.m+" Columns="+s.n+" Probability of a Zero="+s.probability);
	    System.out.println("Jarray elements in LinkedList:");
		for(int i=0;i<Database.storeJarray.size();i++)
		{
			System.out.print(Database.storeJarray.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void viewvarray(Input s)
	{    int a[]=new int[Database.storevarray.size()];
         int d=Database.storevarray.size();
		System.out.println("Rows="+s.m+" Columns="+s.n+" Probability of a Zero="+s.probability);
	    System.out.println("Varray elements in Stack:");
		
	    for(int i=Database.storevarray.size()-1;i!=-1;i--)
		{   a[i]=Database.storevarray.pop();
			System.out.print(a[i]+" ");
			
		}
		for(int i=0;i<d;i++)
		{
			Database.storevarray.push(a[i]);
		}
	}
}
