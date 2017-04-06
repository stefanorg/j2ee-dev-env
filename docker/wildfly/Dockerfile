FROM jboss/wildfly

# add mysql connector to lib dir
ADD lib/mysql-connector-java-5.1.41.jar /opt/jboss/wildfly/standalone/lib/mysql-connector-java-5.1.41.jar

# customize bootstrap
ADD customization/standalone.conf /opt/jboss/wildfly/bin/standalone.conf

# add mysql module
ADD customization/module.xml /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/module.xml
ADD lib/mysql-connector-java-5.1.41.jar /opt/jboss/wildfly/modules/system/layers/base/com/mysql/main/mysql-connector-java-5.1.41.jar

# custom server configuration
ADD customization/standalone.xml /opt/jboss/wildfly/standalone/configuration/standalone.xml

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
#CMD ["/opt/jboss/wildfly/customization/execute.sh"]