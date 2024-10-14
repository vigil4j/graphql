package net.examples.vaj.bookDetails;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
class BookController {

    @QueryMapping
    public Book bookById(@Argument("id") String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public Author authorById(@Argument("id") String id) {
        return Author.getAuthorById(id);
    }
    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

    @SchemaMapping
    public Book book(Author author) {
        return Book.getByBookId(author.bookId());
    }

}
