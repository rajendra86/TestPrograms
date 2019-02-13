package design_patterns_example.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PokerGameTest {

	public static void main(String[] args) {
		boolean exitCond = Boolean.TRUE;
		List<PokerPlayer> players = new ArrayList<PokerPlayer>();
		players.add(new PokerPlayer("Sonal"));
		players.add(new PokerPlayer("Shwetha"));
		players.add(new PokerPlayer("Deepu"));

		PokerEvent event = null;
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Scrum Poker");

		do {
			System.out.print("Enter User Name:- ");
			String username = in.nextLine();

			if ("admin".equalsIgnoreCase(username)) {

				System.out.println("Hello Admin!");
				System.out.println("1.Create an Event");
				System.out.println("2.Invite members to join the event");
				System.out.println("Enter your choice:- ");
				int choice = in.nextInt();

				if (choice == 1) {
					// Create an event
					event = new PokerEvent("Event1");
					System.out.println(event.getEventName() + " Created!");

				} else if (choice == 2) {
					if (event == null) {
						System.out
								.println("No active events to invite members!!!!");
					} else {
						System.out.println("Inviting members...");

						for (Iterator<PokerPlayer> iterator = players
								.iterator(); iterator.hasNext();) {
							PokerPlayer pokerPlayer = (PokerPlayer) iterator
									.next();
							System.out.println("Invited "
									+ pokerPlayer.getMemberName());
							pokerPlayer.joinEvent(event);
							System.out.println(pokerPlayer.getMemberName()
									+ " joined " + event.getEventName());
						}
					}
				}
			} else if ("user".equalsIgnoreCase(username)) {
				System.out.println("Hello User!");
				System.out.println("Giving Points to stories....");
				// Player giving his points to a theme in a event
				event.givePoints("IA Refresh", 13);
				event.givePoints("VIE 29", 21);
				event.givePoints("Balance Checker", 34);

				exitCond = Boolean.FALSE;
			}
		} while (exitCond);

	}
}
