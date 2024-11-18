package org.example;

import Database.DB;
import GUI.App2;
import GUI.FaceTesst;
import diviceController.*;

import javax.swing.*;
import java.io.File;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static App2 app1;
    private static FaceTesst faceTesst =  null;

    // Kiểm tra kết nối Internet
    private static void checkConnectInternet(){
        try{
            Process process = java.lang.Runtime.getRuntime().exec("ping www.geeksforgeeks.org");
            int x = process.waitFor();
            if (x == 0) {

                System.out.println("Connection Successful, "
                        + "Output was " + x);
                app1.getLblKNMang().setIcon(new ImageIcon(Main.class.getResource("/ticxanh12.png")));
                app1.getLblKNMang().setText("");
                GlobalValues.setCHECK_Internet(true);

            }
            else {
                System.out.println("Internet Not Connected, "
                        + "Output was " + x);
                app1.getLblKNMang().setIcon(new ImageIcon(Main.class.getResource("/exit21.png")));
                app1.getLblKNMang().setText("Cần kết nối internet để thực hiện xác thực với BCA");

                app1.getBtnRAR().setEnabled(false);
                GlobalValues.setCHECK_Internet(false);
            }
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        File files = new File(GlobalValues.EXPORT_CSV);

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                app1 =new App2();
                app1.getBtnRAR().setEnabled(false);
                app1.getBtneKYC().setEnabled(false);
                app1.setLocationRelativeTo(null);
                checkConnectInternet();
                app1.setVisible(true);


    }

}
