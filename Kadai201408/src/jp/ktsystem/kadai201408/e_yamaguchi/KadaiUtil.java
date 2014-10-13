package jp.ktsystem.kadai201408.e_yamaguchi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h3>課題チェッククラス</h3>
 *
 * @author e_yamaguchi
 * @since 2014/10/13
 */
public class KadaiUtil {

	/**
	 * ファイル名チェック
	 * <br>
	 * @param anFilePath ファイル名
	 * @return boolean
	 */
	public static boolean checkFile(String aFilePath) {
		return null == aFilePath || aFilePath.isEmpty();
	}

	/**
	 * Bom除去チェック
	 * <br>
	 * @param aCheckRecord チェック対象行
	 * @return bom除去された文字列
	 */
	public static String skipBom(String aCheckRecord) {
		// BOM除去
		if (KadaiConstants.BOM_PATTERN == aCheckRecord.charAt(0)) {
			return aCheckRecord.substring(1);
		}
		return aCheckRecord;
	}

	/**
	 * 不正文字チェック
	 * <br>
	 * @param aCheckRecord チェック対象行
	 * @param anIllegalChar 不正文字
	 * @throws KadaiException
	 */
	public static void checkIllegalChar(String aCheckRecord, Pattern anIllegalChar) throws KadaiException {
		Matcher match = anIllegalChar.matcher(aCheckRecord);

		// 不正文字がデータに含まれている場合エラー
		if (!match.matches()) {
			throw new KadaiException(KadaiConstants.ILLEGAL_CHAR_ERROR);
		}
	}
}
