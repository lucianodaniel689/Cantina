import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Pratos> listaPratos = new ArrayList<Pratos>();

    public boolean addPrato(Object prato) {

        this.listaPratos.add((Pratos) prato);
        return (true);
    }
    public boolean addPratos() {
        
        Pratos prato1 = new Pratos();
        prato1.setTipo("Lanches");
        prato1.setNome("Pizza");
        prato1.setValor(45);
        prato1.setTxEntrega(2);

        this.listaPratos.add((Pratos) prato1);

        Pratos prato2 = new Pratos();
        prato2.setTipo("Lanches");
        prato2.setNome("Burguer");
        prato2.setValor(30);
        prato2.setTxEntrega(2);
        this.listaPratos.add((Pratos) prato2);

        Pratos prato3 = new Pratos();
        prato3.setTipo("Lanches");
        prato3.setNome("Fogazza");
        prato3.setValor(20);
        prato3.setTxEntrega(2);
        this.listaPratos.add((Pratos) prato3);

        Pratos prato4 = new Pratos();
        prato4.setTipo("Comida");
        prato4.setNome("Pasta");
        prato4.setValor(30);
        prato4.setTxEntrega(2);
        this.listaPratos.add((Pratos) prato4);

        Pratos prato5 = new Pratos();
        prato5.setTipo("Comida");
        prato5.setNome("Lasanha");
        prato5.setValor(70);
        prato5.setTxEntrega(2);
        this.listaPratos.add((Pratos) prato5);

        Pratos prato6 = new Pratos();
        prato6.setTipo("Comida");
        prato6.setNome("Polpetone");
        prato6.setValor(50);
        prato6.setTxEntrega(2);
        this.listaPratos.add((Pratos) prato6);

        Pratos prato7 = new Pratos();
        prato7.setTipo("Bebidas");
        prato7.setNome("Regrigerante");
        prato7.setValor(5);
        prato7.setTxEntrega(1);
        this.listaPratos.add((Pratos) prato7);

        Pratos prato8 = new Pratos();
        prato8.setTipo("Bebidas");
        prato8.setNome("Suco");
        prato8.setValor(7);
        prato8.setTxEntrega(1);
        this.listaPratos.add((Pratos) prato8);

        Pratos prato9 = new Pratos();
        prato9.setTipo("Bebidas");
        prato9.setNome("Vinho");
        prato9.setValor(50);
        prato9.setTxEntrega(1);
        this.listaPratos.add((Pratos) prato9);

        return (true);
    }   
    public boolean listarPratosCardapio() {

        System.out.println(this.listaPratos);

        return (true);
    }

}
