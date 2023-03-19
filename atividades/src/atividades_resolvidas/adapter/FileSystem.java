package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    public List<String[]> getItemsFromFileSystem() {
        // Lógica para recuperar itens do sistema de arquivos
        List<String[]> itemsData = new ArrayList<>();
        itemsData.add(new String[] { "Item D", "Descrição do item D" });
        itemsData.add(new String[] { "Item E", "Descrição do item E" });
        itemsData.add(new String[] { "Item F", "Descrição do item F" });
        return itemsData;
    }
}
