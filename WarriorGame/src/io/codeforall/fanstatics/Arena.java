
    package io.codeforall.fanstatics;

    import io.codeforall.fanstatics.Heros.Cleric;
    import io.codeforall.fanstatics.Heros.Mage;
    import io.codeforall.fanstatics.Heros.Rogue;
    import io.codeforall.fanstatics.Heros.Warrior;
    import java.util.LinkedList;
    
    public class Arena {
    
        private LinkedList<Hero> heroes;
    
        // Construtor que inicializa os heróis
        public Arena() {
            heroes = new LinkedList<>();
            // Adicionando heróis à arena
            heroes.add(new Mage("Simão"));
            heroes.add(new Rogue("Thiago"));
            heroes.add(new Warrior("Sebastião"));
            heroes.add(new Cleric("Bastos"));
        }
    
        // Inicia a batalha
        public void startBattle() {
            TurnManager turnManager = new TurnManager(heroes); // Passa a lista de heróis para o TurnManager
            turnManager.startTurn(); // Inicia o combate
        
        }
    }
    

