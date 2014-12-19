package kr.sadalmelik.repository;

import kr.sadalmelik.domain.Forum;
import kr.sadalmelik.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    public Page<Post> findByForum(Forum forum, Pageable pageable);
}
