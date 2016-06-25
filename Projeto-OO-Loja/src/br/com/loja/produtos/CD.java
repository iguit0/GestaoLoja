package br.com.loja.produtos;

/** Classe: CD
*  Esta classe possui os atributos que serão manipulados em GerenciadorProdutos.
* @author Igor
* @author Mateus
*/
public class CD extends Produto {
    private String cantor, gravadora;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
    
}
