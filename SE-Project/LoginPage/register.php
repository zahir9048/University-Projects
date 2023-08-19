<?php
require("./connection.php");

?>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./CSS/register.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./CSS/bootstrap.min.css">
    <link rel="shortcut icon" type="png" href="../meta data/logo3.png">
    <title>Register</title>
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
        <div class="container">
            <div class="title">Registration</div>
            <div class="content">
                <form action="./register_scr.php" method="post">
                    <div class="user-details">
                        <div class="input-box">
                            <span class="details">First Name</span>
                            <input type="text" name="fname" placeholder="Enter your first name" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Last Name</span>
                            <input type="text" name="lname" placeholder="Enter your last name" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Email</span>
                            <input type="email" name="email" placeholder="Enter your email" required>
                        </div>
                        <?php
                        if (isset($_SESSION['message'])) {
                            echo $_SESSION['message'];
                        }
                        ?>
                        <div class="input-box">
                            <span class="details">Date Of Birth</span>
                            <input type="date" name="dob" placeholder="Enter date of birth" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Phone Number</span>
                            <input type="text" name="num" placeholder="e.g +92-3314993" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Password</span>
                            <input id="pass" type="password" name="pass" placeholder="Enter your password" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Confirm Password</span>
                            <input type="password" placeholder="Confirm your password" required>
                        </div>
                        <div class="gender-details">
                            <input type="radio" name="gender" id="dot-1" value="male">
                            <input type="radio" name="gender" id="dot-2" value="female">
                            <input type="radio" name="gender" id="dot-3" value="other">
                            <span class="gender-title">Gender</span>
                            <div class="category">
                                <label for="dot-1">
                                    <span class="dot one"></span>
                                    <span class="gender">Male</span>
                                </label>
                                <label for="dot-2">
                                    <span class="dot two"></span>
                                    <span class="gender">Female</span>
                                </label>
                                <label for="dot-3">
                                    <span class="dot three"></span>
                                    <span class="gender">Other</span>
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="button">
                        <input id="register" type="submit" value="Register">
                    </div>
                    <div class="signin-link">
                        <div>Already a member? <a href="./logout.php">Sign In</a></div>
                    </div>

                </form>
            </div>
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
</body>

</html>