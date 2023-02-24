/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Interpreter;

import dominio.Mensaje;
import org.json.JSONObject;
public class CadenaExpression  implements Expression
{
    @Override
    public String interpret(String context) {
     String[] arrSplit = context.split(",");   
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
        System.out.println(arrSplit[1]+" "+arrSplit[0]+" "+arrSplit[2]);
        Mensaje  m = new Mensaje(arrSplit[1],arrSplit[0],arrSplit[2]);

        JSONObject jsonObject = new JSONObject(m);
        String json = jsonObject.toString();

       return json;
    }

}
