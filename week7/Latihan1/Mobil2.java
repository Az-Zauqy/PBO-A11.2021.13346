class Mobil2 {
    int kecepatan;
    int gigi;
    
    public void hidupkanMobil() {
        System.out.println("Mobil dinyalakan");
    }
    
    public void ubahGigi(int gigi) {
        this.gigi = gigi;
        System.out.println("Gigi diubah menjadi " + gigi);
    }
    
    public void matikanMobil() {
        System.out.println("Mobil dimatikan");
    }
}