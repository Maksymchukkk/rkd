import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитання та правильні відповіді
        String[] questions = {
                "Question 1:When did you go to the cinema?\n" +
                        "a) Yesterday\n" +
                        "b) Last week\n" +
                        "c) In the morning\n" +
                        "d) Next month",

                "Question 2:Did you finish your homework?\n" +
                        "a) Yes, I did\n" +
                        "b) No, I didn't\n" +
                        "c) I'm doing it now\n" +
                        "d) I'll do it tomorrow",

                "Question 3:Where did they go on vacation?\n" +
                        "a) To the beach\n" +
                        "b) To the mountains\n" +
                        "c) To the park\n" +
                        "d) Nowhere",

                "Question 4:Did she buy a new car?\n" +
                        "a) Yes, she did\n" +
                        "b) No, she didn't\n" +
                        "c) She's going to buy one\n" +
                        "d) I'm not sure",

                "Question 5:What did you have for breakfast?\n" +
                        "a) Cereal\n" +
                        "b) Toast and eggs\n" +
                        "c) Pancakes\n" +
                        "d) I skipped breakfast"
        };

        char[] answers = {'a', 'a', 'b', 'a', 'b'};

        // Кількість запитань і кількість правильних відповідей
        int totalQuestions = questions.length;
        int correctAnswers = 0;

        // Ім'я курсанта
        System.out.print("Введіть ваше ім'я: ");
        String studentName = scanner.nextLine();

        // Цикл для проходження тесту
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            char studentAnswer;

            // Запитати користувача на введення варіанту відповіді
            do {
                System.out.print("Введіть варіант відповіді (a, b, c, d) або 'q' для виходу: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    // Користувач вибрав вихід з програми
                    System.out.println("Робота програми завершена.");
                    return;
                }

                if (input.length() == 1) {
                    studentAnswer = input.charAt(0);

                    // Перевірка, чи введено коректний варіант відповіді
                    if (studentAnswer >= 'a' && studentAnswer <= 'd') {
                        break;
                    }
                }

                System.out.println("Введено некоректний варіант відповіді.");
            } while (true);

            // Перевірка відповіді користувача
            if (studentAnswer == answers[i]) {
                correctAnswers++;
            }
        }

        // Обчислення відсотка правильних відповідей
        double percentage = (correctAnswers / (double) totalQuestions) * 100;
        System.out.println("Відсоток " + percentage);
    }
}
