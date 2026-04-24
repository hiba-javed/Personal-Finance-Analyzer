//handles importing data from files
import java.io.*;
import java.util.*;
public class TransactionImporter {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("transactions.txt"))) {
            String line;
            br.readLine(); // Skip the header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", 4);
                if (data.length == 4) {
                    String date = data[0].trim();
                    String description = data[1].trim();
                    double amount = Double.parseDouble(data[2].trim());
                    String category = data[3].trim();
                    transactions.add(new Transaction(date, description, amount, category));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Print transactions 
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}