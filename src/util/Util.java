package util;

public class Util {
	
	public static void swap(Object[] array, int i, int j) {
		if(array == null) {
			throw new IllegalArgumentException();
		}
		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static boolean validateInput(Object[] array, int leftIndex, int rightIndex) {
		boolean valid = false;
		if(array != null && rightIndex < array.length && leftIndex >= 0 && rightIndex > leftIndex) {
			valid = true;
		}
		return valid;
	}
}
