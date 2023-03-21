package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeArquivo {
    public List<String[]> obterItensSistemaArquivos() {
        // Lógica para recuperar itens do sistema de arquivos
        List<String[]> dadosItens = new ArrayList<>();
        dadosItens.add(new String[] { "Item D", "Descrição do item D" });
        dadosItens.add(new String[] { "Item E", "Descrição do item E" });
        dadosItens.add(new String[] { "Item F", "Descrição do item F" });
        return dadosItens;
    }
}
