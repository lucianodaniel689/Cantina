import java.util.ArrayList;
import java.util.List;

public class Comanda {
    double valorTotal = 0;
    double taxaTotal = 0;

    List<Pratos> listaPratos = new ArrayList<Pratos>();


    public boolean addPrato(Object prato){
       
        this.listaPratos.add((Pratos) prato);
        this.taxaTotal += ((Pratos) prato).getTxEntrega();
        this.valorTotal += ((Pratos) prato).getValor();
        return(true);
    }
    public double getTxEntrega() {
        return this.taxaTotal;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }
}
