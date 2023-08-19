<?php

require("./connection.php");


$_SESSION['message'] = "<span class='red'>&nbsp;&nbsp;&nbsp;</span>";
header('location: login.php?message=' . $_SESSION['message']);
header('location: login.php');
session_destroy();
$mysqli->close()

    ?>