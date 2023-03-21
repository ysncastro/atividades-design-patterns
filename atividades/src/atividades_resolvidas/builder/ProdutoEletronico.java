package atividades_resolvidas.builder;

public class ProdutoEletronico {
    private String nome;
    private String marca;
    private double preco;
    private int quantidadeDisponivel;
    private String descricao;

    public ProdutoEletronico(String nome, String marca, double preco, int quantidadeDisponivel, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public static class ProdutoEletronicoBuilder {
        private String nome;
        private String marca;
        private double preco;
        private int quantidadeDisponivel;
        private String descricao;

        public ProdutoEletronicoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public ProdutoEletronicoBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public ProdutoEletronicoBuilder setPreco(double preco) {
            this.preco = preco;
            return this;
        }

        public ProdutoEletronicoBuilder setQuantidadeDisponivel(int quantidadeDisponivel) {
            this.quantidadeDisponivel = quantidadeDisponivel;
            return this;
        }

        public ProdutoEletronicoBuilder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public ProdutoEletronico build() {
            return new ProdutoEletronico(nome, marca, preco, quantidadeDisponivel, descricao);
        }
    }
}
