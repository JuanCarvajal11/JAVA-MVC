package Vista;

import javax.swing.*;

import Controlador.*;
import Controlador.ControladorProyectores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    public VistaPrincipal(ControladorComputadores ControCompu, ControladorMemorias ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(558, 234, 340, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ITEC");
        JLabel titulo = new JLabel("¡Bienvenidos al ITEC!");
        Font f = new Font( "Comic Sans MS",Font.ITALIC, 32);
        titulo.setFont(f);
        JButton computadores  = new JButton("Computadores");
        JButton memorias = new JButton("Memorias");
        JButton proyectores = new JButton("Proyectores");
        JButton regletas = new JButton("Regletas");
        JButton routers = new JButton("Routers");
        JButton televisores = new JButton("Televisores");
        titulo.setBounds(10, -20, 400, 100);
        computadores.setBounds(50, 55, 215, 40);
        computadores.setBackground(Color.blue);
        computadores.setForeground(Color.WHITE);
        memorias.setBounds(50, 100, 215, 40);
        memorias.setBackground(Color.blue);
        memorias.setForeground(Color.WHITE);
        proyectores.setBounds(50, 150, 215, 40);
        proyectores.setBackground(Color.blue);
        proyectores.setForeground(Color.WHITE);
        regletas.setBounds(50, 200, 215, 40);
        regletas.setBackground(Color.blue);
        regletas.setForeground(Color.WHITE);
        routers.setBounds(50, 250, 215, 40);
        routers.setBackground(Color.blue);
        routers.setForeground(Color.WHITE);
        televisores.setBounds(50, 300, 215, 40);
        televisores.setBackground(Color.blue);
        televisores.setForeground(Color.WHITE);

        add(titulo);
        add(computadores);
        add(memorias);
        add(proyectores);
        add(regletas);
        add(routers);
        add(televisores);

        computadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                VistaComputadores nuevoFrame = new VistaComputadores(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
            }
        });
        memorias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                VistaMemorias nuevoFrame = new VistaMemorias(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
            }
        });
        proyectores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                VistaProyectores nuevoFrame = new VistaProyectores(ControCompu, ControProyectores, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
            }
        });
        regletas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaRegletas nuevoFrame = new VistaRegletas(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
            }

        });
        routers.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                VistaRouters nuevoFrame = new VistaRouters(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
            }

        });
        televisores.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                VistaTelevisores nuevoFrame = new VistaTelevisores(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
                dispose();
                
            }});

    }

    public static void main(String[] args) {
        ControladorComputadores ControCompu = new ControladorComputadores();
        ControladorMemorias ControMemorias = new ControladorMemorias();
        ControladorProyectores ControProyectores = new ControladorProyectores();
        ControladorRegletas ControRegletas = new ControladorRegletas();
        ControladorRouters ControRouters = new ControladorRouters();
        ControladorTelevisores ControTelevisores = new ControladorTelevisores();  
        new VistaPrincipal(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
    }

}

