FROM maven:3.6.3-openjdk-17
WORKDIR /opt/app/
COPY . /opt/app/
RUN mvn package
ENTRYPOINT ["java","-jar","/opt/app/target/burgerfast.jar"]