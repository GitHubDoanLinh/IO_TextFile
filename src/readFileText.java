import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class readFileText {
    public static void main(String[] args) {
        String fileName = "Test.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));) {
            long sum = 0;
            while (true) {
                String lineRead = fileReader.readLine();
                if (lineRead == null) {
                    // End of file is reached
                    break;
                }
                long num = Integer.parseInt(lineRead);
                sum += num;
            }// end of while

            System.out.println(sum);
        }// end of try block

        catch (IOException ioex) {
            System.err.println("Error !!!");
        }// end of catch block
    }
}
