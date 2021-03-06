package basic;

import java.util.Scanner;


/**
 * This class will be the brains of our game to begin with.
 * 
 * We will make a simple mission-based game. The user just selects things to do
 * from menus.
 */
public class MissionRunner {
	/**
	 * This variable is inaccessible to anything existing outside of this class
	 */
	private boolean shouldKeepRunning = true;

	public void run() {
		while (shouldKeepRunning) { // think "while shouldKeepRunning is true"
			showMenuDialog();
			String input = getUserInput();
			handleInput(input);
		}
	}

	public void showMenuDialog() {
		// Escaping the character 'n' (\n) means "new line character" which puts
		// the text that follows it on a different line
		display("\nWelcome to the game!\n");
		display("Please select what you would like to do:");
		display(" (1) Say hello");
		display(" (2) Have me say hello");
		// Please add more items to this menu. You may notice it is a bit
		// cumbersome to do add and handle the menu items this way, so we will
		// be refactoring it in the near future.
		// ------- Begin Additions
		// ------- End Additions
		display(" (Q) Quit this endless game");
	}

	public void handleInput(String input) {
		switch (input) {
		case "1":
			// In order to display a quote ("), we need to escape the character
			// with a backslash (\) to tell the compiler that the next quote
			// does not end the string, but instead is acually part of the
			// string
			display("You say, \"Hello\"");
			break;
		case "2":
			display("Please tell me your name so that I may address you properly.");
			// This next line concatenates (combines) the hard-coded string
			// "Hello, " with anything the user enters. Because the method
			// getUserInput() returns a String, we do not need to store the
			// result in a temporary variable
			display("Hello, " + getUserInput());
			break;
		case "Q":
			display("Thanks for playing!  Goodbye!");
			// We definitely need a way to stop this, so this is it!
			shouldKeepRunning = false;
			break;
		default:
			// This is called error handling - the user may input something
			// wrong, so we handle that here.
			display("I'm sorry, but I think you've made a mistake.\nI do not understand '"
					+ input + "' so please select something from the list.");
			break;
		}
	}

	private void display(String s) {
		System.out.println(s);
	}

	private String getUserInput() {
		System.out.print(">>  ");
		// This annotation (@<Text>) makes it not complain about us not calling
		// close() on reader, which we do not want to do because that would
		// permanently prohibit the ability for the user to input data after
		// their first entry.
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}
}
