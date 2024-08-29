public class TipeDataArray {
    public static void main(String[] args) {

       //Cara 1
        int[] kumpulanNumber; // deklarasi
        kumpulanNumber = new int[3]; // inisialisasi

        // Cara 2
        int[] kumpulanNumber2 = new int[3];

        // Cara 3
        int[] kumpulanNumber3 = new int[] {1,3,4,5};

        // cara memasukkan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = 200;
        kumpulanNumber[2] = 300;

        System.out.println(kumpulanNumber[1]);
    }
}
