<?php
$db_user = 'root';
$db_pass = "";
$db = 'project'; //database name
$con = mysqli_connect('localhost', $db_user, $db_pass) or die('Unable to connect database');
mysqli_select_db($con, $db) or die('cannot');
if (!isset($_SESSION)) {
    session_start();
}
?>