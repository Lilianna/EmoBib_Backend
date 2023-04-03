package be.technobel.emobiblio.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Borrowing {
@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "request_id", nullable = false)
private Long id;

@Column(nullable = false)
    private LocalDate date;

@Column(nullable = false)
private LocalDate issueDate;

@Column(nullable = false)
private LocalDate returnDate;

@Column(name = "fine_amount", nullable = false)
private Currency fineAmount;

//@ManyToOne
//@JoinColumn(name ="borrow_by", nullable = false)
//private User borrowBy;

}
