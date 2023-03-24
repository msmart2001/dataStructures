package Homework4;
import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Course> courses;
    private boolean sorted;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        this.sorted = true;
    }

    public void addCourse(Course course) {
        courses.add(course);
        sorted = false;
    }

    @Override
    public String toString() {
        if (!sorted) {
            for (int i = 0; i < courses.size() - 1; i++) {
                int min = i;
                for (int j = i + 1; j < courses.size(); j++) {
                    if (courses.get(j).compareTo(courses.get(min)) < 0) {
                        min = j;
                    }
                }
                if (min != i) {
                    Course temp = courses.get(i);
                    courses.set(i, courses.get(min));
                    courses.set(min, temp);
                }
            }
            sorted = true;
        }
        String result = "Student: " + name + "\nCourses: \n";
        for (Course course : courses) {
            result += course.getDepartment() + " " + course.getCourseNumber() + ": " + course.getCourseName() + "\n";
        }
        return result;
    }

}
