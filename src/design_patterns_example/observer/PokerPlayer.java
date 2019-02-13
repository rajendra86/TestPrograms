package design_patterns_example.observer;

public class PokerPlayer implements Player {

	private String memberName;
	private String themename;
	private int point;
	private Event pokerEvent;

	public PokerPlayer(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public void display() {		
		System.out.println("MemberName= " + memberName + " ThemeName= "
				+ themename + " Point= " + point);
	}

	@Override
	public void update(String themename, int point) {

		this.themename = themename;
		this.point = point;
		display();
	}

	public void joinEvent(Event event) {
		this.pokerEvent = event;
		pokerEvent.registerPlayer(this);
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
