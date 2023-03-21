package atividades_resolvidas.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    public void update(String message);
}

interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String message);
}


class Topico implements Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void postNovaMensagemNoTopico(String message) {
        notifyObservers(message);
    }
}

class InscritoDoTopico implements Observer {
    private final String name;

    public InscritoDoTopico(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + ", o tópico foi atualizado com a mensagem: '" + message + "'");
    }
}

public class Exercicio {
    public static void main(String[] args) {
        Topico topico = new Topico();
        InscritoDoTopico inscrito1 = new InscritoDoTopico("João Pedro");
        InscritoDoTopico inscrito2 = new InscritoDoTopico("Ana Marcia");
        InscritoDoTopico inscrito3 = new InscritoDoTopico("Joaquina");

        topico.subscribe(inscrito1);
        topico.subscribe(inscrito2);
        topico.subscribe(inscrito3);

        topico.postNovaMensagemNoTopico("Primeira mensagem do tópico");

    }
}