/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author ridri
 */
public class BookNotInStock extends Book {
    int requestField = 0;
    public BookNotInStock(String title, String author, String publisher, double costPrice, boolean isProcured, int requestField) {
        super(title, author, publisher, costPrice, isProcured);
        this.requestField = requestField;
    }
    public BookNotInStock(Book b, int requestField) {
        super(b.title, b.author, b.publisher, b.costPrice, b.isProcured);
        this.requestField = 1;
    }
    public BookNotInStock(String title, String author, String publisher, double costPrice, boolean isProcured) {
        super(title, author, publisher, costPrice, isProcured);
    }
    public BookNotInStock(Book b) {
        super(b.title, b.author, b.publisher, b.costPrice, b.isProcured);
        this.requestField = 1;
    }
    public void incrementRequestField() {
        this.requestField += 1;
    }
    public int getRequestField() {
        return requestField;
    }
}
