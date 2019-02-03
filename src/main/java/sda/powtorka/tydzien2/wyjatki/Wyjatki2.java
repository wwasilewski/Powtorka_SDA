//program ktory wyswietla linijki tekstu z pliku

package sda.powtorka.tydzien2.wyjatki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wyjatki2 {
    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\notka.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
