/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felimframer;

import java.io.IOException;
import java.io.ObjectOutputStream;



public interface Framer {
    public void frameMsg(String message,ObjectOutputStream out,String to);
    public String nextMsg(String send) throws IOException;
}
