/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import objetos.String_;
import objetos.Integer;
import ui.NewJFrame;

/**
 *
 * @author tux
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Hashtable numeros = new Hashtable();
//        numeros.put("uno", new Integer(1));
//        numeros.put("uno", new String("2"));
//        numeros.put("uno", new Float(3.0));
//
//        for (Dictionary item : numeros.) {
//
//        }

        NewJFrame f = new NewJFrame();
//        f.setSize(400, 300);
        f.setTitle("Properties CRUD");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Hashtable enu = new Hashtable<Integer, String>();
        enu.put(1, new String("2"));
        enu.put(2, new String("3"));

        Object rowData[][] = {{new String_(false, 2, "pepe", "blabla"), "String_", "Delete"},
        {new Integer(true, 1, 2, "qk", "blablabla"), "Integer", "Delete"},
        {new objetos.Enum("cuco", "blablabla", enu), "Enum", "Delete"},};
        String columnNames[] = {"Name", "Type", ""};

        TableModel model = new DefaultTableModel(rowData, columnNames);
        f.getjTable().setModel(model);
    }

}
