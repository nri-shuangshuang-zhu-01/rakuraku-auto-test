set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-29/MBPIRBO200/jacoco.exec,append=true -jar "D:\OMK\workspace\replenish-stock-service\replenish-stock-batch\build\libs\replenish-stock-batch-1.0.0-SNAPSHOT.jar"  "deleteWeeklyReorderPointDemandForecastDataJob" "--subsidiary-code=TIW" "--job-net-id=12345" "--job-execution-id=12345" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-09-29/MBPIRBO200/case_004/case_004_003.log 2>&1