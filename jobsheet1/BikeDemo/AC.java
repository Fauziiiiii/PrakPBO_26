package BikeDemo;

public class AC {
    public String merk;
    public int suhuCelcius;

    public void nyalakan() {
        System.out.println("AC " + merk + " dinyalakan.");
    }
    public void ubahSuhu(int suhuBaru) {
        suhuCelcius = suhuBaru;
        System.out.println("Suhu AC diubah menjadi " + suhuCelcius + " derajat Celcius.");
    }
    public void cetakInformasi() {
        System.out.println("--- Info AC ---");
        System.out.println("Merk : " + merk);
        System.out.println("Suhu : " + suhuCelcius + "C\n");
    }
}
