import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Check if the index is within bounds
            System.out.println("Day: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index. Please enter a value between 0 and 6.");
        }
    }
}

// "C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\lib\idea_rt.jar=50740:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "E:\Harsh\College\SEM-3\Java Projects\guvi-task3\out\production\guvi-task3" Weekday
//Enter day position (0-6): 2
//Day: Tuesday
//
//Process finished with exit code 0