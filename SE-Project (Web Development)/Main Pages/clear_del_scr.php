<?php

require("../LoginPage/connection.php");

$_SESSION['deletefail'] = "<span class='red'>&nbsp;&nbsp;&nbsp;&nbsp;</span>";
header('location: ./delete.php?deletefail=' . $_SESSION['deletefail']);
header('location: ./delete.php');

$mysqli->close()

    ?>