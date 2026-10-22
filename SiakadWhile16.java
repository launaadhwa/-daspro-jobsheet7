
import java.util.Scanner;

public class SiakadWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        int i = 1;
        double nilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        while (i <= jumlahMahasiswa) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                continue;
            }

            if (nilai > 80) {
                System.out.println("Nilai huruf: A");
            } else if (nilai > 73) {
                System.out.println("Nilai huruf: B+");
            } else if (nilai > 65) {
                System.out.println("Nilai huruf: B");
            } else if (nilai > 60) {
                System.out.println("Nilai huruf: C+");
            } else if (nilai > 50) {
                System.out.println("Nilai huruf: C");
            } else if (nilai > 39) {
                System.out.println("Nilai huruf: D");
            } else {
                System.out.println("Nilai huruf: E");
            }

            i++;
        }

        sc.close();
    }
}
