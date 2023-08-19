<?php

require("./connection.php");
$email = $_POST['email'];
$email = mysqli_real_escape_string($con, $email);
$password = $_POST['password'];
$password = mysqli_real_escape_string($con, $password);
$password = MD5($password);
$_SESSION['usern'] = $email;
$query = "SELECT * FROM users WHERE email='" . $email . "' AND password='" . $password . "'";
$result = mysqli_query($con, $query) or die($mysqli_error($con));
$num = mysqli_num_rows($result);
if ($num > 0) {
    $row = mysqli_fetch_array($result); {

        $_SESSION['user_id'] = $row['email'];
        $_SESSION['fname'] = $row['firstname'];
        $_SESSION['lname'] = $row['lastname'];
        header('location: ../Main Pages/homepage.php');
    }
} else {
    $_SESSION['wrong'] = "<span class='red'>Wrong Email or Password. Try again.</span>";
    header('location: login.php?message=' . $_SESSION['wrong']);
}
$mysqli->close()

    ?>