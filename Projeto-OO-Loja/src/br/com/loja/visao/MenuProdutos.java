package br.com.loja.visao;

import br.com.loja.produtos.GerenciadorProdutos;
import java.util.Scanner;

/** Classe: MenuProdutos
*  A função desta classe é semelhante a Menu, porém, com produtos..
*  Realiza a listagem e o cadastro de produtos...
* @author Igor
* @author Mateus
*/
public class MenuProdutos {
    //Scanner, instâncias, Arrays, Atributos , etc..
    private int opcao;
    
    Scanner input = new Scanner(System.in);
    
    GerenciadorProdutos gP = new GerenciadorProdutos();
    
    String descPesquisa;
      
    public void MenuProd(){
        do{
            System.out.println("\nEscolha um produto!!");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - Jogo");
            System.out.println("4 - Livro");
            System.out.println("0 - Voltar para Menu");
            System.out.print("Opcao -> ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    gP.cadastrarCD();
                    break;
                case 2:
                    gP.cadastrarDVD();
                    break;
                case 3:
                    gP.cadastrarJogo();
                    break;
                case 4:
                    gP.cadastrarLivro();
                    break;
                case 0:
                    System.out.println("Voce saiu...");
                    break;
                default: System.out.println("Digite uma opcao correta!!");
            }
        }while(opcao != 0);
    }
    
    public void ListaProd(){
        do{
            System.out.println("\nEscolha um produto para listar!!");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - Jogo");
            System.out.println("4 - Livro");
            System.out.println("0 - Voltar para Menu\n");
            System.out.print("Opcao -> ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    descPesquisa = "";
                    gP.listarCD(descPesquisa);
                    break;
                case 2:
                   descPesquisa = "";
                    gP.listarDVD(descPesquisa);
                    break;
                case 3:
                    descPesquisa = "";
                    gP.listarJogo(descPesquisa);
                    break;
                case 4:
                    descPesquisa = "";
                    gP.listarLivro(descPesquisa);
                case 0:
                    System.out.println("Voce saiu...");
                    break;
                default: System.out.println("Digite uma opcao correta!!");
            }
        }while(opcao != 0);
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }  
}
