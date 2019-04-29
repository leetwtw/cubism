<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

$db_host = "mycubism.c0rw1rrv8ptk.ap-northeast-2.rds.amazonaws.com";
$db_user = "cubism";
$db_passwd = "11111111";
$db_name = "test";

$conn = mysqli_connect($db_host, $db_user, $db_passwd, $db_name) or die("Fail to Connect :(");

if($conn) echo("Success to Connect :)");

?>
