package match.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import match.constants.Constants;
import match.form.GeneticAlgorithmForm;

/**
 * 遺伝的アルゴリズム機能用のアクション
 * @author fujimura
 */
public class GeneticAlgorithmAction {
	/** 遺伝的アルゴリズム機能用のアクションフォーム */
	@Resource
	@ActionForm
	protected GeneticAlgorithmForm geneticAlgorithmForm;

	/**
	 * 準備画面を表示する。<br>
	 * 問題数、個体数に合わせて初期表示するための処理を行う。
	 * @return 準備画面のJSPファイル名
	 */
	@Execute(validator=false)
	public String index() {
		geneticAlgorithmForm.correctAnswerList = new ArrayList<String>();
		geneticAlgorithmForm.answerList = new ArrayList<List<String>>();

		for (int i = 0; i < Constants.NUMBER_OF_QUESTIONS; i++) {
			geneticAlgorithmForm.correctAnswerList.add(String.valueOf(i));
		}
		for (int i = 0; i < Constants.POPULATION; i++) {
			geneticAlgorithmForm.answerList.add(new ArrayList<String>());
		}
		return "preparation.jsp";
	}

	@Execute(validator=false)
	public String learning() {
		return "learning.jsp";
	}
}
