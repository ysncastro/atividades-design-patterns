package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class RelationalDatabase {
    public List<Object[]> getItemsFromDb() {
        // Consulta SQL para recuperar itens do banco de dados
        List<Object[]> itemsData = new ArrayList<>();
        itemsData.add(new Object[] { "Item A", "Descrição do item A" });
        itemsData.add(new Object[] { "Item B", "Descrição do item B" });
        itemsData.add(new Object[] { "Item C", "Descrição do item C" });
        return itemsData;
    }
}
