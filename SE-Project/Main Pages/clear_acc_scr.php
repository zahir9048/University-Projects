<?php

require("../LoginPage/connection.php");

$_SESSION['success'] = "<span class='red'>&nbsp;&nbsp;&nbsp;</span>";
header('location: ./account.php?success=' . $_SESSION['success']);
header('location: ./account.php');

$mysqli->close()

    ?>