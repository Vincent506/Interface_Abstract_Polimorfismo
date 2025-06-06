import java.util.Scanner;
import model.UsuarioAPI;
import model.UsuarioAPP;
import model.UsuarioSite;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nm, em;
        // Entrada de dados do Usuario do aplicativo
        System.out.println("Digite o nome: ");
        nm = input.nextLine();
        System.out.println("Digite o Email: ");
        em = input.nextLine();
        // Criação do usuario do aplicativo
        UsuarioAPP aplicativo = new UsuarioAPP(nm, em);
        // Entrada de dados da API
        System.out.println("Digite o nome: ");
        nm = input.nextLine();
        System.out.println("Digite o Email: ");
        em = input.nextLine();
        // Criação de usuario da API
        UsuarioAPI api = new UsuarioAPI(nm, em);
        // Entrada de dados do Site
        System.out.println("Digite o nome: ");
        nm = input.nextLine();
        System.out.println("Digite o Email: ");
        em = input.nextLine();
        // Criação do usuario do Site
        UsuarioSite site = new UsuarioSite(nm, em);
        boolean verficarapp,vericarsite,verificarapi;
        verficarapp = aplicativo.autenticar();
        vericarsite = site.autenticar();
        verificarapi = api.autenticar();
        //verificação da entrada de dados
        if ((verficarapp == true)&&(verificarapi == true)&&(vericarsite == true)) {
            aplicativo.exibirDados();
            System.out.println("Autenticação por impressão digital.... ");
            api.exibirDados();
            System.out.println("Autenticação por token.... ");
            site.exibirDados();
            System.out.println("Autenticação por login de usuario e senha.... ");
        }else{
            System.out.println("Usuario não cadastrado...");
            // se algum campo não for preenchido a autentição não vai ser efetuada.
        }
        input.close();
    }
}
