/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientejson;

import InterfazGrafica.FrmMain;

public class ClienteJSON {

    /**
     * @param args the command line argumentsW
     */
    public static void main(String[] args) {
        FrmMain i = new FrmMain();
        i.startThread();
        i.setVisible(true);
        i.agregarObserver();
        try
            {
                Thread.sleep(1000);
                i.registrarNombre();
            
            }catch(InterruptedException e){}
    }
    
}
