package sheridan.tetervak.hellosheridan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/Hello")
    public String hello1(@RequestParam(defaultValue = "Sheridan") String name, Model model){
        logger.trace("hello1() was called");
        logger.debug("name = " + name);
        model.addAttribute("name", name);
        return "Hello";
    }

    @GetMapping("/Hello/{name}")
    public String hello2(@PathVariable String name, Model model){
        logger.trace("hello2() was called");
        logger.debug("name = " + name);
        model.addAttribute("name", name);
        return "Hello";
    }



}
