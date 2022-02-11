package com.example.wbepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecoveryController {
    @RequestMapping("/Recovery")
    public String ShowRecoveryPage() {
        return "pages/Recovery";
    }
}
