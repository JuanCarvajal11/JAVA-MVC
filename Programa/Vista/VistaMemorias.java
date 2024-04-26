package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.ControladorComputadores;
import Controlador.ControladorMemorias;
import Controlador.ControladorProyectores;
import Controlador.ControladorRegletas;
import Controlador.ControladorRouters;
import Controlador.ControladorTelevisores;
import Modelo.Memorias;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaMemorias extends JFrame {
    int id;
    public VistaMemorias(ControladorComputadores ControCompu, ControladorMemorias ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(0, 0, 1100,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MEMORIAS");
        JLabel titulo = new JLabel("ITEC");
        Font font = new Font( "Comic Sans MS",Font.ITALIC, 32);
        Font f = new Font( "Comic Sans MS",Font.ITALIC, 25);
        JLabel Ltipo_memoria = new JLabel("TIPO MEMORIA:");
        JLabel Lalmacenamiento = new JLabel("ALMACENA:");
        JLabel Lmarca = new JLabel("MARCA:");
        JLabel Lcolor = new JLabel("COLOR:");
        JButton registrar = new JButton("Registrar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JButton actualizar = new JButton("Actualizar");
        JButton eliminar = new JButton("Eliminar");
        JButton atras = new JButton("Atras");
        JTextField tipo_memoria = new JTextField();
        JTextField almacenamiento = new JTextField();
        JTextField marca = new JTextField();
        JTextField color = new JTextField();

        titulo.setFont(font);
        Ltipo_memoria.setFont(f);
        tipo_memoria.setFont(f);
        Lalmacenamiento.setFont(f);
        almacenamiento.setFont(f);
        Lmarca.setFont(f);
        marca.setFont(f);
        Lcolor.setFont(f);
        color.setFont(f);

        titulo.setBounds(10, -30, 400, 100);
        Ltipo_memoria.setBounds(10, 50, 400, 100);
        tipo_memoria.setBounds(230, 70, 150, 50);
        tipo_memoria.setBackground(Color.blue);
        tipo_memoria.setForeground(Color.white);
        Lalmacenamiento.setBounds(10, 130, 400, 100);
        almacenamiento.setBounds(170, 150, 150, 50);
        almacenamiento.setBackground(Color.blue);
        almacenamiento.setForeground(Color.white);
        Lmarca.setBounds(10, 210, 400, 100);
        marca.setBounds(120, 230, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        Lcolor.setBounds(10, 290, 400, 100);
        color.setBounds(120, 310, 150, 50);
        color.setBackground(Color.blue);
        color.setForeground(Color.white);
        almacenamiento.setForeground(Color.white);
        registrar.setBounds(30, 610, 150, 40);
        registrar.setBackground(Color.BLUE);
        registrar.setForeground(Color.white);
        mostrar.setBounds(600, 400, 100, 40);
        mostrar.setBackground(Color.BLUE);
        mostrar.setForeground(Color.white);
        buscar.setBounds(720, 400, 100, 40);
        buscar.setBackground(Color.BLUE);
        buscar.setForeground(Color.white);
        actualizar.setBounds(720, 450, 100, 40);
        actualizar.setBackground(Color.BLUE);
        actualizar.setForeground(Color.white);
        eliminar.setBounds(840, 400, 100, 40);
        eliminar.setBackground(Color.BLUE);
        eliminar.setForeground(Color.white);
        atras.setBounds(920, 610, 100, 40);
        atras.setBackground(Color.BLUE);
        atras.setForeground(Color.white);


        add(titulo);
        add(Ltipo_memoria);
        add(tipo_memoria);
        add(Lalmacenamiento);
        add(almacenamiento);
        add(Lmarca);
        add(marca);
        add(Lcolor);
        add(color);
        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        

        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrar(ControMemorias, tipo_memoria, almacenamiento, marca, color);
            }
        });
        
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar(ControMemorias);
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar(ControMemorias, tipo_memoria, almacenamiento, marca, color);
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizar(ControMemorias, tipo_memoria, almacenamiento, marca, color);
            }
        });

        eliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                eliminar(ControMemorias, tipo_memoria, almacenamiento, marca, color);
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

    public void registrar(ControladorMemorias controMemorias, JTextField tipo_memoria, JTextField almacenamiento, JTextField marca, JTextField color){
        if(tipo_memoria.getText().length() > 0 && almacenamiento.getText().length() > 0 && marca.getText().length() > 0 && color.getText().length() > 0 ){
            Memorias nuevaMemoria = new Memorias();
            int id = controMemorias.contador(); 
            nuevaMemoria.setId(id);
            nuevaMemoria.setTipo_memoria(tipo_memoria.getText());
            nuevaMemoria.setAlmacenamiento(almacenamiento.getText());
            nuevaMemoria.setMarca(marca.getText());
            nuevaMemoria.setColor(color.getText());
            controMemorias.registrarMemoria(nuevaMemoria);
            tipo_memoria.setText(null);
            almacenamiento.setText(null);
            marca.setText(null);
            color.setText(null);
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar(ControladorMemorias controMemorias){
        Object columnas[] = {"ID","TIPO MEMORIA","ALMACENAMIENTO","MARCA","COLOR"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
        JTable tabla=new JTable(modeloTabla);
        tabla.setBounds(600, 100, 500, 600);
        tabla.setBackground(Color.blue);
        tabla.setForeground(Color.white);
        add(tabla);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(500, 10, 500, 300);
        add(scroll);
        for(Memorias memorias : controMemorias.obtenerMemoria()){
            modeloTabla.addRow(new Object[]{memorias.getId(), memorias.getTipo_memoria(), memorias.getAlmacenamiento(), memorias.getMarca(), memorias.getColor()});
        }
    }

    public void actualizar(ControladorMemorias controMemorias, JTextField tipo_memoria, JTextField almacenamiento, JTextField marca, JTextField color){
        if(tipo_memoria.getText().length() > 0 && almacenamiento.getText().length() > 0 && marca.getText().length() > 0 && color.getText().length() > 0 ){ 
            Memorias nuevaMemoria = new Memorias();
            nuevaMemoria.setId(this.id);
            nuevaMemoria.setTipo_memoria(tipo_memoria.getText());
            nuevaMemoria.setAlmacenamiento(almacenamiento.getText());
            nuevaMemoria.setMarca(marca.getText());
            nuevaMemoria.setColor(color.getText());
            controMemorias.actualizarMemoria(id, nuevaMemoria);
            tipo_memoria.setText(null);
            almacenamiento.setText(null);
            marca.setText(null);
            color.setText(null);
            this.id = 0;
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscar(ControladorMemorias controMemorias, JTextField tipo_memoria, JTextField almacenamiento, JTextField marca, JTextField color){
        String id = JOptionPane.showInputDialog("Buscar ID");
        Memorias memoriaEncontrada = controMemorias.buscarMemoria(Integer.parseInt(id));
        if(memoriaEncontrada != null){
            tipo_memoria.setText(memoriaEncontrada.getTipo_memoria());
            almacenamiento.setText(memoriaEncontrada.getAlmacenamiento());
            marca.setText(memoriaEncontrada.getMarca());
            color.setText(memoriaEncontrada.getColor());
            this.id = memoriaEncontrada.getId();
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal: La memoria no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    } 

    public void eliminar(ControladorMemorias controMemorias, JTextField tipo_memoria, JTextField almacenamiento, JTextField marca, JTextField color){
        if (this.id != 0){
            controMemorias.eliminarMemoria(this.id);
            tipo_memoria.setText(null);
            almacenamiento.setText(null);
            marca.setText(null);
            color.setText(null);
            this.id = 0;
        }else{
            JOptionPane.showMessageDialog(null, "Algo salió mal: La memoria no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
