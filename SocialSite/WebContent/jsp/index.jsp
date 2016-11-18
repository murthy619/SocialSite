<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css"
		href="../css/index.css" />

        <title>login form</title>
    </head>
    <body>


    <div class="header">
  <h1>SocialSite</h1>
</div>

<div class="menu">
  <ul>
    <li>Home</li>
    <li>AboutUs</li>
    <li>SignIn/SignUp</li>
    <li>Contact us</li>
  </ul>
</div>

<div class="main">
  <h1>The City</h1>
  <form method="post" action="LoginController">
        Email ID:<input type="text" name="email" /><br/>
        Password:<input type="text" name="pass" /><br/>
        <input type="submit" value="login" />
        </form>
</div>
    </body>
</html>