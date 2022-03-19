import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filtro = "";

        Cardapio cardapio = new Cardapio();
        Comanda comanda = new Comanda();

         
        System.out.println("\n\nSeja bem Vindo à Cantina Codifichiamo!\n");

        cardapio.addPratos();

        cardapio.listarPratosCardapio();

        Scanner input = new Scanner(System.in);



        while (!filtro.equalsIgnoreCase("X")) {

            

            System.out.println("Digite o nome do prato ou X para totalizar a conta: ");
            filtro = input.nextLine();
            
            boolean lAchei = false;
            for (int i = 0; i < cardapio.listaPratos.size(); i++) {

                if (cardapio.listaPratos.get(i).getNome().equalsIgnoreCase(filtro)) {
                    comanda.addPrato(cardapio.listaPratos.get(i));
                    lAchei = true;
                }
            }

            if (lAchei == false && !filtro.equalsIgnoreCase("X")) {
                System.out.println("Prato não encontrado: "+filtro);
            } 

        }

        System.out.println("Valor Total Comanda: " + comanda.getValorTotal());
        System.out.println("Valor Total Entrega: " + comanda.getTxEntrega());
        System.out.println("Obrigado pelo pedido. Conte conosco!");

        System.out.println();

    }
}
