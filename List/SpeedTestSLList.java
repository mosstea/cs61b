public class SpeedTestSLList {
	public static void main(String[] args) {
		SLList test = new SLList(10);
		int i = 0;
		while (i < 10000) {
			test.addLast(i);
			i += 1;
		}

	}
}