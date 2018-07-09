package sort;

/**
 * Interface de todos os algoritmos de ordenação.
 * Contém apenas a assinatura dos métodos de ordenação.
 * 
 */
public interface Sort<T extends Comparable<T>> {
	
	/**
	 * 
	 * @param array
	 */
	public void sort(T[] array);
}
