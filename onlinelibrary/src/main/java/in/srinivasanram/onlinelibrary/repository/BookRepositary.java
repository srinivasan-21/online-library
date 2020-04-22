package in.srinivasanram.onlinelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.srinivasanram.onlinelibrary.entity.Book;

public interface BookRepositary extends JpaRepository<Book, Long>{

}
