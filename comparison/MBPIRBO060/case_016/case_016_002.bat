set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-13/MBPIRBO060/jacoco.exec,append=true -jar "C:\Users\jiangdw\Documents\NEW-JIANG\replenish-stock-batch\build\libs\replenish-stock-batch-1.0.0-SNAPSHOT.jar"  "CalculateMinimumValueJob" "--operation-date=20200401" "--subsidiary-code=JPN" "--job-net-id=54321" "--job-execution-id=<CalculateMinimumValueJob>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-13/MBPIRBO060/case_016/case_016_003.log 2>&1