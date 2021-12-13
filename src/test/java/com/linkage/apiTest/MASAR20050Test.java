package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("Example機能確認")
@DisplayName("Example機能確認")
public class MASAR20050Test {

  @BeforeAll
  public static void initialize() throws Exception {
    RakurakuCore.initialize("dbunit", "MASAR20050");
  }

  @BeforeEach
  public void setUp() throws Exception {
    RakurakuCore.setUp("dbunit", "MASAR20050");
  }

  @AfterEach
  public void tearDown() throws Exception {
    RakurakuCore.tearDown();
  }

  @AfterAll
  public static void release() throws Exception {
    RakurakuCore.release(
        "1+++++internal/v1/ccy/search;;通貨情報取得API;;1*****2+++++internal/v1/ccy/search;;通貨情報取得API;;1*****3+++++internal/v1/ccy/search;;通貨情報取得API;;1*****4+++++internal/v1/ccy/search;;通貨情報取得API;;1*****5+++++internal/v1/ccy/search;;通貨情報取得API;;1*****6+++++internal/v1/ccy/search;;通貨情報取得API;;1*****7+++++internal/v1/ccy/search;;通貨情報取得API;;1*****8+++++internal/v1/ccy/search;;通貨情報取得API;;1*****9+++++internal/v1/ccy/search;;通貨情報取得API;;1*****10+++++internal/v1/ccy/search;;通貨情報取得API;;1*****11+++++internal/v1/ccy/search;;通貨情報取得API;;1*****12+++++internal/v1/ccy/search;;通貨情報取得API;;1*****13+++++internal/v1/ccy/search;;通貨情報取得API;;1*****14+++++internal/v1/ccy/search;;通貨情報取得API;;1*****15+++++internal/v1/ccy/search;;通貨情報取得API;;1*****16+++++internal/v1/ccy/search;;通貨情報取得API;;1*****17+++++internal/v1/ccy/search;;通貨情報取得API;;1*****18+++++internal/v1/ccy/search;;通貨情報取得API;;1*****19+++++internal/v1/ccy/search;;通貨情報取得API;;1*****20+++++internal/v1/ccy/search;;通貨情報取得API;;1*****21+++++internal/v1/ccy/search;;通貨情報取得API;;1*****22+++++internal/v1/ccy/search;;通貨情報取得API;;1*****23+++++internal/v1/ccy/search;;通貨情報取得API;;1*****24+++++internal/v1/ccy/search;;通貨情報取得API;;1*****25+++++internal/v1/ccy/search;;通貨情報取得API;;1*****26+++++internal/v1/ccy/search;;通貨情報取得API;;1*****27+++++internal/v1/ccy/search;;通貨情報取得API;;1*****28+++++internal/v1/ccy/search;;通貨情報取得API;;1*****29+++++internal/v1/ccy/search;;通貨情報取得API;;1*****30+++++internal/v1/ccy/search;;通貨情報取得API;;1*****31+++++internal/v1/ccy/search;;通貨情報取得API;;1*****32+++++internal/v1/ccy/search;;通貨情報取得API;;1*****33+++++internal/v1/ccy/search;;通貨情報取得API;;1*****34+++++internal/v1/ccy/search;;通貨情報取得API;;1*****35+++++internal/v1/ccy/search;;通貨情報取得API;;1*****36+++++internal/v1/ccy/search;;通貨情報取得API;;1*****37+++++internal/v1/ccy/search;;通貨情報取得API;;1*****38+++++internal/v1/ccy/search;;通貨情報取得API;;1*****39+++++internal/v1/ccy/search;;通貨情報取得API;;1*****40+++++internal/v1/ccy/search;;通貨情報取得API;;1*****41+++++internal/v1/ccy/search;;通貨情報取得API;;2*****42+++++internal/v1/ccy/search;;通貨情報取得API;;1");
  }

  @Test
  @Tag("一件確認")
  @DisplayName("一件確認")
  public void testMASAR20050_001() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_001/case_001_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMASAR20050_002() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_002/case_002_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_003() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_003/case_003_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_004() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_004/case_004_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_005() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_005/case_005_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_006() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_006/case_006_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_007() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_007/case_007_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_008() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_008/case_008_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_009() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_009/case_009_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_010() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_010/case_010_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_011() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_011/case_011_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_012() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_012/case_012_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_013() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_013/case_013_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_014() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_014/case_014_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_015() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_015/case_015_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_016() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_016/case_016_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_017() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_017/case_017_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_018() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_018/case_018_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_019() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_019/case_019_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_020() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_020/case_020_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_021() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_021/case_021_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_022() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_022/case_022_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_023() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_023/case_023_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_024() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_024/case_024_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_025() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_025/case_025_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_026() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_026/case_026_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_027() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_027/case_027_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_028() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_028/case_028_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_029() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_029/case_029_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_030() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_030/case_030_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_031() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_031/case_031_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_032() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_032/case_032_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_033() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_033/case_033_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_034() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_034/case_034_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_035() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_035/case_035_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_036() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_036/case_036_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_037() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_037/case_037_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_038() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_038/case_038_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_039() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_039/case_039_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_040() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_040/case_040_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_041() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_041/case_041_", "");// ケース番号の設定

    // ここから自動化打鍵開始
  }

  @Test
  public void testMASAR20050_042() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050/case_042/case_042_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "42");

    /* 操作(apiMock) → internal/v1/ccy/search → 通貨情報取得API */
    rakurakuCore.operateMockApi("internal/v1/ccy/search", "通貨情報取得API", "1");

    /* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
    rakurakuCore.operateApi("登录",
        "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=123456&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=016&invoiceStatus=Open",
        "GET",
        "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46",
        "UserLoginInfo", "-");

  }

}
