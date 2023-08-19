<?php

require("../LoginPage/connection.php");

$_SESSION['fail'] = "<span class='red'>&nbsp;&nbsp;&nbsp;&nbsp;</span>";
header('location: ./edit.php?fail=' . $_SESSION['fail']);
header('location: ./edit.php');

$mysqli->close()

    ?>