package be.technobel.emobiblio.service.impl;

import be.technobel.emobiblio.exeption.NotFoundException;
import be.technobel.emobiblio.models.dto.AuthorDTO;
import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.form.AuthorForm;
import be.technobel.emobiblio.repository.AuthorRepository;
import be.technobel.emobiblio.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDTO> findAllAuthors() {
        return authorRepository.findAll().stream()
                .map(AuthorDTO::from)
                .toList();
    }

    @Override
    public AuthorDTO findAuthorById(Long id) {
        return authorRepository.findById(id)
                .map(AuthorDTO::from)
                .orElseThrow(() -> new NotFoundException(String.format("Author not found with ID %d", id)));
    }

    @Override
    public void createAuthor(AuthorForm author) {
        authorRepository.save(author.toEntity());
    }

    @Override
    public void updateAuthor(Long id, AuthorForm author) {
        Author toUpdate = authorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Author not found with ID %d", id)));

        toUpdate.setName(author.getName());
        toUpdate.setDescription(author.getDescription());

        authorRepository.save(toUpdate);
    }

    @Override
    public void deleteAuthor(Long id) {
        var author = authorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Author not found with ID %d", id)));

        authorRepository.deleteById(author.getId());
    }


}
