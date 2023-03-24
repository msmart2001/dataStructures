package Homework4;

public class Course {

    private String department;
    private int courseNumber;
    private String courseName;

    public Course(String department, int courseNumber, String courseName) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }
    public String getCourseName() {
        return courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    // Implement compareTo method (question 2 on homework 5)
    public int compareTo(Course otherCourse) {

        int departmentComparison = this.department.compareTo(otherCourse.department);
        if (departmentComparison != 0) {
            return departmentComparison;
        }

        // If departments are the same, compare by course number
        return Integer.compare(this.courseNumber, otherCourse.courseNumber);
    }




    // Other getters and setters

}
