public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat object
        Matematika mtk = new Matematika();

        // Menampilkan hasil sesuai permintaan soal
        System.out.println("Pertambahan: 20 + 20 = " + mtk.pertambahan(20, 20));
        System.out.println("Pengurangan: 10 - 5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 20 = " + mtk.perkalian(10, 20));
        System.out.println("Pembagian: 21 / 2 = " + mtk.pembagian(21, 2));
    }
}