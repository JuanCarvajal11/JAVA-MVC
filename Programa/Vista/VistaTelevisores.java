package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.*;
import Modelo.Televisores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaTelevisores extends JFrame{
    int id;
    public VistaTelevisores(ControladorComputadores ControCompu, ControladorMemorias ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(0, 0, 1100,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ITEC");
        JLabel titulo = new JLabel("TELEVISORES");
        Font font = new Font( "Comic Sans MS",Font.ITALIC, 32);
        Font f = new Font( "Comic Sans MS",Font.ITALIC, 25);
        JLabel Lmarca = new JLabel("MARCA:");
        JLabel Lresolucion = new JLabel("RESOLUCION:");
        JLabel Lcant_puertos = new JLabel("CANT PUERTOS:");
        JLabel Los = new JLabel("SISTEMA OPERATIVO:");

        JButton registrar = new JButton("Registrar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JButton actualizar = new JButton("Actualizar");
        JButton eliminar = new JButton("Eliminar");
        JButton atras = new JButton("Atras");

        JTextField marca = new JTextField();
        JTextField resolucion = new JTextField();
        JTextField cant_puertos = new JTextField();
        JTextField os = new JTextField();

        titulo.setFont(font);
        Lmarca.setFont(f);
        marca.setFont(f);
        Lcant_puertos.setFont(f);
        cant_puertos.setFont(f);
        Lresolucion.setFont(f);
        resolucion.setFont(f);
        Lcant_puertos.setFont(f);
        cant_puertos.setFont(f);
        Los.setFont(f);
        os.setFont(f);

        titulo.setBounds(0, -30, 400, 100);
        Lmarca.setBounds(10, 50, 400, 100);
        marca.setBounds(145, 70, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        Lresolucion.setBounds(10, 130, 400, 100);
        resolucion.setBounds(163, 150, 150, 50);
        resolucion.setBackground(Color.blue);
        resolucion.setForeground(Color.white);
        Lcant_puertos.setBounds(10, 210, 400, 100);
        cant_puertos.setBounds(296, 230, 150, 50);
        cant_puertos.setBackground(Color.blue);
        cant_puertos.setForeground(Color.white);
        Los.setBounds(10, 290, 400, 100);
        os.setBounds(300, 310, 150, 50);
        os.setBackground(Color.blue);
        os.setForeground(Color.white);

        registrar.setBounds(30, 610, 150, 40);
        registrar.setBackground(Color.blue);
        registrar.setForeground(Color.white);
        mostrar.setBounds(600, 400, 100, 40);
        mostrar.setBackground(Color.blue);
        mostrar.setForeground(Color.white);
        buscar.setBounds(720, 400, 100, 40);
        buscar.setBackground(Color.blue);
        buscar.setForeground(Color.white);
        actualizar.setBounds(720, 450, 100, 40);
        actualizar.setBackground(Color.blue);
        actualizar.setForeground(Color.white);
        eliminar.setBounds(840, 400, 100, 40);
        eliminar.setBackground(Color.blue);
        eliminar.setForeground(Color.white);
        atras.setBounds(920, 610, 100, 40);
        atras.setBackground(Color.blue);
        atras.setForeground(Color.white);


        add(titulo);
        add(Lmarca);
        add(marca);
        add(Lresolucion);
        add(resolucion);
        add(Lcant_puertos);
        add(cant_puertos);
        add(Los);
        add(os);
        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        

        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && resolucion.getText().length() > 0 && cant_puertos.getText().length() > 0 && os.getText().length() > 0 ){
                    Televisores nuevoTelevisor = new Televisores();
                    int id = ControTelevisores.contador(); 
                    nuevoTelevisor.setId(id);
                    nuevoTelevisor.setMarca(marca.getText());
                    nuevoTelevisor.setResolucion(resolucion.getText());
                    nuevoTelevisor.setCant_puertos(cant_puertos.getText());
                    nuevoTelevisor.setOs(os.getText());
                    ControTelevisores.registrarTelevisor(nuevoTelevisor);
                    marca.setText(null);
                    resolucion.setText(null);
                    cant_puertos.setText(null);
                    os.setText(null);
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object columnas[] = {"ID","TIPO MEMORIA","resolucion","cant_puertos","os"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
        JTable tabla=new JTable(modeloTabla);
        tabla.setBounds(600, 100, 500, 600);
        tabla.setBackground(Color.blue);
        tabla.setForeground(Color.white);
        add(tabla);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(500, 10, 500, 300);
        add(scroll);
        for(Televisores memorias : ControTelevisores.obtenerTelevisor()){
            modeloTabla.addRow(new Object[]{memorias.getId(), memorias.getMarca(), memorias.getResolucion(), memorias.getCant_puertos(), memorias.getOs()});
        }
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = JOptionPane.showInputDialog("Buscar ID");
        Televisores televisorEncontrado = ControTelevisores.buscarTelevisor(Integer.parseInt(id1));
        if(televisorEncontrado != null){
            marca.setText(televisorEncontrado.getMarca());
            resolucion.setText(televisorEncontrado.getResolucion());
            cant_puertos.setText(televisorEncontrado.getCant_puertos());
            os.setText(televisorEncontrado.getOs());
            id = televisorEncontrado.getId();
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal: El televisor no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && resolucion.getText().length() > 0 && cant_puertos.getText().length() > 0 && os.getText().length() > 0 ){ 
                    Televisores nuevoTelevisor = new Televisores();
                    nuevoTelevisor.setId(id);
                    nuevoTelevisor.setMarca(marca.getText());
                    nuevoTelevisor.setResolucion(resolucion.getText());
                    nuevoTelevisor.setCant_puertos(cant_puertos.getText());
                    nuevoTelevisor.setOs(os.getText());
                    ControTelevisores.actualizarTelevisor(id, nuevoTelevisor);
                    marca.setText(null);
                    resolucion.setText(null);
                    cant_puertos.setText(null);
                    os.setText(null);
                    id = 0;
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        eliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (id != 0){
                    ControTelevisores.eliminarTelevisor(id);
                    marca.setText(null);
                    resolucion.setText(null);
                    cant_puertos.setText(null);
                    os.setText(null);
                    id = 0;
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El televisor no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VistaPrincipal nuevoFrame = new VistaPrincipal(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
            }
        });
        
    }


   
}
