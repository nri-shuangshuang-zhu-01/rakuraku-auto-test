set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-19/MBLSCVH200/jacoco.exec,append=true -jar "E:\Works\shipment\shipment-control-batch\build\libs\shipment-control-batch-1.0.0-SNAPSHOT.jar"  "createReceivedNotShippedMtoJob" "--job-execution-id=JOB001" "--job-net-id=100" "--operation-date=20211201" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-19/MBLSCVH200/case_049/case_049_005.log 2>&1