package be.technobel.emobiblio.models.form;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BorrowingForm {

    @NotBlank
    private Long bookId;

    @NotBlank
    @FutureOrPresent
    private LocalDate borrowingDate;

    @NotBlank
    private LocalDate dueDate;


}
