package net.examples.vaj.bookDetails;


import java.util.Arrays;
import java.util.List;

record Author(String id, String firstName, String lastName,String bookId) {

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling", "book-1"),
            new Author("author-2", "Herman", "Melville","book-2"),
            new Author("author-3", "Anne", "Rice","book-3")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
    }

    public static Author getAuthorById(String id) {
        return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
    }
}
