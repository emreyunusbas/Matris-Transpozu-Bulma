public class MatrisTranspozu {
    public static void main(String[] args) {
        // İlk matrisi tanımlayın
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // İkinci matrisi tanımlayın
        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Transpozunu bulmak için fonksiyonu çağırın ve sonucu yazdırın
        int[][] transpoze1 = transpozunuBul(matris1);
        int[][] transpoze2 = transpozunuBul(matris2);

        System.out.println("Matris 1:");
        matrisiYazdir(matris1);
        System.out.println("Transpoze 1:");
        matrisiYazdir(transpoze1);

        System.out.println("Matris 2:");
        matrisiYazdir(matris2);
        System.out.println("Transpoze 2:");
        matrisiYazdir(transpoze2);
    }

    // Matrisin transpozunu bulan fonksiyon
    public static int[][] transpozunuBul(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpoze = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        return transpoze;
    }

    // Matrisi ekrana yazdıran fonksiyon
    public static void matrisiYazdir(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
