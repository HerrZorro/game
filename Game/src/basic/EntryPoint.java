package basic;

/**
 * This comment is known as a Javadoc comment and can be used to create a
 * document that describes anything you wish to include about your code.
 * 
 * This class will be the entry-point for starting the game. The name of this
 * class is entirely arbitrary, but I've chosen it to be clear when reading.
 * 
 * Press the green circle with a white triangle ("play button") to run the code
 * and look for the output in the Console window. You can type directly in the
 * console window, too.
 */
public class EntryPoint {

	/**
	 * This method contains the signature that allows the JVM (what runs Java
	 * code) to understand that it is a starting point. You may have one of
	 * these methods per class and when executing the program, you may specify
	 * any class with a public static void main(String[] args) method to be run.
	 * We will keep our code to only having one such method as there should only
	 * be one way to start this game.
	 * 
	 * @param args
	 *            Arguments sent from the command line when starting this
	 *            program; we are not going to be use these at the moment.
	 */
	public static void main(String[] args) {
		MissionRunner missionRunner = new MissionRunner();
		missionRunner.run();
	}
}
