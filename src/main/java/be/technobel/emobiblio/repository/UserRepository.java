package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
