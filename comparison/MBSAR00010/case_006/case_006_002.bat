set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-28/MBSAR00010/jacoco.exec,append=true -jar "D:\git\billing-service\billing-batch\build\libs\billing-batch-1.0.0-SNAPSHOT.jar"  "deleteReprintDataJob" "--job-execution-id=12350" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-28/MBSAR00010/case_006/case_006_003.log 2>&1