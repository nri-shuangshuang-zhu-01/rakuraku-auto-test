set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-29/MBPIRBO140/jacoco.exec,append=true -jar "D:\OMK\workspace\replenish-stock-service\replenish-stock-batch\build\libs\replenish-stock-batch-1.0.0-SNAPSHOT.jar"  "weeklyPoolDataLogicalPlantReplaceJob" "--operation-date=20221010" "--subsidiary-code=JPN" "--job-net-id=NetId1234" "--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-29/MBPIRBO140/case_003/case_003_004.log 2>&1