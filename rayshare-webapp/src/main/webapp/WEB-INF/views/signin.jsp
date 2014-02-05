<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Rayshare Sign In Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

    <c:if test="${not empty error}">
        <div class="alert-danger">
            Your sign in attempt was not successful, try again.<br /> Caused :
            ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>
    </c:if>

    <div class="container">

      <form class="form-signin" role="form" action="<c:url value='j_spring_security_check' />" method='POST'>
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="j_username" placeholder="User Name" required autofocus>
        <input type="password" class="form-control" name="j_password" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" name="submit" type="submit" value="submit">Sign in</button>
        <button class="btn btn-lg btn-primary btn-block" name="reset" type="reset">Reset</button>
      </form>

    </div> <!-- /container -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- <script src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script> -->
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <!-- <script src="<c:url value="/resources/js/bootstrap.js"/>"></script> -->
  </body>
</html>