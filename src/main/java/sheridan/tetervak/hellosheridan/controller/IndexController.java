package sheridan.tetervak.hellosheridan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final Logger logger =LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = {"/", "/Index"})
    public String index(){
        logger.trace("index()  was called");
        return "Index";

    }
}
