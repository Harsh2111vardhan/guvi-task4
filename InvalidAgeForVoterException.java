// User-defined Exception: InvalidAgeForVoterException
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        this.voterId = voterId;
        this.name = name;

        // Check if the voter age is valid
        if (age < 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter. Age must be 18 or above.");
        }

        this.age = age; // Only executed if no exception is thrown
    }

    // Display Voter details
    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Voter class
    public static void main(String[] args) {
        try {
            Voter voter = new Voter(101, "Alice", 16);  // This will throw the InvalidAgeForVoterException
            voter.display();
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage()); // Catch and display the custom exception message
        }

        try {
            Voter validVoter = new Voter(102, "Bob", 22);  // This will not throw an exception
            validVoter.display();
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }
}

//"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=50853:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\Harsh\College\SEM-3\Java Projects\guvi-task3\out\production\guvi-task3" Voter
//Invalid age for voter. Age must be 18 or above.
//Voter ID: 102
//Name: Bob
//Age: 22
//
//Process finished with exit code 0