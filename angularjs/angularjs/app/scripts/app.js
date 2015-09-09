/**
 * Created by Administrator on 2015/9/8.
 * AngularJS中应用的路由通过$routeProvider来声明，它是$route服务的提供者。这项服务使得控制器、视图模板与当前浏览器的URL可以轻易集成。
 对于$route服务来说，$routeProvider对外提供了API接口，通过API接口允许你为你的应用定义路由规则。
 */
angular.module('phonecat', []).
    config(['$routeProvider', function ($routeProvider) {/*我们请求把$routeProvider注入到我们的配置函数并且使用$routeProvider.whenAPI来定义我们的路由规则。*/
        $routeProvider.
            when('/phones', {templateUrl: 'partials/phone-list.html', controller: PhoneListCtrl}).
            when('/phones/:phoneId', {templateUrl: 'partials/phone-detail.html', controller: PhoneDetailCtrl}).
            otherwise({redirectTo: '/phones'});
    }]);