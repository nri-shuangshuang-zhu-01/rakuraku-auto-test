set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-08/MBSCR10020/jacoco.exec,append=true -jar "D:\GIT_workspace\billing-service\billing-batch\build\libs\billing-batch-1.0.0-SNAPSHOT.jar"  "incomingPaymentUnmatchSapCcyChangeJob" "--subsidiary-code=MJP" "--job-net-id=100" "--job-execution-id=100" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-08/MBSCR10020/case_015/case_015_004.log 2>&1