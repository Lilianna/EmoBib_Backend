package be.technobel.emobiblio.models.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Reservation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "book_id")
        private Book book;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private User user;

        @Column(name = "reservation_date")
        private LocalDateTime reservationDate;

        public Reservation(Long id, Book book, User user, LocalDateTime reservationDate) {
                this.id = id;
                this.book = book;
                this.user = user;
                this.reservationDate = reservationDate;
        }

        public Reservation() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Book getBook() {
                return book;
        }

        public void setBook(Book book) {
                this.book = book;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public LocalDateTime getReservationDate() {
                return reservationDate;
        }

        public void setReservationDate(LocalDateTime reservationDate) {
                this.reservationDate = reservationDate;
        }
}
