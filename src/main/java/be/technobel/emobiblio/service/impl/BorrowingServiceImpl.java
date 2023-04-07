package be.technobel.emobiblio.service.impl;

import be.technobel.emobiblio.exeption.ResourceNotFoundException;
import be.technobel.emobiblio.models.dto.BookDTO;
import be.technobel.emobiblio.models.dto.BorrowingDTO;
import be.technobel.emobiblio.repository.BookRepository;
import be.technobel.emobiblio.repository.BorrowingRepository;
import be.technobel.emobiblio.repository.UserRepository;
import be.technobel.emobiblio.service.BorrowingService;

public class BorrowingServiceImpl implements BorrowingService {

    private BorrowingRepository borrowingRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;

    @Override
    public BorrowingDTO borrowBook(Long bookId, Long userId) {
        BookDTO book = bookRepository.findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + bookId));
    }




}

