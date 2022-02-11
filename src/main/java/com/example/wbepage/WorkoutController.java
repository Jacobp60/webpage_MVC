package com.example.wbepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkoutController {
    @RequestMapping("/Workout")
    public String showWorkoutPage() {
        return "pages/Workout";
    }
}
