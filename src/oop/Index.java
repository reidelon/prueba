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
import ui.NewJFrame;

/**
 *
 * @author tux
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJFrame f = new NewJFrame();
//        f.setSize(400, 300);
        f.setTitle("Properties CRUD");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Hashtable enu = new Hashtable<objetos.Integer, java.lang.String>();
        enu.put(1, new java.lang.String("2"));
        enu.put(2, new java.lang.String("3"));

        Object rowData[][] = {{new objetos.String(false, 2, "pepe", "blabla"), "String", "Delete"},
        {new objetos.Integer(true, 1, 2, "qk", "blablabla"), "Integer", "Delete"},
        {new objetos.Enum("cuco", "blablabla", enu), "Enum", "Delete"},};
        java.lang.String columnNames[] = {"Name", "Type", ""};

        TableModel model = new DefaultTableModel(rowData, columnNames);
        f.getjTable().setModel(model);
    }
    
}
