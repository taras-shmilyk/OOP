public class ArraySort {

	public static void main(String[] args) {
	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
		int tab;
		for (int i=0; i<length-1; i++) {
			for(int j=0; j<length-1; j++) {
				if(array[j]>array[j+1]) {
					tab = array[j];
					array[j]=array[j+1];
					array[j+1] = tab;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
