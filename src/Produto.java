import java.util.ArrayList;
import java.util.List;

public class Produto {
    public String nome;
    public String descricao;
    public double valor;
    public int numPedido;

    public Produto() {
    }

    public Produto(String nome,
                   String descricao,
                   double valor,
                   int numPedido) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.numPedido = numPedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", numPedido=" + numPedido +
                '}';
    }

    public List<Produto> CriarProdutos(){
        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 1
        );

        Produto produto2 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 2
        );

        Produto produto3 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 3
        );

        Produto produto4 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 4
        );

        Produto produto5 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 5
        );

        Produto produto6 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 6
        );

        Produto produto7 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 7
        );

        Produto produto8 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 8
        );

        Produto produto9 = new Produto(
                nome = "Camarao na moranga",
                descricao = "pirão de camarão servido dentro de uma abóora",
                valor = 180,
                numPedido = 9
        );

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);
        produtos.add(produto9);

        return produtos;
    }
}
