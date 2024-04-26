package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorComputadores;
import Controlador.ControladorMemorias;
import Controlador.ControladorProyectores;
import Controlador.ControladorRegletas;
import Controlador.ControladorRouters;
import Controlador.ControladorTelevisores;
import Modelo.Regletas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaRegletas extends JFrame {
    int id;
    public VistaRegletas(ControladorComputadores ControCompu, ControladorMemorias ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(0, 0, 1100, 750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("REGLETAS");
        JTextField cantidad_entradas = new JTextField();
        JTextField cantidad_voltaje = new JTextField();
        JTextField marca = new JTextField();
        JLabel titulo = new JLabel("REGLETAS");
        Font font = new Font("Comic Sans MS", Font.ITALIC, 32);
        Font f = new Font("Comic Sans MS", Font.ITALIC, 25);
        JLabel Lcantidad_entradas = new JLabel("CANT. ENT:");
        JLabel Lcantidad_voltaje = new JLabel("CANT. VOLT:");
        JLabel Lmarca = new JLabel("MARCA:");
        JButton registrar = new JButton("Registrar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JButton actualizar = new JButton("Actualizar");
        JButton eliminar = new JButton("Eliminar");
        JButton atras = new JButton("Atras");

        titulo.setFont(font);
        Lmarca.setFont(f);
        marca.setFont(f);
        Lcantidad_entradas.setFont(f);
        cantidad_entradas.setFont(f);
        Lcantidad_voltaje.setFont(f);
        cantidad_voltaje.setFont(f);
        titulo.setBounds(0, -30, 400, 100);
        Lmarca.setBounds(40, 50, 400, 100);
        marca.setBounds(140, 70, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        Lcantidad_entradas.setBounds(40, 130, 400, 100);
        cantidad_entradas.setBounds(190, 150, 150, 50);
        cantidad_entradas.setBackground(Color.blue);
        cantidad_entradas.setForeground(Color.white);
        Lcantidad_voltaje.setBounds(40, 210, 400, 100);
        cantidad_voltaje.setBounds(200, 230, 150, 50);
        cantidad_voltaje.setBackground(Color.blue);
        cantidad_voltaje.setForeground(Color.white);
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
        add(Lcantidad_entradas);
        add(cantidad_entradas);
        add(Lcantidad_voltaje);
        add(cantidad_voltaje);
        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && cantidad_entradas.getText().length() > 0 && cantidad_voltaje.getText().length() > 0){
                    Regletas nuevoRegletas = new Regletas();
                    int id = ControProyectores.contador(); 
                    nuevoRegletas.setId(id);
                    nuevoRegletas.setMarca(marca.getText());
                    nuevoRegletas.setCant_entradas(Integer.parseInt(cantidad_entradas.getText()));
                    nuevoRegletas.setCant_voltaje(Integer.parseInt(cantidad_voltaje.getText()));;
                    ControRegletas.registrarRegleta(nuevoRegletas);
                    marca.setText(null);
                    cantidad_entradas.setText(null);
                    cantidad_voltaje.setText(null);
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object columnas[] = {"ID","MARCA","CANT. ENTRADAS","CANT. VOLTAJE"};

            DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
            JTable tabla=new JTable(modeloTabla);
            tabla.setBounds(600, 100, 500, 600);
            tabla.setBackground(Color.blue);
            tabla.setForeground(Color.white);
            add(tabla);

            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBounds(500, 10, 500, 300);
            add(scroll);
            for(Regletas regletas : ControRegletas.obtenerRegleta()){
                modeloTabla.addRow(new Object[]{regletas.getId(), regletas.getMarca(), regletas.getCant_entradas(), regletas.getCant_voltaje()});
            }
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = JOptionPane.showInputDialog("Buscar ID");
                Regletas regletaEncontrado = ControRegletas.buscarRegleta(Integer.parseInt(id1));
                if(regletaEncontrado != null){
                    marca.setText(regletaEncontrado.getMarca());
                    cantidad_entradas.setText(String.valueOf(regletaEncontrado.getCant_entradas()));
                    cantidad_voltaje.setText(String.valueOf(regletaEncontrado.getCant_voltaje()));
                    id = regletaEncontrado.getId();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El Proyector no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && cantidad_entradas.getText().length() > 0 && cantidad_voltaje.getText().length() > 0){ 
                    Regletas nuevoRegletas = new Regletas();
                    nuevoRegletas.setId(id);
                    nuevoRegletas.setMarca(marca.getText());
                    nuevoRegletas.setCant_entradas(Integer.parseInt(cantidad_entradas.getText()));
                    nuevoRegletas.setCant_voltaje(Integer.parseInt(cantidad_voltaje.getText()));;
                    ControRegletas.actualizarRegleta(id, nuevoRegletas);
                    marca.setText(null);
                    cantidad_entradas.setText(null);
                    cantidad_voltaje.setText(null);
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
                    ControRegletas.eliminarRegleta(id);
                    marca.setText(null);
                    cantidad_entradas.setText(null);
                    cantidad_voltaje.setText(null);
                    id = 0;
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El proyector no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }  
            }
        });

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VistaPrincipal nuevoFrame = new VistaPrincipal(ControCompu, null, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
            }
        });
        
    }


}