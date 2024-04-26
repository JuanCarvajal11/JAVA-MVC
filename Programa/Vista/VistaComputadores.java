package Vista;

//Importamos librerias
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.*;
import Modelo.Computadores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaComputadores extends JFrame {
    int id;

    public VistaComputadores(ControladorComputadores ControCompu, ControladorMemorias ControMemorias, ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        //Configuracion de la pestaña
        setLayout(null);
        setBounds(0, 0, 1100, 750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("COMPUTADORES ITEC");
        //Creamos los textos y los textbox y los botones
        JTextField marca = new JTextField();
        JTextField modelo = new JTextField();
        JTextField almacenamiento = new JTextField();
        JTextField tipo_almacenamiento = new JTextField();
        JTextField procesador = new JTextField();
        JTextField cargador = new JTextField();
        JTextField mouse = new JTextField();
        JLabel titulo = new JLabel("COMPUTADORES");
        //Creamos fuentes
        Font font = new Font("Comic Sans MS", Font.ITALIC, 32);
        Font f = new Font("Comic Sans MS", Font.ITALIC, 25);
        JLabel Lmarca = new JLabel("MARCA:");
        JLabel Lmodelo = new JLabel("MODELO:");
        JLabel Lalmacenamiento = new JLabel("ALMACENA:");
        JLabel Ltipo_almacenamiento = new JLabel("TIPO ALMA:");
        JLabel Lprocesador = new JLabel("PROCESADOR:");
        JLabel Lcargador = new JLabel("CARGADOR:");
        JLabel Lmouse = new JLabel("MOUSE:");
        JButton registrar = new JButton("Registrar");
        //Asignamos un color de fono y un color de letra
        registrar.setBackground(Color.BLUE);
        registrar.setForeground(Color.white);
        JButton mostrar = new JButton("Mostrar");
        mostrar.setBackground(Color.BLUE);
        mostrar.setForeground(Color.WHITE);
        JButton buscar = new JButton("Buscar");
        buscar.setBackground(Color.blue);
        buscar.setForeground(Color.WHITE);
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBackground(Color.blue);
        actualizar.setForeground(Color.white);
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBackground(Color.blue);
        eliminar.setForeground(Color.white);
        JButton atras = new JButton("Atras");
        atras.setBackground(Color.blue);
        atras.setForeground(Color.white);

        //Le asignamos que fuente va a utilizar cada uno de los label, textbox y button
        titulo.setFont(font);
        Lmarca.setFont(f);
        marca.setFont(f);
        Lmodelo.setFont(f);
        modelo.setFont(f);
        Lalmacenamiento.setFont(f);
        almacenamiento.setFont(f);
        Ltipo_almacenamiento.setFont(f);
        tipo_almacenamiento.setFont(f);
        Lprocesador.setFont(f);
        procesador.setFont(f);
        Lcargador.setFont(f);
        cargador.setFont(f);
        Lmouse.setFont(f);
        mouse.setFont(f);

        //Cada elemento se le debe agregar una coordenada que es la parte donde se va a encontrar
        titulo.setBounds(40, -30, 400, 100);
        Lmarca.setBounds(40, 50, 400, 100);
        marca.setBounds(140, 70, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        Lmodelo.setBounds(40, 130, 400, 100);
        modelo.setBounds(163, 150, 150, 50);
        modelo.setBackground(Color.blue);
        modelo.setForeground(Color.white);
        Lalmacenamiento.setBounds(40, 210, 400, 100);
        almacenamiento.setBounds(220, 230, 150, 50);
        almacenamiento.setBackground(Color.blue);
        almacenamiento.setForeground(Color.white);
        Ltipo_almacenamiento.setBounds(40, 290, 400, 100);
        tipo_almacenamiento.setBounds(220, 310, 150, 50);
        tipo_almacenamiento.setBackground(Color.blue);
        tipo_almacenamiento.setForeground(Color.white);
        Lprocesador.setBounds(40, 370, 400, 100);
        procesador.setBounds(220, 390, 150, 50);
        procesador.setBackground(Color.blue);
        procesador.setForeground(Color.white);
        Lcargador.setBounds(40, 450, 400, 100);
        cargador.setBounds(220, 470, 150, 50);
        cargador.setBackground(Color.blue);
        cargador.setForeground(Color.white);
        Lmouse.setBounds(40, 530, 400, 100);
        mouse.setBounds(163, 550, 150, 50);
        mouse.setBackground(Color.blue);
        mouse.setForeground(Color.white);
        registrar.setBounds(30, 610, 150, 40);
        mostrar.setBounds(600, 400, 100, 40);
        buscar.setBounds(720, 400, 100, 40);
        actualizar.setBounds(720, 450, 100, 40);
        eliminar.setBounds(840, 400, 100, 40);
        atras.setBounds(920, 610, 100, 40);

        //Se agregan todos los elementos
        add(titulo);
        add(Lmarca);
        add(marca);
        add(Lmodelo);
        add(modelo);
        add(Lalmacenamiento);
        add(almacenamiento);
        add(Ltipo_almacenamiento);
        add(tipo_almacenamiento);
        add(Lprocesador);
        add(procesador);
        add(Lcargador);
        add(cargador);
        add(Lmouse);
        add(mouse);
        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && modelo.getText().length() > 0 && almacenamiento.getText().length() > 0 && tipo_almacenamiento.getText().length() > 0 && procesador.getText().length() > 0 && cargador.getText().length() > 0 && mouse.getText().length() > 0){
                    Computadores nuevoComputador = new Computadores();
                    int id = ControProyectores.contador(); 
                    nuevoComputador.setId(id);
                    nuevoComputador.setMarca(marca.getText());
                    nuevoComputador.setModelo(modelo.getText());
                    nuevoComputador.setAlmacenamiento(almacenamiento.getText());
                    nuevoComputador.setTipo_almacenamiento(tipo_almacenamiento.getText());
                    nuevoComputador.setProcesador(procesador.getText());
                    nuevoComputador.setCargador(cargador.getText());
                    nuevoComputador.setMouse(mouse.getText());
                    ControCompu.registrarComputador(nuevoComputador);
                    marca.setText(null);
                    modelo.setText(null);
                    almacenamiento.setText(null);
                    tipo_almacenamiento.setText(null);
                    procesador.setText(null);
                    cargador.setText(null);
                    mouse.setText(null);
                }else{ 
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
             }
        }); 
         

        
        mostrar.addActionListener(new ActionListener() {

             @Override
            public void actionPerformed(ActionEvent e) {
                Object columnas[] = {"ID","MARCA","MODELO","ALMACENAMIENTO","T.ALMACENAMINTO", "PROCESADOR", "CARGADOR", "MOUSE "};

            DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
            JTable tabla=new JTable(modeloTabla);
            tabla.setBounds(600, 100, 500, 600);
            tabla.setBackground(Color.blue);
            tabla.setForeground(Color.white);
            add(tabla);

            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBounds(500, 10, 500, 300);
            add(scroll);
            for(Computadores computadores : ControCompu.obtenerComputador()){
                modeloTabla.addRow(new Object[]{computadores.getId(), computadores.getMarca(), computadores.getModelo(), computadores.getAlmacenamiento(), computadores.getTipo_almacenamiento(), computadores.getProcesador(), computadores.getCargador(), computadores.getMouse()});
            }
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = JOptionPane.showInputDialog("Buscar ID");
                Computadores computadorEncontrado = ControCompu.buscarComputador(Integer.parseInt(id1));
                if(computadorEncontrado != null){
                    marca.setText(computadorEncontrado.getMarca());
                    modelo.setText(computadorEncontrado.getModelo());
                    almacenamiento.setText(computadorEncontrado.getAlmacenamiento());
                    tipo_almacenamiento.setText(computadorEncontrado.getTipo_almacenamiento());
                    procesador.setText(computadorEncontrado.getProcesador());
                    cargador.setText(computadorEncontrado.getCargador());
                    mouse.setText(computadorEncontrado.getMouse());
                    id = computadorEncontrado.getId();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El Proyector no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && modelo.getText().length() > 0 && almacenamiento.getText().length() > 0 && tipo_almacenamiento.getText().length() > 0 && procesador.getText().length() > 0 && cargador.getText().length() > 0 && mouse.getText().length() > 0){ 
                    Computadores nuevoComputador = new Computadores();
                    nuevoComputador.setId(id);
                    nuevoComputador.setMarca(marca.getText());
                    nuevoComputador.setModelo(modelo.getText());
                    nuevoComputador.setAlmacenamiento(almacenamiento.getText());
                    nuevoComputador.setTipo_almacenamiento(tipo_almacenamiento.getText());
                    nuevoComputador.setProcesador(procesador.getText());
                    nuevoComputador.setCargador(cargador.getText());
                    nuevoComputador.setMouse(mouse.getText());
                    ControCompu.actualizarComputador(id, nuevoComputador);
                    marca.setText(null);
                    modelo.setText(null);
                    almacenamiento.setText(null);
                    tipo_almacenamiento.setText(null);
                    procesador.setText(null);
                    cargador.setText(null);
                    mouse.setText(null);
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
                    ControCompu.eliminarComputador(id);
                    marca.setText(null);
                    modelo.setText(null);
                    almacenamiento.setText(null);
                    tipo_almacenamiento.setText(null);
                    procesador.setText(null);
                    cargador.setText(null);
                    mouse.setText(null);
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
                VistaPrincipal nuevoFrame = new VistaPrincipal(ControCompu, ControMemorias, ControProyectores, ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
            }
        });
        
    }

}
