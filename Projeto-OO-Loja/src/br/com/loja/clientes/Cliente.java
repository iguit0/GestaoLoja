package br.com.loja.clientes;

import java.util.ArrayList;

/** Classe: Cliente
*  Esta classe possui os atributos que serão manipulados em GerenciadorClientes.
* @author Igor
* @author Mateus
*/
public class Cliente {
    private int codigo;
    private String cpf, nome, email, senha;
    
    public String flag = "x";
    
    public ArrayList<Endereco> endereco = new ArrayList<Endereco>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
