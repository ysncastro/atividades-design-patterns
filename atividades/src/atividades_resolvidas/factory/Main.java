package atividades_resolvidas.factory;

public class Main {

    public static void main(String[] args) {
        LeitorDeArquivoFactory leitorFactory = new LeitorDeArquivoFactory();
        ProcessadorDeArquivo processadorDeArquivo = new ProcessadorDeArquivo(leitorFactory);

        processadorDeArquivo.processFile("data.csv", "csv");
        processadorDeArquivo.processFile("data.xml", "xml");
        processadorDeArquivo.processFile("data.json", "json");
    }

}
