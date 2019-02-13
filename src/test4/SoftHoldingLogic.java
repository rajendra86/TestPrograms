package test4;

public class SoftHoldingLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String paymentType = "Prepaid";
		boolean softHoldingPrepay = false;
		boolean softHoldingPostpay = false;
		boolean isVisible = false;

		// Case 1: paymentType Prepaid, softHoldingPrepay - false,
		// softHoldingPostpay - false
		// Show home page
		// Case 2: paymentType Postpaid, softHoldingPrepay - false,
		// softHoldingPostpay - false
		// Show home page
		// Case 3: paymentType Prepaid, softHoldingPrepay - true,
		// softHoldingPostpay - false
		// Show maintenance page
		// Case 4: paymentType Prepaid, softHoldingPrepay - false,
		// softHoldingPostpay - true
		// Show home page
		// Case 5: paymentType Postpaid, softHoldingPrepay - false,
		// softHoldingPostpay - true
		// Show maintenance page
		// Case 6: paymentType Postpaid, softHoldingPrepay - true,
		// softHoldingPostpay - false
		// Show home page
		// Case 7: paymentType Prepaid, softHoldingPrepay - true,
		// softHoldingPostpay - true
		// Show maintenance page
		// Case 8: paymentType Postpaid, softHoldingPrepay - true,
		// softHoldingPostpay - true
		// Show maintenance page

		if (paymentType != null && paymentType.equalsIgnoreCase("Prepaid")) {
			if (softHoldingPrepay == false) {
				isVisible = true;
			} else if (softHoldingPrepay == true) {
				isVisible = false;
			}

		} else if (paymentType != null
				&& paymentType.equalsIgnoreCase("Postpaid")) {
			if (softHoldingPostpay == false) {
				isVisible = true;
			} else if (softHoldingPostpay == true) {
				isVisible = false;
			}
		}

		if (isVisible) {
			System.out.println("Showing Home Page!!!");
		}
		if (!isVisible) {
			System.out.println("Sorry, showing maintenance page");
		}
		
		String script = "<script>function myFunction() {location.href = \"http://www.vodafone.co.uk/maintenance/\";}</script>";
	}
}
