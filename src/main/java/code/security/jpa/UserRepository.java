package code.security.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import code.security.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}
