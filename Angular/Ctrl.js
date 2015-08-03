app.controller("Ctrl", function($scope ,$http)
 {
 	$scope.clientKey = 'aS5FtNNINJW3b9KRh18Cfxa8uudxDp7OidtL0huO0qRbAC2SEbuTJF2d9gKMFSAX';
    $scope.zip ='0';
    $scope.state = '';
    $scope.city='';
    $scope.message='';
    $http.get("http://0.0.0.0:8080/Documents/file.json")
    .success(function(data) 
     {
        $scope.$watch('zip',function(){
        	for(var i=0;i<data.zip_codes.length;i++)
        	{

        		if( data.zip_codes[i].zip_code===$scope.zip)
        		{
                                $scope.message='';
        			$scope.state=data.zip_codes[i].state;
        			$scope.city=data.zip_codes[i].city;
        		}
        		if($scope.zip.length===6)
        		{
        			$scope.message="enter valid zip";
                    		$scope.state='';
                    		$scope.city='';
        		}
                	if($scope.zip.length<5)
                	{
                    	$scope.message="";
                    	$scope.state='';
                    	$scope.city='';
                	}
        	}
        });
        
    }).error(function(data){alert("error occured")});
    
});
