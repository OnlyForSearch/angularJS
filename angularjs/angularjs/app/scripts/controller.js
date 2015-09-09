/**
 * Created by Administrator on 2015/9/8.
 */

angular.module('myApp.phone', []).controller('PhoneListCtrl', function ($scope, $http) {
    $scope.phones = [
        {
            "id": "motorola-defy-with-motoblur",
            "imageUrl": "img/phones/motorola-defy-with-motoblur.0.jpg",
            "name": "Nexus S",
            "snippet": "Fast just got faster with Nexus S."
        },
        {
            "id": "motorola-defy-with-motoblur",
            "imageUrl": "img/phones/motorola-defy-with-motoblur.0.jpg",
            "name": "Motorola XOOM™ with Wi-Fi",
            "snippet": "The Next, Next Generation tablet."
        },
        {
            "id": "motorola-defy-with-motoblur",
            "imageUrl": "img/phones/motorola-defy-with-motoblur.0.jpg",
            "name": "MOTOROLA XOOM™",
            "snippet": "The Next, Next Generation tablet."
        }
    ];
/*    $http.get('phones/phones.json').success(function (data) {
        $scope.phones = data;
    });

    $scope.orderProp = 'age';*/
});


//angular.module('myApp2', []).controller('PhoneDetailCtrl', function ($scope, $routeParams) {
//    $scope.phoneId = $routeParams.phoneId;
//});


/*
angular.module('myApp2', []).controller('customersCtrl', function ($scope) {
    $http.get("http://www.runoob.com/try/angularjs/data/Customers_JSON.php")
        .success(function (response) {
            $scope.names = response.records;
        });
});
*/


var app = angular.module('myApp2', []);
app.controller('customersCtrl', function ($scope, $http) {
    $http.get("http://www.runoob.com/try/angularjs/data/Customers_JSON.php")
        .success(function (response) {
            $scope.names = response.records;
        });
});
