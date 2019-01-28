public class Tampilkan {
    public static void main(String[] args){
        lingkaran circle = new lingkaran();
        persegi square = new persegi();

        System.out.println("Selamat datang di program sederhana aldi");
        System.out.println("menghitung keliling lingkaran & keliling persegi");
        System.out.println();

        square.setSisi(10);
        square.KelilingPersegi();
        System.out.println("1. persegi");
        System.out.println("nilai sisi : "+square.getSisi());
        System.out.println("jadi nilai keliling persegi adalah "+square.getKelilingPersegi());

        circle.setJari(10);
        circle.setPhi(3.14);
        circle.Keliling();
        System.out.println("");
        System.out.println("2. lingkaran");
        System.out.println("nilai jari-jari : "+circle.getJari());
        System.out.println("nilai Phi : "+circle.getPhi());
        System.out.println("jadi, hasil keliling lingkaran adalah "+circle.getKeliling());

    }
}
