set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-07/MBLSCSM100/jacoco.exec,append=true -jar "D:\pleiades\workspace\shipment-control-service\shipment-control-batch\build\libs\shipment-control-batch-1.0.0-SNAPSHOT.jar"  "cumulativeShipmentJob" "--job-execution-id=JOB001" "--subsidiary-code=CHN" "--operation-date=20210101" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-07/MBLSCSM100/case_102/case_102_010.log 2>&1