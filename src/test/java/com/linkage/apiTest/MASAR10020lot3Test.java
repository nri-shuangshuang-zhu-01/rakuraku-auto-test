package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR10020機能確認")
@DisplayName("MASAR10020機能確認")
public class MASAR10020lot3Test {

  @BeforeAll
  public static void initialize() throws Exception {
    RakurakuCore.initialize("dbunit", "MASAR10020lot3");
  }

  @BeforeEach
  public void setUp() throws Exception {
    RakurakuCore.setUp("dbunit", "MASAR10020lot3");
  }

  @AfterEach
  public void tearDown() throws Exception {
    RakurakuCore.tearDown();
  }

  @AfterAll
  public static void release() throws Exception {
    RakurakuCore.release("");
  }

  @Test
  public void testMASAR10020lot3_001() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_001/case_001_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "1");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "1");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_002() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_002/case_002_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "2");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "2");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "2");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "2");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "2");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "2");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_003() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_003/case_003_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "3");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "3");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "3");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "3");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "3");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "3");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "3");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_004() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_004/case_004_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "4");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "4");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "4");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "4");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "4");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "4");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "4");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "4");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_005() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_005/case_005_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "5");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "5");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "5");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "5");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "5");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "5");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "5");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "5");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_006() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_006/case_006_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "6");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "6");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "6");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "6");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "6");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "6");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "6");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "6");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

  @Test
  public void testMASAR10020lot3_007() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10020lot3/case_007/case_007_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "7");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "7");

    /* 未入金管理テーブル → m_bank → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "7");

    /* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "7");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "7");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "7");

    /* 未入金管理テーブル → M_ACCEPTANCE_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "7");

    /* 未入金管理テーブル → M_INCOMING_PAYMENT_GROUP → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_INCOMING_PAYMENT_GROUP", "データクリア・挿入", "7");

    /* 未入金管理テーブル → t_reprint → DELETE_ALL */
    rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

  }

}
