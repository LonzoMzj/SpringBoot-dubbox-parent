<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<script type="text/javascript" src="js/jquery.min.js"></script>

    <script type="text/javascript">
       /*将post method 改变为delete*/
      $(function(){                     
    	   $(".delete").click(function(){
    		   var href=$(this).attr("href");
    		   $("#formdelete").attr("action",href).submit();
    		   return false;
    	   })
       }) 
       /* $(function(){
    	   $(".delete").click(function(){
    		   var href = $(this).attr("href");
    		   $("#formdelete").attr("action",href).submit();
    		   return false;
    	   })
       }) */
   </script>   
   
<div align="center">

</div>

<div style="width:500px;margin:20px auto;text-align: center">
	<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>id</td>
	        <td>name</td>
	        <td>编辑</td>
	        <td>删除</td>
	    </tr>
	    <c:forEach items="${page}" var="c" varStatus="st">
	        <tr>
	            <td>${c.id}</td>
	            <td>${c.name}</td>
				<td><a href="categories/${c.id}">编辑</a></td>
				<td><a class="delete" href="categories/${c.id}">删除</a></td>
	        </tr>
	    </c:forEach>
	    


            	    
	</table>
	<br>
	<br>
	<form action="categories" method="post">
	name: <input name="name"> <br>
	<button type="submit">提交</button>
	
	</form>
	
	<form id="formdelete" action="" method="POST" >
       <input type="hidden" name="_method" value="DELETE">
   </form>
</div>
