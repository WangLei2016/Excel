<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>查询数据</title>  
    <script type="text/javascript" src="js/jquery.min.js"></script>  
    <script type="text/javascript">  
    $(document).ready(function(){
        $("#sure").click(function(){

            var timeValue= $("#time").val();

            if((timeValue.length>0 &&timeValue!="")){
                $("#sure").attr({"disabled":"disabled"});
                $.ajax({
                    type: "POST",
                    url: "http://127.0.0.1:8080/ssmm/allnumber",
                    data: "time="+timeValue,
                    success: function(msg){
                        $("#allnum").val( msg)
                        $("#sure").removeAttr("disabled");//将按钮可用
                        alert( "22222222222" );
                    }
                });

            }else{
                alert( "请输入日期" );
            }
        });





        $("#sureadd").click(function(){

            var timeUp= $("#uptime").val();
            var timeDn= $("#dntime").val();
            if((timeUp.length>0 &&timeUp!=""&&timeDn.length>0&&timeDn!="")){
                $("#sureadd").attr({"disabled":"disabled"});
                $.ajax({
                    type: "POST",
                    url: "http://127.0.0.1:8080/ssmm/addnumber",
                    data: "Uptime="+timeUp+"&"+"Dntime="+timeDn,
                    success: function(msg){
                        $("#addnum").val( msg);
                        $("#sureadd").removeAttr("disabled");//将按钮可用
                        alert( "3333" );
                    }
                });

            }else{
                alert( "请输入日期" );
            }
        })
        
    });
    </script>  
  </head>  
    
  <body>  
  <form action="/ssmm/detail" method="post">
   <table   >
   
    <!--<tr> <td>选择日期:</td>  <td><input type="date"  id="time"   /></td>  <td>总数：</td> <td><input id="allnum"  placeholder="11"  style="width:60px" readOnly="true"/></td> </tr>-->
    <!--<tr> <td> <input type="button" value="确定"  id="sure"/></td></tr>-->
    <!--<tr> <td>选择日期:</td>  <td><input type="date"   id="uptime"/></td>     <td> 到</td>      <td><input type="date"  id="dntime"/></td>   <td>新增：</td> <td><input id="addnum"  placeholder="11"  style="width:60px" readOnly="true"/></td> </tr>-->
    <!--<tr> <td> <input type="button" value="确定"  id="sureadd"/></td></tr>-->
    <tr> <td>选择日期:</td>  <td><input type="date"  id="detail"   name="time"/></td></tr>
    <tr> <td> <input type="submit" value="提交"  id="suredetail"/></td></tr>

</table>
    </form >
    

  </body>
  
  
    
</html>  