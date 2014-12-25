package kr.sadalmelik.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForumController {
    @RequestMapping("/")
    public String forum() {
        return "greeting";
    }
}