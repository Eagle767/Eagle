package controlpack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bi")
public class ControllerDemo {

	@RequestMapping(method =RequestMethod.GET, value = "/hello" )
	public void hello() {
		System.out.println("Hello.......");
	}
	
	@RequestMapping(method =RequestMethod.GET, value = "/hello1" )
	public void hello1(@RequestParam("name")String name,@RequestParam("pass")String pass) {
		System.out.println("Hello......."+name+":"+pass);
	}
	
	@RequestMapping(method =RequestMethod.GET, value = "/hello2/{path}" )
	public void hello(@PathVariable("path")String path) {
		System.out.println("Hello......."+path);
	}
	
	@RequestMapping(method =RequestMethod.GET, value = "/hello3/{path}/{path1}" )
	public void hello(@PathVariable("path")String path,@PathVariable("path1")String path1) {
		System.out.println("Hello......."+path+":"+path1);
	}
	
}
