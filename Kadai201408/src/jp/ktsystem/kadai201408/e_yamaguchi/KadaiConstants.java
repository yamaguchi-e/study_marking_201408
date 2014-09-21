package jp.ktsystem.kadai201408.e_yamaguchi;

import java.util.regex.Pattern;

/**
 * <h3>定数クラス</h3>
 *
 * @author e_yamaguchi
 * @since 2014/08/10
 */
public class KadaiConstants {

	/** FAIL_INPUT_OUTPUT_ERROR ファイルの入出力エラー */
	public static final long FILE_INPUT_OUTPUT_ERROR = 1;

	/** ILLEGAL_CHAR_ERROR データ内部に半角英字以外の文字が存在した場合のエラー */
	public static final long ILLEGAL_CHAR_ERROR = 2;

	/** OTHER_ERROR その他のエラー */
	public static final long OTHER_ERROR = 3;

	/** CHARACTER_CODE  文字コード */
	public static final String CHARACTER_CODE = "UTF-8";

	/** DELIMITER 区切り */
	public static final String DELIMITER = ",";

	/** BOM_PATTERN  BOM */
	public static final char BOM_PATTERN = 0xFEFF;

	/** HALF_ALPHA_PATTERN 半角英字 */
	public static final Pattern HALF_ALPHA_PATTERN = Pattern.compile("^[a-zA-Z]*$");

	/**  OUTPUT_FORMAT  出力フォーマット  */
	public static final String OUTPUT_FORMAT = "[%s]:[%s]:[%s]";

	/**  FILE_SIZEs  ファイルサイズ  */
	public static final int FILE_SIZE = 1024 * 1024;
}
