package org.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/testConextionTodataBase")
    public String database(Model model) {
     String message;
        try {
            jdbcTemplate.execute("SELECT 1");
            message = "Connection to database is successful";
        } catch (Exception e) {
            message = "Connection to database failed";
        }
        model.addAttribute("message", message);
        return "database";


    }

}
