package adaptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.junit.Before;
import org.junit.Test;

/**
 * Adaptorパターンの検証用クラス。
 * 
 * <pre>
 * {@link Enumeration}の実装クラスである{@link StringTokenizer}が
 * {@link Iterator}の実装クラスのように扱えることをテストします。
 * </pre>
 * 
 * @author TakumiEra
 *
 */
public class AdapterTest {

	private StringTokenizer stringTokenizer;
    private Iterator<Object> iterator;
	
	/**
	 * テストの前準備。
	 */
	@Before
	public void testname(){
		// Enumrationの実装クラスをインスタンス化
		stringTokenizer = new StringTokenizer(
				"One morning," +
				"when Gregor Samsa woke from troubled dreams," +
				"he found himself transformed in his bed into a horrible vermin.", ",");
		// Iteratorとして扱えるよう、EnumerationIteratorでラップ
		iterator = new EnumerationIterator<Object>(stringTokenizer);
	}
	
	/**
	 * {@link Iterator#hasNext()}を呼び出せることのテスト。
	 * <pre>
	 * {@link Enumeration#hasMoreElements()}と同様の動作ができていることを確認する。
	 * </pre>
	 * 
	 * @throws Exception
	 */
	@Test
	public void hasNextTest() throws Exception {
		assertTrue(iterator.hasNext());
	}
	
	/**
	 * {@link Iterator#next()}を呼び出せることのテスト。
	 * <pre>
	 * {@link Enumeration#nextElement()}と同様の動作ができていることを確認する。
	 * </pre>
	 * 
	 * @throws Exception
	 */
	@Test
	public void nextTest() throws Exception {
		assertEquals("One morning",iterator.next());
		assertEquals("when Gregor Samsa woke from troubled dreams",iterator.next());
		assertEquals("he found himself transformed in his bed into a horrible vermin.",iterator.next());
	}
	
	/**
	 * {@link Iterator#remove()}を呼び出せることのテスト。
	 * <pre>
	 * {@link Enumeration}にはremoveメソッドは存在しないため、
	 * {@link UnsupportedOperationException}を返すことを確認する。
	 * </pre>
	 * 
	 * @throws Exception
	 */
	@Test(expected=UnsupportedOperationException.class)
	public void removeTest() throws Exception {
		iterator.remove();
	}
	
}
