package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("StockSummary作成")
@DisplayName("StockSummary作成")
public class MBSAR30020NewTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSAR30020New");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSAR30020New");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****2+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****3+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****4+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****5+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****6+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****7+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****8+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****9+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****10+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****11+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****12+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****13+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****14+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****15+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****16+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****17+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****18+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****19+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****20+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****21+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****22+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****23+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****24+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****25+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****26+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;example-26*****27+++++/internal/v1/ccy/get;;通貨情報取得API;;example-27-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****28+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****29+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****30+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****31+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****32+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****33+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****34+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example*****35+++++/internal/v1/ccy/get;;通貨情報取得API;;@Example-----/internal/v1/subsidiary/get;;現法情報取得API;;@Example");
	}

	@Test
	@Tag("StockSummaryStart1")
	@DisplayName("StockSummaryStart1")
	public void testMBSAR30020New_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成2")
	@DisplayName("StockSummary作成2")
	public void testMBSAR30020New_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成3")
	@DisplayName("StockSummary作成3")
	public void testMBSAR30020New_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成4")
	@DisplayName("StockSummary作成4")
	public void testMBSAR30020New_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成5")
	@DisplayName("StockSummary作成5")
	public void testMBSAR30020New_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成6")
	@DisplayName("StockSummary作成6")
	public void testMBSAR30020New_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成7")
	@DisplayName("StockSummary作成7")
	public void testMBSAR30020New_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成8")
	@DisplayName("StockSummary作成8")
	public void testMBSAR30020New_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成9")
	@DisplayName("StockSummary作成9")
	public void testMBSAR30020New_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成10")
	@DisplayName("StockSummary作成10")
	public void testMBSAR30020New_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成11")
	@DisplayName("StockSummary作成11")
	public void testMBSAR30020New_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "11");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成12")
	@DisplayName("StockSummary作成12")
	public void testMBSAR30020New_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成13")
	@DisplayName("StockSummary作成13")
	public void testMBSAR30020New_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "13");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成14")
	@DisplayName("StockSummary作成14")
	public void testMBSAR30020New_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "14");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成15")
	@DisplayName("StockSummary作成15")
	public void testMBSAR30020New_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成16")
	@DisplayName("StockSummary作成16")
	public void testMBSAR30020New_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成17")
	@DisplayName("StockSummary作成17")
	public void testMBSAR30020New_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成18")
	@DisplayName("StockSummary作成18")
	public void testMBSAR30020New_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成19")
	@DisplayName("StockSummary作成19")
	public void testMBSAR30020New_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成20")
	@DisplayName("StockSummary作成20")
	public void testMBSAR30020New_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "20");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成21")
	@DisplayName("StockSummary作成21")
	public void testMBSAR30020New_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "21");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成22")
	@DisplayName("StockSummary作成22")
	public void testMBSAR30020New_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "22");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成23")
	@DisplayName("StockSummary作成23")
	public void testMBSAR30020New_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "23");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成24")
	@DisplayName("StockSummary作成24")
	public void testMBSAR30020New_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "24");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成25")
	@DisplayName("StockSummary作成25")
	public void testMBSAR30020New_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "25");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成26")
	@DisplayName("StockSummary作成26")
	public void testMBSAR30020New_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "example-26");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成27")
	@DisplayName("StockSummary作成27")
	public void testMBSAR30020New_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "example-27");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成28")
	@DisplayName("StockSummary作成28")
	public void testMBSAR30020New_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

	}

	@Test
	@Tag("StockSummary作成29")
	@DisplayName("StockSummary作成29")
	public void testMBSAR30020New_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "データクリア・挿入", "29");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成30")
	@DisplayName("StockSummary作成30")
	public void testMBSAR30020New_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "データクリア・挿入", "30");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成31")
	@DisplayName("StockSummary作成31")
	public void testMBSAR30020New_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "データクリア・挿入", "31");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成32")
	@DisplayName("StockSummary作成32")
	public void testMBSAR30020New_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "14");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成最大值")
	@DisplayName("StockSummary作成最大值")
	public void testMBSAR30020New_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "33");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成NULL")
	@DisplayName("StockSummary作成NULL")
	public void testMBSAR30020New_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "34");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("StockSummary作成空白")
	@DisplayName("StockSummary作成空白")
	public void testMBSAR30020New_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR30020New/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_GINNER_INFO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_GINNER_INFO", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_PLANT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PLANT", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_STOCK_SETTING", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_STOCK_STATUS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_STOCK_STATUS", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_MONTHLY_STOCK_COUNT_RANK → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_MONTHLY_STOCK_COUNT_RANK", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_SHIPMENT_COUNT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT", "データクリア・挿入", "35");

		/* 操作(DB準備) → t_receiving_and_shipment_accumulation → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_receiving_and_shipment_accumulation", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_PRODUCT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_PRODUCT_SUPPLIER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_PRODUCT_SUPPLIER", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_TYPE_CODE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_TYPE_CODE", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_STOCK_SUMMARY → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_STOCK_SUMMARY", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get → 通貨情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get", "通貨情報取得API", "@Example");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "@Example");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "stockSummaryCreateJob,--job-execution-id=12345,--operation-date=20210817,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_STOCK_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_STOCK_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

}
