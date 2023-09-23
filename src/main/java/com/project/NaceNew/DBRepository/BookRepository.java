package com.project.NaceNew.DBRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.NaceNew.Entity.Book;

//JPA will provide CRUD operations for free
public interface BookRepository extends JpaRepository<Book, Long> {


}