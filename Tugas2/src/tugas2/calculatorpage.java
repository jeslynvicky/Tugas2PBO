package tugas2;

import bangundatar.balok;
import bangundatar.persegi;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculatorpage extends JFrame implements ActionListener{
    JLabel judul = new JLabel();
    JLabel ket = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JTextField inputpanjang = new JTextField();
    JLabel lebar = new JLabel("Lebar");
    JTextField inputlebar = new JTextField();
    JLabel tinggi = new JLabel("Tinggi");
    JTextField inputtinggi = new JTextField();
    JButton tombolhitung = new JButton("Hitung");
    JButton tombolreset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel hasilluas = new JLabel("[Hasil berupa angka]");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel hasilkeliling = new JLabel("[Hasil berupa angka]");
    JLabel volume = new JLabel("Volume Balok");
    JLabel hasilvolume = new JLabel("[Hasil berupa angka]");
    JLabel luaspermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasillp = new JLabel("[Hasil berupa angka]");
    
    calculatorpage(String usernamee, String jenisgender){
        String panggilan = (jenisgender == "L") ? "Mr." : "Mrs.";
        
        setVisible(true);
        setSize(520, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setText("Welcome, " + panggilan + usernamee); 
        judul.setBounds(10, 10, 480, 24);
        judul.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(ket);
        ket.setBounds(10, 35, 500, 24);
        ket.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(panjang);
        panjang.setBounds(10, 80, 140, 24);
        panjang.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputpanjang);
        inputpanjang.setBounds(150, 80, 345, 24);
        
        add(lebar);
        lebar.setBounds(10, 115, 140, 24);
        lebar.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputlebar);
        inputlebar.setBounds(150, 115, 345, 24);
        
        add(tinggi);
        tinggi.setBounds(10, 150, 140, 24);
        tinggi.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputtinggi);
        inputtinggi.setBounds(150, 150, 345, 24);
        
        add(tombolhitung);
        tombolhitung.setBounds(10, 190, 485, 26);
        tombolhitung.addActionListener(this);
        
        add(tombolreset);
        tombolreset.setBounds(10, 225, 485, 26);
        tombolreset.addActionListener(this);
        
        add(hasil);
        hasil.setBounds(10, 260, 485, 26);
        hasil.setFont(new Font("Arial", Font.BOLD, 13));
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(luas);
        luas.setBounds(10, 290, 200, 24);
        luas.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilluas);
        hasilluas.setBounds(237, 290, 200, 24);
        hasilluas.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(keliling);
        keliling.setBounds(10, 315, 200, 24);
        keliling.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilkeliling);
        hasilkeliling.setBounds(237, 315, 200, 24);
        hasilkeliling.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(volume);
        volume.setBounds(10, 340, 330, 24);
        volume.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilvolume);
        hasilvolume.setBounds(237, 340, 200, 24);
        hasilvolume.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(luaspermukaan);
        luaspermukaan.setBounds(10, 365, 200, 24);
        luaspermukaan.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasillp);
        hasillp.setBounds(237, 365, 200, 24);
        hasillp.setFont(new Font("Arial", Font.BOLD, 12));
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == tombolhitung) {
        try {
            // Cek apakah nilai panjang, lebar, dan tinggi tidak kosong
            if (inputpanjang.getText().isEmpty() || inputlebar.getText().isEmpty() || inputtinggi.getText().isEmpty()) {
                throw new Exception("Ada nilai yang belum diinput!");
            }
            
            // Parsing nilai panjang, lebar, dan tinggi
            double nilaipanjang = Double.parseDouble(inputpanjang.getText());
            double nilailebar = Double.parseDouble(inputlebar.getText());
            double nilaitinggi = Double.parseDouble(inputtinggi.getText());

            // Membuat objek persegi dan balok
            persegi bangun1 = new persegi(nilaipanjang, nilailebar);
            balok bangun2 = new balok(nilaipanjang, nilailebar, nilaitinggi);

            // Menghitung hasil dan mengonversinya ke String
            String hasilLuas = String.valueOf(bangun1.Luas());
            String hasilKeliling = String.valueOf(bangun1.Keliling());
            String hasilVolume = String.valueOf(bangun2.Volume());
            String hasilLuasPermukaan = String.valueOf(bangun2.LuasPermukaan());

            // Menampilkan hasil di label
            hasilluas.setText(hasilLuas);
            hasilkeliling.setText(hasilKeliling);
            hasilvolume.setText(hasilVolume);
            hasillp.setText(hasilLuasPermukaan);
        } catch (NumberFormatException ex) {
            // Tangkap jika input tidak valid (bukan angka)
            JOptionPane.showMessageDialog(this, "Ada nilai yang bukan merupakan angka.");
        } catch (Exception ex) {
            // Tangkap jika ada input yang kosong
            JOptionPane.showMessageDialog(this, "Ada nilai yang belum diinput!");
        }
    } else if (e.getSource() == tombolreset) {
        // Reset input dan label hasil
        inputpanjang.setText("");
        inputlebar.setText("");
        inputtinggi.setText("");
        
        hasilluas.setText("[Hasil berupa angka]");
        hasilkeliling.setText("[Hasil berupa angka]");
        hasilvolume.setText("[Hasil berupa angka]");
        hasillp.setText("[Hasil berupa angka]");
    }
}

}
