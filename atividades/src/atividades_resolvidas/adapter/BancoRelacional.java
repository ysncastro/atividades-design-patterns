package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class BancoRelacional {
    public List<Object[]> obterItensDoBanco() {
        // Consulta SQL para recuperar itens do banco de dados
        List<Object[]> dadosItens = new ArrayList<>();
        dadosItens.add(new Object[] { "Item A", "Descrição do item A" });
        dadosItens.add(new Object[] { "Item B", "Descrição do item B" });
        dadosItens.add(new Object[] { "Item C", "Descrição do item C" });
        return dadosItens;
    }
}
