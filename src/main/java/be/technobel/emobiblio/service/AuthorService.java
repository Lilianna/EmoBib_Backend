package be.technobel.emobiblio.service;

import be.technobel.emobiblio.entity.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class AuthorService {
    public List<Author> findAllAuthors();

    public Author findAuthorById(Long id);

    public void createAuthor(Author author);

    public void updateAuthor(Author author);

    public void deleteAuthor(Long id);

    public Page<Author> findPaginated(Pageable pageable);

}