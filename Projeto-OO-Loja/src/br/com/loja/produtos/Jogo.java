package br.com.loja.produtos;
/** Classe: Jogo
*  Esta classe possui os atributos que serão manipulados em GerenciadorProdutos.
* @author Igor
* @author Mateus
*/
public class Jogo extends Produto {
    private String genero, produtora;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    
}
