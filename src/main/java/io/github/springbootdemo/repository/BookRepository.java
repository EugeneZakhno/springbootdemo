package io.github.springbootdemo.repository;

import io.github.springbootdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
