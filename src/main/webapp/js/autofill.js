/**
 * HTML読み込み後実行処理
 */
$(document).ready(function() {
    /**
     * 正解自動入力処理
     */
    $('[id="correct_answer_autofill"]').on('click', function() {
        var $correctAnswerTextBoxes = $('[id*="correct_answer_text_"]');
        for (var i = 0; i < $correctAnswerTextBoxes.length; i++) {
            var randomNum = Math.floor(Math.random() * 3) + 1;
            $($correctAnswerTextBoxes[i]).val(randomNum);
        }
    });

	/**
     * 遺伝子の回答1列自動入力処理
     */
    $('[id*="gene_answer_autofill"][line]').on('click', function() {
        var $this = $(this);
        var lineNumber = $this.attr('line');
        var $geneAnswerTextBoxes = $('[id*="gene_answer_text_' + lineNumber + '"]');
        for (var i = 0; i < $geneAnswerTextBoxes.length; i++) {
            var randomNum = Math.floor(Math.random() * 3) + 1;
            $($geneAnswerTextBoxes[i]).val(randomNum);
        }
    });

    /**
     * 全遺伝子の回答自動入力処理
     */
    $('[id*="all_gene_answer_autofill"]').on('click', function() {
        for (var i =0; i < $('[line][type="button"]').length; i++) {
            $('#gene_answer_autofill_' + i).trigger('click');
        }
    });
})
