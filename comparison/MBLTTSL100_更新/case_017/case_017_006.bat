set JAVA_HOME=D:\pleiades\jdk11.0.3_7
set PATH=%JAVA_HOME%;%JAVA_HOME%\bin;
java -javaagent:D:\pleiades\workspace\rakuraku-core\src\test\resources\selenium-2\lib\org.jacoco.agent-0.8.5-runtime.jar=includes=*,destfile=D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-28/MBLTTSL100/jacoco.exec,append=true -jar "D:\GIT_workspace\shipment-tracking-service\shipment-tracking-batch\build\libs\shipment-tracking-batch-1.2.2.1.jar"  "carrierInvoiceRegisterJob" "--operation-date=20210709" "--subsidiary-code=JPN" "--job-net-id=100" "--job-execution-id=<jobExecutionId>" > D:\pleiades\workspace\rakuraku-auto-test/testresult/2021-10-28/MBLTTSL100/case_017/case_017_007.log 2>&1