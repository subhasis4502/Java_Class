import java.util.Scanner;

public class Insert_delete {

	void ArrayTraverse(int a[]) {
		System.out.println("The elements in the array is:");

		int i = 0;
		while (a[i] != '\0') {
			System.out.println(a[i]);
			i++;
		}
	}

	public static boolean Check_Element(int b[], int x, int size) {

		for (int i = 0; i <= size; i++) {
			if (b[i] == x) {
				return true;

			}

		}
		return false;
	}

	void insert_Element(int a[], int size, int n, int yi) {
		for (int i = size; i > yi - 1; i--) {
			a[i] = a[i - 1];
		}
		a[yi] = n;

	}

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("The size of the array");
		int size = sc.nextInt();

		System.out.print("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		Insert_delete ob = new Insert_delete();
		ob.ArrayTraverse(a);

		System.out.println("Enter the element to be entered");
		int n = sc.nextInt();
		ob.insert_Element(a, size, n, 1);
		ob.ArrayTraverse(a);

	}

}
