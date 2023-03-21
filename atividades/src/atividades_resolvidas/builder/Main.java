package atividades_resolvidas.builder;

public class Main {

    public static void main(String[] args) {
        ProdutoEletronico.ProdutoEletronicoBuilder builder = new ProdutoEletronico.ProdutoEletronicoBuilder();
        ProdutoEletronico produto = builder.setNome("Smartphone")
                .setMarca("Samsung")
                .setPreco(1000.0)
                .setQuantidadeDisponivel(10)
                .setDescricao("Galaxy S21")
                .build();

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade Disponivel: " + produto.getQuantidadeDisponivel());
        System.out.println("Descrição do produto: " + produto.getDescricao());
    }

}
