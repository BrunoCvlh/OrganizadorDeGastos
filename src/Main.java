import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Gastos{
    public static void main(String[] args) {

        int opcaoUser = 0;
        Gastos compra = new Gastos();
        Scanner scan = new Scanner(System.in);

        ArrayList<String> nomedaLista = new ArrayList();

        do{
        System.out.println("Olá, este é o organizador de gastos!");
        System.out.println("Digite o número da opção que deseja:");
        System.out.println("1. Adicionar uma compra");
        System.out.println("2. Apagar uma compra");
        System.out.println("3. Mostrar as ultimas compras");
        System.out.println("4. Sair");

        opcaoUser = scan.nextInt();
        scan.nextLine();

        switch (opcaoUser){
            case 1:
                System.out.println("Digite o nome da compra:");
                String nomeDaCompra = scan.nextLine();
                compra.criarItemNoBanco(nomeDaCompra);
                compra.mostrarBancoDeGastos();
                break;
            case 2:
                compra.mostrarBancoDeGastos();
                System.out.println("Digite o nome da compra que deseja apagar:");
                String nomeDoItemParaApagar = scan.nextLine();
                compra.deletarItem(nomeDoItemParaApagar);
                break;
            case 3:
                compra.mostrarBancoDeGastos();
                break;
            case 4:
                break;
            default:
                System.out.println("Você optou por sair");
                break;

        }
        } while (opcaoUser != 4);
    }
}