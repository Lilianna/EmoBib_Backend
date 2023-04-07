package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.models.entity.Borrowing;
import be.technobel.emobiblio.models.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
}
