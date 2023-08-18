<?php
require("../LoginPage/connection.php");
if (!isset($_SESSION['user_id'])) {
    header('location: ../LoginPage/logout.php');
}
?>

<!DOCTYPE html>

<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <title>Delete Account</title>
    <link rel="stylesheet" href="./CSS/delete.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./CSS/bootstrap.min.css">
    <link rel="shortcut icon" type="png" href="../meta data/logo3.png">
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
                        <a href="./homepage.php" class="bn3637 bn36">Home</a>
                    </li>
                    <li>
                        <a href="./softwares.php" id="softwares-btn" class="bn3637 bn36">Softwares</a>
                    </li>
                    <li>

                        <a href="./games.php" id="" class="bn3637 bn36">Games</a>
                    </li>
                    <li>
                        <a href="./movies.php" class="bn3637 bn36">Movies</a>
                    </li>
                </ul>
            </nav>
            <div class="dropdown">
                <a href="./clear_acc_scr.php" id="btn-account" class="bn3637 bn36 dropbtn">
                    <?php echo $_SESSION['fname']; ?>
                    <?php echo $_SESSION['lname']; ?>
                </a>
                <div class="dropdown-content main-menu clicky-menu no-js">
                    <a href="./clear_acc_scr.php">Account Settings</a>
                    <a href="../LoginPage/logout.php">Log Out</a>
                </div>
            </div>
        </header>
        <div class="container">
            <div class="title">Delete Account</div>
            <div class="content">
                <div class="user-details">

                    <form class="edit-form" action="./delete_scr.php" method="post">


                        <div class="password-container">

                            <div style="position: relative; right: 9.5%;" class="label-password">
                                <p>Enter your password to verify its you!</p>
                            </div>
                            <div class="input-box" id="input-pass">
                                <span class="details">Password</span>
                                <input type="password" placeholder="Enter your password" name="pass" value="">
                            </div>

                            <?php
                            if (isset($_SESSION['deletefail'])) {
                                echo $_SESSION['deletefail'];
                            }
                            ?>
                            <div class="label-password" id="sure-delete">
                                <p><b>Are you sure you want to delete your account?</b></p>
                            </div>
                        </div>

                        <div class="button" id="btn-del">
                            <input id="del" type="submit" value="Yes">
                        </div>
                    </form>
                    <div class="button" id="btn-cancel">
                        <a href="./clear_acc_scr.php"><input id="cancel" type="submit" value="Cancel"></a>
                    </div>
                </div>



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