package bangundatar;

public class balok implements OBD{

    private double nilaipanjang, nilailebar, nilaitinggi;
    
    public balok(double nilaipanjang, double nilailebar, double nilaitinggi) {
        this.nilaipanjang = nilaipanjang;
        this.nilailebar = nilailebar;
        this.nilaitinggi = nilaitinggi;
    }

    public double getPanjang() {
        return nilaipanjang;
    }

    public void setPanjang(double nilaipanjang) {
        this.nilaipanjang = nilaipanjang;
    }

    public double getLebar() {
        return nilailebar;
    }

    public void setLebar(double nilailebar) {
        this.nilailebar = nilailebar;
    }
    
    public double getTinggi() {
        return nilaitinggi;
    }

    public void setTinggi(double nilaitinggi) {
        this.nilaitinggi = nilaitinggi;
    }

    @Override
    public double Luas() {
        throw new UnsupportedOperationException("[Hasil berupa angka]"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double Keliling() {
        throw new UnsupportedOperationException("[Hasil berupa angka]"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double Volume() {
        return nilaipanjang * nilailebar * nilaitinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2 * ((nilaipanjang * nilailebar) + (nilaipanjang * nilaitinggi) + (nilailebar * nilaitinggi));
    }
}
