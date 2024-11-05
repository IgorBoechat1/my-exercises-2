package io.codeforall.fanstatics;

import java.util.LinkedList;
import java.util.Random;

public class TurnManager {

    private LinkedList<Hero> heroes;
    private Random random = new Random();
    private int counter = 0;

    public TurnManager(LinkedList<Hero> heroes) {
        this.heroes = heroes;
        this.counter = counter;
        
    }

    // Gerencia os turnos dos heróis
    public void startTurn() {
        while (heroes.size() > 1) { // Enquanto houver mais de um herói
            
            for (int i = 0; i < heroes.size(); i++) {
                Hero attacker = heroes.get(i);
                if (attacker.getHealth() <= 0) continue; // Se o herói está derrotado, pula o turno

                // Escolhe o alvo
                Hero target = heroes.get((i + 1) % heroes.size()); // O próximo herói

                System.out.println(attacker + "'s turn!");

                // O herói escolhe entre atacar ou usar habilidade
                if (random.nextBoolean()) {
                    // Atacar
                    int damage = attacker.attack();
                    System.out.println(attacker.name + " attacks " + target.name + " for " + damage + " damage.");
                    target.takeDamage(damage);
                } else {
                    // Usar habilidade
                    attacker.useAbility();
                }

                // Verifica se o alvo foi derrotado
                if (target.getHealth() <= 0) {
                    System.out.println(target.name + " has been defeated!");
                    heroes.remove(target);
                    i--; // Ajusta o índice após remoção
                }

                // Exibe o status dos heróis após a ação
                System.out.println(attacker);
                System.out.println(target);
                System.out.println("------");
                System.out.println("Round " + counter++);

                // Pausa entre os turnos para facilitar o acompanhamento
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }

        // Finaliza a batalha
        if (heroes.size() == 1) {
            System.out.println(heroes.get(0).name + " is the winner!");
        }
    }
}
