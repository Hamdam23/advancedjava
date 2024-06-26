package createanddestroyobjects.chapter5.annotations;

@Doc(
    author = "John Wick",
    date = "10-05-2024"
)
public class Book {

  @ValidStringLength
  private String title;
  private String author;
  private int yearPublished;
  private String isbn;

  public Book(String title, String author, int yearPublished, String isbn) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    this.isbn = isbn;
  }

  // Getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYearPublished() {
    return yearPublished;
  }

  public void setYearPublished(int yearPublished) {
    this.yearPublished = yearPublished;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  // toString method for printing
  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", yearPublished=" + yearPublished +
        ", isbn='" + isbn + '\'' +
        '}';
  }

  public static void main(String[] args) {
    System.out.println(new Book("", "author", 2015, "isbn"));
  }
}
