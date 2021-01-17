FROM openJdk:8
EXPOSE 8080
ADD target/myApp-app2.war myApp-app2.war
ENTRYPOINT ["java","-jar","/myApp2.war"]
