package be.technobel.emobiblio.controller;

import be.technobel.emobiblio.models.dto.ReservationDTO;
import be.technobel.emobiblio.service.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
//@CrossOrigin('*')
@RequestMapping("/request")
public class BorrowingController {
    private final LocalDate reservationDate;
    private final ReservationService reservationService;


    public BorrowingController(LocalDate reservationDate, ReservationService reservationService) {
        this.reservationDate = reservationDate;
        this.reservationService = reservationService;
    }
//    @GetMapping(path = "/reservations")


}
