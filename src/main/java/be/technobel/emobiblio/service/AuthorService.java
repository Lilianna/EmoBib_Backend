package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.AuthorDTO;
import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.form.AuthorForm;

import java.util.List;

public interface AuthorService {

    List<AuthorDTO> getAllAuthors();

    AuthorDTO getAuthorById(Long id);

    void createAuthor(AuthorForm author);

    void updateAuthor(Long id, AuthorForm author);

   void deleteAuthor(Long id);

}
