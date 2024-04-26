package Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controlador.*;
import Modelo.Routers;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaRouters extends JFrame{
    int id;
    public VistaRouters(ControladorComputadores ControCompu, ControladorMemorias ControMemorias,ControladorProyectores ControProyectores, ControladorRegletas ControRegletas, ControladorRouters ControRouters, ControladorTelevisores ControTelevisores) {
        setLayout(null);
        setBounds(0, 0, 1100,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ITEC");
        JLabel titulo = new JLabel("ROUTERS");
        Font font = new Font( "Comic Sans MS",Font.ITALIC, 32);
        Font f = new Font( "Comic Sans MS",Font.ITALIC, 25);
        JLabel Lmarca = new JLabel("MARCA:");
        JLabel Lmodelo = new JLabel("MODELO:");
        JLabel Lvelocidad = new JLabel("VELOCIDAD");
        JLabel Ltipo_conecti = new JLabel("TIPO CONEXION");
        JLabel Lcant_voltaje = new JLabel("VOLTAJE");
        
        
        JButton registrar = new JButton("Registrar");
        JButton mostrar = new JButton("Mostrar");
        JButton buscar = new JButton("Buscar");
        JButton actualizar = new JButton("Actualizar");
        JButton eliminar = new JButton("Eliminar");
        JButton atras = new JButton("Atras");

        JTextField marca = new JTextField();
        JTextField modelo = new JTextField();
        JTextField velocidad = new JTextField();
        JTextField tipo_conecti = new JTextField();
        JTextField cant_voltaje = new JTextField();


        titulo.setFont(font);
        Lmarca.setFont(f);
        Lmodelo.setFont(f);
        Lvelocidad.setFont(f);
        Ltipo_conecti.setFont(f);
        Lcant_voltaje.setFont(f);
        

        marca.setFont(f);
        modelo.setFont(f);
        velocidad.setFont(f);
        tipo_conecti.setFont(f);
        cant_voltaje.setFont(f);
        

        titulo.setBounds(0, -30, 400, 100);
        Lmarca.setBounds(10, 50, 400, 100);
        Lmodelo.setBounds(10, 130, 400, 100);
        Lvelocidad.setBounds(10, 210, 400, 100);
        Ltipo_conecti.setBounds(10, 290, 400, 100);
        Lcant_voltaje.setBounds(10, 380, 150, 50);
       

        marca.setBounds(170, 70, 150, 50);
        marca.setBackground(Color.blue);
        marca.setForeground(Color.white);
        modelo.setBounds(170, 150, 150, 50);
        modelo.setBackground(Color.blue);
        modelo.setForeground(Color.white);
        velocidad.setBounds(170, 230, 150, 50);
        velocidad.setBackground(Color.blue);
        velocidad.setForeground(Color.white);
        tipo_conecti.setBounds(200, 310, 150, 50);
        tipo_conecti.setBackground(Color.blue);
        tipo_conecti.setForeground(Color.white);
        cant_voltaje.setBounds(170, 380, 150, 50);
        cant_voltaje.setBackground(Color.blue);
        cant_voltaje.setForeground(Color.white);
        

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
        add(Lmodelo);
        add(Lvelocidad);
        add(Ltipo_conecti);
        add(Lcant_voltaje);
        

        add(marca);
        add(modelo);
        add(velocidad);
        add(tipo_conecti);
        add(cant_voltaje);
       

        add(registrar);
        add(mostrar);
        add(buscar);
        add(actualizar);
        add(eliminar);
        add(atras);

        

        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && modelo.getText().length() > 0 && marca.getText().length() > 0 && velocidad.getText().length() > 0 && marca.getText().length() > 0 && tipo_conecti.getText().length() > 0 && marca.getText().length() > 0 && cant_voltaje.getText().length() > 0){
                    Routers nuevoRouter = new Routers();
                    int id = ControRouters.contador(); 
                    nuevoRouter.setId(id);
                    nuevoRouter.setMarca(marca.getText());
                    nuevoRouter.setModelo(modelo.getText());
                    nuevoRouter.setVelocidad(velocidad.getText());
                    nuevoRouter.setTipo_conecti(tipo_conecti.getText());
                    nuevoRouter.setCant_voltaje(cant_voltaje.getText());
                    ControRouters.registrarRouter(nuevoRouter);
                    marca.setText(null);
                    modelo.setText(null);
                    velocidad.setText(null);
                    tipo_conecti.setText(null);
                    cant_voltaje.setText(null);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: Los campos no pueden quedar vacios", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object columnas[] = {"ID","MARCA","MODELO","VELOCIDAD","TIPO CONEXION", "CANTIDAD VOLTAJE"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas,0);
        JTable tabla=new JTable(modeloTabla);
        tabla.setBounds(600, 100, 500, 600);
        tabla.setBackground(Color.blue);
        tabla.setForeground(Color.white);
        add(tabla);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(500, 10, 500, 300);
        add(scroll);
        for(Routers routers : ControRouters.obtenerRouter()){
            modeloTabla.addRow(new Object[]{routers.getId(), routers.getMarca(), routers.getModelo(), routers.getVelocidad(), routers.getTipo_conecti(), routers.getCant_voltaje()});
        }
            }
        });

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id1 = JOptionPane.showInputDialog("Buscar ID");
                Routers routerEncontrado = ControRouters.buscarRouter(Integer.parseInt(id1));
                if(routerEncontrado != null){
                    marca.setText(routerEncontrado.getMarca());
                    modelo.setText(routerEncontrado.getModelo());
                    velocidad.setText(String.valueOf(routerEncontrado.getVelocidad()));
                    tipo_conecti.setText(String.valueOf(routerEncontrado.getTipo_conecti()));
                    cant_voltaje.setText(routerEncontrado.getCant_voltaje());
                    
                    id = routerEncontrado.getId();
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El router no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(marca.getText().length() > 0 && modelo.getText().length() > 0 && marca.getText().length() > 0 && velocidad.getText().length() > 0 && marca.getText().length() > 0 && tipo_conecti.getText().length() > 0 && marca.getText().length() > 0 && cant_voltaje.getText().length() > 0 && marca.getText().length() > 0){ 
                    Routers nuevoRouter = new Routers();
                    nuevoRouter.setId(id);
                    nuevoRouter.setMarca(marca.getText());
                    nuevoRouter.setModelo(modelo.getText());
                    nuevoRouter.setVelocidad(velocidad.getText());
                    nuevoRouter.setTipo_conecti(tipo_conecti.getText());
                    nuevoRouter.setCant_voltaje(cant_voltaje.getText());
                    
                    ControRouters.actualizarRouter(id, nuevoRouter);
                    marca.setText(null);
                    modelo.setText(null);
                    velocidad.setText(null);
                    tipo_conecti.setText(null);
                    cant_voltaje.setText(null);
                    
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
                    ControRouters.eliminarRouter(id);
                    marca.setText(null);
                    modelo.setText(null);
                    velocidad.setText(null);
                    tipo_conecti.setText(null);
                    cant_voltaje.setText(null);
                    
                    id = 0;
                }else{
                    JOptionPane.showMessageDialog(null, "Algo salió mal: El router no ha sido encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }  
            }
        });

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VistaPrincipal nuevoFrame = new VistaPrincipal(ControCompu, ControMemorias, ControProyectores,
                        ControRegletas, ControRouters, ControTelevisores);
                nuevoFrame.setVisible(true);
            }
        });
        
    }


 
    
}
