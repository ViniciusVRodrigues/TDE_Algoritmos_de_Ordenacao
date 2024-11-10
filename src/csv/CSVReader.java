package csv;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    private List<Integer> numbers;

    public int[] read(String caminho) {
        this.numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.isEmpty()) continue;
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return getNumbers();
    }

    public int[] getNumbers() {
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
