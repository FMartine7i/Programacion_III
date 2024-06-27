import java.util.*;

public class SocialNetwork {
    private List<Usuario> usuarios;

    public SocialNetwork() { this.usuarios = new ArrayList<>(); }

    public void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario findUserById(int id) {
        Usuario foundUser = null;
        for (Usuario user : usuarios) {
            if (id == user.getId())
                foundUser = user;
        }
        return foundUser;
    }

    public List<Usuario> bfs(int initId) {
        List<Usuario> resultado = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Queue<Usuario> queue = new LinkedList<>();

        Usuario usuarioInicial = findUserById(initId);
        if (usuarioInicial == null)
            return resultado;

        queue.add(usuarioInicial);
        return resultado;
    }
    public List<Usuario> mutualFriends(Usuario user1, Usuario user2) {
        List<Usuario> mutual = new ArrayList<>();
        for (Usuario friend : user1.getFriends()) {
            if (user2.getFriends().contains(friend))
                mutual.add(friend);
        }
        return mutual;
    }
}
