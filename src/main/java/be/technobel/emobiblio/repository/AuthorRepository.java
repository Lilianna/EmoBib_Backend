package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.models.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthorRepository extends JpaRepository<Author, Long> {

}
