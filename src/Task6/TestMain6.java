package Task6;

import Task5.Solution5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain6 {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                System.out.println((solution.convert(line, 4)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
