package vv.lvov.MyFirstSpringBootApp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",
    defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }
    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "s",
            defaultValue = "") String s){
        return String.format("Hello %s!", s);
    }
}
