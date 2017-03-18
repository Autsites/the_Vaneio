
package Utilitarios;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.gjt.mm.mysql.Driver;



/**
 * The type Conexao.
 */
public class Conexao {
    
    /* MySQL Connect
    private final String $link = "mysql";
    private final String $host = "localhost";
    private final String $port = "3306";
    private final String $bank = "pizzaria";
    
    private final String $driver = "org.gjt.mm.mysql.Driver";
    
    private final String $driver = "org.gjt.mm.mysql.Driver";
    
    private final String $user = "root";
    private final String $pass = "";
    */
    
    // Deagol PostgreSQL Connect
    /*
    private final String $link = "postgresql";
    private final String $host = "deagol.autsites.com";
    private final String $port = "5432";
    private final String $bank = "tcc_pizzaria";
    
    private final String $driver = "org.postgresql.Driver";
    
    private final String $user = "tcc";
    private final String $pass = "postgres123";
    */
    
    /* //Amazon AWS Connect
    private final String $link = "postgresql";
    private final String $host = "b0vgpytupagaeif-postgresql.services.clever-cloud.com";
    private final String $port = "5432";
    private final String $bank = "b0vgpytupagaeif";
    
    private final String $driver = "org.postgresql.Driver";
    
    private final String $user = "ug2zwd0sdwvpbaqkcnz1";
    private final String $pass = "FGLmG8CGQYVQ6dnHKzxd";
    */
    
    //Properties Config = new Properties();

        //Etec PostgreSQL Connect
    private String $link = "postgresql";
    private  String $host = "radbug.autsites.com";
    private  String $port = "5432";
    private  String $bank = "pizzaria";
    
    private  String $driver = "org.postgresql.Driver";
    
    private  String $user = "pizzaria_user";
    private  String $pass = "the_vaneio";
    
    
    private  String $juntar = "jdbc:"+$link+"://"+$host+":"+$port+"/"+$bank;

    /**
     * The Conectar.
     */
    public static Connection $conectar;

    /**
     * Instantiates a new Conexao.
     */
    public Conexao()  {
              
       
        try {
        
            $conectar = DriverManager.getConnection($juntar,$user,$pass);
            $conectar.setAutoCommit(false);
           
           
        } catch (Exception e) {
       
            JOptionPane.showMessageDialog(null, e.getMessage(),null,0);
           
        }

    }

    /**
     * Gets connection.
     *
     * @return the connection
     */
    public static Connection getConnection() {
        if ($conectar == null) {

            try {
                new Conexao();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                
            }

        }
       
        return $conectar;
    }

    /**
     * Fechar conexao.
     */
    public static void fecharConexao() {
       
        try {
            if (!$conectar.isClosed()) {
                $conectar.close();
                $conectar = null;
                
            }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),null,0);
        }
    }

}

