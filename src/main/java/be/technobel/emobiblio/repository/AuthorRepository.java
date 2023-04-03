package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.models.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface AuthorRepository extends JpaRepository<Author, Long> {

}
