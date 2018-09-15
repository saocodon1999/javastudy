package ontapthcs4;

public class ErrorInputStudent extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorInputStudent() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("nhap khong hop le. vui long thu lai sau!");
		}
	}
}
