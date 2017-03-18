
package Beans;

import java.util.List;


/**
 * The type Cliente beans.
 */
public class ClienteBeans {
    
    private int Codigo, OrdemCidade, OrdemBairro;
    private String Operador,DataNasc,DataCad,Celular,Email, Cpf, Rg, Referencia;
    private String[] Nome = new String[2];
    private  List<String> Bairro; 

    public List<String> getCidade() {
        return Cidade;
    }

    public void setCidade(List<String> Cidade) {
        this.Cidade = Cidade;
    }
    private List<String> Cidade;
    /**
     * Gets ordem cidade.
     *
     * @return the ordem cidade
     */
    public int getOrdemCidade() {
        return OrdemCidade;
    }

    /**
     * Sets ordem cidade.
     *
     * @param OrdemCidade the ordem cidade
     */
    public void setOrdemCidade(int OrdemCidade) {
        this.OrdemCidade = OrdemCidade;
    }

    /**
     * Gets ordem bairro.
     *
     * @return the ordem bairro
     */
    public int getOrdemBairro() {
        return OrdemBairro;
    }

    /**
     * Sets ordem bairro.
     *
     * @param OrdemBairro the ordem bairro
     */
    public void setOrdemBairro(int OrdemBairro) {
        this.OrdemBairro = OrdemBairro;
    }

    
    public String[] getNome() {
        return Nome;
    }

    public void setNome(String Nome, int i) {
        this.Nome[i] = Nome;
    }
    
   

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String Operador) {
        this.Operador = Operador;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    /**
     * Gets cpf.
     *
     * @return the cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * Sets cpf.
     *
     * @param Cpf the cpf
     */
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    /**
     * Gets rg.
     *
     * @return the rg
     */
    public String getRg() {
        return Rg;
    }

    /**
     * Sets rg.
     *
     * @param Rg the rg
     */
    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    private boolean Ativo;

    /**
     * Is ativo boolean.
     *
     * @return the boolean
     */
    public boolean isAtivo() {
        return Ativo;
    }

    /**
     * Sets ativo.
     *
     * @param Ativo the ativo
     */
    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

    /**
     * Get ativo boolean.
     *
     * @return the boolean
     */
    public  Boolean getAtivo(){
        return Ativo;
    }

    /**
     * Gets celular.
     *
     * @return the celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * Sets celular.
     *
     * @param Celular the celular
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets email.
     *
     * @param Email the email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Gets codigo.
     *
     * @return the codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Sets codigo.
     *
     * @param Codigo the codigo
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public List<String> getBairro() {
        return Bairro;
    }

    
    public void setBairro(List<String> Bairro) {    
        this.Bairro = Bairro;
    }

    /**
     * Gets data cad.
     *
     * @return the data cad
     */
    public String getDataCad() {
        return DataCad;
    }

    /**
     * Sets data cad.
     *
     * @param DataCad the data cad
     */
    public void setDataCad(String DataCad) {
        this.DataCad = DataCad;
    }


    /**
     * Instantiates a new Cliente beans.
     */
    public ClienteBeans() {
        
        
    }

   
    
    

}
