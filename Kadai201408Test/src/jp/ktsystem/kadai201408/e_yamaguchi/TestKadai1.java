package jp.ktsystem.kadai201408.e_yamaguchi;

import junit.framework.TestCase;

/**
 * <h3>テストクラス</h3>
 *
 * @author e_yamaguti
 * @since 2014/08/13
 */
public class TestKadai1 extends TestCase {

	private static final String SAMPLE_RESULT_PATH = "c:\\temp\\inputKadai1\\";

	/**
	 * 成功ケーステスト
	 * @param anInputPath  入力ファイル
	 * @param scoreSum 点数合計
	 */
	private void execute(String anInputPath, long scoreSum) {

		try {
			long answer = Kadai.calcScoreSum(anInputPath);
			assertEquals(answer, scoreSum);
		} catch(Exception e) {
			fail("例外が発生しました：" + e.getMessage());
		}
	}

	/**
	 * エラーケーステスト
	 * @param anInputPath   入力ファイル
	 * @param anOutputPath  出力ファイル
	 * @param errorCode     エラーコード
	 */
	private void executeInvalid(String anInputPath, long errorCode) {
		try {
			Kadai.calcScoreSum(anInputPath);
			fail("なぜ成功する？");
		} catch(KadaiException e) {
			assertEquals(errorCode, e.getErrorCode());
		}
	}

	public void testCase1() {
		execute(SAMPLE_RESULT_PATH + "Case1.txt", 1);
	}

	public void testCase2() {
		execute(SAMPLE_RESULT_PATH + "Case2.txt", 1);
	}

	public void testCase3() {
		execute(SAMPLE_RESULT_PATH + "Case3.txt", 0);
	}

	public void testCase4() {
		execute(SAMPLE_RESULT_PATH + "Case4.txt", 0);
	}

	public void testCase5() {
		execute(SAMPLE_RESULT_PATH + "Case5.txt", 2);
	}

	public void testCase6() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case6.txt", 2);
	}

	public void testCase7() {
		execute(SAMPLE_RESULT_PATH + "Case7.txt", 1);
	}

	public void testCase8() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case8.txt", 2);
	}

	public void testCase9() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case9.txt", 2);
	}

	public void testCase10() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case10.txt", 2);
	}

	public void testCase11() {
		execute(SAMPLE_RESULT_PATH + "Case11.txt", 1);
	}

	public void testCase12() {
		execute(SAMPLE_RESULT_PATH + "Case12.txt", 351);
	}

	public void testCase13() {
		execute(SAMPLE_RESULT_PATH + "Case13.txt", 351);
	}

	public void testCase14() {
		execute(SAMPLE_RESULT_PATH + "Case14.txt", 351);
	}

	public void testCase15() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case15.txt", 2);
	}

	public void testCase16() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case16.txt", 2);
	}

	public void testCase17() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case17.txt", 2);
	}

	public void testCase18() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case18.txt", 2);
	}

	public void testCase19() {
		execute(SAMPLE_RESULT_PATH + "Case19.txt", 5);
	}

	public void testCase20() {
		execute(SAMPLE_RESULT_PATH + "Case20.txt", 6201);
	}

	public void testCase21() {
		execute(SAMPLE_RESULT_PATH + "Case21.txt", 6201);
	}

	public void testCase22() {
		execute(SAMPLE_RESULT_PATH + "Case22.txt", 6201);
	}

	public void testCase23() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case23.txt", 2);
	}

	public void testCase24() {
		execute(SAMPLE_RESULT_PATH + "Case24.txt", 159);
	}

	public void testCase25() {
		execute(SAMPLE_RESULT_PATH + "Case25.txt", 159);
	}

	public void testCase26() {
		execute(SAMPLE_RESULT_PATH + "Case26.txt", 159);
	}

	public void testCase27() {
		executeInvalid(SAMPLE_RESULT_PATH + "Case27.txt", 2);
	}

	public void testCase28() {
		execute(SAMPLE_RESULT_PATH + "Case28.txt", 191);
	}

	public void testCase29() {
		execute(SAMPLE_RESULT_PATH + "Case29.txt", 159);
	}

	public void testCase30() {
		execute(SAMPLE_RESULT_PATH + "Case30.txt", 159);
	}

	public void testCase31() {
		execute(SAMPLE_RESULT_PATH + "Case31.txt", 159);
	}

	public void testCase32() {
		executeInvalid(null, 1);
	}

	public void testCase33() {
		executeInvalid("", 1);
	}

	public void testCase34() {
		executeInvalid(SAMPLE_RESULT_PATH + "aaa.txt", 1);
	}

	public void testCase35() {
		executeInvalid("c:\\temp\\inputKadai1", 1);
	}

	public void testCase36() {
		execute(SAMPLE_RESULT_PATH + "Case36.txt", 159);
	}
}