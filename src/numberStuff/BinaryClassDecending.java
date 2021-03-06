package numberStuff;

public class BinaryClassDecending {
	public static class JavaBinary {

		public static int binarySearchAscending(int[] temp, int value) {
			int low = 0;
			int high = temp.length - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp[mid] == value)
					return mid;
				else if (temp[mid] < value)
					low = mid + 1;
				else
					high = mid - 1;
			}
			return -1;
		}

		public static int binarySearchDescending(int[] temp, int value) {
			int low = 0;
			int high = temp.length - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp[mid] == value)
					return mid;
				else if (temp[mid] > value)
					low = mid + 1;
				else
					high = mid - 1;
			}
			return -1;
		}

		public static double doubleSearchAsceding(double[] temp, double value) {
			int low = 0;
			int high = temp.length - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp[mid] - value < 0.00001) {
					return mid;
				} else {
					if (temp[mid] - value > 0.00001) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
				}
			}
			return -1;
		}
	}
}
