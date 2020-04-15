package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.Book;
import net.proselyte.springbootdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {


    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {  // binding make via constructor
        this.bookRepository = bookRepository;
    }

    public Book findById(Long id){             // read
    return bookRepository.getOne(id);
    }

    public List<Book> findAll(){               // read
        return bookRepository.findAll();
    }
    public Book saveBook(Book book){           // update
        return bookRepository.save(book);
    }

    public  void deleteById(Long id){        // delete
        bookRepository.deleteById(id);

    }

}
