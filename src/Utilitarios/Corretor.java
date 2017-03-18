package Utilitarios;

import java.sql.Array;
import java.sql.SQLException;

/**
 * The type Corretor.
 *
 * @author Java
 */
public class Corretor {

    /**
     * Converter data sql string.
     *
     * @param Data the data
     * @return the string
     */
    public static String ConverterDataSQL(String Data) {
        
        return Data.substring(6,10) + "-" + Data.substring(3,5) + "-" + Data.substring(0,2);
    }

    /**
     * Converter data java string.
     *
     * @param Data the data
     * @return the string
     */
    public static String ConverterDataJava(String Data) {
        
        return Data.substring(8,10) + "/" + Data.substring(5,7) + "/" + Data.substring(0,4);
    }


    /**
     * Converter status java string.
     *
     * @param Status the status
     * @return the string
     */
    public static String ConverterStatusJava(Boolean Status) {
        if (Status == true) {
            return "Ativo";
        } else {
            return "Inativo";
        }
    }

    /**
     * Converter status banco string.
     *
     * @param Status the status
     * @return the string
     */
    public static String ConverterStatusBanco(Boolean Status){

        if (Status == true){
            return "t";
        } else {
            return "f";
        }

    }

    /**
     * Converter status boolean boolean.
     *
     * @param Status the status
     * @return the boolean
     */
    public static boolean ConverterStatusBoolean(String Status){
        if (Status == "Ativo"){
            return true;
        } else {
            return false;
        }
    }

    public static String[] converterArray(Array a){
             String[] m = null;  
        try {
              m = (String[]) a.getArray();
        } catch (SQLException ex) {
            return  new String[] {ex.getMessage()};
        } finally {
            return m;
        }
    }
    
    public static int converterArray(Array a,int i) throws SQLException{
           Object[] o = (Object[]) a.getArray();
        
            return (int) o[i];
    }
}
    

