package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.AuthorDTO;
import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.form.AuthorForm;

import java.util.List;

public interface AuthorService {
//    public List<AuthorDTO> getAll();

    public List<AuthorDTO> findAllAuthors();

    public AuthorDTO findAuthorById(Long id);

    public void createAuthor(AuthorForm author);

    public void updateAuthor(Long id, AuthorForm author);

    public void deleteAuthor(Long id);

}
