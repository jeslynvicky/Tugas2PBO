package bangundatar;

public class persegi implements OBD{

    private double nilaipanjang, nilailebar;
    
    public persegi(double nilaipanjang, double nilailebar) {
        this.nilaipanjang = nilaipanjang;
        this.nilailebar = nilailebar;
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
    
    @Override
    public double Luas() {
        return nilaipanjang * nilailebar;
    }

    @Override
    public double Keliling() {
        return 2 * (nilaipanjang + nilailebar);
    }    

    @Override
    public double Volume() {
        throw new UnsupportedOperationException("[Hasil berupa angka]"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double LuasPermukaan() {
        throw new UnsupportedOperationException("[Hasil berupa angka]"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
