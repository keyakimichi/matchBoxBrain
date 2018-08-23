<%@page pageEncoding="UTF-8"%>
<html>

  <head>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="${f:url('/js/autofill.js')}"></script>
    <link rel="stylesheet" type="text/css" href="${f:url('/css/geneticAlgorithm/preparation.css')}">

  </head>

  <body>

    <h1>準備画面</h1>
    <h3>正解</h3>
    <c:forEach var="obj" items="${f:h(correctAnswerList)}" varStatus="status">
      <input id="correct_answer_text_${status.index}" type="text" size="1">
    </c:forEach>
    <input type="button" id="correct_answer_autofill" value="正解自動入力"><br>
    <br>
    <h3>遺伝子の回答</h3>
    <c:forEach var="obj" items="${f:h(correctAnswerList)}" varStatus="status_">
      <input id="hidden_answer_text_${status.index}_${status_.index}" type="text" size="1">
    </c:forEach>
    <input type="button" id="all_gene_answer_autofill" value="全回答自動入力"><br>
    <c:forEach var="obj" items="${f:h(answerList)}" varStatus="status">
      <c:forEach var="obj" items="${f:h(correctAnswerList)}" varStatus="status_">
        <input id="gene_answer_text_${status.index}_${status_.index}" type="text" size="1">
      </c:forEach>
      <input type="button" id="gene_answer_autofill_${status.index}" line="${status.index}" value="回答自動入力"><br>
    </c:forEach>
    <br>
    <input type="submit" value="完了">

  </body>

</html>
