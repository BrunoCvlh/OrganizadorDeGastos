import java.util.ArrayList;

public class Gastos {

    ArrayList<String> BancoDeGastos = new ArrayList();

    //métodos da interface declarados abaixo
    public void criarItemNoBanco(String compra){
        BancoDeGastos.add(compra);
        System.out.printf("O item %s foi adicionado!\n", compra);
    };

    public void deletarItem(String compra){
        BancoDeGastos.remove(compra);
        System.out.printf("O gasto %s foi removido.\n", compra);
    };

    public void mostrarBancoDeGastos(){
        System.out.println("---Banco de Gastos Atual---");
        System.out.println(BancoDeGastos);
        System.out.println("------------fim------------");
    };

}
