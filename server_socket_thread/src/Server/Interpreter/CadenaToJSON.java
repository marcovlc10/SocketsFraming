/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Interpreter;

/**
 *
 * @author esnip
 */
public class CadenaToJSON implements Expression {

    @Override
    /**
     *   
     *   String[] arrSplit = context.split(",");   
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
        Persona p = new Persona(arrSplit[0],Float.valueOf(arrSplit[1]),Float.valueOf(arrSplit[2]));
        
        p.setIMC(p.getPeso()/(p.getEstatura()*p.getEstatura()));
         
        return String.valueOf(p.getNombre())+","+String.valueOf(p.getEstatura())+","+String.valueOf(p.getPeso())+","+String.valueOf(p.getIMC());
     */
    /**
     * String mensaje = "[{\"To\":\"JSON\",\"from\":\"cadena\",\"mensaje\":\"olis\"},
     */
    public String interpret(String context) {
        
      
        
        return null;
        
    }
    
}
