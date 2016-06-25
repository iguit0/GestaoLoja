package br.com.loja.visao;

import br.com.loja.clientes.GerenciadorClientes;
import br.com.loja.produtos.GerenciadorProdutos;
import br.com.loja.vendas.GerenciadorVendas;
import java.util.Scanner;

/** Classe: Menu
*  Esta classe visa uma melhor organização da aplicação, pois organiza os
*  métodos de acordo com a opção que o usuário escolher...
* @author Igor
* @author Mateus
*/

public class Menu {
    //Scanner e instâncias 
    Scanner ler = new Scanner(System.in);
    GerenciadorProdutos gP = new GerenciadorProdutos();
    GerenciadorClientes gC = new GerenciadorClientes();
    GerenciadorVendas gV = new GerenciadorVendas();
    MenuProdutos mprod = new MenuProdutos();
    
    //atributos e controladores..
    String login, senha,descPesquisa;
    private int opcaoMenu;
    boolean verificador = true;
    
        public void Menu() throws InterruptedException{  		                      
                do{
                    System.out.println("\t\t## Gestao de Loja :: ##");
                    System.out.println("\n                  ==============================");
                    System.out.println("                  |     1 - Cadastrar Produtos  |");
                    System.out.println("                  |     2 - Cadastrar Clientes  |");
                    System.out.println("                  |     3 - Cadastra Vendas     |");
                    System.out.println("                  |     4 - Alterar Estoque     |");
                    System.out.println("                  |     5 - Alterar dados       |");
                    System.out.println("                  |     6 - Lista produto       |");
                    System.out.println("                  |     7 - Lista clientes      |");
                    System.out.println("                  |     8 - Lista vendas        |");
                    System.out.println("                  |     0 - Sair                |");
                    System.out.println("                  ==============================\n");
                    System.out.print("Digite sua Opcao -> ");
                    opcaoMenu = ler.nextInt();
			switch(opcaoMenu){
                                case 0:
                                    System.out.println("Saiu...");
                                    break;
                                case 1:    
                                    mprod.MenuProd();
                                    break;
                                case 2:
                                    gC.cadastrarCliente();
                                    break;
                                case 3:
                                    gV.cadastrarVenda();
                                    break;
                                case 4:
                                    gP.alterarEstoque();
                                    break;
                                case 5:
                                    gC.alterarDadosCliente();
                                    break;
                                case 6:
                                    mprod.ListaProd();
                                    break;
                                case 7:
                                    descPesquisa = "";
                                    gC.listarClientes(descPesquisa);
                                    break;
                                case 8:
                                    descPesquisa = "";
                                    gV.listarVenda(descPesquisa);
                                    break;		  
                                
                                default:  System.out.println("Voce digitou uma opcao incorreta!!");					
                        }
					}while(opcaoMenu != 0);
			
    }     

    public int getOpcaoMenu() {
        return opcaoMenu;
    }

    public void setOpcaoMenu(int opcaoMenu) {
        this.opcaoMenu = opcaoMenu;
    }
    
}
