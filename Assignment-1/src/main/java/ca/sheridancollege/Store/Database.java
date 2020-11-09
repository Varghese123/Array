package ca.sheridancollege.Store;

//import java.util.Arrays;
import java.util.LinkedList;
//import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Database 
{
      public static LinkedList<Integer> storeJarray=new LinkedList<Integer>();
      public static Stack<Integer> storevarray=new Stack<Integer>() ;
      public static LinkedList<Integer> storelarray=new LinkedList<Integer>();
      
      
    

	public static LinkedList<Integer> getStoreJarray() {
		return storeJarray;
	}

	public static void setStoreJarray(LinkedList<Integer> storeJarray) {
		Database.storeJarray = storeJarray;
	}

	public static Stack<Integer> getStorevarray() {
		return storevarray;
	}

	public static void setStorevarray(Stack<Integer> storevarray) {
		Database.storevarray = storevarray;
	}
      
	
   
	
	
	
       
     }
	


