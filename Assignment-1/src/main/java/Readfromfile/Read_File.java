package Readfromfile;

import java.io.File;
import java.util.Scanner;

import ca.sheridancollege.createarray.Generate;

public class Read_File 
{ public static int fi,si;
	public static void readFile()
	{
	
	 try {
	  
	       File file = new File("src/main/resources/static/Assignment 1.dat");
	       Scanner s= new Scanner(file);
	  
	        int a1[][]=new int[10][10];
	   
	            while(s.hasNext())
	 
	                {    fi=s.nextInt();
	                     si=s.nextInt();
	                     //s.nextLine();
	                     
		 
	                   for(int i=0;i<fi;i++)
	                       { System.out.println();
	    	                      for(int j=0;j<si;j++)
	    	                         {    
	    	                           	  a1[i][j]=s.nextInt();
	    	                           	  System.out.print(a1[i][j]+" ");
	    	                         }
	                        }
	                                 System.out.println();
	                                 Generate.setArray(a1); 
                     }
	                                 s.close();
	       }
	    
    
	    
	  catch(Exception e)
	  {
		  System.out.println("Error"+e);
	  }

	}

}
