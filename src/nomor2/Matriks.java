package nomor2;
public class Matriks {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    // Baris pertama mencetak angka kolom
                    System.out.print((j == 0 ? "   " : j + "  "));
                } else {
                    // Kolom pertama harus sesuai nilai baris (i)
                    System.out.print((j == 0 ? i + "  " : (i * j) + "  "));
                }
            }
            System.out.println();
        }
    }
}
