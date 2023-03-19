package atividades_resolvidas.singleton;

class BancoDeDados {

    public static Conexao instanciaConexao;

    public static Conexao obterConexao() {
        if (instanciaConexao == null) {
            instanciaConexao = new Conexao();
        }
        return instanciaConexao;
    }

}

class Conexao {

    public Double id;

    Conexao() {
        this.id = Math.random();
    }

    void rodarSQL() {
        System.out.println("RODANDO SQL " + id);
    }

}

class UsuarioDAO {

    void buscarTodos() {
        System.out.println("buscando todos os usuarios...");
        BancoDeDados.obterConexao().rodarSQL();
    }

    void buscarPorId() {
        System.out.println("buscando usuario por id...");
        BancoDeDados.obterConexao().rodarSQL();
    }

    void salvar() {
        System.out.println("salvando...");
        BancoDeDados.obterConexao().rodarSQL();
    }

}

public class Main {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuarioDAO.buscarTodos();
        usuarioDAO.buscarPorId();
        usuarioDAO.salvar();

    }

}
