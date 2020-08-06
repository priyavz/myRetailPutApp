# myRetailPutApp

This is a spring boot microservice that takes care of PUT requests. Dockerizing this can enable us to scale this service separately.

Launch the application by Starting the MyRetailPutServiceApplication.java or by the docker command docker build -t "com/myretail". The docker configuration is mentioned in the DockerFile. This app uses common libraries from myRetailCommon repo.



TODO: 1)Implement tests. (Given some more time , this can easily be done).
  2)EnableCaching at the app server layer by using ehcache/redis so that the performance can be optimized(This too can be easily done given a bit more time).
