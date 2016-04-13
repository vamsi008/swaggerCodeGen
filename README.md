# swaggerCodeGen


###Advantages

   By generating the code using the swagger we can precisely have the data as per the documentation, and also the generated code that  has the annotations required to generate the swagger document.
     The moment we change the documentation and update the jar that will be reflected in the extended class which helps us to update and monitor the project in a better way.

Swagger not only generates the endpoints but also creates the pojo's required for the project per the documentation.

###Description
This code snippet contains the info on how to use the swagger documentation in order to generate the Rest End points.



 1. **SwaggerRest**
 2. **MyApp**



**SwaggerRest**::

SwaggerRest snippet contains the the API documentation Json written in swagger. Using the API it generates the code (Refer to the SwaagerRest pom for further ). 
Once the code is generated in the target location, we make a jar out of the project.


**MyApp**::

We add this **SwaggerRest** jar as a dependency into the **MyApp** after which we use the rest end points in order to write our own code.


As Pojos and all the required interfaces area already developed it is easy for us to develop the code based on the structure.

