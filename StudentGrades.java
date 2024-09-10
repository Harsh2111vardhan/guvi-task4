import java.util.HashMap;

public class StudentGrades {
    // HashMap to store student names and their grades
    private HashMap<String, Integer> studentGrades = new HashMap<>();

    // Method to add a student and grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " does not exist.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println(name + " does not exist.");
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();

        // Adding students and grades
        sg.addStudent("John", 85);
        sg.addStudent("Mary", 92);

        // Display grade
        sg.displayGrade("John");

        // Remove student
        sg.removeStudent("Mary");

        // Try displaying removed student
        sg.displayGrade("Mary");
    }
}

//OUTPUT
//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=50759:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\Harsh\College\SEM-3\Java Projects\guvi-task3\out\production\guvi-task3" StudentGrades
//John's grade: 85
//Mary has been removed.
//Mary does not exist.
//
//Process finished with exit code 0
