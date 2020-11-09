package ca.sheridancollege.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import Readfromfile.Read_File;
import ca.sheridancollege.Store.Database;
import ca.sheridancollege.createarray.Generate;
import ca.sheridancollege.createarray.Input;
import ca.sheridancollege.file.StoretoFile;
import ca.sheridancollege.view.View;
import ca.sheridancollege.view.ViewText;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String getData(Model model)
	
	{   
		model.addAttribute("Size",new Input());
        return "add.html";
	}
	
	@GetMapping("/add")
	public String addData(Model model,@ModelAttribute Input size)
	
	{    if(size.m==0||size.n==0)
	      {
		    Read_File.readFile();
		    Generate.jArray(Read_File.fi,Read_File.si);
            Generate.vArray(Read_File.fi,Read_File.si);
            Generate.larray(Read_File.fi,Read_File.si);
            ViewText.viewJarray2(Read_File.fi,Read_File.si);
            ViewText.viewvarray2(Read_File.fi,Read_File.si);
         
            model.addAttribute("Size",new Input());
	      }
    	   else {
		        size.setM(size.m);
	            size.setN(size.n);
	            size.setProbability(size.probability);
	  
	            Generate.generate(size);
	            Generate.jArray(size);
	            Generate.vArray(size);
	            Generate.larray(size);
	            StoretoFile.storeTofile(size);
	  
	          
	 
	            View.viewJarray(size);
	            View.viewvarray(size);
	            model.addAttribute("Size",new Input());
		
    	    }
		
   		
   		return "add.html";
   		
	}
	@GetMapping("/view")

	public static String viewJarray(Model model)
	{ 
		model.addAttribute("Jarray",Database.storeJarray);
		model.addAttribute("varray", Database.storevarray);
	    model.addAttribute("larray", Database.storelarray);
	    return "view.html";
	}
	

}
