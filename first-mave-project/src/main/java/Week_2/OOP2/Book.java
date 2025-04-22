package Week_2.OOP2;

public class Book {
     String title;
     String author;
     int nrOfPages;

    public Book(String title, String author, int nrOfPages) {
        this.title = title;
        this.author = author;
        this.nrOfPages = nrOfPages;
    }
    public void describe() {
        System.out.println("This book is " + title + " by the author " + author + " and has " + nrOfPages + " pages");
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor (String author) {
        this.author = author;
    }




//    public int getPages () {
//        return pages;
//    }
//    public void setPages(int pages) {
//        if (pages > 0) {
//            this.pages = pages;
//        } else {
//            System.out.println("a book must have at least one page!");
//        }
    }


