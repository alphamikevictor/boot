package springboot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.pojo.Greeting;

@RestController
public class GreetingController {
	
	public final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/greeting/{greet}")
	@ResponseBody
	public Greeting getGreeting(@PathVariable(name="greet",required=true) String greet) {
		return new Greeting(counter.incrementAndGet(),greet);
	}
}
