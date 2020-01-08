

<% 
   String msg=(String)request.getAttribute("msg");
   if(msg!=null){
   out.print(msg);
   }
   
    %>           

<form action="LoginServlet">
User Name : <input type="text" name="uname"/>
 Password :  <input type="text" name="passwd"/>
       <input type="submit" Value ="Click"/>
</form> 




        