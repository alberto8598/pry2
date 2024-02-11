FROM tomcat:latest
VOLUME /tmp
COPY src/main/build/libs/*.jar united.jar
ENV JAVA_OPTS=" -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar united.jar --server.port=8092" ]