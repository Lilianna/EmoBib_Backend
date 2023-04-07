package be.technobel.emobiblio.models.form;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationForm {
    @NotBlank
    private Long bookId;

    @NotBlank
    private Long userId;

    @NotNull
    @FutureOrPresent
    private LocalDate reservationDate;




}
