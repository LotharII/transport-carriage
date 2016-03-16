'use strict';

angular.module('customer').factory('CustomerService', function($http) {
   return {
       getUserByEmail: function(email) {
           return $http({
               method: 'GET',
               url: '' + email,
               headers: {
                   'ContentType': 'application/json',
                   'Accept': 'application/json'
               }
           });
       },
       saveUser: function(user) {
           return $http({
               method: 'POST',
               url: '',
               headers: {
                   'ContentType': 'application/json',
                   'Accept': 'application/json'
               },
               data: user
           })
       }
   }
});