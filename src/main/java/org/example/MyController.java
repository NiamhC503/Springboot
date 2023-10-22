package org.example;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @GetMapping("/")
    public String Countdown(Model model){
        DateTime now = DateTime.now();
        DateTime newYear = now.withMonthOfYear(1).withDayOfMonth(1).plusYears(1);
        int daysRemaining = Days.daysBetween(now,  newYear).getDays();

        model.addAttribute("daysRemaining", daysRemaining);
        return "Days until new year: " + daysRemaining;
    }
}