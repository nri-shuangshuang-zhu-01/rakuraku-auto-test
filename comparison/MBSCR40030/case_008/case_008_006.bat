set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-22/MBSCR40030/jacoco.exec,append=true -jar "D:\git_workspace\credit-management-service\credit-management-batch\build\libs\credit-management-batch-1.0.0-SNAPSHOT.jar"  "creditManagementDateProcessJob" "--job-net-id=<jobNetId>" "--job-execution-id=<creditManagementDateProcessJob>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-22/MBSCR40030/case_008/case_008_007.log 2>&1