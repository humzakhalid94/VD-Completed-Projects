package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }


        @RequestMapping("/greeting2")
    public Result greeting2( @RequestParam(value="val1", defaultValue="0") Integer val1 ,
                             @RequestParam(value="val2", defaultValue="0") Integer val2) {

        // System.out.println(val1);
        Values value = new Values(val1,
                val2);
        return new Result(value.getA() , value.getB());


    }

}
