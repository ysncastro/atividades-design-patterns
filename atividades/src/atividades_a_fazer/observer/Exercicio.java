package atividades_a_fazer.observer;

interface Observer {
    void update(String message);
}

interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String message);
}


//class Topico implements Observable {
//}


//class InscritoDoTopico implements Observer {
//}

public class Exercicio {
    public static void main(String[] args) {
//        Topico topico = new Topico();
//        InscritoDoTopico inscrito1 = new InscritoDoTopico("João Pedro");
//        InscritoDoTopico inscrito2 = new InscritoDoTopico("Ana Marcia");
//        InscritoDoTopico inscrito3 = new InscritoDoTopico("Joaquina");
//
//        topico.subscribe(inscrito1);
//        topico.subscribe(inscrito2);
//        topico.subscribe(inscrito3);
//
//        topico.postNovaMensagemNoTopico("Primeira mensagem do tópico");
//

// ---------------------------------------------------------------------------------------------------------------------

        //Ao rodar este método Main, deverão aparecer no console as seguintes linhas:
        //João Pedro, o tópico foi atualizado com a mensagem: 'Primeira mensagem do tópico'
        //Ana Marcia, o tópico foi atualizado com a mensagem: 'Primeira mensagem do tópico'
        //Joaquina, o tópico foi atualizado com a mensagem: 'Primeira mensagem do tópico'
    }
}