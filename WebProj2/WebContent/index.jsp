<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>INDEX</title>
	</head>
	<body>
	<!-- MySQLの接続ができているか -->
		<s:form action="HelloStrutsAction">
			<s:submit value="HelloStruts"/>
		</s:form>

	<!-- index.jspのform→Actionクラスから値を受取り、ログインの認証 -->
		<s:form action="WelcomeAction">
			<s:submit value="Welcome"/>
		</s:form>

	<!-- お問い合わせ機能 -->
		<s:form action ="InquiryAction">
			<s:submit value="お問い合わせ"/>
		</s:form>

	<!-- 新規ユーザー登録 -->
		<h3>新規ユーザー登録</h3>
		GET通信<br>
		<s:form action="TestAction" method= "get">
			<s:textfield name = "username"/>
			<s:password name = "password"/>
			<s:submit value = "送信"/>
		</s:form>
		POST通信
		<s:form action="TestAction" method= "post">
			<s:textfield name = "username"/>
			<s:password name = "password"/>
			<s:submit value = "送信"/>
		</s:form>
	</body>

</html>