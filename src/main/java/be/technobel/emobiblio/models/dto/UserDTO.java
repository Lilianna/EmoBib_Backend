package be.technobel.emobiblio.models.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String password;


}
