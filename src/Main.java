import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel usuarioLabel,contraseniaLabel,Inicio;
    private static JTextField usuarioTxt;

    private static JPasswordField contraseniaTxt;
    private static JButton boton;


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        usuarioLabel = new JLabel("Usuario");
        usuarioLabel.setBounds(10,20,80,25);
        panel.add(usuarioLabel);

        usuarioTxt = new JTextField(20);
        usuarioTxt.setBounds(100,20,166,25);
        panel.add(usuarioTxt);

        contraseniaLabel = new JLabel("Contraseña");
        contraseniaLabel.setBounds(10,50,80,25);
        panel.add(contraseniaLabel);

        contraseniaTxt = new JPasswordField();
        contraseniaTxt.setBounds(100,50,165,25);
        panel.add(contraseniaTxt);

        boton = new JButton("Iniciar Sesión");
        boton.setBounds(10,80,80,25);
        boton.addActionListener(new Main());
        panel.add(boton);

        Inicio = new JLabel("");
        Inicio.setBounds(10,110,300,25);
        panel.add(Inicio);



        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String Usuario =usuarioTxt.getText();
           String contrasenia = contraseniaTxt.getText();
           System.out.println(Usuario+","+contrasenia);

           if(Usuario.equals("Cristopher")&& contrasenia.equals("Chicharito14")){
               Inicio.setText("Bienvenido");
           }else{
               Inicio.setText("Datos incorrectos");
           }


    }
}