package kr.sadalmelik.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/forum/{forumKey}")
    public String post(String forumKey) {

        return null;
    }

}
