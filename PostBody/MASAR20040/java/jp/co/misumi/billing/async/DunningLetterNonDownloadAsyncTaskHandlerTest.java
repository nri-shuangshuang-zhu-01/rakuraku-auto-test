package jp.co.misumi.billing.async;

import jp.co.misumi.billing.model.task.IssueDunningLetterNonDownloadTaskV1Format;
import jp.co.misumi.billing.model.task.TaskDataListV1;
import jp.co.misumi.fw.async.api.common.task.MultiVersionTask;
import jp.co.misumi.fw.async.api.common.task.TaskHeaderConstants;
import jp.co.misumi.fw.async.api.consumer.testing.consumer.MockAsyncConsumer;
import jp.co.misumi.fw.common.security.auth.misumi.domain.value.AuthUserType;
import jp.co.misumi.fw.common.testing.MisumiFwCommonTestingConfiguration;
import jp.co.misumi.fw.common.testing.log.MemoryLogAppender;
import jp.co.misumi.fw.core.versioning.VersionedValue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * MockTaskで非同期タスクを起動してタスクHandlerをテストします
 *
 * @author LKG曹
 * @since 1.0.0
 */
@DisplayName("dunningLetterNonDownloadAsyncTaskHandler 一気通貫テスト")
@SpringBootTest
@Import(
    value = {
        AsyncConsumerTestConfiguration.class,
        DataSourceAutoConfiguration.class,
        MisumiFwCommonTestingConfiguration.class
    })
public class DunningLetterNonDownloadAsyncTaskHandlerTest {
  @Autowired
  private MockAsyncConsumer mockAsyncConsumer;
  @Autowired
  private DataSource dataSource;
  private MemoryLogAppender logCompareAppender = new MemoryLogAppender();
  private String idempotencyKey;

  @BeforeEach
  protected void testBefore() throws Exception {
    // 冪等キー
    idempotencyKey = "4a037a9e-2500-4724-a005-998a1ab13a46-002";
  }

  @AfterEach
  protected void testAfter() throws Exception {
    logCompareAppender.stop();
  }

  @Test
  @DisplayName("DunningLetterNonDownload 正常系：正常終了ログを検証")
  public void case001() throws Exception {

    // 変更前の検証ポイント設定
    //Changes changes = new Changes(dataSource);
    //changes.setStartPointNow();

    // タスク設定
    final IssueDunningLetterNonDownloadTaskV1Format taskDataCondition = new IssueDunningLetterNonDownloadTaskV1Format();
    List<TaskDataListV1> taskDataList = new ArrayList<>();
    // Data SET In This
    //No.1
//    createNo_3Data(taskDataList);
//  No.015
    createLists_NEW_20210924(taskDataList);
//    No.2
//    createLists(taskDataList);
    //    No.3
//    createNo_3Data(taskDataList);
//    No.4
//    createNo_4Data(taskDataList);
    //No.5
   // createNo_5Data(taskDataList);

    //No.6
//    createNo_12Data(taskDataList);

    taskDataCondition.setTaskDataList(taskDataList);
    mockAsyncConsumer.perform(
        new MultiVersionTask(List.of(VersionedValue.of("v1", taskDataCondition))),
        Map.of(
            TaskHeaderConstants.IDEMPOTENCY_KEY,
            idempotencyKey,
            TaskHeaderConstants.TASK_TYPE,
            "issue-dunning-letter-without-download",
            TaskHeaderConstants.AUTH_USER_TYPE,
            AuthUserType.CUSTOMER.getValue(),
            TaskHeaderConstants.AUTH_ID,
            "GUEST",
            TaskHeaderConstants.IDEMPOTENCY_KEY_TARGET_ID,
            "GUEST",
            TaskHeaderConstants.OPERATOR_ID,
            "GUEST",
            TaskHeaderConstants.OPERATOR_TYPE,
            AuthUserType.CUSTOMER.getValue(),
            TaskHeaderConstants.CLIENT_PROGRAM,
            "test"));
  }

  public static void createNo_1Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    // 現法コード
    taskData.setSubsidiaryCode("JPN");

    //遅延日数
    taskData.setDelayDays("1");

    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createNo_3Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createNo_4Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("6");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createNo_5Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createNo_6Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData1 = new TaskDataListV1();
    // 現法コード
    taskData1.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData1.setBillToCode("1");
    // 督促レベル
    taskData1.setLevel("6");
    //遅延日数
    taskData1.setDelayDays("1");
    //インボイス番号
    taskData1.setInvoiceNumber("2");
    //ログインユーザ
    taskData1.setLoginUser("wangcl");
    //インボイス日付
    taskData1.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData1);
  }

  public static void createNo_7Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_8Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_9Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_10Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_11Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_12Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_13Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_14Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 現法コード
    taskData.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //遅延日数
    taskData.setDelayDays("1");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);
  }

  public static void createNo_16Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    // 現法コード
    taskData.setSubsidiaryCode("JPN");

    //遅延日数
    taskData.setDelayDays("1");

    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createNo_17Data( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData = new TaskDataListV1();
    // 売掛先コード
    taskData.setBillToCode("1");
    // 督促レベル
    taskData.setLevel("4");
    //インボイス番号
    taskData.setInvoiceNumber("2");
    // 現法コード
    taskData.setSubsidiaryCode("JPN");

    //遅延日数
    taskData.setDelayDays("1");

    //ログインユーザ
    taskData.setLoginUser("wangcl");
    //インボイス日付
    taskData.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    taskDataList.add(taskData);

  }

  public static void createLists( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData1 = new TaskDataListV1();
    // 現法コード
    taskData1.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData1.setBillToCode("4");
    // 督促レベル
    taskData1.setLevel("6");
    //遅延日数
    taskData1.setDelayDays("5");
    //インボイス番号
    taskData1.setInvoiceNumber("2");
    //ログインユーザ
    taskData1.setLoginUser("wangcl");
    //インボイス日付
    taskData1.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    TaskDataListV1 taskData2 = new TaskDataListV1();
    // 現法コード
    taskData2.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData2.setBillToCode("6");
    // 督促レベル
    taskData2.setLevel("5");
    //遅延日数
    taskData2.setDelayDays("3");
    //インボイス番号
    taskData2.setInvoiceNumber("1");
    //ログインユーザ
    taskData2.setLoginUser("wangcl");
    //インボイス日付
    taskData2.setInvoiceIssueDate(LocalDate.parse("2021-01-06"));


    TaskDataListV1 taskData3 = new TaskDataListV1();
    // 現法コード
    taskData3.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData3.setBillToCode("5");
    // 督促レベル
    taskData3.setLevel("4");
    //遅延日数
    taskData3.setDelayDays("1");
    //インボイス番号
    taskData3.setInvoiceNumber("3");
    //ログインユーザ
    taskData3.setLoginUser("wangcl");
    //インボイス日付
    taskData3.setInvoiceIssueDate(LocalDate.parse("2021-01-01"));

    TaskDataListV1 taskData4 = new TaskDataListV1();
    // 現法コード
    taskData4.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData4.setBillToCode("2");
    // 督促レベル
    taskData4.setLevel("3");
    //遅延日数
    taskData4.setDelayDays("4");
    //インボイス番号
    taskData4.setInvoiceNumber("4");
    //ログインユーザ
    taskData4.setLoginUser("wangcl");
    //インボイス日付
    taskData4.setInvoiceIssueDate(LocalDate.parse("2021-01-02"));

    TaskDataListV1 taskData5 = new TaskDataListV1();
    // 現法コード
    taskData5.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData5.setBillToCode("1");
    // 督促レベル
    taskData5.setLevel("2");
    //遅延日数
    taskData5.setDelayDays("2");
    //インボイス番号
    taskData5.setInvoiceNumber("5");
    //ログインユーザ
    taskData5.setLoginUser("wangcl");
    //インボイス日付
    taskData5.setInvoiceIssueDate(LocalDate.parse("2021-01-03"));

    TaskDataListV1 taskData6 = new TaskDataListV1();
    // 現法コード
    taskData6.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData6.setBillToCode("3");
    // 督促レベル
    taskData6.setLevel("1");
    //遅延日数
    taskData6.setDelayDays("6");
    //インボイス番号
    taskData6.setInvoiceNumber("6");
    //ログインユーザ
    taskData6.setLoginUser("wangcl");
    //インボイス日付
    taskData6.setInvoiceIssueDate(LocalDate.parse("2021-01-04"));

    taskDataList.add(taskData1);
    taskDataList.add(taskData2);
    taskDataList.add(taskData3);
    taskDataList.add(taskData4);
    taskDataList.add(taskData5);
    taskDataList.add(taskData6);
  }

  public static void createLists_NEW_20210924( List<TaskDataListV1> taskDataList){
    TaskDataListV1 taskData1 = new TaskDataListV1();
    // 現法コード
    taskData1.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData1.setBillToCode("1");
    // 督促レベル
    taskData1.setLevel("2");
    //遅延日数
    taskData1.setDelayDays("3");
    //インボイス番号
    taskData1.setInvoiceNumber("1");
    //ログインユーザ
    taskData1.setLoginUser("wangcl");
    //インボイス日付
    taskData1.setInvoiceIssueDate(LocalDate.parse("2021-01-14"));


    TaskDataListV1 taskData2 = new TaskDataListV1();
    // 現法コード
    taskData2.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData2.setBillToCode("1");
    // 督促レベル
    taskData2.setLevel("2");
    //遅延日数
    taskData2.setDelayDays("2");
    //インボイス番号
    taskData2.setInvoiceNumber("2");
    //ログインユーザ
    taskData2.setLoginUser("wangcl");
    //インボイス日付
    taskData2.setInvoiceIssueDate(LocalDate.parse("2021-01-15"));

    TaskDataListV1 taskData3 = new TaskDataListV1();
    // 現法コード
    taskData3.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData3.setBillToCode("1");
    // 督促レベル
    taskData3.setLevel("2");
    //遅延日数
    taskData3.setDelayDays("4");
    //インボイス番号
    taskData3.setInvoiceNumber("4");
    //ログインユーザ
    taskData3.setLoginUser("wangcl");
    //インボイス日付
    taskData3.setInvoiceIssueDate(LocalDate.parse("2021-01-16"));


    TaskDataListV1 taskData4 = new TaskDataListV1();
    // 現法コード
    taskData4.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData4.setBillToCode("1");
    // 督促レベル
    taskData4.setLevel("2");
    //遅延日数
    taskData4.setDelayDays("3");
    //インボイス番号
    taskData4.setInvoiceNumber("3");
    //ログインユーザ
    taskData4.setLoginUser("wangcl");
    //インボイス日付
    taskData4.setInvoiceIssueDate(LocalDate.parse("2021-01-15"));

    TaskDataListV1 taskData5 = new TaskDataListV1();
    // 現法コード
    taskData5.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData5.setBillToCode("1");
    // 督促レベル
    taskData5.setLevel("2");
    //遅延日数
    taskData5.setDelayDays("3");
    //インボイス番号
    taskData5.setInvoiceNumber("3");
    //ログインユーザ
    taskData5.setLoginUser("wangcl");
    //インボイス日付
    taskData5.setInvoiceIssueDate(LocalDate.parse("2021-01-14"));

    TaskDataListV1 taskData6 = new TaskDataListV1();
    // 現法コード
    taskData6.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData6.setBillToCode("1");
    // 督促レベル
    taskData6.setLevel("2");
    //遅延日数
    taskData6.setDelayDays("3");
    //インボイス番号
    taskData6.setInvoiceNumber("3");
    //ログインユーザ
    taskData6.setLoginUser("wangcl");
    //インボイス日付
    taskData6.setInvoiceIssueDate(LocalDate.parse("2021-01-11"));

    TaskDataListV1 taskData7 = new TaskDataListV1();
    // 現法コード
    taskData7.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData7.setBillToCode("1");
    // 督促レベル
    taskData7.setLevel("2");
    //遅延日数
    taskData7.setDelayDays("3");
    //インボイス番号
    taskData7.setInvoiceNumber("3");
    //ログインユーザ
    taskData7.setLoginUser("wangcl");
    //インボイス日付
    taskData7.setInvoiceIssueDate(LocalDate.parse("2021-01-12"));

    TaskDataListV1 taskData8 = new TaskDataListV1();
    // 現法コード
    taskData8.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData8.setBillToCode("1");
    // 督促レベル
    taskData8.setLevel("2");
    //遅延日数
    taskData8.setDelayDays("4");
    //インボイス番号
    taskData8.setInvoiceNumber("3");
    //ログインユーザ
    taskData8.setLoginUser("wangcl");
    //インボイス日付
    taskData8.setInvoiceIssueDate(LocalDate.parse("2021-01-13"));

    TaskDataListV1 taskData9 = new TaskDataListV1();
    // 現法コード
    taskData9.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData9.setBillToCode("1");
    // 督促レベル
    taskData9.setLevel("1");
    //遅延日数
    taskData9.setDelayDays("3");
    //インボイス番号
    taskData9.setInvoiceNumber("3");
    //ログインユーザ
    taskData9.setLoginUser("wangcl");
    //インボイス日付
    taskData9.setInvoiceIssueDate(LocalDate.parse("2021-01-01"));

    TaskDataListV1 taskData10 = new TaskDataListV1();
    // 現法コード
    taskData10.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData10.setBillToCode("1");
    // 督促レベル
    taskData10.setLevel("2");
    //遅延日数
    taskData10.setDelayDays("1");
    //インボイス番号
    taskData10.setInvoiceNumber("3");
    //ログインユーザ
    taskData10.setLoginUser("wangcl");
    //インボイス日付
    taskData10.setInvoiceIssueDate(LocalDate.parse("2021-01-06"));

    TaskDataListV1 taskData11 = new TaskDataListV1();
    // 現法コード
    taskData11.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData11.setBillToCode("1");
    // 督促レベル
    taskData11.setLevel("3");
    //遅延日数
    taskData11.setDelayDays("2");
    //インボイス番号
    taskData11.setInvoiceNumber("3");
    //ログインユーザ
    taskData11.setLoginUser("wangcl");
    //インボイス日付
    taskData11.setInvoiceIssueDate(LocalDate.parse("2021-01-05"));

    TaskDataListV1 taskData12 = new TaskDataListV1();
    // 現法コード
    taskData12.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData12.setBillToCode("2");
    // 督促レベル
    taskData12.setLevel("2");
    //遅延日数
    taskData12.setDelayDays("2");
    //インボイス番号
    taskData12.setInvoiceNumber("2");
    //ログインユーザ
    taskData12.setLoginUser("wangcl");
    //インボイス日付
    taskData12.setInvoiceIssueDate(LocalDate.parse("2021-01-02"));

    TaskDataListV1 taskData13 = new TaskDataListV1();
    // 現法コード
    taskData13.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData13.setBillToCode("2");
    // 督促レベル
    taskData13.setLevel("1");
    //遅延日数
    taskData13.setDelayDays("3");
    //インボイス番号
    taskData13.setInvoiceNumber("2");
    //ログインユーザ
    taskData13.setLoginUser("wangcl");
    //インボイス日付
    taskData13.setInvoiceIssueDate(LocalDate.parse("2021-01-01"));

    TaskDataListV1 taskData14 = new TaskDataListV1();
    // 現法コード
    taskData14.setSubsidiaryCode("JPN");
    // 売掛先コード
    taskData14.setBillToCode("2");
    // 督促レベル
    taskData14.setLevel("3");
    //遅延日数
    taskData14.setDelayDays("3");
    //インボイス番号
    taskData14.setInvoiceNumber("2");
    //ログインユーザ
    taskData14.setLoginUser("wangcl");
    //インボイス日付
    taskData14.setInvoiceIssueDate(LocalDate.parse("2021-01-03"));

    taskDataList.add(taskData1);taskDataList.add(taskData2);
    taskDataList.add(taskData3);taskDataList.add(taskData4);
    taskDataList.add(taskData5);taskDataList.add(taskData6);
    taskDataList.add(taskData7);taskDataList.add(taskData8);
    taskDataList.add(taskData9);taskDataList.add(taskData10);
    taskDataList.add(taskData11);taskDataList.add(taskData12);
    taskDataList.add(taskData13);taskDataList.add(taskData14);
  }
}
