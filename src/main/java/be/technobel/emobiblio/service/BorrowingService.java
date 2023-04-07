package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.BorrowingDTO;

public interface BorrowingService {


    BorrowingDTO borrowBook(Long bookId, Long userId);
}
