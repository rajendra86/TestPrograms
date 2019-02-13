package state_design_pattern_vending_machine;

public class MachineWarning extends Exception {
	private String message;
	private static final long serialVersionUID = 1L;

	public MachineWarning(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
