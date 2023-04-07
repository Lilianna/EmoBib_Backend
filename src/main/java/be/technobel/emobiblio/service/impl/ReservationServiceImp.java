package be.technobel.emobiblio.service.impl;

import be.technobel.emobiblio.models.dto.BookDTO;
import be.technobel.emobiblio.models.dto.ReservationDTO;
import be.technobel.emobiblio.models.entity.Reservation;
import be.technobel.emobiblio.repository.BookRepository;
import be.technobel.emobiblio.repository.ReservationRepository;
import be.technobel.emobiblio.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImp implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<ReservationDTO> getAllReservations() {
        return reservationRepository.findAll().stream()
                .map(ReservationDTO::from)
                .toList();
    }

    @Override
    public ReservationDTO getReservationById(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.orElse(null); // throw exception book is not available
    }
    @Override
    public ReservationDTO createReservation(Long bookId, Long userId, LocalDate reservationDate) {
        Optional<BookDTO> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            ReservationDTO reservation = ReservationDTO.from(new Reservation());
            reservation.setBookId(bookId);
            reservation.setUserId(userId);
            reservation.setReservationDate(reservationDate);
            return reservationRepository.save(reservation);
        } else {
            return null; //throw exception
        }
    }

    @Override
    public void deleteReservation(Long id) {
        Optional<Reservation> existingReservation = reservationRepository.findById(id);
        if (existingReservation.isPresent()) {
            reservationRepository.deleteById(id);
        }
    }
    @Override
    public List<ReservationDTO> getReservationsByUser(Long userId) {
        return reservationRepository.findById(userId)
                .stream()
                .map(ReservationDTO::from)
                .toList();
//                .orElseThrow(() -> new NotFoundException(String.format("Reservation not found with ID %d", userId)));
    }


    @Override
    public List<ReservationDTO> getReservationsByBook(Long bookId) {
        return reservationRepository.findById(bookId)
                .stream()
                .map(ReservationDTO:: from)
                .toList();
    }


}




