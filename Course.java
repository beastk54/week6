package week6;
/*
 * Brandon Kavanaugh 
 * Ex13_13
 */
import java.util.ArrayList;

public class Course implements Cloneable{

    String courseName;
    ArrayList<String> classList = new ArrayList<>();

    public Course(String Name) {
        courseName = Name;
    }
    public Course(String Name, ArrayList<String> c) {
        courseName = Name;
        classList=c;
    }

    public void addStudent(String student) {

    	classList.add(student);
    }

    public String[] getClassList() {
        return classList.toArray(new String[classList.size()]);
    }

    public int getClassSize() {
        return classList.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

    	classList.remove(student);

    }

    public void clear(){
    	classList.clear();
    }
    public Course Clone() {
        return new Course(courseName,classList);
    }

}
