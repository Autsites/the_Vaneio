
package Controller;

import javax.swing.*;

import static java.lang.System.*;

/**
 * The type ConfiguracaoMaster.
 *
 * @author Java
 */
public class ConfiguracaoMaster {

    /**
     * The Titulo.
     */
    static final String $titulo = "Pizzaria Zeo";

    /**
     * Get titulo string.
     *
     * @return the string
     */
    public static String get$titulo() {
        return $titulo;
    }


    /**
     * Fechar form boolean.
     *
     * @return the boolean
     */
    public static void fecharForm(){
        
        Object[] options = {"Sim", "Não"};
        

        if (JOptionPane.showOptionDialog(null, "Deseja Fechar a Janela?", "Fechar Operação",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]) 
                == 0) {
                   System.exit(0);
        }

    }

    public static void fecharForm(JInternalFrame frm){

        Object[] options = {"Sim", "Não"};


        if (JOptionPane.showOptionDialog(null, "Deseja Fechar a Janela?", "Fechar Operação",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1])
                == 0) {
            frm.dispose();
        }

    }
    

}
