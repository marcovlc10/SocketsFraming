/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felimframer;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeliFramer implements Framer{
    private InputStream in;
    private static final byte DELIMITER = '\n';
    @Override
    public void frameMsg(String message, ObjectOutputStream out,String to) {
        try {
             System.out.println("enviado data to server");
            out.writeObject(to);
            out.writeObject(message);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(DeliFramer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String nextMsg(String send) throws IOException {
        return send;
    }

  
    
}
