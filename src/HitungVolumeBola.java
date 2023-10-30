import java.util.Scanner;

/**
 * Program sederhana untuk menghitung volume bola berdasarkan jari-jari yang diberikan.
 */
public class HitungVolumeBola {
    /**
     * @author prima
     * Menghitung volume bola berdasarkan jari-jari.
     *
     * @param jariJari Jari-jari bola.
     * @return Volume bola berdasarkan jari-jari yang diberikan.
     */
    public static double hitungVolumeBola(double jariJari) {
        // Rumus untuk menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }

    /**
     * Metode utama untuk menghitung volume bola.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jari-jari bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        // Menghitung volume berdasarkan jari-jari yang dimasukkan
        double volume = hitungVolumeBola(jariJari);

        // Menampilkan hasil volume bola
        System.out.printf("Volume bola dengan jari-jari %.2f adalah: %.2f\n", jariJari, volume);

        input.close();
    }
}