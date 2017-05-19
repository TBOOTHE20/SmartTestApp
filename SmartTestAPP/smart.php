<?php
	$op = $_POST["op"];
	$val = NULL;
	$skill = NULL;
	if( $op == "uploadLearningOutcome" ){
		$val = $_POST["val"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar smarttestapp.Server $op $val";
		print($cmd);
	}
	$str = shell_exec($cmd);
	print($str);
?>
