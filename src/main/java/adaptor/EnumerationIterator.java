package adaptor;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * {@link Enumearation}を{@link Iterator}に適合させるためのアダプタクラス。
 * 
 * @author TakumiEra
 *
 */
public class EnumerationIterator<E> implements Iterator<E> {
	
	/**
	 * Enumerationインスタンス。
	 */
	Enumeration<E> enumeration;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aEnumeration
	 */
	public EnumerationIterator(Enumeration<E> aEnumeration) {
		this.enumeration = aEnumeration;
	}

	@Override
	public boolean hasNext() {
		return this.enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return this.enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
