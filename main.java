import java.util.Scanner;

public class main {
    private String userName;
    private int score;

    public static void main(String[] args) {
        main quizApp = new main();
        quizApp.startQuiz();
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        // Get user name
        System.out.print("Enter your name: ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! Welcome to the Quiz!");

        // Quiz questions
        String[][] questions = {
                {"Number of primitive data types in Java are?", "a) 6", "b) 7", "c) 8", "c"},
                {"What is the size of float and double in java?", "a) 64 and 64", "b) 32 and 64", "c) 64 and 32", "b"},
                {"Automatic type conversion is possible in which of the possible cases?", "a) Byte to Int", "b) Int to Long", "c) Int to Float", "b"},
                {"Select the valid statement.", "a) char[] ch = new char(5)", "b) char[] ch = new char[5]", "c) char[] ch = new char[]", "b"},
                {"When an array is passed to a method, what does the method receive?", "a) Copy of first element", "b) The reference of an array", "c) A copy of the array", "b"}
        };

        // Ask each question
        for (String[] question : questions) {
            System.out.println(question[0]);
            System.out.println(question[1]);
            System.out.println(question[2]);
            System.out.println(question[3]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            // Check answer and update score
            if (answer.equalsIgnoreCase(question[4])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + question[4]);
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz Completed! Your score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
