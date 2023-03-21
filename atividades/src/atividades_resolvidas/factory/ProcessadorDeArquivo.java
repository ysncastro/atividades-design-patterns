package atividades_resolvidas.factory;

public class ProcessadorDeArquivo {

    private LeitorDeArquivoFactory leitorFactory;

    public ProcessadorDeArquivo(LeitorDeArquivoFactory leitorFactory) {
        this.leitorFactory = leitorFactory;
    }

    public void processFile(String nomeArquivo, String tipoArquivo) {
        LeitorDeArquivos leitor = leitorFactory.criaLeitor(tipoArquivo);
        leitor.lerArquivo(nomeArquivo);

    }
}
