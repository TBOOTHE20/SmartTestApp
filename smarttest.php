<?php
	$op = $_POST["op"];
	$val = NULL;
	$skill = NULL;
	if( $op == "uploadUser" ){
		$val = $_POST["val"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $val";
		print($cmd);
	}
	else {
		$username = $_POST["username"];
		$password = $_POST["password"]
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $username $password";
		print($cmd);
	}	
	$str = shell_exec($cmd);
	print($str);
?>
