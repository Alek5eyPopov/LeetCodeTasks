package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain4 {
    public static void main(String[] args) {

        Solution4 solution = new Solution4();
        int[] first;
        int[] second;
        String line;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            line = reader.readLine();
            if (line.equals("exit")) return;
            first = stringToMass(line);
            line = reader.readLine();
            if (line.equals("exit")) return;
            second = stringToMass(line);
            System.out.println(solution.findMedianSortedArrays(first, second));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int[] stringToMass(String str) {
        String[] strArray = str.split(",");  // Разделяем строку по пробелам
        int[] intArray = new int[strArray.length];  // Создаем массив для целых чисел

        // Преобразуем каждый элемент строки в число и записываем в массив
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        return intArray;
    }

    private static String[] stringToMassStr(String str) {
        return str.split(",");
    }
}
