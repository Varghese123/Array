package ca.sheridancollege.file;
import java.io.FileWriter;   
import java.io.IOException;

import ca.sheridancollege.createarray.Generate;
import ca.sheridancollege.createarray.Input; 
public class StoretoFile {
	
	public static void storeTofile(Input m)
	{
	
	try{
		FileWriter myWriter = new FileWriter("OriginalArray.txt");
	
		   for(int i=0;i<m.m;i++)
	
		   {    myWriter.write("\n");
	    
		         for(int j=0;j<m.n;j++)
	      
		         {   int [][] a=Generate.getArray();
	    	         myWriter.write(Integer.toString(a[i][j])+" ");
	    	  
	      }
	}
    
         myWriter.close();
    
	}
	catch(IOException e)
	{
		System.out.println("ERROR!");
	}
	}
}
