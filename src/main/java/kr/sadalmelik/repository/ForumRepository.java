package kr.sadalmelik.repository;

import kr.sadalmelik.domain.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum, Long>{

}
