/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import vistas.FrmInicioSesion;
import vistas.FrmRegistroUsuario;

/**
 *
 * @author Abrahan Barrios
 */
public class registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmInicioSesion inicio= new FrmInicioSesion();
        inicio.setVisible(true);  
    }
    {
        FrmRegistroUsuario form = new FrmRegistroUsuario();
        form.setVisible(true);  
    }
}
