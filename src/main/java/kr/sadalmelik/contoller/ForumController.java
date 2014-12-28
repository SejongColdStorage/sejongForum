package kr.sadalmelik.contoller;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.repository.ForumRepository;
import kr.sadalmelik.repository.PostRepository;
import kr.sadalmelik.service.PostService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ForumController {
    @Autowired
    ForumRepository forumRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

    @RequestMapping("/forum")
    public String forum(Model model) {
        List<Forum> forums = forumRepository.findAll();
        List<ForumView> forumViews = this.extendToForumViews(forums);

        model.addAttribute(forumViews);

        return "forum/forumList";
    }

    @RequestMapping("/forum/{forumName}")
    public String post(String forumName) {
        return null;
    }


    private List<ForumView> extendToForumViews(List<Forum> forums){
        List<ForumView> forumViews = new ArrayList<>();
        for(Forum forum : forums){
            ForumView forumView = new ForumView(forum);
            //최근 게시물
            forumView.setRecentPosts(postService.findRecentPosts(forum));

            forumViews.add(forumView);
        }

        return forumViews;
    }

    //기존의 forum과는 다르게 최근 게시물이 5개씩 노출되어야 함.
    //해당 기능은 forum의 화면에서만 사용되므로 여기에서 정의한다.
    @Data
    private class ForumView extends Forum {

        public ForumView(Forum forum){
            //TODO modelMapper로 변경할 것.
            this.setId(forum.getId());
            this.setForumName(forum.getForumName());
            this.setDescription(forum.getDescription());
        }

        private List<Post> recentPosts;
    }

}