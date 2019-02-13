package state_design_pattern_vending_machine;

public interface State {
	public void insertCoin()throws MachineWarning;
    public void pressButton()throws MachineWarning;
    public void dispense()throws MachineWarning;
}
