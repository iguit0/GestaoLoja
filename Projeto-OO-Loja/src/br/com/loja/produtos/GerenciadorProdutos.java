package br.com.loja.produtos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/** Classe: GerenciadorProdutos
*  Esta classe possui toda a lógica de cadastro de produtos, ainda
*  possui o método de listagem dos mesmos...
* @author Igor
* @author Mateus
*/
public class GerenciadorProdutos {
    //Scanner, instâncias, Arrays, Atributos , etc..
    private boolean verificador;
    private boolean controlador;
    Scanner input = new Scanner(System.in);
    
    public ArrayList<CD> listaCD = new ArrayList<CD>();
    public ArrayList<DVD> listaDVD = new ArrayList<DVD>();
    public ArrayList<Jogo> listaJogo = new ArrayList<Jogo>();
    public ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    
    public boolean cadastrarCD() {  
        CD cd = new CD();
        this.verificador = true;
        
        do {
            try {
                cd.qnt = 0;
                cd.precoTotal = 0;
                System.out.print("\nCadastrar CD\n");
                System.out.print("\n- Codigo do CD: ");
                cd.codigo = input.nextInt();
                input.nextLine();
                System.out.print("- Descricao do CD: ");
                cd.descricao = input.nextLine();
                System.out.print("- Estoque do CD: ");
                cd.estoque = input.nextInt();
                input.nextLine();
                System.out.print("- Preco do CD: ");
                cd.preco = input.nextDouble();
                input.nextLine();
                System.out.print("- Nome do CD: ");
                cd.nome = input.nextLine();
                System.out.print("- Cantor do CD: ");
                String cantorCD = input.nextLine();
                cd.setCantor(cantorCD);
                System.out.print("- Gravadora do CD: ");
                String gravadoraCD = input.nextLine();
                cd.setGravadora(gravadoraCD);
                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException e2) {
                System.err.print("\nErro: " + e2);
            }catch(ArithmeticException | NullPointerException | ClassCastException e3) {
                System.err.print("\nErro: " + e3);
            }
        }while(isVerificador());
        
        
        listaCD.add(cd);
        System.out.print("\nCD cadastrado com sucesso!\n");
        
        
        return true;
    }
    
    public boolean cadastrarDVD() {
        DVD dvd = new DVD();
        this.verificador = true;
        
        do {
            try {
                dvd.qnt = 0;
                dvd.precoTotal = 0;
                System.out.print("\nCadastrar DVD\n");
                System.out.print("\n- Codigo do DVD: ");
                dvd.codigo = input.nextInt();
                input.nextLine();
                System.out.print("- Descricao do DVD: ");
                dvd.descricao = input.nextLine();
                System.out.print("- Estoque do DVD: ");
                dvd.estoque = input.nextInt();
                input.nextLine();
                System.out.print("- Preco do DVD: ");
                dvd.preco = input.nextDouble();
                input.nextLine();
                System.out.print("- Nome do DVD: ");
                dvd.nome = input.nextLine();
                System.out.print("- Genero do DVD: ");
                String generoDVD = input.nextLine();
                dvd.setGenero(generoDVD);
                System.out.print("- Produtora do DVD: ");
                String produtoraDVD = input.nextLine();
                dvd.setProdutora(produtoraDVD);
                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException e2) {
                System.err.print("\nErro: " + e2);
            }catch(ArithmeticException | NullPointerException | ClassCastException e3) {
                System.err.print("\nErro: " + e3);
            }
        }while(isVerificador());
        
        
        listaDVD.add(dvd);
        System.out.print("\nDVD cadastrado com sucesso!\n");
        
        
        return true;
    }
    
    public boolean cadastrarJogo() {
        Jogo jogo = new Jogo();
        this.verificador = true;
        
        do {
            try {
                jogo.qnt = 0;
                jogo.precoTotal = 0;
                System.out.print("\nCadastrar Jogo\n");
                System.out.print("\n- Codigo do Jogo: ");
                jogo.codigo = input.nextInt();
                input.nextLine();
                System.out.print("- Descricao do Jogo: ");
                jogo.descricao = input.nextLine();
                System.out.print("- Estoque do Jogo: ");
                jogo.estoque = input.nextInt();
                input.nextLine();
                System.out.print("- Preco do Jogo: ");
                jogo.preco = input.nextDouble();
                input.nextLine();
                System.out.print("- Nome do Jogo: ");
                jogo.nome = input.nextLine();
                System.out.print("- Genero do Jogo: ");
                String generoJogo = input.nextLine();
                jogo.setGenero(generoJogo);
                System.out.print("- Produtora do Jogo: ");
                String produtoraJogo = input.nextLine();
                jogo.setProdutora(produtoraJogo);
                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException e2) {
                System.err.print("\nErro: " + e2);
            }catch(ArithmeticException | NullPointerException | ClassCastException e3) {
                System.err.print("\nErro: " + e3);
            }
        }while(isVerificador());
        
        
        listaJogo.add(jogo);
        System.out.print("\nJogo cadastrado com sucesso!\n");
        
        
        return true;
    }
    
    public boolean cadastrarLivro() {
        Livro livro = new Livro();
        this.verificador = true;
        
        do {
            try {
                livro.qnt = 0;
                livro.precoTotal = 0;
                System.out.print("\nCadastrar Livro\n");
                System.out.print("\n- Codigo do Livro: ");
                livro.codigo = input.nextInt();
                input.nextLine();
                System.out.print("- Descricao do Livro: ");
                livro.descricao = input.nextLine();
                System.out.print("- Estoque do Livro: ");
                livro.estoque = input.nextInt();
                input.nextLine();
                System.out.print("- Preco do Livro: ");
                livro.preco = input.nextDouble();
                input.nextLine();
                System.out.print("- Nome do Livro: ");
                livro.nome = input.nextLine();
                System.out.print("- Autor do Livro: ");
                String autorLivro = input.nextLine();
                livro.setAutor(autorLivro);
                System.out.print("- Editora do Livro: ");
                String editoraLivro = input.nextLine();
                livro.setEditora(editoraLivro);
                this.verificador = false;
            }catch(InputMismatchException e1) {
                System.err.print("\nDigite um numero: ");
                input.nextLine();
                System.out.print("\n");
            }catch(ArrayIndexOutOfBoundsException e2) {
                System.err.print("\nErro: " + e2);
            }catch(ArithmeticException | NullPointerException | ClassCastException e3) {
                System.err.print("\nErro: " + e3);
            }
        }while(isVerificador());
        
        listaLivro.add(livro);
        System.out.print("\nLivro cadastrado com sucesso!\n");
        
        
        return true;
    }
    
    public void listarCD(String descPesquisa) {
        if(listaCD.isEmpty()) {
            System.out.print("\nNenhum CD cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de CD's\n");
        
        int nRegs = listaCD.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaCD.get(j).descricao.startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do CD: " + listaCD.get(j).codigo);
                System.out.print("\n-> Descricao do CD: " + listaCD.get(j).descricao);
                System.out.print("\n-> Estoque do CD: " + listaCD.get(j).estoque);
                System.out.print("\n-> Preco do CD: " + listaCD.get(j).preco);
                System.out.print("\n-> Nome do CD: " + listaCD.get(j).nome);
                System.out.print("\n-> Cantor do CD: " + listaCD.get(j).getCantor());
                System.out.print("\n-> Gravadora do CD: " + listaCD.get(j).getGravadora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarDVD(String descPesquisa) {
        if(listaDVD.isEmpty()) {
            System.out.print("\nNenhum DVD cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de DVD's\n");
        
        int nRegs = listaDVD.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaDVD.get(j).descricao.startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do DVD: " + listaDVD.get(j).codigo);
                System.out.print("\n-> Descricao do DVD: " + listaDVD.get(j).descricao);
                System.out.print("\n-> Estoque do DVD: " + listaDVD.get(j).estoque);
                System.out.print("\n-> Preco do DVD: " + listaDVD.get(j).preco);
                System.out.print("\n-> Nome do DVD: " + listaDVD.get(j).nome);
                System.out.print("\n-> Genero do DVD: " + listaDVD.get(j).getGenero());
                System.out.print("\n-> Produtora do DVD: " + listaDVD.get(j).getProdutora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarJogo(String descPesquisa) {
        if(listaJogo.isEmpty()) {
            System.out.print("\nNenhum Jogo cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de Jogos\n");
        
        int nRegs = listaJogo.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaJogo.get(j).descricao.startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do Jogo: " + listaJogo.get(j).codigo);
                System.out.print("\n-> Descricao do Jogo: " + listaJogo.get(j).descricao);
                System.out.print("\n-> Estoque do Jogo: " + listaJogo.get(j).estoque);
                System.out.print("\n-> Preco do Jogo: " + listaJogo.get(j).preco);
                System.out.print("\n-> Nome do Jogo: " + listaJogo.get(j).nome);
                System.out.print("\n-> Genero do Jogo: " + listaJogo.get(j).getGenero());
                System.out.print("\n-> Produtora do Jogo: " + listaJogo.get(j).getProdutora());
                System.out.print("\n");
            }
        }
    }
    
    public void listarLivro(String descPesquisa) {
        if(listaLivro.isEmpty()) {
            System.out.print("\nNenhum Livro cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de Livros\n");
        
        int nRegs = listaLivro.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaLivro.get(j).descricao.startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo do Livro: " + listaLivro.get(j).codigo);
                System.out.print("\n-> Descricao do Livro: " + listaLivro.get(j).descricao);
                System.out.print("\n-> Estoque do Livro: " + listaLivro.get(j).estoque);
                System.out.print("\n-> Preco do Livro: " + listaLivro.get(j).preco);
                System.out.print("\n-> Nome do Livro: " + listaLivro.get(j).nome);
                System.out.print("\n-> Autor do Livro: " + listaLivro.get(j).getAutor());
                System.out.print("\n-> Editora do Livro: " + listaLivro.get(j).getEditora());
                System.out.print("\n");
            }
        }
    }
    
    public void alterarEstoque() {       
        int novoCod;
        
        String descPesquisa;
        descPesquisa = "";
        
        listarCD(descPesquisa);
        listarDVD(descPesquisa);
        listarJogo(descPesquisa);
        listarLivro(descPesquisa);
        
        System.out.print("\nProduto para alterar o estoque: ");
        int produto = input.nextInt();
        
        System.out.print("\nCodigo do produto para alterar: ");
        int codProduto = input.nextInt();
        
        switch(produto) {
            case 0:
                break;
            case 1:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaCD.size(); i++) {
                    if(listaCD.get(i).codigo == codProduto) {
                        listaCD.get(i).codigo = novoCod;
                    }
                }
                
                break;
            
            case 2:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaDVD.size(); i++) {
                    if(listaDVD.get(i).codigo == codProduto) {
                        listaDVD.get(i).codigo = novoCod;
                    }
                }
                
                break;
                
            case 3:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaJogo.size(); i++) {
                    if(listaJogo.get(i).codigo == codProduto) {
                        listaJogo.get(i).codigo = novoCod;
                    }
                }
                
                break;
            
            case 4:
                System.out.print("\nNovo codigo: ");
                novoCod = input.nextInt();
                
                for(int i = 0; i < listaLivro.size(); i++) {
                    if(listaLivro.get(i).codigo == codProduto) {
                        listaLivro.get(i).codigo = novoCod;
                    }
                }
                
                break;
                
            default:
                System.out.print("\nOpcao invalida!\n");
                break;
        }
        
    }

    
    public boolean isVerificador() {
        return verificador;
    }
    
    public void setVerificador(boolean verificador) {
        this.verificador = verificador;
    }
    
}
