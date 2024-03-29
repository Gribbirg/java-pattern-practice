package ru.mirea.practice15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.practice15.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<List<Author>> getAllBy();

    Optional<Integer> deleteAuthorById(Long id);
}
