package Task5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain5 {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                System.out.println((solution.longestPalindrome(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
