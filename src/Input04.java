import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input04 {
    public static void main (String[] args) {
        String fileName = "input04text.txt";
        
        try (BufferedReader br = new BufferedReader (new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("BlueBumper")) {
                    String[] parts = line.split("\\s+");
                    int xPosition = Integer.parseInt(parts[3]);
                    int yPosition = Integer.parseInt(parts[4]);
                    
                    System.out.println("Coordenadas do BlueBumpers: xPosition " + xPosition + ", yPosition " + yPosition);
                           break;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo : " + e.getMessage());
        }
    }
}