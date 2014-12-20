package kr.sadalmelik.service;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import kr.sadalmelik.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by SejongPark on 14. 12. 4..
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public void write(Post post) {
        if(post.getWriteDate() == null) {
            post.setWriteDate(new Date());
        }

        postRepository.save(post);
    }

    @Override
    public void modify(Post post){
        post.setUpdateDate(new Date());
    }

    @Override
    public Page<Post> find(Forum forum, int pageNumber){
        Sort sort = new Sort(Sort.Direction.DESC, new String[]{"writeDate"});
        PageRequest pageRequest = new PageRequest(pageNumber, 10, sort);

        return postRepository.findByForum(forum, pageRequest);
    }
}
