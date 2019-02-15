# EcommerceApp
Java Spring-Boot and Angular CLI Application. 

The Angular WebPack which runs on a separate server(port:4200) is bundled up with all its assets and pushed into the 
/resources/static directory of the Spring Boot app with the help of node packages : rimraf , mkdirp and  copyfiles.

This way the whole App can be run as a single packaged Spring Boot application on port:8080,ready to be tested and deployed.


A simple Shopping App with a Cart to add, delete, update items and display the final billing amount.

After checkout final order is displayed on the order page.
