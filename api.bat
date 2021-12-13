set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:/pleiades/workspace/rakuraku-core/src/test/resources/selenium-2/lib/org.jacoco.agent-0.8.5-runtime.jar=includes=*,output=tcpserver,address=0.0.0.0,port=8395,append=true -jar D:\pleiades\workspace\shipment-control-service\shipment-control-rest-api\build\libs\shipment-control-rest-api-1.0.0-SNAPSHOT.jar