package state_design_pattern_atm_machine;

public interface AtmMachineState {
	public void insertDebitCard();

	public void ejectDebitCard();

	public void enterPinAndWithdrawMoney();
}
