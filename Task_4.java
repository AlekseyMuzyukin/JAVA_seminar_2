import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task_4 {
    // /**
    // *
    // */
    public static Scanner iScanner = new Scanner(System.in);

    public static int InputInt(String text) {

        System.out.println(text);
        return iScanner.nextInt();
    }

    public static char InputChar(String text) {
        System.out.println(text);
        return iScanner.next().charAt(0);

    }

    public static String InputString(String text) {
        System.out.println(text);
        if (iScanner.hasNextLine()) {
            return iScanner.nextLine();
        }
        return "";
    }

    public static boolean CheckActiv(String userInput) {
        return !userInput.equals("Stop");

    }

    public static float Function(int a, int b, char ch) {
        if (ch == '+')
            return a + b;
        else if (ch == '-')
            return a - b;
        else if (ch == '*')
            return a * b;
        else if (ch == '/' && b != 0)
            return a / b;
        else
            return -1;
    }

    public static void main(String[] args) throws IOException {
        // boolean CheckActiv = true;

        Logger logger = Logger.getLogger(Task_4.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);
        String active = " ";
        while (CheckActiv(active)) {
            int a = InputInt("Введите первое число");
            int b = InputInt("Введите второе число");
            char ch = InputChar("Введите знак");
            System.out.printf("Результат: %.1f\n", Function(a, b, ch));
            active = InputString("Для остановки набери Stop \n или нажми Enter");
            logger.info("");
        }
        iScanner.close();
    }

}
