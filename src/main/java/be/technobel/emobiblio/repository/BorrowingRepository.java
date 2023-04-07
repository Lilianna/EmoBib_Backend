package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.models.entity.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long>  {
}
