package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
