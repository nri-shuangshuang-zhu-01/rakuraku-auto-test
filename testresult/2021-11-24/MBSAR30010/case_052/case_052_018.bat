set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-24/MBSAR30010/jacoco.exec,append=true -jar "E:\pleiades\workspace\billing-service-develop\billing-batch\build\libs\billing-batch-1.0.0-SNAPSHOT.jar"  "deadStockToolCreateJob" "--job-execution-id=12345" "--operation-date=20210825" "--subsidiary-code=CHN" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-11-24/MBSAR30010/case_052/case_052_019.log 2>&1