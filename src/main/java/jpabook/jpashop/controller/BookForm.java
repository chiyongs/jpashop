package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

  private Long id;

  private String name;
  private int price;
  private int stockQuantity;

  private String author;
  private String isbn;

  public static BookForm createBookForm(Long id, String name, int price, int stockQuantity, String author, String isbn) {
    BookForm bookForm = new BookForm();
    bookForm.setId(id);
    bookForm.setName(name);
    bookForm.setPrice(price);
    bookForm.setStockQuantity(stockQuantity);
    bookForm.setAuthor(author);
    bookForm.setIsbn(isbn);

    return bookForm;
  }
}
