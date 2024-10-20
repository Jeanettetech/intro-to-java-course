package com.cbfacademy;

public class App {
    public static void main(String[] args) {// Add a call to initialiseContainer in the main method of App, before any
                                            // factory method calls.
        SimpleContainer container = initialiseContainer();
        Game game = container.get(Game.class);
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

    private static SimpleContainer initialiseContainer() {// method to register mappings for the Game and Player
                                                          // interfaces with their concrete implementations in the
                                                          // container, e.g. container.register(Game.class,
                                                          // DiceGame.class)
        SimpleContainer container = new SimpleContainer();

        container.register(Game.class, DiceGame.class);
        container.register(Player.class, DicePlayer.class);

        return container;

    }
}
