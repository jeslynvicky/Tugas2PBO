package tugas2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JLabel judul = new JLabel("Selamat Datang!");
    JLabel ket = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputuser = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputpass = new JTextField();
    JLabel jeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton pilihlaki = new JRadioButton("Laki-laki");
    JRadioButton pilihperempuan = new JRadioButton("Perempuan", true);
    JButton tombollogin = new JButton("Login");
    
    login(){
        setVisible(true);
        setSize(520, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(10, 10, 150, 24);
        judul.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(ket);
        ket.setBounds(10, 35, 500, 24);
        ket.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(username);
        username.setBounds(10, 70, 500, 24);
        username.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputuser);
        inputuser.setBounds(10, 95, 485, 24);
        
        add(password);
        password.setBounds(10, 125, 500, 24);
        password.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputpass);
        inputpass.setBounds(10, 150, 485, 24);
        
        add(jeniskelamin);
        jeniskelamin.setBounds(10, 180, 485, 24);
        
        ButtonGroup pilihgender = new ButtonGroup();
        pilihgender.add(pilihlaki);
        pilihgender.add(pilihperempuan);
       
            add(pilihlaki);
            pilihlaki.setBounds (10, 205, 145, 24);

            add(pilihperempuan);
            pilihperempuan.setBounds (250, 205, 150, 24);
            
        add(tombollogin);
        tombollogin.setBounds(10, 245, 485, 26);
        tombollogin.addActionListener(this);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    try {
        // Mendapatkan nilai dari inputan username, password, dan jenis gender
        String usernamee = inputuser.getText();
        String passwords = inputpass.getText();
        String jenisgender = pilihlaki.isSelected() ? "L" : "P";
        
        // Jika kedua input username dan password kosong, lemparkan exception
        if (usernamee.isEmpty() && passwords.isEmpty()) {
            throw new Exception("Masukkan username dan password :)");
        } 
        // Jika input username kosong, lemparkan exception
        else if (usernamee.isEmpty()) {
            throw new Exception("Masukkan username :)");
        } 
        // Jika input password kosong, lemparkan exception
        else if (passwords.isEmpty()) {
            throw new Exception("Masukkan password :)");
        }
      
        // Jika semua input valid, buat objek calculatorpage dengan parameter username dan jenis gender
        new calculatorpage(usernamee, jenisgender);
        // Tutup frame ini (frame yang sedang berjalan)
        this.dispose();
    } 
    // Tangkap exception yang terjadi dan tampilkan pesan kesalahan menggunakan JOptionPane
    catch (Exception error) {
        JOptionPane.showMessageDialog(this, error.getMessage());
    }
} 
}
