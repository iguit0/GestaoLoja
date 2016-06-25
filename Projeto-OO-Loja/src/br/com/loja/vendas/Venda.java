package br.com.loja.vendas;

import br.com.loja.clientes.Cliente;
import br.com.loja.clientes.Endereco;
import br.com.loja.clientes.GerenciadorClientes;
import br.com.loja.produtos.CD;
import br.com.loja.produtos.DVD;
import br.com.loja.produtos.GerenciadorProdutos;
import br.com.loja.produtos.Jogo;
import br.com.loja.produtos.Livro;
import java.util.ArrayList;
import java.util.Scanner;
/** Classe: Venda
*  Esta classe escolhe o cliente e escolhe endereco, assim como compra produtos 
* para determinado cliente.
* @author Igor
* @author Mateus
*/
public class Venda {
    private String data, status;
    private Cliente cliente;
    private Endereco endereco;
    private double valorVenda;
    
    public String flag = "x";
    
    public ArrayList listaProdutos = new ArrayList<>();
    GerenciadorClientes gC = new GerenciadorClientes();
    GerenciadorProdutos gP = new GerenciadorProdutos();
    
    Scanner input = new Scanner(System.in);
    
    public Cliente escolherCliente() {
        int nRegs;
        
        Cliente cliente = new Cliente();
        
        nRegs = gC.listaCliente.size();
        
        for(int i = 0; i < nRegs; i++) {
            System.out.print("\n-> CPF: " + gC.listaCliente.get(i).getCpf());
            System.out.print("\n-> Nome: " + gC.listaCliente.get(i).getNome());
            System.out.print("\n-> Email: " + gC.listaCliente.get(i).getEmail());
            System.out.print("\n-> Senha: " + gC.listaCliente.get(i).getSenha());
            System.out.print("\n");
        }
        
        System.out.print("\nCPF do cliente: ");
        String cpfCliente = input.nextLine();
        
        for(int j = 0; j < nRegs; j++) {
            if(gC.listaCliente.get(j).getCpf().equals(cpfCliente)) {
                cliente = gC.listaCliente.get(j);
                break;
            }
        }
        
        return cliente;
    }
    
    public Endereco escolherEndereco(Cliente cliente) {
        int nRegs;
        
        Endereco endereco = new Endereco();
        
        nRegs = gC.listaCliente.size();
        
        for(int i = 0; i < nRegs; i++) {
            System.out.print("\n-> Rua: " + cliente.endereco.get(i).getRua());
            System.out.print("\n-> Numero: " + cliente.endereco.get(i).getNumero());
            System.out.print("\n-> Bairro: " + cliente.endereco.get(i).getBairro());
            System.out.print("\n-> Cidade: " + cliente.endereco.get(i).getCidade());
            System.out.print("\n-> CEP: " + cliente.endereco.get(i).getCep());
            System.out.print("\n");
        }
        
        System.out.print("\nCEP do endereco do cliente: ");
        String cepEndereco = input.nextLine();
        
        for(int j = 0; j < nRegs; j++) {
            if(cliente.endereco.get(j).getCep().equals(cepEndereco)) {
                endereco = cliente.endereco.get(j);
            }
        }
        
        return endereco;
    }
    
    public CD comprarCD() {
        int nRegs, codPesquisar;
        String descPesquisa;
        
        CD cd = new CD();
        
        nRegs = gP.listaCD.size();
        
        descPesquisa = "";
        gP.listarCD(descPesquisa);
        
        
        System.out.print("\nCodigo do CD desejado: ");
        codPesquisar = input.nextInt();
        
        for(int i = 0; i < nRegs; i++) {
            if(gP.listaCD.get(i).codigo == codPesquisar) {
                cd = gP.listaCD.get(i);
            }
        }
        
        return cd;
    }
    
    public DVD comprarDVD() {
        int nRegs, codPesquisar;
        String descPesquisa;
        
        DVD dvd = new DVD();
        
        nRegs = gP.listaDVD.size();
        
        descPesquisa = input.next();
        gP.listarDVD(descPesquisa);
        
        
        System.out.print("\nCodigo do DVD desejado: ");
        codPesquisar = input.nextInt();
        
        for(int i = 0; i < nRegs; i++) {
            if(gP.listaDVD.get(i).codigo == codPesquisar) {
                dvd = gP.listaDVD.get(i);
            }
        }
        
        return dvd;
    }
    
    public Jogo comprarJogo() {
        int nRegs, codPesquisar;
        String descPesquisa;
        
        Jogo jogo = new Jogo();
        
        nRegs = gP.listaJogo.size();
        
        descPesquisa = input.next();
        gP.listarLivro(descPesquisa);
        
        
        System.out.print("\nCodigo do Jogo desejado: ");
        codPesquisar = input.nextInt();
        
        for(int i = 0; i < nRegs; i++) {
            if(gP.listaJogo.get(i).codigo == codPesquisar) {
                jogo = gP.listaJogo.get(i);
            }
        }
        
        return jogo;
    }
    
    public Livro comprarLivro() {
        int nRegs, codPesquisar;
        String descPesquisa;
        
        Livro livro = new Livro();
        
        nRegs = gP.listaLivro.size();
        
        descPesquisa = input.next();
        gP.listarLivro(descPesquisa);
        
        
        System.out.print("\nCodigo do Livro desejado: ");
        codPesquisar = input.nextInt();
        
        for(int i = 0; i < nRegs; i++) {
            if(gP.listaLivro.get(i).codigo == codPesquisar) {
                livro = gP.listaLivro.get(i);
            }
        }
        
        return livro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
