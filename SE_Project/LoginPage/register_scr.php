<?php

require("./connection.php");

$firstname = $_POST['fname'];
$firstname = mysqli_real_escape_string($con, $firstname);

$lastname = $_POST['lname'];
$lastname = mysqli_real_escape_string($con, $lastname);

$contact = $_POST['num'];
$contact = mysqli_real_escape_string($con, $contact);

$email = $_POST['email'];
$email = mysqli_real_escape_string($con, $email);

$password = $_POST['pass'];
$password = mysqli_real_escape_string($con, $password);
$password = MD5($password);

$gender = $_POST['gender'];
$gender = mysqli_real_escape_string($con, $gender);

$dob = $_POST['dob'];
$dob = mysqli_real_escape_string($con, $dob);


$query = "SELECT * FROM users WHERE email='$email'";
$result = mysqli_query($con, $query) or die($mysqli_error($con));
$num = mysqli_num_rows($result);

if ($num != 0) {
    $_SESSION['message'] = "<span style='display:flex; justify-content: center; height: 25px; font-weight: 600; color: #e50d0d; display: flex; font-size: 16px; position: relative; top: 37px; right: 141px;' class='red'>Email already exists.</span>";
    header('location: register.php?message=' . $_SESSION['message']);

} else {

    $query = "INSERT INTO users(firstname, lastname, phone, email, password, gender, dateofbirth)VALUES('" . $firstname . "','" . $lastname . "','" . $contact . "','" . $email . "','" . $password . "','" . $gender . "','" . $dob . "')";
    mysqli_query($con, $query) or die(mysqli_error($con));

    //$user_id = mysqli_insert_id($con);

    $_SESSION['firstname'] = $firstname;
    $_SESSION['email'] = $email;
    $_SESSION['user_id'] = $user_id;
    header('location: logout.php');
}
?>