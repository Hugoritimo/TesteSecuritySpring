import java.util.HashMap;
import java.util.Map;

public class SistemaSeguranca {
    private Map<String, Usuario> usuarios;

    public SistemaSeguranca() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(String nome, String senha) {
        Usuario usuario = new Usuario(nome, senha);
        usuarios.put(nome, usuario);
    }

    public boolean autenticarUsuario(String nome, String senha) {
        if (usuarios.containsKey(nome)) {
            Usuario usuario = usuarios.get(nome);
            return usuario.verificarSenha(senha);
        }
        return false;
    }
}
