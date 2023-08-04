import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inicializar();
    }

    public static void Inicializar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Bem vindo ao restaurante do Brenão!");
        System.out.println("Selecione uma das opções: Fazer Pedido[1] ou Sair[2] ");
        System.out.println("=====================================================");
        System.out.print("> ");
        int opcao = teclado.nextInt();

        if (opcao == 1){
            System.out.print("Por gentileza, informe seu nome: ");
            String nomeCliente = teclado.next();

            Cardapio cardapio = new Cardapio();
            cardapio.ExibirCardapio(nomeCliente);
        }
    }
}