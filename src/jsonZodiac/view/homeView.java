/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonZodiac.view;

import java.io.IOException;

/**
 *
 * @author Gina Udy
 */

public class homeView { 

    private void displayZodiac() {
        this.console.println("\n"
                + "\nWelcome to this super serious horoscope website!                           "
                + "\n==========================================================================="
                + "\n                                                                           ");
    }

    public void displayStartProgramView() throws IOException {  // shows user name and banner from above functions

        displayBanner();

        String playerName = getPlayerName();

        displayNextView(playerName);

        Player p = new Player();
        p.setName(playerName);
        PrincessBride.setPlayer(p);

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private String getPlayerName() throws IOException {  // gets user name 

        boolean isValidName = false;  // initialize to not valid 
        String name = " ";

        this.console.println("\nPlease enter your name: ");

        while (!isValidName) {
            String input = "";
            input = this.keyboard.readLine();  // get next line typed on keyboard 

            if (input != null && input.length() >= 2) {
                isValidName = true;
                name = input.toUpperCase();

            } else {
                ErrorView.display(this.getClass().getName(), "\nInput is invalid: name must be greater than one character in length.");
            }

        }

        return name;
    }

    private void displayNextView(String playerName) {

        // display a custom welcome message 
        this.console.println("\n"
                + "\n================================="
                + "\n Welcome to the game, " + playerName + "."
                + "\n We hope you have a lot of fun!"
                + "\n=================================");

    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
