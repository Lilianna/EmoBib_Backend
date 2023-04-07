package be.technobel.emobiblio.models.form;

import be.technobel.emobiblio.models.entity.Author;
import be.technobel.emobiblio.models.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 50)
    private String lastName;

    @NotBlank
    @Size(min = 6, max = 20)
    private String username;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    private String confirmPassword;

    @NotBlank
    @Email
    private String email;

    @Size(min = 10, max = 20)
    private String phoneNumber;

    public User toEntity(){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        return user;
    }

}
