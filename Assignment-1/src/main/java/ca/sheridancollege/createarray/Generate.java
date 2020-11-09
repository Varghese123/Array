package ca.sheridancollege.createarray;

import ca.sheridancollege.Store.Database;

public class Generate {
	 
	private static int array[][]=new int[10][10];
	
	private static int[] varray=new int[10];
	private static int[] jarray=new int[20];
	private static int[] larray=new int[15]; 
	
	public static void generate(Input m)
	
	{
		for(int i=0;i<m.m;i++)
		{
			for(int j=0;j<m.n;j++)
			{   if(Math.random()<=m.probability)
			            {array[i][j]=0;
			            }
			  else
			    	array[i][j]=(int) Math.floor(Math.random()*10);
			      //  System.out.println(array[i][j]);
			}
				
		}
		
	}
	
	public static void vArray(Input m)
	{   int h=0;
	System.out.println("Varray is: ");
		for(int i=0;i<m.m;i++)
		{
			for(int j=0;j<m.n;j++)
			{
				if(array[i][j]!=0)
				{  
					varray[h]=array[i][j];
					Database.storevarray.push(array[i][j]);
					System.out.print( varray[h]+" ");
					h++;
					
				}
				
					
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public static int[][] getArray() {
		return array;
	}

	public static void setArray(int[][] array) {
		Generate.array = array;
	}

	public static int[] getVarray() {
		return varray;
	}

	public void setVarray(int[] varray) {
		Generate.varray = varray;
	}

	public static int[] getJarray() {
		return jarray;
	}

	public void setJarray(int[] jarray) {
		Generate.jarray = jarray;
	}

	public static void jArray(Input m)
	{
		for(int i=0;i<m.m;i++)
		{
			for(int j=0;j<m.n;j++)
			{
				if(array[i][j]!=0)
		
					{jarray[i]=j;
					 Database.storeJarray.add(j);
					
					 
					}
			}
		}
	}
	
   public static void larray(Input m)
   { 
     int h=0;
     int k;
     int c=0;
     System.out.println("Larray is: ");
	   for(int i=0;i<m.m;i++)
		{ 
			for(int j=0;j<m.n;j++)
			{
				while(array[i][j]!=0)
		
					{     for( k=c;k<varray.length;k++)
					           { 
						           if(array[i][j]==varray[k])
					                       
					                 {
						        	   larray[h]=k;
						        	   Database.storelarray.add(k);
					                  System.out.print( larray[h]+" ");
					                  c=k;
					                  c++;
					                  h++;
					                  
					                    k=varray.length;
					                    j=m.n;		                   
					                  }			      
					           }				
					}
			
			}			
		}
	   System.out.println();
			
   }

public static int[] getLarray() {
	return larray;
}

public static void setLarray(int[] larray) {
	Generate.larray = larray;
}

public static void jArray(int m,int n)
{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(array[i][j]!=0)
	
				{jarray[i]=j;
				 Database.storeJarray.add(j);
				
				}
		}
	}
}

public static void larray(int m,int n)
{ 
  int h=0;
  int k;
  int c=0;
  System.out.println("Larray is: ");
	   for(int i=0;i<m;i++)
		{ 
			for(int j=0;j<n;j++)
			{
				while(array[i][j]!=0)
		
					{     for( k=c;k<varray.length;k++)
					           { 
						           if(array[i][j]==varray[k])
					                       
					                 {
						        	   larray[h]=k;
						        	   Database.storelarray.add(k);
					                  System.out.print( larray[h]+" ");
					                  c=k;
					                  c++;
					                  h++;
					                  
					                    k=varray.length;
					                    j=n;		                   
					                  }			      
					           }				
					}
			
			}			
		}
	   System.out.println();
	   System.out.println();
			
}
public static void vArray(int m,int n)
{int h=0;
System.out.println("Varray is: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(array[i][j]!=0)
			{
				varray[h]=array[i][j];
				Database.storevarray.push(array[i][j]);
				System.out.print( varray[h]+" ");
				h++;
				
			}
			
				
		}
	}
	System.out.println();
}


   }
