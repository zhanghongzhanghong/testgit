<html>
   <head>
       <meta charset="UTF-8">
       <title>freemarker</title>
   </head>
   <body>
        <table>
            <tr>
                <td>ID</td>
                <td>NAME</td>
                <td>AGE</td>
            </tr>
            <#list  list as user >
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                </tr>
            </#list>
        </table>
   </body>
</html>