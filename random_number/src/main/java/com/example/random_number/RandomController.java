package com.example.random_number;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RandomController {
	
@RequestMapping("/getrandom")
public ModelAndView getRandom() {
	System.out.println();
	ModelAndView modelAndView = new ModelAndView("welcome");
	modelAndView.addObject("key", "Your lottery number ::::");
	modelAndView.addObject("number", (int)(Math.random()*10000));
	
	modelAndView.addObject("key", "count down to the draw");
	modelAndView.addObject("number", (int)(Math.random()*10000));
	return modelAndView;	
	
	/*Map<String, Object> model = new HashMap<String, Object>();
	model.put("key", "your lottery number :::");
	model.put("value", (int)(Math.random()*10000));
	
	
	return new ModelAndView("welcome", "model", model);
	
	
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	    String dateString = "25/12/2019 09:30:45";
	    Date date;
		try {
			date = sdf.parse(dateString);
			System.out.println("Date: " + date);
			 
		    Timestamp timestamp = new Timestamp(date.getTime());
		    System.out.println("Timestamp: " + timestamp);
		    
		    java.util.Date date1 = new java.util.Date();
			 Timestamp timestamp1 = new Timestamp(date1.getTime());
			 System.out.println("NEW Timestamp: " + timestamp);
			 
			 long milliseconds = timestamp.getTime() - timestamp1.getTime();
			 
			    int seconds = (int) milliseconds / 1000;
			 
			    // calculate hours minutes and seconds
			    int days = seconds / 86400;
			    int hours = seconds / 3600;
			    int minutes = (seconds % 3600) / 60;
			    seconds = (seconds % 3600) % 60;

			    System.out.println("timestamp1: " + timestamp1);
			    System.out.println("timestamp2: " + timestamp2);
			 
			    System.out.println("Difference: ");
			    System.out.println(" Hours: " + hours);
			    System.out.println(" Minutes: " + minutes);
			    System.out.println(" Seconds: " + seconds);
			 } 
			 catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		 
		 
*/
	
}
}
