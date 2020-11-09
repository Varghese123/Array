package ca.sheridancollege.view;

import ca.sheridancollege.Store.Database;

public class ViewText {
	
	public static void viewJarray2(int m,int n)
	{  
		System.out.println("Rows="+m+" Columns="+n);
	    System.out.println("Jarray elements in LinkedList:");
		for(int i=0;i<Database.storeJarray.size();i++)
		{
			System.out.print(Database.storeJarray.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void viewvarray2(int m,int n)
	{  int a[]=new int[Database.storevarray.size()];
	    int d=Database.storevarray.size();
		System.out.println("Rows="+m+" Columns="+n);
	    System.out.println("Varray elements in Stack:");
		for(int i=Database.storevarray.size()-1;i!=-1;i--)
		{
			a[i]=Database.storevarray.pop();
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<d;i++)
		{
			Database.storevarray.push(a[i]);
			
		}
		
	}

}
