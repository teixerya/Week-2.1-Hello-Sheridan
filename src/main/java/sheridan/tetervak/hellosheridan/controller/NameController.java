package sheridan.tetervak.hellosheridan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameController {

    @GetMapping("/Input")
    public String input(){
        return "Input";
    }

    @GetMapping("/Output")
    public String output(@RequestParam String firstName,
                         @RequestParam String lastName,
                         Model model) {

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        return "Output";
    }

}
