package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
