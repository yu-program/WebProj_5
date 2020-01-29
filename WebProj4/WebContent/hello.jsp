<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel ="stylesheet" type= "text/css" href= "./css/style.css">
    <title>HelloStruts</title>
   </head>
   <body>
     <h1>HelloStruts2!</h1>
     <br>

     <table>
<!-- <tbody>は、テーブルの本文。 -->
       <tbody>
<!-- <tr>は、横一行を定義。 -->
         <tr>
<!-- <th>は、記述した内容が見出しになるヘッダセルを作成する。セルの内容がデータなら、<td>を使う。 -->
           <th>USERID</th>
           <th>USERNAME</th>
           <th>PASSWORD</th>
           <th>RESULT</th>
         </tr>

<!-- s:iteratorは集合の要素(List,Map,Set(配列)など)に対して順番にアクセスするためのインターフェイス。要素へのアクセスが簡単にできる。 -->
         <s:iterator value= "helloStrutsDTOList">
         <tr>
           <td><s:property value="userId"/></td>
           <td><s:property value="userName"/></td>
           <td><s:property value="password"/></td>
           <td><s:property value="result"/></td>
         </tr>
         </s:iterator>
       </tbody>
     </table>
   </body>
</html>