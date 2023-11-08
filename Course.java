public class Course {
    private String courseName;
    private Textbook TB;
    private Instructor Ins;

    public Course(String n, Instructor in, Textbook tb)
    {

        this.courseName = n;
        this.Ins = in;
        this.TB = tb;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Instructor getIns() {
        return Ins;
    }
    public void setIns(Instructor ins) {
        Ins = ins;
    }
    public void setTB(Textbook tB) {
        TB = tB;
    }
    public Textbook getTB() {
        return TB;
    }
    public String toString()
    {
        return(this.courseName + " is taught by " + this.Ins + " with Textbook = " + this.TB);
    }
}
