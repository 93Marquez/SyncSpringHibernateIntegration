package spring.mvc.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/indexpage") 
@Controller
public class firstController {

	@RequestMapping("/submitForm")  
	public String suForm(Model model)  
	{  
	      //create a indexPojo object   
	    indexPojo ip1=new indexPojo();  
	      
	    //provide indexPojo object to the model   
	    model.addAttribute("ipojo", ip1);  
	    return "UpdateRecord";  
	}  

	@RequestMapping("/RecordUpdated")  
	public String ReUPD(@ModelAttribute("ipojo")indexPojo ip1)  
	{  
		// @ModelAttribute binds form data to the object 	 
		 
		    return "Confirmation";  
		}  
	    
	}  
	
	
	
