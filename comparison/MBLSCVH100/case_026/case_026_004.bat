set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-02/MBLSCVH100/jacoco.exec,append=true -jar "D:\pleiades\workspace\shipment-control-service\shipment-control-batch\build\libs\shipment-control-batch-1.0.0-SNAPSHOT.jar"  "holdingListRegisterJob" "--job-execution-id=JOB001" "--user-code=999" "--subsidiary-code=JPN" "--operation-date=20210101" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-02/MBLSCVH100/case_026/case_026_005.log 2>&1