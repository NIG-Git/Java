<%@ page contentType="text/html; charset=UTF-8" %>

<!-- 1 -->
<%@ taglib uri="/tags/SampleTag.tld" prefix="sample" %>

<html>

	<title>SampleCustomTag</title>

	<body>

	<h2>
	<!-- 2 -->
	 <sample:customTag str="属性値のメッセージ">
		Body Message<br> <!-- ボディ部 -->
	 </sample:customTag>
	</h2>

	<br>

	<h2>JSPページ終了</h2>

	</body>

</html>
