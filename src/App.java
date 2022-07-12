import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class App {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/teste.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        

        br.close();
    }
}
