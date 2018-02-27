FROM jetty
MAINTAINER Patrick Chan <patc888@gmail.com>

CMD [ "java", "-jar", "/usr/local/jetty/start.jar" ]

# Add the war file
ARG JAR_FILE
ADD target/${JAR_FILE} /var/lib/jetty/webapps/root.war

EXPOSE 8080