import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] ayaa) {
        String namaFile = "data_umum.txt";

        List<Data> mahasiswa = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baca;
            while ((baca = reader.readLine()) != null) {
                //System.out.println(line);
                String[] row = baca.split(", ");
                Data m = new Data();
                m.nim = row[0];
                m.nama = row[1];
                m.tahunMasuk = Integer.valueOf(row[2]);
                m.beasiswa = row[3];
                mahasiswa.add(m);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Total data = " + mahasiswa.size());


    }

}


