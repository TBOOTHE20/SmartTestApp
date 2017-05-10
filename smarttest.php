<?php
	$op = $_POST["op"];
	if( $op == "uploadUser" ){
		$val = $_POST["val"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $val";
		print($cmd);
	}
	else {
		$skill = $_POST["username"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $username";
		print($cmd);
	}	
	$str = shell_exec($cmd);
	print($str);
?>
