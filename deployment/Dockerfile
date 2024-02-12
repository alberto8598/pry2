FROM amazoncorretto:17-alpine
WORKDIR /app
VOLUME /tmp
ENV IMG_PATH=/img
RUN mkdir -p /img
ADD out/artifacts/untitled_jar app.jar

# Copia el archivo JAR de tu aplicación al contenedor
#COPY ./out/artifacts/untitled_jar/untitled.jar app.jar

# Define el comando para ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "app.jar"]