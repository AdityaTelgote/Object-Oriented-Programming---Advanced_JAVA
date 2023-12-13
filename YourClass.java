/*Question
 * import java.util.*;

public class YourClass {
    private Map<String, Course> courseList; // Assuming courseList is a map of course names to Course objects
    private Map<String, List<Course>> coursesEnrolledByStudents; // Assuming coursesEnrolledByStudents is a map of student IDs to courses

    // Constructor or other methods that initialize courseList and coursesEnrolledByStudents

    public void enrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);
        if (course == null) {
            throw new CourseNotFoundException("Course " + courseName + " not found");
        }

        if (!studentExists(studentID)) {
            throw new StudentNotFoundException("Student with ID " + studentID + " not found");
        }

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }

    // Method to check if the student exists
    private boolean studentExists(String studentID) {
        // Logic to check if the student exists in your system
        // Replace this with your own logic to check for student existence
        // Example: return studentList.containsKey(studentID);
        // Assume studentList is a Map<String, Student> containing students
        return studentList.containsKey(studentID);
    }
    
    // Other methods and code
}

 */

package Aditya;

import java.util.*;

public class YourClass {
    private Map<String, Course> courseList; // Assuming courseList is a map of course names to Course objects
    private Map<String, List<Course>> coursesEnrolledByStudents; // Assuming coursesEnrolledByStudents is a map of student IDs to courses

    // Constructor or other methods that initialize courseList and coursesEnrolledByStudents

    public void enrollStudents(String courseName, String studentID) throws Exception {
        Course course = courseList.get(courseName);
        if (course == null) {
            throw new Exception("Course " + courseName + " not found");
        }

        if (!studentExists(studentID)) {
            throw new Exception("Student with ID " + studentID + " not found");
        }

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }

    // Method to check if the student exists
    private boolean studentExists(String studentID) {
        Map<String, Course> studentList = null;
		// Logic to check if the student exists in your system
        // Replace this with your own logic to check for student existence
        // Example: return studentList.containsKey(studentID);
        // Assume studentList is a Map<String, Student> containing students
        return studentList.containsKey(studentID);
    }
    
    // Other methods and code
}
