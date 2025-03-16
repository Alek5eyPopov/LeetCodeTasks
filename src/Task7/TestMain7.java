package Task7;

import Task15.Solution15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain7 {
    public static void main(String[] args) {

        Solution7 solution = new Solution7();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                System.out.println(solution.reverse(Integer.parseInt(line)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static int[] stringToMass(String str){
        String[] strArray = str.split(",");  // Разделяем строку по пробелам
        int[] intArray = new int[strArray.length];  // Создаем массив для целых чисел

        // Преобразуем каждый элемент строки в число и записываем в массив
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        return intArray;
    }

    private static String[] stringToMassStr(String str){
        return str.split(",");
    }
}
