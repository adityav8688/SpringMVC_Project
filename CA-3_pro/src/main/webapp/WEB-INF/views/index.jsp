<!DOCTYPE html>
<html>
  <head>
    <title>Sign In</title>
    <%@include file="./base.jsp" %>
    <style>
      body {
        background-color: #f2f2f2;
      }

      .container {
  width: 400px;
  margin: auto;
  padding: 20px;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0px 0px 10px rgba(0,0,0,0.3);
}

      h2 {
        text-align: center;
      }

      label {
        display: block;
        font-weight: bold;
        margin-bottom: 5px;
      }

      input[type="text"],
      input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border-radius: 5px;
        border: none;
       
      }

      input[type="submit"] {
        background-color: #4CAF50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
      }

      input[type="submit"]:hover {
        background-color: #3e8e41;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <form  action="reserv">
        <h2>Sign In</h2>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder= "Enter UserName">

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder= "Enter Password">

        <a href="${pageContext.request.contextPath }/reserv"  class="btn btn-lg btn-primary btn-block" type="submit">Login</a>
      </form>
    </div>
  </body>
</html>
