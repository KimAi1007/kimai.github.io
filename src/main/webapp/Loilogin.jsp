<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
<title>Insert title here</title>
<style>
/* Fonts Form Google Font ::- https://fonts.google.com/  -:: */
@import url('https://fonts.googleapis.com/css?family=Abel|Abril+Fatface|Alegreya|Arima+Madurai|Dancing+Script|Dosis|Merriweather|Oleo+Script|Overlock|PT+Serif|Pacifico|Playball|Playfair+Display|Share|Unica+One|Vibur');
/* End Fonts */
/* Start Global rules */
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
/* End Global rules */

/* Start body rules */
body {
    background-image: radial-gradient(circle at 10% 20%, rgb(226, 240, 254) 0%, rgb(255, 247, 228) 90%);
background-image: radial-gradient(circle at 10% 20%, rgb(226, 240, 254) 0%, rgb(255, 247, 228) 90%);
background-attachment: fixed;
  background-repeat: no-repeat;

    font-family: 'Vibur', cursive;
/*   the main font */
    font-family: 'Abel', sans-serif;
opacity: .95;
/* background-image: linear-gradient(to top, #d9afd9 0%, #97d9e1 100%); */
}



/* |||||||||||||||||||||||||||||||||||||||||||||*/
/* //////////////////////////////////////////// */




/* End body rules */

/* Start form  attributes */
form {
    width: 450px;
    min-height: 500px;
    height: auto;
    border-radius: 5px;
    margin: 2% auto;
    box-shadow: 0 9px 50px hsla(20, 67%, 75%, 0.31);
    padding: 2%;
    background-image: radial-gradient(circle at 10% 20%, rgb(226, 240, 254) 0%, rgb(255, 247, 228) 90%);
}
/* form Container */
form .con {
    display: -webkit-flex;
    display: flex;
  
    -webkit-justify-content: space-around;
    justify-content: space-around;
  
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
  
      margin: 0 auto;
}

/* the header form form */
header {
    margin: 2% auto 10% auto;
    text-align: center;
}
/* Login title form form */
header h2 {
    font-size: 250%;
    font-family: 'Playfair Display', serif;
    color: red;
}
/*  A welcome message or an explanation of the login form */
header p {letter-spacing: 0.05em;}



/* //////////////////////////////////////////// */
/* //////////////////////////////////////////// */


.input-item {
    background: #fff;
    color: #333;
    padding: 14.5px 0px 15px 9px;
    border-radius: 5px 0px 0px 5px;
}



/* Show/hide password Font Icon */
#eye {
    background: #fff;
    color: #333;
  
    margin: 5.9px 0 0 0;
    margin-left: -20px;
    padding: 15px 9px 19px 0px;
    border-radius: 0px 5px 5px 0px;
  
    float: right;
    position: relative;
    right: 1%;
    top: -.2%;
    z-index: 5;
    
    cursor: pointer;
}
/* inputs form  */
input[class="form-input"]{
    width: 240px;
    height: 50px;
  
    margin-top: 2%;
    padding: 15px;
    
    font-size: 16px;
    font-family: 'Abel', sans-serif;
    color: #5E6472;
  
    outline: none;
    border: none;
  
    border-radius: 0px 5px 5px 0px;
    transition: 0.2s linear;
    
}
input[id="txt-input"] {width: 250px;}
/* focus  */
input:focus {
    transform: translateX(-2px);
    border-radius: 5px;
}

/* //////////////////////////////////////////// */
/* //////////////////////////////////////////// */

/* input[type="text"] {min-width: 250px;} */
/* buttons  */
button {
    display: inline-block;
    color: #252537;
  
    width: 280px;
    height: 50px;
  
    padding: 0 20px;
    background: #fff;
    border-radius: 5px;
    
    outline: none;
    border: none;
  
    cursor: pointer;
    text-align: center;
    transition: all 0.2s linear;
    
    margin: 7% auto;
    letter-spacing: 0.05em;
    
}
.log-in {
background: radial-gradient(circle at 0.7% 1%, rgb(215, 248, 247) 0%, rgb(102, 188, 239) 100.2%);
}
/* Submits */
.submits {
    width: 100%;
    display: block;
    margin-right: 156px;
    margin-left: -38px;
}

/*       Forgot Password button FAF3DD  */
.back {background: transparent;}

/*     Sign Up button  */

.back {background: linear-gradient(to top, #fff1eb 0%, #ace0f9 100%);}

.back a {
border: none;
color: black;
text-align: center;
text-decoration: none;
display: inline-block; 
margin: 4px 2px;
cursor: pointer;
}

.sign-up {background: linear-gradient(to top, #fff1eb 0%, #ace0f9 100%);}

.sign-up a {
border: none;
color: black;
text-align: center;
text-decoration: none;
display: inline-block; 
margin: 4px 2px;
cursor: pointer;
}



/* buttons hover */
button:hover {
    transform: translatey(3px);
    box-shadow: none;
}

/* buttons hover Animation */
button:hover {
    animation: ani9 0.4s ease-in-out infinite alternate;
}
@keyframes ani9 {
    0% {
        transform: translateY(3px);
    }
    100% {
        transform: translateY(5px);
    }
}
</style>
</head>
<body>
<div class="overlay">

<form action="accountServlet" method="post">
   <div class="con">
   <header class="head-form">
      <h2>Login failed</h2>
    <i class="fa-regular fa-face-tired" style="color: #1f3356;"></i>
    <i class="fa-regular fa-face-tired" style="color: #1f3356;"></i>
    <i class="fa-regular fa-face-tired" style="color: #1f3356;"></i>
      <p>This account does not exist or you entered the wrong user information!!!</p>
   </header>
   <br>
   <div class="field-set">  
     
 
     
      <br>
<!--        buttons -->
<!--      button LogIn -->
      <button class="btn submits back">
      
      <a href="Login.jsp">Back to login</a>
      <i class="fa-solid fa-backward"></i>
      </button>
      
   <div class="other">
      <button class="btn submits sign-up"><a href="Signup.jsp">
     Sign Up</a>
      <i class="fa fa-user-plus" aria-hidden="true"></i>
      </button>
   </div>
  

   </div>

</body>
<script type="text/javascript">

function show() {
 var p = document.getElementById('pwd');
 p.setAttribute('type', 'text');
}

function hide() {
 var p = document.getElementById('pwd');
 p.setAttribute('type', 'password');
}

</script>

</html>