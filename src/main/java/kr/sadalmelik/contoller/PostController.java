package kr.sadalmelik.contoller;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.repository.ForumRepository;
import kr.sadalmelik.repository.PostRepository;
import kr.sadalmelik.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @Autowired
    ForumRepository forumRepository;

    @Autowired
    PostService postService;

    @Autowired
    PostRepository postRepository;

    @RequestMapping("/forum/{forumKey}")
    public String postList(
            String forumKey,
            @RequestParam(defaultValue = "1", required = false) int pageNumber) {

        //key를 기준으로 forum을 찾는다.
        Forum forum = forumRepository.findByForumKey(forumKey);
        Page<Post> posts = postService.find(forum, pageNumber - 1);

        return "/post/postList";
    }

    @RequestMapping("/forum/{forumKey}/{postNumber}")
    public String getPost(String forumKey,
                          long postId,
                          @RequestParam(defaultValue = "1", required = false) int pageNumber) {

        Forum forum = forumRepository.findByForumKey(forumKey);
        Post post = postRepository.findOne(postId);

        return null;
    }
}
