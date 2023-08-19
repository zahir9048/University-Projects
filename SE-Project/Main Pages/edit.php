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
    <title>Edit Account</title>
    <link rel="stylesheet" href="./CSS/edit.css">
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
            <div class="title">Edit Account Details</div>
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
                        <form class="edit-form" action="./edit_scr.php" method="post">
                            <div class="input-box">
                                <span class="details" id="fname">First Name</span>
                                <input type="text" name="fname" value="<?php
                                echo $fname;
                                ?>">
                            </div>
                            <div class="input-box">
                                <span class="details" id="lastname">Last Name</span>
                                <input type="text" name="lname" value="<?php
                                echo $lname;
                                ?>">
                            </div>
                            <div class="input-box">
                                <span class="details" id="email">Email</span>
                                <input type="email" name="email" value="<?php
                                echo $email;
                                ?>" disabled>
                            </div>
                            <div class="input-box">
                                <span class="details" id="pnum">Contact No</span>
                                <input type="text" name="pnum" value="<?php
                                echo $contact;
                                ?>">
                            </div>

                            <div class="input-box">
                                <span class="details" id="dob">Date Of Birth</span>
                                <input type="date" name="dob" value="<?php
                                echo $dob;
                                ?>">
                            </div>

                            <div class="input-box">
                                <span class="details">Gender</span>
                                <input type="text" name="gender" value="<?php
                                echo $gender;
                                ?>">
                            </div>
                            <div class="password-container">
                                <div id="label-password">
                                    <p>Enter your account password to update details</p>
                                </div>
                                <div class="input-box" id="input-pass">
                                    <span class="details">Password</span>
                                    <input type="password" placeholder="Enter your password" name="pass" value="">
                                </div>

                                <?php
                                if (isset($_SESSION['fail'])) {
                                    echo $_SESSION['fail'];
                                }
                                ?>
                            </div>

                            <div class="button" id="btn-update">
                                <input id="update" type="submit" value="Update">
                            </div>
                        </form>
                        <div class="button" id="btn-cancel">
                            <a href="./clear_acc_scr.php"><input id="cancel" type="submit" value="Cancel"></a>
                        </div>
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