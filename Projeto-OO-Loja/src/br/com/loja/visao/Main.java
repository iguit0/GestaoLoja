package br.com.loja.visao;

import java.util.Scanner;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;

public class Main {   
  
    public static void main(String[] args){
        //Scanner e instâncias    
        Scanner ler = new Scanner(System.in);
        Menu m = new Menu();
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();   
            
        //implementações de Data e seu formato...
        Locale Brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        Locale Eua = Locale.US;
        DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL, Brasil); 
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, Eua);
           
        //atributos e controladores..
        int Opcao;
        String nome, login, senha;
        boolean verificador = false;
               
        try{
            do{
                System.out.println("\t\t\tBem vindo(a) ao sistema!!\n");
                System.out.println("BR Time: "+f1.format(data));
                System.out.println("US Time: "+f2.format(data));
                System.out.println("\n1 - Entrar no Sistema");
                System.out.println("2 - Conheca os Desenvolvedores");
                System.out.println("0 - Sair");
                System.out.print("Opcao -> ");
                Opcao = ler.nextInt();
                ler.nextLine();
                switch(Opcao){
                  case 0:
                        System.out.println("Você saiu...");
                        verificador = true;
                    break;                
                  case 1:
                        m.Menu();                      
                        verificador = false;
                        break;

                    case 2:
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("\t-> Desenvolvido por: Igor Lucio (3902) & Mateus Lopes (3987) // UFV/CRP\n\n");
                        System.out.println(">> Igor Lucio: fb.com/igorsk89  //  igor.lucio@ufv.br\n>> Mateus Lopes: fb.com/lopesmateuscastro   //   mateus.l.castro@ufv.br\n");
                        System.out.println("     ______     __          __ ");
                        System.out.println("        |       | \\        / |");
                        System.out.println("	|       |  \\	  /  |");
                        System.out.println("	|	|   \\    /   |");
                        System.out.println("        |	|    \\	/    |");
                        System.out.println("      __|____	|     \\/     |\n");
                        System.out.println("           >> GESTAO DE LOJA <<");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        verificador = false;
                        break;

                    default: System.out.println("Voce digitou uma opcao incorreta!!");
                }       
            }while(verificador == false);
    
        }catch(InputMismatchException | IndexOutOfBoundsException | ArithmeticException e1){
            System.err.println("Erro "+e1);
        }
    }  
}        