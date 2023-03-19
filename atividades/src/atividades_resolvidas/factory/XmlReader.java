package atividades_resolvidas.factory;

public class XmlReader extends FileReader{
    @Override
    public void readFile(String fileName) {
        System.out.println("Reading XML file: " + fileName);
        // read XML file and process data
    }
}
