package padroescriacao.singleton;

public class Database {

    private Database() {};
    private static Database instance = new Database();
    public static Database getInstance() {
        return instance;
    }

    private String nomeMercado;
    private String usuarioLogado;

    public String getnomeMercado() {
        return nomeMercado;
    }

    public void setnomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
