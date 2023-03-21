package atividades_resolvidas.factory;

public class LeitorXml extends LeitorDeArquivos {
    @Override
    public void lerArquivo(String nomeArquivo) {
        System.out.println("Lendo arquivo XML: " + nomeArquivo);
    }
}
