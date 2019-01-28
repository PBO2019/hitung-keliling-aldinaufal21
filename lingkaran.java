public class lingkaran {

    private int jari = 10;
    private double phi = 3.14;
    private double Keliling;

    public void Keliling(){
        this.Keliling = 2 * phi * jari;
    }

    public void setKeliling(double keliling) {
        this.Keliling = keliling;
    }

    public double getKeliling() {
        return Keliling;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }
}
