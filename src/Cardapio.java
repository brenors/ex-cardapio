import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
    public List<Produto> Produtos = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(List<Produto> produtos) {
        Produtos = produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "Produtos=" + Produtos +
                '}';
    }

    public void ExibirCardapio(String cliente){
        Cardapio cardapio = new Cardapio();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();

        cardapio.Produtos = produto.CriarProdutos();
        pedido.Conta = new ArrayList<>();

        int opcao = -1;
        pedido.ValorTotal = 0;

        while(opcao != 0){
            for (Produto itemCardapio : cardapio.Produtos) {
                System.out.println(itemCardapio.getNome() + " --- "
                        + itemCardapio.getDescricao() + " --- "
                        + "R$" + itemCardapio.getValor() + " --- "
                        + "Código: " + itemCardapio.getNumPedido());
            }

            if(!pedido.Conta.isEmpty()){
                System.out.println("==================================================================================================");
                System.out.println("Conta: ");
                for (Produto item : pedido.Conta){
                    System.out.println("    -> " + item.nome + " --- " + "Código: " + item.numPedido + " --- Valor unitário: " + "R$" + item.valor);
                }
                System.out.println("Total : R$" + pedido.ValorTotal);
                System.out.println("==================================================================================================");
            }

            System.out.println("Selecione uma opção do menu digitando o código do item. Finalizar pedido[0]");
            System.out.print("> ");
            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            for (Produto item : cardapio.Produtos){
                if (opcao == item.getNumPedido()){
                    pedido.Conta.add(item);
                    pedido.ValorTotal += item.valor;
                }
                else{
                    System.out.println("Item " + opcao + " não encontrado, tente novamente.");
                }
            }
        }

        pedido.FinalizarPedido(pedido);
    }
}
