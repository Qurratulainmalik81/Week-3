public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String t, String a, String p)
    {
        this.title = t;
        this.author = a;
        this.publisher = p;

    }
  public Textbook(Textbook tb)
    {
        this.title = tb.title;
        this.author = tb.author;
        this.publisher = tb.publisher;
    }
    public void set(String t, String a, String p)
    {
        this.title = t;
        this.author = a;
        this.publisher = p;
    }
    public String toString()
    {
        return (this.title + " Written by " + this.author + " published by " + this.publisher);
    }
}
