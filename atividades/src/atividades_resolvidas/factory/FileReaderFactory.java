package atividades_resolvidas.factory;

public class FileReaderFactory {
    public FileReader createReader(String fileType) {
        switch (fileType) {
            case "csv":
                return new CsvReader();
            case "xml":
                return new XmlReader();
            case "json":
                return new JsonReader();
            default:
                throw new IllegalArgumentException("Invalid file type: " + fileType);
        }
    }
}
