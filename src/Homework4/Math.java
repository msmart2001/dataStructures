package Homework4;

import java.util.ArrayList;

public class Math {

    // returns true or false based on if courseload qualifies
    public boolean qualifyForMajor(ArrayList<Course> list) {
        int mathCoursesAbove200LevelCount = 0;
        for (Course course : list) {
            if (course.getDepartment().equals("Math") && course.getCourseNumber() > 200) {
                mathCoursesAbove200LevelCount++;
            }
        }
        return mathCoursesAbove200LevelCount >= 3;
    }

    // Override toString() method to return "Math"
    @Override
    public String toString() {
        return "Math";
    }
}
