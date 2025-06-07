import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import model.UsuarioAPI;
import model.UsuarioAPP;
import model.UsuarioSite;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<UsuarioAPP> usersapp = new ArrayList<>();
        List<UsuarioAPI> usersapi = new ArrayList<>();
        List<UsuarioSite> userssite = new ArrayList<>();
        boolean verficarapp,vericarsite,verificarapi;
        Scanner input = new Scanner(System.in);
        String nm, em;

        String menu = "=============================== SISTEMA DE AUTENTICAÇÃO ==============================="
        +"\n1 - Cadastrar Usuario do Aplicativo"
        +"\n2 - Cadastrar Usuario de API"
        +"\n3 - Cadastrar Usuario do Site"
        +"\n4 - Verificar Autenticação do Aplicativo"
        +"\n5 - Verificar Autenticação da API"
        +"\n6 - Verificar Autenticação do Site"
        +"\n7 - Exibir os Dados dos Usuarios do Aplicativo"
        +"\n8 - Exibir os Dados dos Usuarios da API"
        +"\n9 - Exibir os Dados dos Usuarios do Site"
        +"\n10 - Exibir Todos os Dados"
        +"\n0 - Sair"
        +"\nO que deseja fazer?";
        int opc = -1;
        do{
            System.out.println(menu);
            opc = Integer.parseInt(input.nextLine());
            switch (opc) {
                case 1:
                    // Entrada de dados do Usuario do aplicativo
                    System.out.println("Digite o nome: ");
                    nm = input.nextLine();
                    System.out.println("Digite o Email: ");
                    em = input.nextLine();
                    // Criação do usuario do aplicativo
                    UsuarioAPP aplicativo = new UsuarioAPP(nm, em);
                    //adiciona o usuario criado a Lista
                    usersapp.add(aplicativo);
                    System.out.println("USUARIO CADASTRADO NO APLICATIVO");
                    break;
                case 2:
                    // Entrada de dados da API
                    System.out.println("Digite o nome: ");
                    nm = input.nextLine();
                    System.out.println("Digite o Email: ");
                    em = input.nextLine();
                    // Criação de usuario da API
                    UsuarioAPI api = new UsuarioAPI(nm, em);
                    //adiciona o usuario criado a Lista
                    usersapi.add(api);
                    System.out.println("USUARIO CADASTRADO NA API");
                    break;
                case 3:
                    // Entrada de dados do Site
                    System.out.println("Digite o nome: ");
                    nm = input.nextLine();
                    System.out.println("Digite o Email: ");
                    em = input.nextLine();
                    // Criação do usuario do Site
                    UsuarioSite site = new UsuarioSite(nm, em);
                    //adiciona o usuario criado a Lista
                    userssite.add(site);
                    System.out.println("USUARIO CADASTRADO NO SITE");
                    break;
                case 4:
                    //percorre a Lista de usuarios
                    for (int j = 0; j < usersapp.size(); j++) {
                        //verificação de usuario
                        verficarapp = usersapp.get(j).autenticar();
                        if (verficarapp == true) {
                            //se os campos de cadastro de usuario forem todos preenchidos
                            System.out.println("Autenticação por impressão digital.... ");
                            System.out.println("Usuario "+usersapp.get(j).getNome()+" verificado!!");
                        }else{
                            //se algum campo do usuario não for preenchido
                            System.out.println("Erro de verificação.....");
                        }
                    }
                    break;
                case 5:
                    //percorre a Lista de usuarios
                    for (int i = 0; i < usersapi.size(); i++) {
                        //verificação de usuario
                        verificarapi = usersapi.get(i).autenticar();
                        if (verificarapi == true) {
                            //se os campos de cadastro de usuario forem todos preenchidos
                            System.out.println("Autenticação por token.... ");
                            System.out.println("Usuario "+usersapi.get(i).getNome()+" verificado!!");                
                        }else{
                            //se algum campo do usuario não for preenchido
                            System.out.println("Erro de Verificação");
                        }
                    }
                    break;
                case 6:
                    //percorre a Lista de usuarios
                    for (int i = 0; i < userssite.size(); i++) {
                        //verificação de usuario
                        vericarsite = userssite.get(i).autenticar();
                        if (vericarsite == true) {
                            //se os campos de cadastro de usuario forem todos preenchidos
                             System.out.println("Autenticação por login de usuario e senha.... ");
                             System.out.println("Usuario "+userssite.get(i).getNome()+ " verificado!!");
                        }else{
                            //se algum campo do usuario não for preenchido
                            System.out.println("Erro de Verificação");
                        }
                    }
                    break;
                case 7:
                    //percorre a Lista de usuarios
                    for (int i = 0; i < usersapp.size(); i++) {
                        //exibe os dados do usuario um por um
                        usersapp.get(i).exibirDados();
                    }
                    break;
                case 8:
                    //percorre a Lista de usuarios
                    for (int i = 0; i < usersapi.size(); i++) {
                        //exibe os dados do usuario um por um
                        usersapi.get(i).exibirDados();
                    }
                    break;
                case 9:
                    //percorre a Lista de usuarios
                    for (int k = 0; k < userssite.size(); k++) {
                        //exibe os dados do usuario um por um
                        userssite.get(k).exibirDados();
                    }
                    break;
                case 10:
                    System.out.println("Usuarios do Aplicativo\n");
                    //percorre a Lista de usuarios
                    for (int i = 0; i < usersapp.size(); i++) {
                        //exibe os dados do usuario um por um
                        usersapp.get(i).exibirDados();
                    }
                    System.out.println("\nUsuarios de API\n");
                    //percorre a Lista de usuarios
                    for (int i = 0; i < usersapi.size(); i++) {
                        //exibe os dados do usuario um por um
                        usersapi.get(i).exibirDados();
                    }
                    System.out.println("\nUsuarios do Site\n10");
                    //percorre a Lista de usuarios
                    for (int k = 0; k < userssite.size(); k++) {
                        //exibe os dados do usuario um por um
                        userssite.get(k).exibirDados();
                    }
                    break;
                case 0:
                    System.out.println("saindo e fechando o programa...");
                    break;
                default:
                System.out.println("Digite uma opção valida....");
                    break;
            }
        }while(opc!=0);
        input.close();
    }
}
