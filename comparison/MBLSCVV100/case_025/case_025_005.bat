set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-13/MBLSCVV100/jacoco.exec,append=true -jar "E:\shipment\shipment-control-batch\build\libs\shipment-control-batch-1.0.0-SNAPSHOT.jar"  "stockCountRankJudgementJob" "--operation-date=20210421" "--subsidiary-code=MJP" "--job-net-id=100" "--job-execution-id=<jobExecutionId>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-13/MBLSCVV100/case_025/case_025_006.log 2>&1