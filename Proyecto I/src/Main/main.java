/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import com.datos.CargarDatos;
import com.view.VentanaPrincipal;
import com.modelo.Colegio;
/**
 *
 * @author R22bot2.15 Pocket
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CargarDatos carga = new CargarDatos();
        Colegio colegio = (carga.cargarXML());
        VentanaPrincipal vnPr = new VentanaPrincipal();
        vnPr.setVisible(true);
        
    }
    
}
