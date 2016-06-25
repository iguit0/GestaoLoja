package br.com.loja.vendas;

import br.com.loja.clientes.Cliente;
import br.com.loja.clientes.Endereco;
import br.com.loja.produtos.CD;
import br.com.loja.produtos.DVD;
import br.com.loja.produtos.Jogo;
import br.com.loja.produtos.Livro;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/** Classe: GerenciadorVendas
*  Esta classe possui toda a lógica de cadastro de venda e listagem...
* @author Igor
* @author Mateus
*/
public class GerenciadorVendas {
    
    Scanner input = new Scanner(System.in);
    private String data, status;
    
    ArrayList<Venda> listaVenda = new ArrayList<Venda>();
    
    public boolean cadastrarVenda() throws InterruptedException {
        int opcao = 0;
        Venda venda = new Venda();
        double valorVenda = 0;
        
        Cliente cliente = new Cliente();
        cliente = venda.escolherCliente();
        venda.setCliente(cliente);
        
        Endereco endereco = new Endereco();
        endereco = venda.escolherEndereco(cliente);
        venda.setEndereco(endereco);
        
        do {
           /* System.out.print("\nComprar Produtos\n");
            System.out.print("\n1. CD");
            System.out.print("\n2. DVD");
            System.out.print("\n3. Jogo");
            System.out.print("\n4. Livro");
            System.out.print("\n0. Sair\n");    
            System.out.print("\nOpcao: ");*/
            opcao = input.nextInt();
            
            switch(opcao) {
                case 0:
                    break;
                case 1:
                    CD cd = new CD();
                    cd = venda.comprarCD();
                    System.out.print("\nQuantidade desejada: ");
                    cd.qnt = input.nextInt();
                    cd.precoTotal = cd.preco * cd.qnt;
                    valorVenda += cd.precoTotal;
                    venda.listaProdutos.add(cd);
                    break;
                case 2:
                    DVD dvd = new DVD();
                    dvd = venda.comprarDVD();
                    System.out.print("\nQuantidade desejada: ");
                    dvd.qnt = input.nextInt();
                    dvd.precoTotal = dvd.preco * dvd.qnt;
                    venda.listaProdutos.add(dvd);
                    valorVenda += dvd.precoTotal;
                    break;
                case 3:
                    Jogo jogo = new Jogo();
                    jogo = venda.comprarJogo();
                    System.out.print("\nQuantidade desejada: ");
                    jogo.qnt= input.nextInt();
                    jogo.precoTotal = jogo.preco * jogo.qnt;
                    venda.listaProdutos.add(jogo);
                    valorVenda += jogo.precoTotal;
                    break;
                case 4:
                    Livro livro = new Livro();
                    livro = venda.comprarLivro();
                    System.out.print("\nQuantidade desejada: ");
                    livro.qnt = input.nextInt();
                    livro.precoTotal = livro.preco * livro.qnt;
                    venda.listaProdutos.add(livro);
                    valorVenda += livro.precoTotal;
                    break;
                
            }
            
        }while(opcao != 0);
        
        data = getDateTime();
        status = "em andamento";
        setStatus(status);
        System.out.println("Status: " + getStatus() + "\nData: " + data);
        status = "finalizada";
        
        Thread.sleep(5000, 0);
        
        data = getDateTime();
        setStatus(status);
        System.out.println("Status: " + getStatus() + "\nData: " + data);
        
        venda.setData(data);
        venda.setStatus(status);
        venda.setValorVenda(valorVenda);
        
        listaVenda.add(venda);
        
        return true;
    }
    
    public void listarVenda(String descPesquisa) {
        if(listaVenda.isEmpty()) {
            System.out.print("\nNenhuma venda cadastrada!\n");
        }
        
        System.out.print("\nVendas\n");
        
        Venda venda = new Venda();
        
        int n = venda.listaProdutos.size();
        
        int nRegs = listaVenda.size();
        
        for(int i = 0; i < nRegs; i++) {
            if(listaVenda.get(i).flag.startsWith(descPesquisa)) {
                System.out.print("\nCliente\n");
                System.out.print("\n-> Nome: " + listaVenda.get(i).getCliente().getNome());
                System.out.print("\n-> CPF: " + listaVenda.get(i).getCliente().getCpf());
                System.out.print("\n-> Email: " + listaVenda.get(i).getCliente().getEmail());
                System.out.print("\n");
                System.out.print("\nEndereco\n");
                System.out.print("\n-> Rua: " + listaVenda.get(i).getEndereco().getRua());
                System.out.print("\n-> Numero: " + listaVenda.get(i).getEndereco().getNumero());
                System.out.print("\n-> Bairro: " + listaVenda.get(i).getEndereco().getBairro());
                System.out.print("\n-> Cidade: " + listaVenda.get(i).getEndereco().getCidade());
                System.out.print("\n-> CEP: " + listaVenda.get(i).getEndereco().getCep());
                System.out.print("\n");
                System.out.print("\n-> Valor da Venda: "  + listaVenda.get(i).getValorVenda());
                System.out.print("\n");
                System.out.print("\n-> Status da Venda: " + listaVenda.get(i).getStatus());
                System.out.print("\n");
            }
        }
        
    }
    
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
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
    
}
