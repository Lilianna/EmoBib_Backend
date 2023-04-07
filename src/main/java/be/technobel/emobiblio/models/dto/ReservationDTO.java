package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Borrowing;
import be.technobel.emobiblio.models.entity.Reservation;
import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@Builder
public class ReservationDTO {
    private Long id;
    private Long bookId;

    private Long userId;
    private LocalDate reservationDate;

    public static ReservationDTO from(Reservation entity) {
        if (entity == null)
            return null;
        return ReservationDTO.builder()
                .id(entity.getId())
                .bookId(entity.getBook().getId())
                .userId(entity.getUser().getId())
                .reservationDate(LocalDate.from(entity.getReservationDate()))
                .build();
    }
}
