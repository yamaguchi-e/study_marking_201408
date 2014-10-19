package jp.ktsystem.kadai201408.e_yamaguchi;

/**
 * <h3>エラーを返すクラス</h3>
 *
 * @author e_yamaguti
 * @since 2014/08/13
 */
public class KadaiException extends Exception{

	private static final long serialVersionUID = 1L;
	private int errorCode;

	/**
	 * エラーコードを取得
	 *
	 * @return エラーコード
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * エラーコードを指定してオブジェクトを構築
	 *
	 * @param error エラーコード
	 */
	public KadaiException(int error) {
		errorCode = error;
	}
}