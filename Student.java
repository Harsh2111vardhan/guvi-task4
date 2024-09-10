// User-defined Exception: AgeNotWithinRangeException
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User-defined Exception: NameNotValidException
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;

        // Check age validity
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21.");
        }

        this.age = age;

        // Check name validity
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }

        this.name = name;
    }

    // Display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Main method to test the class
    public static void main(String[] args) {
        try {
            // Create student with valid data
            Student student1 = new Student(101, "Alice", 18, "Computer Science");
            student1.display();

            // Create student with invalid age
            Student student2 = new Student(102, "Bob", 14, "Physics");
            student2.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage()); // Catch and display the exception message
        }

        try {
            // Create student with invalid name
            Student student3 = new Student(103, "John123", 19, "Mathematics");
            student3.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage()); // Catch and display the exception message
        }
    }
}

//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=50846:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\Harsh\College\SEM-3\Java Projects\guvi-task3\out\production\guvi-task3" Student
//Roll No: 101
//Name: Alice
//Age: 18
//Course: Computer Science
//Age is not between 15 and 21.
//Name contains invalid characters.
//
//Process finished with exit code 0