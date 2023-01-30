import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int temp;
        System.out.println(Arrays.toString(mas));
        Logger logger = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("SortedLog.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    logger.info(Arrays.toString(mas));
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
    
}
