//this is my demo file and 2nd commit
public class Demo {
    public static void main(String[] args) {
       Textbook JavaBook = new Textbook("Intro to Java", "Dietel & Deitel", "Pearson");
       Instructor JavaInstructor = new Instructor("Penney", "Cameron", "G102") ;

       Course Advancedjava = new Course("Advanced Programming using Java", JavaInstructor, JavaBook);
        System.out.println(Advancedjava);

    }
    
}
