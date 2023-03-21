package atividades_resolvidas.factory;

public class LeitorJson extends LeitorDeArquivos {
    @Override
    public void lerArquivo(String nomeArquivo) {
        System.out.println("Lendo arquivo JSON: " + nomeArquivo);

    }
}
