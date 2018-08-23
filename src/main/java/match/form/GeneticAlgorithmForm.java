package match.form;

import java.util.List;

/**
 * 遺伝的アルゴリズム機能用のアクションフォーム
 * @author fujimura
 */
public class GeneticAlgorithmForm {
	/** 正解値一覧。x個の正しい答え */
	public List<String> correctAnswerList;
	/** 世代。遺伝した回数+1 */
	public int generation;
	/** 回答一覧。x個の回答 * y個体分 */
	public List<List<String>> answerList;
	/** 成績一覧。y個体分の点数 */
	public List<Integer> achievementList;
}
