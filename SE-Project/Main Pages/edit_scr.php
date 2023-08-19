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
    $first_name = $_POST['fname'];
    $first_name = mysqli_real_escape_string($con, $first_name);

    $last_name = $_POST['lname'];
    $last_name = mysqli_real_escape_string($con, $last_name);

    $contact_num = $_POST['pnum'];
    $contact_num = mysqli_real_escape_string($con, $contact_num);

    $gender = $_POST['gender'];
    $gender = mysqli_real_escape_string($con, $gender);

    $dob = $_POST['dob'];
    $dob = mysqli_real_escape_string($con, $dob);

    $query = "UPDATE users SET firstname = '" . $first_name . "', lastname = '" . $last_name . "', phone = '" . $contact_num . "', gender = '" . $gender . "', dateofbirth = '" . $dob . "'   WHERE email = '" . $_SESSION['user_id'] . "'";
    mysqli_query($con, $query) or die($mysqli_error($con));
    $_SESSION['success'] = "<span class = 'green' style='display:flex; justify-content: center; height: 25px; font-weight: 600; color: green; display: flex; font-size: 16px;'>Information Updated Successfully.</span>";
    header('location: account.php?message=' . $_SESSION['success']);
} else {
    $_SESSION['fail'] = "<span class = 'red' style='position:relative; top: 15px; height: 25px; display:flex; justify-content: center; font-weight: bolder; color: #e50d0d; font-size: 16px;'>Wrong Password. Retry.</span>";
    header('location: edit.php?message=' . $_SESSION['fail']);
}
?>