package jobsheet3.Tugas;

public class Kontainer {
    private String id;
    private String namaPemilik;
    private double beratMuatan = 0;
    private double kapasitasMaks;

    public Kontainer(String id, String namaPemilik, double kapasitasMaks){
        this.id = id;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaks = kapasitasMaks;
    }
    
    public String getIdKontainer(){
        return id;
    }
    
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getBeratMuatanSaatIni(){
        return beratMuatan;
    }   

    public double getKapasitasMaksimal(){
        return  kapasitasMaks;
    }

    public void tambahMuatan(double tambahMuatan){
        if(beratMuatan + tambahMuatan > kapasitasMaks){
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }else{
            beratMuatan += tambahMuatan;
        }
    }

    public void turunkanMuatan(double turunMuatan){
        double maksTurunMuatan = beratMuatan / 2;
        
        if(turunMuatan > maksTurunMuatan){
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!.");
        }else{
            beratMuatan -= turunMuatan;
        }
    }
}
