<?php

require("../LoginPage/connection.php");

if (!isset($_SESSION['user_id'])) {
    header('location: ../LoginPage/logout.php');
}

$entered_pass = $_POST['pass'];
$entered_pass = mysqli_real_escape_string($con, $entered_pass);
$entered_pass = MD5($entered_pass);


$query = "SELECT * FROM users WHERE email ='" . $_SESSION['user_id'] . "'";
$result = mysqli_query($con, $query) or die($mysqli_error($con));
$row = mysqli_fetch_array($result);

$orig_pass = $row['password'];


if ($entered_pass == $orig_pass) {

    $query = "DELETE FROM Users WHERE email = '" . $_SESSION['user_id'] . "'";
    mysqli_query($con, $query) or die($mysqli_error($con));

    header('location: ../LoginPage/logout.php');
} else {
    $_SESSION['deletefail'] = "<span style='position:relative; top: 10px; height: 25px; font-weight: bolder; color: #e50d0d; display: flex; font-size: 16px; text-align: justify;'>Wrong Password Entered. Retry.</span>";
    header('location: delete.php?deletefail=' . $_SESSION['deletefail']);
}
?>