package atividades_resolvidas.factory;

public class LeitorCsv extends LeitorDeArquivos {
    @Override
    public void lerArquivo(String nomeArquivo) {
        System.out.println("Lendo arquivo CSV: " + nomeArquivo);
    }
}
