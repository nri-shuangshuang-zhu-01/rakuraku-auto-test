package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("DeadstockTool作成")
@DisplayName("DeadstockTool作成")
public class MBSAR30010Test {

  @BeforeAll
  public static void initialize() throws Exception {
    RakurakuCore.initialize("dbunit", "MBSAR30010");
  }

  @BeforeEach
  public void setUp() throws Exception {
    RakurakuCore.setUp("dbunit", "MBSAR30010");
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
  public void testMBSAR30010_001() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_001/case_001_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "1");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "1");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "1");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "1");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "1");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "1");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_002() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_002/case_002_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "2");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "2");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "2");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "2");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "2");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "2");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "2");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "2");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "2");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "2");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "2");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "2");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_003() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_003/case_003_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "3");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "3");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "3");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "3");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "3");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "3");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "3");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "3");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "3");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_004() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_004/case_004_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "4");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "4");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "4");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "4");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "4");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "4");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "4");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "4");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "4");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_005() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_005/case_005_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "5");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "5");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "5");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "5");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "5");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "5");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "5");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "5");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "5");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_006() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_006/case_006_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "6");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "6");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "6");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "6");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "6");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "6");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "6");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "6");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "6");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_007() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_007/case_007_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "7");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "7");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "7");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "7");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "7");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "7");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "7");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "7");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "7");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_008() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_008/case_008_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "8");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "8");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "8");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "8");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "8");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "8");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "8");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "8");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "8");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_009() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_009/case_009_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "9");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "9");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "9");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "9");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "9");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "9");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "9");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "9");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "9");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_010() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_010/case_010_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "10");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "10");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "10");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "10");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "10");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "10");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "10");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "10");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "10");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_011() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_011/case_011_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "11");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "11");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "11");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "11");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "11");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "11");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "11");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "11");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "11");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_012() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_012/case_012_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "12");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "12");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "12");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "12");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "12");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "12");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "12");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "12");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "12");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_013() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_013/case_013_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "13");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "13");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "13");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "13");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "13");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "13");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "13");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "13");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "13");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_014() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_014/case_014_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "14");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "14");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "14");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "14");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "14");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "14");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "14");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "14");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "14");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_015() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_015/case_015_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "15");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "15");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "15");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "15");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "15");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "15");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "15");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "15");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "15");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_016() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_016/case_016_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "16");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "16");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "16");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "16");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "16");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "16");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "16");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "16");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "16");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_017() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_017/case_017_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "17");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "17");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "17");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "17");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "17");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "17");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "17");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "17");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "17");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_018() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_018/case_018_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "18");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "18");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "18");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "18");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "18");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "18");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "18");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "18");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "18");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210925,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_019() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_019/case_019_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "19");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "19");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "19");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "19");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "19");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "19");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "19");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "19");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "19");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_020() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_020/case_020_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "20");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "20");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "20");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "20");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "20");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "20");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "20");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "20");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "20");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_021() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_021/case_021_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "21");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "21");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "21");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "21");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "21");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "21");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "21");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "21");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "21");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_022() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_022/case_022_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "22");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "22");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "22");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "22");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "22");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "22");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "22");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "22");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "22");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_023() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_023/case_023_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "23");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "23");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "23");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "23");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "23");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "23");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "23");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "23");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "23");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_024() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_024/case_024_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "24");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "24");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "24");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "24");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "24");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "24");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "24");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "24");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "24");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_025() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_025/case_025_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "25");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "25");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "25");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "25");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "25");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "25");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "25");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "25");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "25");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_026() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_026/case_026_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "26");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "26");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "26");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "26");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "26");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "26");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "26");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "26");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "26");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_027() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_027/case_027_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "27");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "27");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "27");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "27");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "27");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "27");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "27");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "27");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "27");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_028() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_028/case_028_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "28");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "28");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "28");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "28");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "28");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "28");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "28");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "28");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "28");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_029() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_029/case_029_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "29");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "29");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "29");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "29");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "29");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "29");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "29");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "29");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "29");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_030() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_030/case_030_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "30");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "30");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "30");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "30");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "30");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "30");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "30");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "30");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "30");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_031() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_031/case_031_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "31");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "31");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "31");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "31");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "31");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "31");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "31");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "31");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "31");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_032() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_032/case_032_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "32");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "32");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "32");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "32");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "32");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "32");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "32");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "32");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "32");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_033() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_033/case_033_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "33");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "33");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "33");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "33");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "33");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "33");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "33");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "33");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "33");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_034() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_034/case_034_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "34");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "34");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "34");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "34");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "34");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "34");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "34");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "34");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "34");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_035() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_035/case_035_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "35");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "35");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "35");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "35");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "35");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "35");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "35");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "35");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "35");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_036() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_036/case_036_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "36");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "36");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "36");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "36");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "36");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "36");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "36");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "36");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "36");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_037() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_037/case_037_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "37");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "37");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "37");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "37");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "37");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "37");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "37");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "37");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "37");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_038() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_038/case_038_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "38");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "38");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "38");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "38");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "38");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "38");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "38");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "38");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "38");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_039() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_039/case_039_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "39");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "39");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "39");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "39");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "39");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "39");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "39");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "39");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "39");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_040() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_040/case_040_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "40");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "40");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "40");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "40");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "40");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "40");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "40");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "40");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "40");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_041() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_041/case_041_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "41");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "41");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "41");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "41");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "41");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "41");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "41");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "41");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "41");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_042() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_042/case_042_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "42");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "42");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "42");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "42");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "42");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "42");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_043() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_043/case_043_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "43");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "43");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "43");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "43");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "43");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "43");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "43");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "43");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "43");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_044() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_044/case_044_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "44");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "44");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "44");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "44");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "44");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "44");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "44");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "44");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "44");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_045() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_045/case_045_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "45");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "45");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "45");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "45");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "45");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "45");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "45");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "45");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "45");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_046() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_046/case_046_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "46");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "46");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "46");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "46");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "46");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "46");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "46");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "46");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "46");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_047() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_047/case_047_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "47");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "47");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "47");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "47");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "47");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "47");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "47");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "47");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "47");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_048() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_048/case_048_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "48");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "48");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "48");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "48");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "48");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "48");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "48");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "48");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "48");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "48");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "48");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "48");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_049() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_049/case_049_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "49");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "49");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "49");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "49");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "49");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "49");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "49");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "49");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "49");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "49");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "49");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "49");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_050() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_050/case_050_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "50");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "50");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "50");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "50");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "50");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "50");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "50");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "50");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "50");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "50");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "50");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "50");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_051() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_051/case_051_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "51");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "51");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "51");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "51");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "51");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "51");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "51");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "51");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "51");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "51");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "51");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "51");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_052() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_052/case_052_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "52");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "52");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "52");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "52");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "52");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "52");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "52");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "52");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "52");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "52");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "52");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "52");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_053() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_053/case_053_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "53");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "53");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "53");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "53");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "53");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "53");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "53");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "53");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "53");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "53");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "53");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "53");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_054() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_054/case_054_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "54");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "54");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "54");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "54");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "54");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "54");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "54");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "54");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "54");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "54");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "54");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "54");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_055() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_055/case_055_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "55");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "55");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "55");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "55");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "55");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "55");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "55");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "55");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "55");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "55");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "55");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "55");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_056() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_056/case_056_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "56");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "56");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "56");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "56");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "56");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "56");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "56");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "56");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "56");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "56");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "56");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "56");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_057() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_057/case_057_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "57");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "57");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "57");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "57");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "57");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "57");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "57");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "57");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "57");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "57");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "57");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "57");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_058() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_058/case_058_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "58");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "58");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "58");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "58");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "58");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "58");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "58");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "58");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "58");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "58");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "58");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "58");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_059() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_059/case_059_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "59");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "59");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "59");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "59");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "59");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "59");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "59");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "59");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "59");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "59");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "59");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "59");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_060() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_060/case_060_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "60");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "60");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "60");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "60");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "60");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "60");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "60");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "60");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "60");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "60");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "60");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "60");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_061() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_061/case_061_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "61");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "61");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "61");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "61");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "61");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "61");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "61");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "61");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "61");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "61");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "61");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "61");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_062() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_062/case_062_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "62");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "62");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "62");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "62");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "62");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "62");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "62");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "62");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "62");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "62");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "62");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "62");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_063() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_063/case_063_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "63");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "63");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "63");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "63");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "63");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "63");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "63");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "63");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "63");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "63");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "63");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "63");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_064() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_064/case_064_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "64");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "64");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "64");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "64");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "64");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "64");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "64");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "64");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "64");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "64");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "64");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "64");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210101,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_065() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_065/case_065_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "65");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "65");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "65");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "65");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "65");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "65");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "65");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "65");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "65");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "65");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "65");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "65");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210201,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_066() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_066/case_066_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "66");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "66");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "66");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "66");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "66");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "66");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "66");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "66");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "66");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "66");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "66");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "66");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_067() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_067/case_067_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "67");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "67");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "67");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "67");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "67");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "67");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "67");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "67");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "67");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "67");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "67");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "67");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210201,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_068() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_068/case_068_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "68");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "68");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "68");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "68");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "68");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "68");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "68");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "68");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "68");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "68");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "68");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "68");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_069() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_069/case_069_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "69");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "69");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "69");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "69");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "69");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "69");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "69");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "69");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "69");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "69");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "69");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "69");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_070() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_070/case_070_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "70");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "70");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "70");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "70");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "70");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "70");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "70");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "70");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "70");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "70");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "70");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "70");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_071() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_071/case_071_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "71");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "71");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "71");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "71");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "71");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "71");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "71");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "71");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "71");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "71");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "71");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "71");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_072() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_072/case_072_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "72");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "72");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "72");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "72");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "72");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "72");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "72");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "72");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "72");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "72");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "72");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "72");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_073() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_073/case_073_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "73");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "73");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "73");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "73");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "73");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "73");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "73");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "73");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "73");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "73");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "73");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "73");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_074() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_074/case_074_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "74");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "74");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "74");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "74");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "74");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "74");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "74");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "74");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "74");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "74");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "74");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "74");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_075() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_075/case_075_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "75");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "75");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "75");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "75");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "75");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "75");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "75");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "75");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "75");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "75");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "75");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "75");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_076() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_076/case_076_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "76");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "76");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "76");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "76");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "76");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "76");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "76");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "76");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "76");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "76");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "76");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "76");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_077() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_077/case_077_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "77");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "77");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "77");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "77");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "77");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "77");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "77");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "77");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "77");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "77");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "77");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "77");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_078() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_078/case_078_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "78");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "78");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "78");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "78");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "78");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "78");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "78");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "78");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "78");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "78");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "78");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "78");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_079() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_079/case_079_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "79");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "79");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "79");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "79");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "79");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "79");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "79");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "79");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "79");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "79");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "79");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "79");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_080() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_080/case_080_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "80");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "80");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "80");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "80");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "80");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "80");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "80");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "80");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "80");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "80");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "80");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "80");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_081() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_081/case_081_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "81");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "81");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "81");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "81");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "81");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "81");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "81");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "81");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "81");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "81");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "81");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "81");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_082() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_082/case_082_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "82");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "82");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "82");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "82");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "82");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "82");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "82");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "82");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "82");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "82");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "82");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "82");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210825,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_083() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_083/case_083_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "83");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "83");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "83");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "83");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "83");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "83");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "83");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "83");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "83");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "83");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "83");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "83");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_084() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_084/case_084_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "84");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "84");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "84");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "84");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "84");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "84");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "84");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "84");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "84");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "84");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "84");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "84");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_085() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_085/case_085_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "85");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "85");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "85");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "85");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "85");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "85");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "85");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "85");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "85");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "85");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "85");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "85");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_086() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_086/case_086_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "86");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "86");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "86");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "86");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "86");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "86");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "86");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "86");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "86");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "86");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "86");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "86");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_087() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_087/case_087_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "87");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "87");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "87");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "87");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "87");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "87");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "87");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "87");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "87");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "87");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "87");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "87");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_088() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_088/case_088_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "88");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "88");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "88");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "88");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "88");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "88");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "88");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "88");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "88");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "88");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "88");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "88");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_089() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_089/case_089_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "89");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "89");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "89");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "89");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "89");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "89");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "89");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "89");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "89");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "89");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "89");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "89");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_090() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_090/case_090_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "90");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "90");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "90");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "90");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "90");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "90");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "90");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "90");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "90");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "90");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "90");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "90");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_091() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_091/case_091_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "91");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "91");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "91");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "91");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "91");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "91");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "91");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "91");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "91");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "91");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "91");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "91");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_092() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_092/case_092_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "92");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "92");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "92");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "92");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "92");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "92");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "92");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "92");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "92");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "92");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "92");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "92");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_093() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_093/case_093_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "93");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "93");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "93");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "93");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "93");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "93");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "93");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "93");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "93");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "93");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "93");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "93");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_094() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_094/case_094_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "94");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "94");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "94");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "94");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "94");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "94");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "94");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "94");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "94");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "94");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "94");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "94");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_095() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_095/case_095_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "95");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "95");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "95");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "95");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "95");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "95");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "95");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "95");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "95");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "95");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "95");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "95");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_096() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_096/case_096_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "96");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "96");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "96");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "96");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "96");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "96");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "96");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "96");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "96");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "96");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "96");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "96");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_097() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_097/case_097_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "97");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "97");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "97");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "97");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "97");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "97");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "97");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "97");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "97");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "97");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "97");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "97");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_098() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_098/case_098_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "98");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "98");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "98");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "98");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "98");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "98");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "98");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "98");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "98");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "98");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "98");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "98");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_099() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_099/case_099_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "99");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "99");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "99");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "99");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "99");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "99");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "99");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "99");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "99");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "99");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "99");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "99");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_100() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_100/case_100_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "100");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "100");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "100");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "100");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "100");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "100");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "100");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "100");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "100");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "100");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "100");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "100");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_101() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_101/case_101_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "101");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "101");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "101");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "101");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "101");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "101");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "101");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "101");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "101");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "101");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "101");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "101");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

  @Test
  public void testMBSAR30010_102() throws Exception {

    RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30010/case_102/case_102_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → m_stock_setting → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_stock_setting", "データクリア・挿入", "102");

    /* 操作(DB準備) → t_stock_status → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_stock_status", "データクリア・挿入", "102");

    /* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_product → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_product_supplier → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_product_supplier", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_plant → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_plant", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_ginner_info → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_ginner_info", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "102");

    /* 操作(DB準備) → m_type_code → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_type_code", "データクリア・挿入", "102");

    /* 操作(DB準備) → T_DEAD_STOCK_CLASSIFY → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_DEAD_STOCK_CLASSIFY", "データクリア・挿入", "102");

    /* 操作(DB準備) → M_PRODUCT_CONTROL_DEPARTMENT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_PRODUCT_CONTROL_DEPARTMENT", "データクリア・挿入", "102");

    /* 操作(DB準備) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "102");

    /* 操作(DB準備) → T_PRODUCT_SHIPPING_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_SHIPPING_AMOUNT", "データクリア・挿入", "102");

    /* 操作(DB準備) → T_PRODUCT_DEAD_STOCK_AMOUNT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("T_PRODUCT_DEAD_STOCK_AMOUNT", "データクリア・挿入", "102");

    /* 操作(DB準備) → M_DEAD_STOCK_EXCLUDE_PRODUCT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_EXCLUDE_PRODUCT", "データクリア・挿入", "102");

    /* 操作(DB準備) → M_DEAD_STOCK_BUSINESS_UNIT → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_BUSINESS_UNIT", "データクリア・挿入", "102");

    /* 操作(DB準備) → M_DEAD_STOCK_TEAM → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("M_DEAD_STOCK_TEAM", "データクリア・挿入", "102");

    /* 操作(バッチ) → 契約取得バッチ */
    rakurakuCore.operateBatch("契約取得バッチ", "〇",
        "deadStockToolCreateJob,--job-execution-id=12345,--operation-date=20210725,--subsidiary-code=CHN");

    /* 操作(DB確認) → m_stock_setting → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_stock_setting", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_stock_status → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("t_stock_status", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → t_receiving_and_shipment_accumulation → NOT_ASSERT_COLUMN */
    rakurakuCore
        .operateDBConfirm("t_receiving_and_shipment_accumulation", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_product_supplier → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_product_supplier", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_plant → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_plant", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_ginner_info → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_ginner_info", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → m_type_code → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("m_type_code", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_DEAD_STOCK_CLASSIFY → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_DEAD_STOCK_CLASSIFY", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_PRODUCT_CONTROL_DEPARTMENT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_PRODUCT_CONTROL_DEPARTMENT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PLANT_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PLANT_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_SHIPPING_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_SHIPPING_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → T_PRODUCT_DEAD_STOCK_AMOUNT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("T_PRODUCT_DEAD_STOCK_AMOUNT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_EXCLUDE_PRODUCT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_EXCLUDE_PRODUCT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_BUSINESS_UNIT → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_BUSINESS_UNIT", "NOT_ASSERT_COLUMN", "〇");

    /* 操作(DB確認) → M_DEAD_STOCK_TEAM → NOT_ASSERT_COLUMN */
    rakurakuCore.operateDBConfirm("M_DEAD_STOCK_TEAM", "NOT_ASSERT_COLUMN", "〇");

  }

}
