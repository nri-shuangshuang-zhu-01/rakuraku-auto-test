set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-10/MBSAR20020/jacoco.exec,append=true -jar "E:\pleiades\workspace\billing-service\billing-batch\build\libs\billing-batch-1.0.0-SNAPSHOT.jar"  "reconciliationNonPaymentManagementJob" "--job-execution-id=12345" "--operation-date=20190720" "--subsidiary-code=MSR" "--job-net-id=100" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-10/MBSAR20020/case_006/case_006_004.log 2>&1