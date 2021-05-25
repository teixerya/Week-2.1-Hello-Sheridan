package sheridan.tetervak.hellosheridan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.tetervak.hellosheridan.domain.User;

@Controller
public class NameController {

    private final Logger logger = LoggerFactory.getLogger(NameController.class);

    @GetMapping("/Input")
    public String input(){
        logger.trace("input() was called");
        return "Input";
    }

    @GetMapping("/Output")
    public String output(@Validated @ModelAttribute User user,
                         BindingResult bindingResult,
                         Model model) {

        logger.trace("output() was called");
//        var user = new User(firstName,lastName);
        logger.debug("user = " + user);
        if(bindingResult.hasErrors()){
            return "Input";
        }


        model.addAttribute("user", user);
        return "Output";
    }

}
