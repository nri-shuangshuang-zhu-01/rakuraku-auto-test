set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-29/MBSCR40020/jacoco.exec,append=true -jar "D:\git_workplace\credit-management-service\credit-management-batch\build\libs\credit-management-batch-1.0.0-SNAPSHOT.jar"  "soBalanceSummaryJob" "--operation-date=20210709" "--subsidiary-code=MJP" "--job-net-id=100" "--job-execution-id=<jobExecutionId>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-29/MBSCR40020/case_002/case_002_005.log 2>&1