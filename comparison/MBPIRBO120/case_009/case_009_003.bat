set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-18/MBPIRBO120/jacoco.exec,append=true -jar "D:\replenish-stock-service\replenish-stock-batch\build\libs\replenish-stock-batch-1.0.0-SNAPSHOT.jar"  "weeklyMonthlyPoolDateLogicPlantReplaceJob" "--operation-date=20210101" "--subsidiary-code=TIW" "--job-net-id=54321" "--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-18/MBPIRBO120/case_009/case_009_004.log 2>&1