public class Tampilkan {
    public static void main(String[] args){
        lingkaran circle = new lingkaran();
        persegi square = new persegi();

        System.out.println("Selamat datang di program sederhana aldi");
        System.out.println("menghitung keliling lingkaran & keliling persegi");
        System.out.println();

        System.out.println("1. menghitung keliling lingkaran");
        System.out.println("");
        circle.keliling();
        System.out.println("");
        System.out.println("2, menghitung keliling persegi");
        System.out.println("");
        square.kelilingPersegi();
    }
}
