<?php
$conn = mysqli_connect("mycubism.c0rw1rrv8ptk.ap-northeast-2.rds.amazonaws.com", "cubism", "11111111", "test");

$query = "SELECT * FROM test.Memory ORDER BY inserted_at DESC";
$result = mysqli_query($conn, $query);
if($row = mysqli_fetch_array($result))
{
echo $row[inserted_at];
}
mysqli_close($conn);
?>
