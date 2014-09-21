package jp.ktsystem.kadai201408.e_yamaguchi;

import java.io.Serializable;

/**
 * <h3>ファイル出力項目</h3>
 *
 * @author e_yamaguchi
 * @since 2014/8/13
 */
public class ScoreInfoBean implements Serializable {

	private String textData;
	private long scoreMultiply;

	public ScoreInfoBean() {
	}

	public String getTextData() {
		return textData;
	}

	public void setTextData(String textData) {
		this.textData = textData;
	}

	public long getScoreMultiply() {
		return scoreMultiply;
	}

	public void setScoreMultiply(long scoreMultiply) {
		this.scoreMultiply = scoreMultiply;
	}
}

