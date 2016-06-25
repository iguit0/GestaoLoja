package br.com.loja.clientes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Classe: GerenciadorClientes
*  Esta classe possui toda a lógica de cadastro de Cliente e Endereco, ainda
*  possui o método de listagem de clientes.
* @author Igor
* @author Mateus
*/
public class GerenciadorClientes {
    //Scanner, instâncias, Arrays, Atributos , etc..
    private boolean verificador;
    Scanner input = new Scanner(System.in);
    public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    private Endereco cadastrarEndereco() {
        Endereco endereco = new Endereco();
        this.verificador = true;
        
        do {
            try {
                System.out.print("\nCadastrar Endereco\n");
                System.out.print("\n- Rua: ");
                String rua = input.nextLine();
                endereco.setRua(rua);
                System.out.print("- Numero: ");
                int numero = input.nextInt();
                endereco.setNumero(numero);
                input.nextLine();
                System.out.print("- Bairro: ");
                String bairro = input.nextLine();
                endereco.setBairro(bairro);
                System.out.print("- Cidade: ");
                String cidade = input.nextLine();
                endereco.setCidade(cidade);
                System.out.print("- CEP: ");
                String cep = input.nextLine();
                endereco.setCep(cep);
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
        
        return endereco;
    }
    
    public Cliente cadastrarCliente() {
        int opcaoEnd = 0, opcaoEscolha;
        boolean verificadorCPF;
        boolean verificadorEmail;
        
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        
        do {
            try {
                System.out.print("\nCadastrarCliente\n");
                System.out.print("\n- Codigo: ");
                int codigo = input.nextInt();
                cliente.setCodigo(codigo);
                input.nextLine();
                
                do {
                    System.out.print("\n-CPF: ");
                    String cpf = input.nextLine();
                    
                    verificadorCPF = ValidaCPF.isCPF(cpf);
                    
                    if(!verificadorCPF) {
                        System.out.print("\nCPF invalido!n");
                        verificadorCPF = false;
                    }
                    
                    for(int i = 0; i < listaCliente.size(); i++) {
                        if(listaCliente.get(i).getCpf().equals(cpf)) {
                            System.out.print("\nCPF repetido!\n");
                            verificadorCPF = false;
                        }
                    }
                    
                    cliente.setCpf(cpf);
                    
                }while(!verificadorCPF);
                
                System.out.print("- Nome: ");
                String nome = input.nextLine();
                cliente.setNome(nome);
                
                do {
                    System.out.print("\n- Email: ");
                    String email = input.nextLine();
                    
                    verificadorEmail = validaEmail(email);
                    
                    if(!verificadorEmail) {
                        System.out.print("\nEmail invalido!\n");
                        verificadorEmail = false;
                    }
                    
                    for(int i = 0; i < listaCliente.size(); i++) {
                        if(listaCliente.get(i).getEmail().equals(email)) {
                            System.out.print("\nEmail repetido!\n");
                            verificadorEmail = false;
                        }
                    }
                    
                    cliente.setEmail(email);
                    
                }while(!verificadorEmail);
                
                System.out.print("- Senha: ");
                String senha = input.nextLine();
                cliente.setSenha(senha);
                
                endereco = cadastrarEndereco();
                cliente.endereco.add(endereco);
                System.out.print("\nVoce deseja cadastrar outro endereco? (1-s | 0-N)");
                opcaoEscolha = input.nextInt();
                
                switch(opcaoEscolha) {
                    case 0:
                        System.out.print("\nOk. Voce saiu!\n");
                        this.verificador = false;
                    case 1:
                        while(opcaoEnd != 0) {
                            Endereco end = new Endereco();
                            end = cadastrarEndereco();
                            cliente.endereco.add(end);
                            System.out.print("\nVoce deseja cadastrar outro endereco? (1-s | 0-N)");
                            opcaoEnd = input.nextInt();
                        }
                        this.verificador = false;
                }
                
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
        
        listaCliente.add(cliente);
        System.out.print("\nCliente cadastrado com sucesso!\n");
        
        
        return cliente;
    }
    public void alterarDadosCliente() {
        String descPesquisa;
        descPesquisa = "";
        listarClientes(descPesquisa);
        
        Cliente cli = new Cliente();
        
        System.out.print("\nCPF do cliente para alterar dados: ");
        String cpfPesquisar = input.nextLine();
        int index = 0;
        
        for(int i = 0; i < listaCliente.size(); i++) {
            if(listaCliente.get(i).getCpf().equals(cpfPesquisar)) {
                index = i;
                break;
            }
        }
        
        cli = cadastrarCliente();
        
        listaCliente.set(index, cli);
        
}

    private boolean validaEmail(String email) {
        System.out.print("\nMetodo de validacao de email\n");
        
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
        Matcher m = p.matcher(email); 
        
        if(m.find()) {
            System.out.println("O email " + email + " e valido");
            return true;
        }else{
            System.out.println("O email " + email + " e invalido");
                return false;
        }  
    }
    
    public void listarClientes(String descPesquisa) {
        if(listaCliente.isEmpty()) {
            System.out.print("\nNenhum cliente cadastrado!\n");
            return;
        }
        
        System.out.print("\nLista de Clientes\n");
        
        int nRegs = listaCliente.size();
        
        for(int j = 0; j < nRegs; j++) {
            if(listaCliente.get(j).flag.startsWith(descPesquisa)) {
                System.out.print("\n-> Codigo: " + listaCliente.get(j).getCodigo());
                System.out.print("\n-> CPF: " + listaCliente.get(j).getCpf());
                System.out.print("\n-> Nome: " + listaCliente.get(j).getNome());
                System.out.print("\n-> Email: " + listaCliente.get(j).getEmail());
                System.out.print("\n");
            }
        }
    }
    
    public boolean isVerificador() {
        return verificador;
    }

    public void setVerificador(boolean verificador) {
        this.verificador = verificador;
    }  
}