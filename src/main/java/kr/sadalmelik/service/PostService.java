package kr.sadalmelik.service;


import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import org.springframework.data.domain.Page;

public interface PostService {
    public void write(Post post);
    public void modify(Post post);
    Page<Post> find(Forum forum, int pageNumber);
}
