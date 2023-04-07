package be.technobel.emobiblio.models.dto;

import be.technobel.emobiblio.models.entity.Borrowing;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BorrowingDTO {
    private Long id;
    private Long bookId;
    private String bookTitle;
    private Long userId;
    private String userName;
    private LocalDate borrowingDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
//    private Double fineAmount;

    public static BorrowingDTO from(Borrowing entity) {
        if (entity == null)
            return null;
        return  BorrowingDTO.builder()
                .id(entity.getId())

                                                .userName(entity.getUserName())
                                                        .borrowingDate(LocalDate.from(entity.getBorrowingDate()))
                                                                .dueDate(entity.getDueDate())
                                                                        .returnDate(LocalDate.from(entity.getReturnDate()))
                .build();
    }
}

// .bookId(entity.getBookId())
//         .bookTitle(entity.getBookTitle())
//         .userId(entity.getUserId())