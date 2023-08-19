<?php
require("./connection.php");

?>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./CSS/login.css">
    <link rel="shortcut icon" type="png" href="../meta data/logo3.png">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./CSS/bootstrap.min.css">
    <title>Login</title>
</head>

<body>
    <div class="page">
        <header class="header1">
            <div id="logocontainer">
                <a href="../meta data/logo3.png" target="_blank"><img id="logo" src="../meta data/logo3.png"
                        alt="main logo"></a>
            </div>
            <nav class="header-nav">
                <ul>
                    <li>
                        <a href="../Main Pages/homepage.php" class="bn3637 bn36">Home</a>
                    </li>
                    <li>
                        <a href="../Main Pages/softwares.php" id="softwares-btn" class="bn3637 bn36">Softwares</a>
                    </li>
                    <li>

                        <a href="../Main Pages/games.php" id="" class="bn3637 bn36">Games</a>
                    </li>
                    <li>
                        <a href="../Main Pages/movies.php" class="bn3637 bn36">Movies</a>
                    </li>
                </ul>
            </nav>
        </header>
        <div class="wrapper">
            <div class="title">Login Form</div>
            <form action="./login_scr.php" method="post">
                <div class="field" id="field1">
                    <input type="email" name="email" required>
                    <label>Email Address</label>
                </div>
                <div class="field" id="field2">
                    <input type="password" name="password" required>
                    <label>Password</label>
                </div>

                <div class=" field" id="field3">
                    <input id="login" type="submit" value="Login">
                </div>
                <?php
                if (isset($_SESSION['wrong'])) {
                    echo $_SESSION['wrong'];
                }
                ?>
                <div class="signup-link">Not a member? <a href="./register.php">Register</a></div>
            </form>
        </div>

        <footer class="footer1">
            <div class="copyrights">
                <span>© 2023 ARZ All rights reserved.</span>
                <span><a href="">Terms of Use</a></span>
                <span><a href="">Privacy and Cookies</a></span>
                <span><a href="">Contact us</a></span>
            </div>


            <div class="footer-social">
                <div class="footer-h2">
                    <h2>Visit Us</h2>
                </div>
                <div class="footer-sm">
                    <div class="img-container">
                        <a href="#">
                            <img class="yt-img" src="../meta data/youtube.png" alt="Youtube icon">
                        </a>
                    </div>
                    <div class="img-container">
                        <a href="#">
                            <img class="tw-img" src="../meta data/twitter.png" alt="Twitter icon">
                        </a>
                    </div>
                    <div class="img-container">
                        <a href="#">
                            <img class="fb-img" src="../meta data/fb.png" alt="Facebook icon">
                        </a>
                    </div>
                </div>
            </div>

        </footer>
    </div>
    </div>
</body>

</html>