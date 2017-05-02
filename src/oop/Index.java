/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Hashtable;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ui.MainFrame;

/**
 *
 * @author tux
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        UIManager.LookAndFeelInfo plaf[] = UIManager.getInstalledLookAndFeels();
        try {
//            UIManager.setLookAndFeel(plaf[1].getClassName());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex1) {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception ex2) {
                System.err.println("Could not to change Look and Feel.");

            }

        }
        
        MainFrame f = new MainFrame();
//        f.setSize(400, 300);
        f.setTitle("Properties CRUD");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Map enu = new Hashtable<java.lang.String, java.lang.String>();
        enu.put("1", new java.lang.String("Mecanico"));
        enu.put("2", new java.lang.String("Informatico"));

        Object rowData[][] = {{new objetos.String(true, 2, "pepe", "blabla", "string"), "String"},
        {new objetos.Integer(true, 1, 2, "qk", "blablabla",33), "Integer"},
        {new objetos.Enum("cuco", "blablabla", enu), "Enum"}};
        java.lang.String columnNames[] = {"Name", "Type"};

        TableModel model = new DefaultTableModel(rowData, columnNames);
        f.getjTable().setModel(model);
    }

}
