package be.technobel.emobiblio.repository;

import be.technobel.emobiblio.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
