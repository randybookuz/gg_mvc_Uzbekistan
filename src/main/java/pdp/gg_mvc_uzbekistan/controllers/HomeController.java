package pdp.gg_mvc_uzbekistan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/api/v1")
public class HomeController {
    @GetMapping("/")
    public  String home(ModelAndView model){
        return "home/home";
    }
    @GetMapping("/facts")
    public  String facts(ModelAndView model){
        return "facts";
    }

}
