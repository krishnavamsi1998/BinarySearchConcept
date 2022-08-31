package arrays;

//log(m*n)=logm+logn

public class BinarySearch2dMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int r, c;
		r = 4;
		c = 3;
		int k = -1;

		int i, j;
		i = 0;
		j = r - 1;

		int[] res = new int[2];
		res[0] = -1;
		res[1] = -1;

		bbs(arr, i, j, r, c, k, res);

		if (res[0] == -1 && res[1] == -1)
			System.out.println("ele not found");
		else
			System.out.println("ele found at " + res[0] + " row and " + res[1] + " col");

	}

	private static int[] bbs(int[][] arr, int i, int j, int r, int c, int k, int[] res) {

		while (i <= j) {
			int out_mid = i + (j - i) / 2;

			if (k >= arr[out_mid][0] && k <= arr[out_mid][c - 1])
				return bs(arr, out_mid, 0, c - 1, k, res);
			else if (k < arr[out_mid][0])
				j = out_mid - 1;
			else if (k > arr[out_mid][0])
				i = out_mid + 1;

		}

		return res;
	}

	private static int[] bs(int[][] arr, int out_mid, int i, int j, int k, int[] res) {

		while (i <= j) {
			int in_mid = i + (j - i) / 2;
			if (k == arr[out_mid][in_mid]) {

				res[0] = out_mid + 1;
				res[1] = in_mid + 1;
				return res;
			} else if (k < arr[out_mid][in_mid])
				j = in_mid - 1;
			else
				i = in_mid + 1;
		}

		return res;
	}

}
