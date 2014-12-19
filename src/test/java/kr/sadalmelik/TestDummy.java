package kr.sadalmelik;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDummy {

    private static List<Post> dummyPosts;
    private static List<Forum> dummyForums;
    private static List<User> dummyUsers;

    public static List<Post> getDummyPosts(){
        return dummyPosts;
    }

    public static List<Forum> getDummyForums(){
        return dummyForums;
    }

    public static List<User> getDummyUsers(){
        return dummyUsers;
    }


    static {
        dummyPosts = new ArrayList<>();
        dummyForums = new ArrayList<>();
        dummyUsers = new ArrayList<>();

        //user dummy데이터 설정.
        User user0 = new User();
        user0.setUsername("박세종");
        user0.setEmail("sejongpark@gmail.com");
        user0.setPassword("testpassword");
        dummyUsers.add(user0);

        //forum dummy data 설정
        Forum forum0 = new Forum();
        forum0.setForumName("tech");
        forum0.setDescription("test");
        dummyForums.add(forum0);

        Post post0 = new Post();
        post0.setForum(forum0);
        post0.setText("texttext");
        post0.setTitle("title");
        post0.setUpdateDate(new Date());
        post0.setUser(user0);
        dummyPosts.add(post0);

        Post post1 = new Post();
        post1.setForum(forum0);
        post1.setText("texttext");
        post1.setTitle("title");
        post1.setUpdateDate(new Date());
        post1.setUser(user0);
        dummyPosts.add(post1);

        Post post2 = new Post();
        post2.setForum(forum0);
        post2.setText("texttext");
        post2.setTitle("title");
        post2.setUpdateDate(new Date());
        post2.setUser(user0);
        dummyPosts.add(post2);
    }
}
