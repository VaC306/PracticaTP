package tp1.p1.control;

import java.util.Scanner;

import tp1.p1.logic.Game;
import tp1.p1.view.GamePrinter;
import tp1.p1.view.Messages;

/**
 * Accepts user input and coordinates the game execution logic.
 *
 */
public class Controller {

	private Game game;

	private Scanner scanner;

	private GamePrinter gamePrinter;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		this.gamePrinter = new GamePrinter(game);
	}

	/**
	 * Draw / Paint the game.
	 */
	private void printGame() {
		System.out.println(gamePrinter);
	
	}

	/**
	 * Prints the final message once the match is finished.
	 */
	public void printEndMessage() {
		System.out.println(gamePrinter.endMessage());
	}

	/**
	 * Show prompt and request command.
	 *
	 * @return the player command as words
	 */
	private String[] prompt() {
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		String[] words = line.toLowerCase().trim().split("\\s+");

		System.out.println(debug(line));

		return words;
	}

	private String debug(String line) {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * Runs the game logic.
	 */
	public void run() {
		boolean refreshDisplay = true;
		boolean doUpdate = false;


while (!game.isFinished() && !game.isPlayerQuits()) {
			
			// 1. Draw : true Pinta el Juego
			if (refreshDisplay) {
				printGame();
			}

			// 2. User action
			System.out.print(Messages.PROMPT);
			String line = scanner.nextLine();
			String[] words = line.toLowerCase().trim().split("\\s+");

			System.out.println(debug(line));

			if (words.length == 0) {
				System.out.println(error(Messages.UNKNOWN_COMMAND));
			} else {
				refreshDisplay = false;
				doUpdate = false;

				switch (words[0]) {

				case "none":
				case "n":
				case "":
					refreshDisplay = true;
					doUpdate = true;
					break;

				case "add":     //más complicado por tener varios parámetros
				case "a":    
					if (words.length < 4) {
						System.out.println(error(Messages.COMMAND_PARAMETERS_MISSING));
						break;
					}
					
					try {
						col = Integer.parseInt(words[2]);
						row = Integer.parseInt(words[3]);
					} catch (NumberFormatException nfe) {
						System.out.println(error(Messages.INVALID_POSITION));
						break;
					}

					switch (words[1]) {
					case "sunflower":
					case "s":       // 
						added =  true/false 
					// llama al añadir una sun flower en esa posición: pide	al Game
						break;

					default:
						System.out.println(Messages.INVALID_GAME_OBJECT);
						validPlant = false;
					}

					if(validPlant && added) {
						actualiza si quieres
						refrescar display y si
						quieres hacer Update
					}
					break;

				case "list":
				case "l":
					System.out.println("aqui la lista de plantas");
					break;

				case "exit":
				case "e":
					this.game.playerQuits();
					refreshDisplay = true;
					break;

			
        			}
			}
			
			// 3-4. Game Action & Update  : actualiza el estado del juego
			if (doUpdate) {
				game.update();
			}
		}

		if (!refreshDisplay) {
			printGame();
		}

		printEndMessage();
	}

}

}
