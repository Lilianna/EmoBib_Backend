package be.technobel.emobiblio.service;

import be.technobel.emobiblio.models.dto.AuthorDTO;
import be.technobel.emobiblio.models.dto.ReservationDTO;
import be.technobel.emobiblio.models.entity.Reservation;
import be.technobel.emobiblio.models.form.AuthorForm;
import be.technobel.emobiblio.models.form.ReservationForm;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    public List<ReservationDTO> getAllReservations();

    public ReservationDTO  getReservationById(Long id);

    public void createReservation(ReservationForm reservation);

    public void updateReservation(Long id, ReservationForm reservation);

    ReservationDTO createReservation(Long bookId, Long userId, LocalDate reservationDate);

    public void deleteReservation(Long id);

    public  List<ReservationDTO> getReservationsByUser(Long userId);
    //Retrieve a list of reservations for a specified user.

    List<ReservationDTO> getReservationsByBook(Long bookId);
    //Retrieve a list of reservations for a specified book.
}
