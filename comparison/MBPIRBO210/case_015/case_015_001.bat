set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-28/MBPIRBO210/jacoco.exec,append=true -jar "D:\OMK\workspace\replenish-stock-service\replenish-stock-batch\build\libs\replenish-stock-batch-1.0.0-SNAPSHOT.jar"  "repaintShipmentRecordPoolPlantJob" "--implement-div=1" "--process-type=0" "--job-execution-id=MBPIRBO210" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-28/MBPIRBO210/case_015/case_015_002.log 2>&1