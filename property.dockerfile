FROM registry.docker-cn.com/library/java:alpine
MAINTAINER david.du
EXPOSE 8080
COPY property.jar /var/lib/shanshui/property/property.jar
CMD java -jar /var/lib/shanshui/property/property.jar --spring.profiles.active=test