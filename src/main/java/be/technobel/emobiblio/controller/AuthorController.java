package be.technobel.emobiblio.controller;

import be.technobel.emobiblio.models.dto.AuthorDTO;
import be.technobel.emobiblio.models.form.AuthorForm;
import be.technobel.emobiblio.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@ResponseBody
//@RequestBody: retrieving the HTTP request body and automatically converting it into the Java object
// tell controller that the object returned is automatically serialized into JSON
// and passed back into HttpResponse object
//@ResponseStatus(HttpStatus.CREATED)

@CrossOrigin("*")
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    // GET request to retrieve all books
    @GetMapping(value = "/", produces = "application/json")
    // to map HTTP GET request onto specific handler method
    public List<AuthorDTO> getAll() {
        return authorService.getdAllAuthors();
    }

    @PostMapping
    //PostMapping("/api/create": mapping HTTP POST request onto specific handler method
    public void insert(@RequestBody @Valid AuthorForm form)
    { authorService.createAuthor(form);}





}
