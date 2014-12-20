package kr.sadalmelik;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.domain.User;
import kr.sadalmelik.repository.ForumRepository;
import kr.sadalmelik.repository.PostRepository;
import kr.sadalmelik.repository.UserRepository;
import kr.sadalmelik.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationTests.class)
@Transactional
public class SejongBoardFeature {

    @Autowired
    PostService postService;
    @Autowired
    PostRepository postRepository;
    @Autowired
    ForumRepository forumRepository;
    @Autowired
    UserRepository userRepository;

    //시나리오1
    @Test
    public void scenario1() {
        // 1. 사용자가 회원가입을 합니다.
        User user = new User();
        user.setUsername("username");
        user.setPassword("userpassword");
        user.setEmail("user00@sejongForum.com");
        userRepository.save(user);

        // 2. 게시판에 접속합니다.
        List<Forum> forums = forumRepository.findAll();

        // 2.1 첫번째 게시판을 선택합니다.
        Forum forum = forums.get(0);

        // 2.2 forum의 post 정보를 가지고 옵니다.
        postService.find(forum, 1);

        // 3. 다른 페이지로 이동합니다.
        postService.find(forum, 2);

        // 4. 새 글을 작성합니다.
        Post post = new Post();
        post.setTitle("title");
        post.setText("테스트 문자열입니다.");
        post.setUser(user);
        post.setForum(forum);
        post.setTagList(Arrays.asList("tag1", "tag2", "tag3"));

        postService.write(post);

        // 5. 작성된 글을 읽습니다.
        postRepository.findOne(post.getId());

        // 6. 작성된 글을 수정합니다.
        post.setText("내부 문자열은 변경합니다.");
        postService.modify(post);

        // 7. 작성된 글을 삭제합니다.
        postRepository.delete(post);
    }

}
