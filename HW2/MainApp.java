package dungeon;

import dungeon.model.*;
import dungeon.view.GameView;

import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {

        // TODO: generate dungeon

        // TODO: create player

        // TODO: Initial call to update to initialize the state of the player

        view.moveBtn.addActionListener(e -> {

            
        });

        // TODO: show frame
    }

    private static void update(GameView view, Player player) {

        // TO DO: 

        view.statsLabel.setText(
                "HP: " + player.getHealth() +
                " | Gold: " + player.getGold()
        );
    }




}