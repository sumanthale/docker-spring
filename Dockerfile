FROM openjdk:8-jdk-alpine
COPY . /demo
WORKDIR /demo
RUN javac HelloWorld.java  
CMD ["java", "HelloWorld"]  
