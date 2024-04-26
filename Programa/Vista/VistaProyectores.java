package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.*;
import Modelo.Proyectores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaProyectores extends JFrame {
    int id;
    public VistaProyectores(ControladorComputadores ControCompu, ControladorProyectores ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(0, 0, 1100,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("PROYECTORES");
        JLabel titulo = new JLabel("PROYECTORES");
        Font font = new Font( "Comic Sans MS",Font.ITALIC, 32);
        Font f = new Font( "Comic Sans MS",Font.ITALIC, 25);
        JLabel Lmarca = new JLabel("MARCA:");
        JLabel Lresolucion = new JLabel("RESOLUCION:");
        JLabel Llargo = new JLabel("LARGO");
        JLabel Lancho = new JLabel("ANCHO");
        JLabel Lcolor = new JLabel("COlOR");
        JLabel Ltipo_entrada = new JLabel("TIPO ENTRADA");
        JLabel Lcant_entradas = new JLabel("CANT. ENTRADAS");
        
        JButton registrar = new JButton("Registrar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JButton actualizar = new JButton("Actualizar");
        JButton eliminar = new JButton("Eliminar");
        JButton atras = new JButton("Atras");

        JTextField marca = new JTextField();
        JTextField resolucion = new JTextField();
        JTextField largo = new JTextField();
        JTextField ancho = new JTextField();
        JTextField color = new JTextField();
        JTextField tipo_entrada = new JTextField();
        JTextField cant_entradas = new JTextField();

        titulo.setFont(font);
        Lmarca.setFont(f);
        Lresolucion.setFont(f);
        Llargo.setFont(f);
        Lancho.setFont(f);
        Lcolor.setFont(f);
        Ltipo_entrada.setFont(f);
        Lcant_entradas.setFont(f);

        marca.setFont(f);
        resolucion.setFont(f);
        largo.setFont(f);
        ancho.setFont(f);
        color.setFont(f);
        tipo_entrada.setFont(f);
        cant_entradas.setFont(f);

        titulo.setBounds(10, -30, 400, 100);
        Lmarca.setBounds(10, 50, 400, 100);
        Lresolucion.setBounds(10, 120, 400, 100);
        Llargo.setBounds(10, 190, 400, 100);
        Lancho.setBounds(10, 260, 400, 100);
        Lcolor.setBounds(10, 350, 400, 50);
        Ltipo_entrada.setBounds(10, 400, 400, 100);
        Lcant_entradas.setBounds(10, 470, 400, 100);

        marca.setBounds(130, 80, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        resolucion.setBounds(200, 140, 150, 50);
        resolucion.setBackground(Color.blue);
        resolucion.setForeground(Color.white);
        largo.setBounds(130, 210, 150, 50);
        largo.setBackground(Color.blue);
        largo.setForeground(Color.white);
        ancho.setBounds(130, 280, 150, 50);
        ancho.setBackground(Color.blue);
        ancho.setForeground(Color.white);
        color.setBounds(130, 350, 150, 50);
        color.setBackground(Color.blue);
        color.setForeground(Color.white);
        tipo_entrada.setBounds(230, 420, 150, 50);
        tipo_entrada.setBackground(Color.blue);
        tipo_entrada.setForeground(Color.white);
        cant_entradas.setBounds(240, 490, 150, 50);
        cant_entradas.setBackground(Color.blue);
        cant_entradas.setForeground(Color.white);

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
        add(Lresolucion);
        add(Llargo);
        add(Lancho);
        add(Lcolor);
        add(Ltipo_entrada);
        add(Lcant_entradas);

        add(marca);
        add(resolucion);
        add(largo);
        add(ancho);
        add(color);
        add(tipo_entrada);
        add(cant_entradas);

        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        

        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && resolucion.getText().length() > 0 && marca.getText().length() > 0 && largo.getText().length() > 0 && marca.getText().length() > 0 && ancho.getText().length() > 0 && marca.getText().length() > 0 && color.getText().length() > 0 && marca.getText().length() > 0 && tipo_entrada.getText().length() > 0 && marca.getText().length() > 0 && cant_entradas.getText().length() > 0 ){
                    Proyectores nuevoProyector = new Proyectores();
                    int id = ControProyectores.contador(); 
                    nuevoProyector.setId(id);
                    nuevoProyector.setMarca(marca.getText());
                    nuevoProyector.setResolucion(resolucion.getText());
                    nuevoProyector.setLargo(Float.parseFloat(largo.getText()));
                    nuevoProyector.setAncho(Float.parseFloat(ancho.getText()));
                    nuevoProyector.setColor(color.getText());
                    nuevoProyector.setTipo_entrada(tipo_entrada.getText());
                    nuevoProyector.setCant_entradas(Integer.parseInt(cant_entradas.getText()));
                    ControProyectores.registrarProyector(nuevoProyector);
                    marca.setText(null);
                    resolucion.setText(null);
                    largo.setText(null);
                    ancho.setText(null);
                    color.setText(null);
                    tipo_entrada.setText(null);
                    cant_entradas.setText(null);
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object columnas[] = {"ID","MARCA","RESOLUCION","LARGO","ANCHO", "COLOR", "TIPO DE ENTRADA", "CANT DE ENTRADAS"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
        JTable tabla=new JTable(modeloTabla);
        tabla.setBounds(600, 100, 500, 600);
        tabla.setBackground(Color.blue);
        tabla.setForeground(Color.white);
        add(tabla);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(500, 10, 500, 300);
        add(scroll);
        for(Proyectores proyectores : ControProyectores.obtenerProyector()){
            modeloTabla.addRow(new Object[]{proyectores.getId(), proyectores.getMarca(), proyectores.getResolucion(), proyectores.getLargo(), proyectores.getAncho(), proyectores.getColor(), proyectores.getTipo_entrada(), proyectores.getCant_entradas()});
        }
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = JOptionPane.showInputDialog("Buscar ID");
                Proyectores proyectorEncontrado = ControProyectores.buscarProyector(Integer.parseInt(id1));
                if(proyectorEncontrado != null){
                    marca.setText(proyectorEncontrado.getMarca());
                    resolucion.setText(proyectorEncontrado.getResolucion());
                    largo.setText(String.valueOf(proyectorEncontrado.getLargo()));
                    ancho.setText(String.valueOf(proyectorEncontrado.getAncho()));
                    color.setText(proyectorEncontrado.getColor());
                    tipo_entrada.setText(proyectorEncontrado.getTipo_entrada());
                    cant_entradas.setText(String.valueOf(proyectorEncontrado.getCant_entradas()));
                    id = proyectorEncontrado.getId();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El Proyector no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && resolucion.getText().length() > 0 && marca.getText().length() > 0 && largo.getText().length() > 0 && marca.getText().length() > 0 && ancho.getText().length() > 0 && marca.getText().length() > 0 && color.getText().length() > 0 && marca.getText().length() > 0 && tipo_entrada.getText().length() > 0 && marca.getText().length() > 0 && cant_entradas.getText().length() > 0 ){ 
                    Proyectores nuevoProyector = new Proyectores();
                    nuevoProyector.setId(id);
                    nuevoProyector.setMarca(marca.getText());
                    nuevoProyector.setResolucion(resolucion.getText());
                    nuevoProyector.setLargo(Float.parseFloat(largo.getText()));
                    nuevoProyector.setAncho(Float.parseFloat(ancho.getText()));
                    nuevoProyector.setColor(color.getText());
                    nuevoProyector.setTipo_entrada(tipo_entrada.getText());
                    nuevoProyector.setCant_entradas(Integer.parseInt(cant_entradas.getText()));
                    ControProyectores.actualizarProyector(id, nuevoProyector);
                    marca.setText(null);
                    resolucion.setText(null);
                    largo.setText(null);
                    ancho.setText(null);
                    color.setText(null);
                    tipo_entrada.setText(null);
                    cant_entradas.setText(null);
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
                    ControProyectores.eliminarProyector(id);
                    marca.setText(null);
                    resolucion.setText(null);
                    largo.setText(null);
                    ancho.setText(null);
                    color.setText(null);
                    tipo_entrada.setText(null);
                    cant_entradas.setText(null);
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
