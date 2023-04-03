package be.technobel.emobiblio.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
// ResponseStatus annotation cause Spring boot to reponse with the specified HTTP status code,
// whenever this exeption is thrown from your controller

public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private String fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s: '%S'", resourceName, fieldName, fieldValue)); // Post not found with id
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public  String getFieldName(){
        return resourceName;
    }
    public String getResourceName(){
        return resourceName;
    }

    public String getFieldValue(){
        return fieldValue;
    }
}
