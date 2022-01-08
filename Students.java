package assignments.day5;

public class Students {
	
	private void getStudentInfo() {
		System.out.println("Every other method is empty nothing to display in console");
	}
	
	void getStudentInfo(int id) {
		
	}
	
	public void getStudentInfo(int id, String name) {
		
	}
	
	protected void getStudentInfo(String email, int phoneNumber) {
		
	}

	public static void main(String[] args) {
		
		Students overRide = new Students();
		
		overRide.getStudentInfo();
		overRide.getStudentInfo(124185786);
		overRide.getStudentInfo(1299737, "Kondareaddy");
		overRide.getStudentInfo("test@gmail.com", 955874141);

	}

}
