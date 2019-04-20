<?php
include "db_config.php";

if(!isset($_GET["level"])) {
if(!isset($_GET["time"]))
        exit;
}



$level = (int)$_GET["level"];
$time = (int)$_GET["time"];

$stmt = $conn->prepare("INSERT INTO test.Memory(level, time) VALUES($level, $time)");
$stmt->execute();
$stmt->close();

?>
