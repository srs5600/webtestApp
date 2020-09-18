FROM maven:3-jdk-14 as build
COPY webtestApp/src /home/app/src
COPY webtestApp/pom.xml /home/app
RUN echo "$PWD"
RUN mvn -f /home/app/pom.xml clean package
RUN echo "$PWD"
RUN mvn install -f /home/app/pom.xml
RUN echo "$PWD"
#COPY  --from=build /home/app/target/webtestApp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

FROM tomcat:9.0.37
#WORKDIR /app
RUN echo "$PWD"
#COPY  --from=build /home/app/target/webtestApp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
COPY  --from=build /home/app/target/webtestApp.war /usr/local/tomcat/webapps/
EXPOSE 8080
