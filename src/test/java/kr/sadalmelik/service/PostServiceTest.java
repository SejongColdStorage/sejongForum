package kr.sadalmelik.service;

import kr.sadalmelik.ApplicationTests;
import kr.sadalmelik.TestDummy;
import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.domain.User;
import kr.sadalmelik.repository.ForumRepository;
import kr.sadalmelik.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationTests.class)
@Transactional
public class PostServiceTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PostService postService;
    @Autowired
    ForumRepository forumRepository;

    @Before
    public void setup() {

    }

    @Test
    public void testWrite() {
        Forum forum = forumRepository.findAll().get(0);
        User user = userRepository.findAll().get(0);

        Post post = TestDummy.getDummyPosts().get(0);
        post.setUser(user);
        post.setForum(forum);

        long currentItemSize = postService.find(forum, 1).getTotalElements();
        postService.write(post);

        assertThat(postService.find(forum, 1).getTotalElements(), is(currentItemSize + 1));
    }

    @Test
    public void testModify() {
    }
}