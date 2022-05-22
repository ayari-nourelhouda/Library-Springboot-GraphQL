package com.projectLib.GraphQLLibrary.repository;

import com.projectLib.GraphQLLibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}