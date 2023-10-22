package org.example;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountdownController {
    @GetMapping("/countdown")
    public String Countdown(Model model){
        DateTime now = DateTime.now();
        DateTime newYear = now.withMonthOfYear(1).withDayOfMonth(1).plusYears(1);
        int daysRemaining = Days.daysBetween(now,  newYear).getDays();

        model.addAttribute("daysRemaining", daysRemaining);
        return "countdown";
    }
}
