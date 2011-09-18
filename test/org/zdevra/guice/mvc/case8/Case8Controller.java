package org.zdevra.guice.mvc.case8;

import org.zdevra.guice.mvc.Controller;
import org.zdevra.guice.mvc.ModelName;
import org.zdevra.guice.mvc.Path;
import org.zdevra.guice.mvc.RequestParameter;
import org.zdevra.guice.mvc.views.ToView;

@Controller
@ToView("default")
public class Case8Controller {
	
	
	@Path("/int/single") @ModelName("msg")
	public String convertInt(@RequestParameter("number") int x) 
	{
		if (x == 1) {
			return "ok";
		}
		return "fail";
	}
	
	
	@Path("/int/array") @ModelName("msg")
	public String convertIntArray(@RequestParameter("array") int[] x) 
	{
		if (x == null) return "fail";
		if (x.length != 2) return "fail";
		if (x[0] != 1) return "fail";
		if (x[1] != 2) return "fail";		
		return "ok";
	}
	
	
	@Path("/integer/single") @ModelName("msg")
	public String convertInteger(@RequestParameter("number") Integer x) 
	{
		if (x == null) return "fail";
		if (x != 1) return "fail";		
		return "ok";
	}
	
	
	@Path("/integer/array") @ModelName("msg")
	public String convertInteger(@RequestParameter("array") Integer[] x) 
	{
		if (x == null) return "fail";
		if (x.length != 2) return "fail";
		return "ok";
	}

}