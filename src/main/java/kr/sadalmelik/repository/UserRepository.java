package kr.sadalmelik.repository;

import kr.sadalmelik.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
