package com.example.wbepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DietController {
    @RequestMapping("/Diet")
    public String showDietPage(){
        return "pages/diet";
    }
}
