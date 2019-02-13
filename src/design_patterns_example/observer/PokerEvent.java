package design_patterns_example.observer;

import java.util.ArrayList;
import java.util.List;

public class PokerEvent implements Event {
	private String eventName;
	private List<PokerPlayer> players;
	private Player player;

	private String themename;
	private int point;

	public PokerEvent(final String eventName) {
		this.eventName = eventName;
		players = new ArrayList<PokerPlayer>();
	}

	@Override
	public void registerPlayer(Player p) {
		players.add((PokerPlayer) p);
	}

	@Override
	public void removePlayer(Player p) {
		int i = players.indexOf((PokerPlayer) p);
		if (i >= 0) {
			players.remove(i);
		}
	}

	@Override
	public void notifyPlayers() {
		for (int i = 0; i < players.size(); i++) {
			player = (Player) players.get(i);
			player.update(themename, point);
		}
	}

	@Override
	public void notifyAllPlayers() {

	}

	public void givePoints(String themeName, int point) {
		this.themename = themeName;
		this.point = point;
		notifyPlayers();
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
