package excepciones;

import javax.swing.JOptionPane;

public class Exception_Product_Not_Found extends Exception{

    public  Exception_Product_Not_Found(){
        super("Product Not Found");
        //JOptionPane.showMessageDialog(null, "Producto no encontrado", JOptionPane.ERROR_MESSAGE);
    }
}
