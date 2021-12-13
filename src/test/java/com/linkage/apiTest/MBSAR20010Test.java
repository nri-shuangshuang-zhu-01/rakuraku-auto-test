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
public class MBSAR20010Test {

  @BeforeAll
  public static void initialize() throws Exception {
    RakurakuCore.initialize("dbunit", "MBSAR20010");
  }

  @BeforeEach
  public void setUp() throws Exception {
    RakurakuCore.setUp("dbunit", "MBSAR20010");
  }

  @AfterEach
  public void tearDown() throws Exception {
    RakurakuCore.tearDown();
  }

  @AfterAll
  public static void release() throws Exception {
    RakurakuCore.release("1+++++internal/v1/ccy/search;;通貨マスタAPI;;1");
  }

  @Test
  @Tag("一件確認")
  @DisplayName("一件確認")
  public void testMBSAR20010_001() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_001/case_001_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "1");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(apiMock) → internal/v1/ccy/search → 通貨マスタAPI */
    rakurakuCore.operateMockApi("internal/v1/ccy/search", "通貨マスタAPI", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_002() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_002/case_002_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "2");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_003() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_003/case_003_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "1");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_004() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_004/case_004_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "1");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_005() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_005/case_005_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "5");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_006() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_006/case_006_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "6");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "6");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_007() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_007/case_007_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "7");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "7");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_008() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_008/case_008_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "8");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "8");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_009() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_009/case_009_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "9");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "9");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_010() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_010/case_010_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "10");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "10");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_011() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_011/case_011_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "11");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "11");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_012() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_012/case_012_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "12");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "12");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=JPN,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_013() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_013/case_013_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "13");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "13");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_014() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_014/case_014_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "14");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_015() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_015/case_015_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "15");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "15");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_016() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_016/case_016_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "16");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "16");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_017() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_017/case_017_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "17");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "17");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_018() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_018/case_018_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "18");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "18");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_019() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_019/case_019_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "19");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "19");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_020() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_020/case_020_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "20");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "20");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_021() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_021/case_021_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "21");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "21");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_022() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_022/case_022_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "22");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "22");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_023() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_023/case_023_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "23");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "23");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_024() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_024/case_024_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "24");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "24");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_025() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_025/case_025_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "25");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "25");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_026() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_026/case_026_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "26");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "26");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_027() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_027/case_027_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "27");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "27");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_028() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_028/case_028_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "28");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "28");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_029() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_029/case_029_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "29");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "29");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_030() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_030/case_030_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "30");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "30");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_031() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_031/case_031_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "31");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "31");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_032() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_032/case_032_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "32");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "32");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_033() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_033/case_033_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "33");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "33");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_034() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_034/case_034_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "34");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "34");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_035() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_035/case_035_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "35");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "35");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_036() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_036/case_036_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "36");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "36");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_037() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_037/case_037_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "37");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "37");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_038() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_038/case_038_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "38");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "38");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_039() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_039/case_039_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "39");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "39");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_040() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_040/case_040_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "40");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "40");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_041() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_041/case_041_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "41");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "41");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_042() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_042/case_042_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "42");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_043() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_043/case_043_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "43");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "43");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_044() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_044/case_044_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "44");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "44");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_045() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_045/case_045_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "45");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "45");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_046() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_046/case_046_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "46");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "46");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR20010_047() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20010/case_047/case_047_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → T_AR → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_AR_HISTORY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_AR_HISTORY", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "47");

    /* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_SALES → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_SALES", "データクリア・挿入", "47");

    /* 操作(DB準備) → PRODUCED_EVENTS_2 → DELETE_ALL */
    rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "DELETE_ALL", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "NPMJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

    /* 操作(DB確認) → T_AR → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_AR_HISTORY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_AR_HISTORY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_SALES → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_SALES", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

  }

}
