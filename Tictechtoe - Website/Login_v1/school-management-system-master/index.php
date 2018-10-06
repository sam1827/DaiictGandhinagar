<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8">
      <title>School Management System</title>
      <!-- Sets initial viewport load and disables zooming  -->
      <!--meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no"-->
      <!-- SmartAddon.com Verification -->
      <!--meta name="smartaddon-verification" content="936e8d43184bc47ef34e25e426c508fe" />
      <meta name="keywords" content=" London School Management System">
      <meta name="description" content="This is a simple School Management System">
      <link rel="shortcut icon" href="favicon_16.ico"/>

      <link rel="bookmark" href="favicon_16.ico"/-->
      <!-- site css -->
      <link rel="stylesheet" href="css/site.min.css">
      <link rel="stylesheet" href="css/custom.css">
      
      <!--link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'-->
      <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
      <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <![endif]-->
      <!--script type="text/javascript" src="js/site.min.js"></script-->
   </head>
   
     
      <body style="background-color:#D3D3D3;
      background-size:cover;
   ">

      <div class="container">

         <div class="col-md-12">
            
            <ol class="breadcrumb breadcrumb-arrow ">
               <li class="active"><span><i class="glyphicon glyphicon-home"></i> Home</span></li>
               <li><a href="addNew.php"><i class="glyphicon glyphicon-comment"></i> Add New Record</a></li>
               <li><a href="select.php"><i class="glyphicon glyphicon-list"></i> Select School</a></li>
               <li><a href="read.php"><i class="glyphicon glyphicon-user"></i> Display All Members</a></li>
               <li><a href="http://tsec.sammeyinc.com/smps/index.html"><i class="glyphicon glyphicon-ok"></i> Student Progress</a></li>

            </ol>
         </div>
         <h2 class="example-title" align="center">Institute Management System</h2>
         
         <div class="row">
            <!-- Panel for Add New Records  -->  
            <div class="col-md-6">
               <center>
                      <div class="panel panel-warning">
               <div class="panel-heading">
                     <h2 class="panel-title"><strong>Add New Record ?</strong></h2>
                  </div>
                 <div class="panel-body"> 
                     You Can Add As Many As Records You Like !! <br/><br/>
                     <a href="addNew.php"><button class="btn btn-warning">Add New Member</button></a>
                  </div>
               </div>
               </center>
            </div>
            <!--/Panel for Add New Records  -->
            <!--   Panel for select members by School name  -->
            <div class="col-md-6">
               <center>
               <div class="panel panel-primary">
                  <div class="panel-heading">
                     <h2 class="panel-title"><strong>Select School Members ?</strong></h2>
                  </div>
                  <div class="panel-body">
                     Display All Members For A Selected School<br/><br/>
                     <a href="select.php"><button class="btn btn-primary">Click Here To Learn More..</button></a>
                  </div>
               </div>
            </center>
            </div>
            <!-- /Panel for select members by School name  -->
            <!--   Panel for Display All Records  -->
            <div class="col-md-6">
               <center>
               <div class="panel panel-info">
                  <div class="panel-heading">
                     <h2 class="panel-title"><strong>Display All Records ?</strong></h2>
                  </div>
                  <div class="panel-body">
                     You Can See All Members Details !!<br/><br/>
                     <a href="read.php"><button class="btn btn-info">Display All Member Details</button></a>
                  </div>
               </div>
            </center>
            </div>
            <!-- /Panel for Display All Records  -->
         <!--Student records-->

         <div class="col-md-6">
            <center>
             <div class="panel panel-info1">
                  <div style="background-color: red;" class="panel-heading">
                     <h2 class="panel-title" style="color: white;"><strong>Student Progress</strong></h2>
                  </div>
                 <div class="panel-body">
                     Progress graph of the student<br/><br/>
                     <a href="http://tsec.sammeyinc.com/smps/index.html"> <button class="btn btn-info" style="background-color: red;" >Display Student Progress</button></a>
                  </div>
                 </div>
                 </center>             
            </div>



         </div>
         <!-- /.row  -->
         <div class="copyright clearfix">
            <p><a href="https://github.com/rob88/School-Management-System" target="_blank"></a></p>
         </div>
      </div>
      <!-- /.container> -->
   </body>
</html>