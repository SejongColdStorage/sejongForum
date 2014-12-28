package kr.sadalmelik.contoller;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ForumController {
    @Autowired
    ForumRepository forumRepository;

    @RequestMapping("/forum")
    public String forum(Model model) {
        List<Forum> forums = forumRepository.findAll();
        model.addAttribute(forums);

        return "forum/forumList";
    }

    @RequestMapping("/forum/{forumName}")
    public String post(String forumName){
        return null;
    }

}