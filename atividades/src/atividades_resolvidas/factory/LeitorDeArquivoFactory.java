package atividades_resolvidas.factory;

public class LeitorDeArquivoFactory {
    public LeitorDeArquivos criaLeitor(String tipoArquivo) {
        switch (tipoArquivo) {
            case "csv":
                return new LeitorCsv();
            case "xml":
                return new LeitorXml();
            case "json":
                return new LeitorJson();
            default:
                throw new IllegalArgumentException("Invalid file type: " + tipoArquivo);
        }
    }
}
