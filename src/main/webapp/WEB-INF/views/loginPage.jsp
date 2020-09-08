
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
	<div class="container">
	    <form class="form-signin" method="POST" action="/loginProcess">
	        <h2 class="form-signin-heading">Please sign in</h2>
	        <label for="" class="sr-only">ID</label>
	        <input type="text" name="username" class="form-control" placeholder="ID" required autofocus>
	        <label for=""  class="sr-only">Password</label>
	        <input type="password" name="password" class="form-control" placeholder="Password" required>
	        <div class="checkbox">
	            <label>
	                <input type="checkbox" value="remember-me"> Remember me
	            </label>
	        </div>
	        <!--input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"-->
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	    </form>
	
	</div> <!-- /container -->
</body>
</html>
