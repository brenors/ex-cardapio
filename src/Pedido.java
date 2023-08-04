import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    List<Produto> Conta = new ArrayList<>();
    double ValorTotal;

    public Pedido() {
    }

    public List<Produto> getConta() {
        return Conta;
    }

    public void setConta(List<Produto> conta) {
        Conta = conta;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Conta=" + Conta +
                ", ValorTotal=" + ValorTotal +
                '}';
    }

    public void FinalizarPedido(Pedido pedido){
        double taxa = (pedido.ValorTotal * 0.10);

        System.out.println("==============================================");
        System.out.println("NOTA FISCAL");
        for (Produto item : pedido.Conta){
            System.out.println("> " + item.nome + " --- " + "R$" + item.valor);
        }
        System.out.println("Taxa de serviço(10%): " + taxa);
        double totalConta = pedido.ValorTotal + taxa;
        System.out.println("Valor total: R$" + totalConta);
        System.out.println("=============================================");
        SolicitarPagamento(totalConta);
    }

    public void SolicitarPagamento(double pedido){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor de entrada para pagar o seu pedido: ");
        double pagamento = teclado.nextDouble();

        while(pagamento < pedido){

            pedido -= pagamento;
            System.out.println("Restam R$" + pedido + " do seu pedido.");
            System.out.print("Informe o valor de entrada para pagar o restante do seu pedido: ");
            pagamento = teclado.nextDouble();
        }

        if (pagamento > pedido)
            System.out.println("Seu troco é R$" + (pagamento - pedido));

        Main.Inicializar();
    }
}
