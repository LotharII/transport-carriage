angular.module('customer').controller('CustomerCtrl', [ '$scope', 'CustomerService',
    function($scope, CustomerService) {
        $scope.getUser = function(email) {
            if(!email)
                return;
            CustomerService.getUserByEmail(email);
        };

        $scope.saveUser = function(user) {
            if(!user)
                return;
            CustomerService.saveUser(user);
        }
    }
]);