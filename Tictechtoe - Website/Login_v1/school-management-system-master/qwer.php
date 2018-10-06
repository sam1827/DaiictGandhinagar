<?php
	/*
		initiziling database and connecting
	*/
	$servername="localhost";
	$username="root";
	$password="";
	$connect = mysql_connect($id,$password) or die("<br/>Check your server connection...");
	$dbname = "login";
	$selectedDB = mysql_select_db($dbname) or die(mysql_error());
	// database connected
?>