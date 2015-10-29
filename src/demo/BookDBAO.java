package demo;
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }
    public BookDetails getallBookDetails(String bookId1, String bookId2) {
        return createBook1(bookId1);

    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transform the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
    private BookDetails createBook1(String bookId1) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId1);
        details.setDescription("Web components for developers talks about how web components can transform the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(7);
        details.setOnSale(false);
        details.setPrice(14.99f);
        details.setTitle("1 components for developers");
        details.setYear(2013);
        return details;
    }
    private BookDetails createBook2 (String bookId2) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId2);
        details.setDescription("Web components for developers talks about how web components can transform the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
    private BookDetails createBook3 (String bookId3) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId3);
        details.setDescription("Web components for developers talks about how web components can transform the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
}