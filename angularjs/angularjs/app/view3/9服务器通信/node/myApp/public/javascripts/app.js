/*2在public/javacscripts/app.js文件中，我们在myApp Angular模块的顶部添加一个控制器：*/
/*2在这个标准的Angular模板中，并未加载任何出格的东西。我们加载了基础的Angular库，以
 及ngRoute和自定义的应用代码。
 我们的应用代码也是标准的。 scripts/app.js文件简单地定义了一个带有单个路由/的Angular模块：*/
angular.module('myApp', [
  'ngRoute',
  'myApp.services'
])
.controller('HomeController', function($scope, HitService) {
  HitService.count().then(function(data) {
    $scope.hits = data;
  })

  $scope.registerHit = function() {
    HitService.registerHit().then(function(data) {
      $scope.hits = data;
    })
  }
});
