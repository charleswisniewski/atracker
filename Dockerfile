FROM java:8-alpine
MAINTAINER Charles Wisniewski <ch@rlesw.com>

ADD target/uberjar/atracker.jar /atracker/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/atracker/app.jar"]
