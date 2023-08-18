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
    <title>Account</title>
    <link rel="stylesheet" href="./CSS/account.css">
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
            <div class="title">Account Details</div>
            <div class="content">
                <div>
                    <div class="user-details">
                        <?php

                        $user_id = $_SESSION['user_id'];
                        $query = "SELECT users.email AS email, users.firstname AS fname, users.lastname AS lname, users.phone AS pnum, users.gender AS gender, users.dateofbirth AS dob FROM users WHERE users.email='$user_id'";
                        $result = mysqli_query($con, $query) or die($mysqli_error($con));
                        $row = mysqli_fetch_array($result);

                        $email = $row["email"];
                        $fname = $row["fname"];
                        $lname = $row["lname"];
                        $contact = $row["pnum"];
                        $gender = $row["gender"];
                        $dob = $row["dob"];

                        ?>
                        <div class="input-box">
                            <span class="details" id="fname">First Name</span>
                            <input type="text" value="<?php
                            echo $fname;
                            ?>" disabled>
                        </div>
                        <div class="input-box">
                            <span class="details" id="lastname">Last Name</span>
                            <input type="text" value="<?php
                            echo $lname;
                            ?>" disabled>
                        </div>
                        <div class="input-box">
                            <span class="details" id="email">Email</span>
                            <input type="text" value="<?php
                            echo $email;
                            ?>" disabled>
                        </div>
                        <div class="input-box">
                            <span class="details" id="pnum">Contact No</span>
                            <input type="text" value="<?php
                            echo $contact;
                            ?>" disabled>
                        </div>

                        <div class="input-box" id="input-box-5">
                            <span class="details" id="dob">Date Of Birth</span>
                            <input type="text" value="<?php
                            echo $dob;
                            ?>" disabled>
                        </div>

                        <div class="input-box" id="input-box-6">
                            <span class="details">Gender</span>
                            <input type="text" value="<?php
                            echo $gender;
                            ?>" disabled>
                        </div>
                    </div>
                    <?php
                    if (isset($_SESSION['success'])) {
                        echo $_SESSION['success'];
                    }
                    ?>
                    <div class="button" id="btn-edit">
                        <a href="./clear_edit.php"><input id="edit" type="submit" value="Edit Account Details"></a>
                    </div>
                    <div class="button" id="btn-del">
                        <a href="./clear_del_scr.php"><input id="delete" type="submit" value="Delete Account"></a>
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