package jp.ktsystem.kadai201408.e_yamaguchi;

import junit.framework.TestCase;

/**
 * <h3>テストクラス</h3>
 *
 * @author e_yamaguti
 * @since 2014/08/13
 */
public class TestKadai2 extends TestCase {

	private static final String INPUT_FILE_PATH = "c:\\temp\\inputKadai2\\";
	private static final String OUTPUT_FILE_PATH = "c:\\temp\\outputKadai2\\";

	/**
	 * 成功ケーステスト
	 * @param anInputPath  入力ファイル
	 * @param scoreSum 点数合計
	 */
	private void execute(String anInputPath, String anOutputPath) {

		try {
			Kadai.printMaxScore(anInputPath, anOutputPath);
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
	private void executeInvalid(String anInputPath, String anOutputPath, int errorCode) {
		try {
			Kadai.printMaxScore(anInputPath, anOutputPath);
			fail("なぜ成功する？");
		} catch(KadaiException e) {
			assertEquals(errorCode, e.getErrorCode());
		}
	}

	public void testCase1() {
		execute(INPUT_FILE_PATH + "Case1.txt", OUTPUT_FILE_PATH + "Case1.txt");
	}

	public void testCase2() {
		execute(INPUT_FILE_PATH + "Case2.txt", OUTPUT_FILE_PATH + "Case2.txt");
	}

	public void testCase3() {
		execute(INPUT_FILE_PATH + "Case3.txt", OUTPUT_FILE_PATH + "Case3.txt");
	}

	public void testCase4() {
		execute(INPUT_FILE_PATH + "Case4.txt", OUTPUT_FILE_PATH + "Case4.txt");
	}

	public void testCase5() {
		execute(INPUT_FILE_PATH + "Case5.txt", OUTPUT_FILE_PATH + "Case5.txt");
	}

	public void testCase6() {
		executeInvalid(INPUT_FILE_PATH + "Case6.txt", OUTPUT_FILE_PATH , 2);
	}

	public void testCase7() {
		execute(INPUT_FILE_PATH + "Case7.txt", OUTPUT_FILE_PATH + "Case7.txt");
	}

	public void testCase8() {
		executeInvalid(INPUT_FILE_PATH + "Case8.txt", OUTPUT_FILE_PATH + "Case8.txt", 2);
	}

	public void testCase9() {
		executeInvalid(INPUT_FILE_PATH + "Case9.txt", OUTPUT_FILE_PATH + "Case9.txt", 2);
	}

	public void testCase10() {
		executeInvalid(INPUT_FILE_PATH + "Case10.txt", OUTPUT_FILE_PATH + "Case10.txt", 2);
	}

	public void testCase11() {
		execute(INPUT_FILE_PATH + "Case11.txt", OUTPUT_FILE_PATH + "Case11.txt");
	}

	public void testCase12() {
		execute(INPUT_FILE_PATH + "Case12.txt", OUTPUT_FILE_PATH + "Case12.txt");
	}

	public void testCase13() {
		execute(INPUT_FILE_PATH + "Case13.txt", OUTPUT_FILE_PATH + "Case13.txt");
	}

	public void testCase14() {
		execute(INPUT_FILE_PATH + "Case14.txt", OUTPUT_FILE_PATH + "Case14.txt");
	}

	public void testCase15() {
		executeInvalid(INPUT_FILE_PATH + "Case15.txt", OUTPUT_FILE_PATH + "Case15.txt", 2);
	}

	public void testCase16() {
		executeInvalid(INPUT_FILE_PATH + "Case16.txt", OUTPUT_FILE_PATH + "Case16.txt", 2);
	}

	public void testCase17() {
		executeInvalid(INPUT_FILE_PATH + "Case17.txt", OUTPUT_FILE_PATH + "Case17.txt", 2);
	}

	public void testCase18() {
		executeInvalid(INPUT_FILE_PATH + "Case18.txt", OUTPUT_FILE_PATH + "Case18.txt", 2);
	}

	public void testCase19() {
		execute(INPUT_FILE_PATH + "Case19.txt", OUTPUT_FILE_PATH + "Case19.txt");
	}

	public void testCase20() {
		execute(INPUT_FILE_PATH + "Case20.txt", OUTPUT_FILE_PATH + "Case20.txt");
	}

	public void testCase21() {
		execute(INPUT_FILE_PATH + "Case21.txt", OUTPUT_FILE_PATH + "Case21.txt");
	}

	public void testCase22() {
		execute(INPUT_FILE_PATH + "Case22.txt", OUTPUT_FILE_PATH + "Case22.txt");
	}

	public void testCase23() {
		executeInvalid(INPUT_FILE_PATH + "Case23.txt", OUTPUT_FILE_PATH + "Case23.txt", 2);
	}

	public void testCase24() {
		execute(INPUT_FILE_PATH + "Case24.txt", OUTPUT_FILE_PATH + "Case24.txt");
	}

	public void testCase25() {
		execute(INPUT_FILE_PATH + "Case25.txt", OUTPUT_FILE_PATH + "Case25.txt");
	}

	public void testCase26() {
		execute(INPUT_FILE_PATH + "Case26.txt", OUTPUT_FILE_PATH + "Case26.txt");
	}

	public void testCase27() {
		executeInvalid(INPUT_FILE_PATH + "Case27.txt", OUTPUT_FILE_PATH + "Case27.txt", 2);
	}

	public void testCase28() {
		execute(INPUT_FILE_PATH + "Case28.txt", OUTPUT_FILE_PATH + "Case28.txt");
	}

	public void testCase29() {
		execute(INPUT_FILE_PATH + "Case29.txt", OUTPUT_FILE_PATH + "Case29.txt");
	}

	public void testCase30() {
		execute(INPUT_FILE_PATH + "Case30.txt", OUTPUT_FILE_PATH + "Case30.txt");
	}

	public void testCase31() {
		execute(INPUT_FILE_PATH + "Case31.txt", OUTPUT_FILE_PATH + "Case31.txt");
	}

	public void testCase32() {
		executeInvalid(null, OUTPUT_FILE_PATH + "Case32.txt", 1);
	}

	public void testCase33() {
		executeInvalid("", OUTPUT_FILE_PATH + "Case33.txt", 1);
	}

	public void testCase34() {
		executeInvalid(INPUT_FILE_PATH + "aaa.txt", OUTPUT_FILE_PATH + "Case34.txt", 1);
	}

	public void testCase35() {
		executeInvalid("c:\\temp\\inputKadai1", OUTPUT_FILE_PATH + "Case35.txt", 1);
	}

	public void testCase36() {
		execute(INPUT_FILE_PATH + "Case36.txt", OUTPUT_FILE_PATH + "Case36.txt");
	}

	public void testCase37() {
		execute(INPUT_FILE_PATH + "Case37.txt", OUTPUT_FILE_PATH + "Case37.txt");
	}

	public void testCase38() {
		executeInvalid(INPUT_FILE_PATH + "Case38.txt", null, 1);
	}

	public void testCase39() {
		executeInvalid(INPUT_FILE_PATH + "Case39.txt", "", 1);
	}

	public void testCase40() {
		executeInvalid(INPUT_FILE_PATH + "Case40.txt", OUTPUT_FILE_PATH, 1);
	}

	public void testCase41() {
		execute(INPUT_FILE_PATH + "Case41.txt", OUTPUT_FILE_PATH + "Case41.txt");
	}
}