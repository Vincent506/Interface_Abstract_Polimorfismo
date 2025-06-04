package model;

public class UsuarioSite extends Usuario implements Autenticavel{

    public UsuarioSite(String nome, String email){
        super(nome, email);
    }
    
    @Override
    public void exibirDados() {
        String mostrar = "== USUARIO SITE =="
        +"\nNome: "+getNome()
        +"\nEmail: "+getEmail();
        System.out.println(mostrar);
    }

    @Override
    public boolean autenticar() {
        if ((getNome() == null ) || (getEmail() == null)) {
            return false;
        }else{
            return true;
        }
    }
}
