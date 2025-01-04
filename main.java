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
                {"What is the capital of France?", "a) Berlin", "b) Paris", "c) Madrid", "b"},
                {"What is 2 + 2?", "a) 3", "b) 4", "c) 5", "b"},
                {"What is the largest planet in our solar system?", "a) Earth", "b) Jupiter", "c) Mars", "b"},
                {"Which language is used for web development?", "a) Python", "b) JavaScript", "c) Java", "b"},
                {"Who wrote 'Hamlet'?", "a) Charles Dickens", "b) William Shakespeare", "c) Mark Twain", "b"}
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
            System.out.println(); // New line for better readability
        }

        // Display final score
        System.out.println("Quiz Completed! Your score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
