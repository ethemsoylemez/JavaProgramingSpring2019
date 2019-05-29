
import java.util.*;

public class _2DArrayList {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> arrLine = new ArrayList<>();

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrRow = new ArrayList<>();
			int d = scan.nextInt();
			for (int j = 0; j < d; j++) {
				arrRow.add(scan.nextInt());
			}

			arrLine.add(arrRow);
		}

		int nq = scan.nextInt();
		for (int k = 0; k < nq; k++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			try {
				System.out.println(arrLine.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
	}
}
