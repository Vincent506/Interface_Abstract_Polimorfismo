package model;

public class UsuarioAPI extends Usuario implements Autenticavel{

    public UsuarioAPI(String nome, String email){
        super(nome, email);
    }

    @Override
    public void exibirDados() {
        String mostrar = "== USUARIO API =="
        +"\nNome: "+getNome()
        +"\nEmail: "+getEmail();
        System.out.println(mostrar);
    }

    @Override
    public boolean autenticar() {
        if (getNome() == null || getEmail() == null) {
            return false;
        }else{
            return true;
        }
    }
    
}
