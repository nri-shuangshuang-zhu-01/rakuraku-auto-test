set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-26/MBSCR40040/jacoco.exec,append=true -jar "D:\GIT_workspace\credit-management-service\credit-management-batch\build\libs\credit-management-batch-1.0.0-SNAPSHOT.jar"  "incomingPaymentUnmatchSapCcyChangeJob" "--subsidiary-code=MJP" "--job-execution-id=<jobExecutionId>" "--job-net-id=<jobNetId>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-26/MBSCR40040/case_006/case_006_004.log 2>&1