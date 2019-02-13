package design_patterns_example.observer;

public interface Event {
	public void registerPlayer(Player p);

	public void removePlayer(Player p);

	public void notifyPlayers();

	public void notifyAllPlayers();
}
