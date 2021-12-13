package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO120機能確認")
@DisplayName("MBPIRBO120機能確認")
public class MBPIRBO120Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO120");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO120");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****2+++++/v1/product/get-list;;商品情報取得API（List）;;-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****3+++++/v1/product/get-list;;商品情報取得API（List）;;-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****4+++++/v1/product/get-list;;商品情報取得API（List）;;-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****5+++++/v1/product/get-list;;商品情報取得API（List）;;-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****6+++++/v1/product/get-list;;商品情報取得API（List）;;example-2-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****7+++++/v1/product/get-list;;商品情報取得API（List）;;example-3-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****8+++++/v1/product/get-list;;商品情報取得API（List）;;URL異常-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****9+++++/v1/product/get-list;;商品情報取得API（List）;;-----/v1/delivery-destination/search;;納入先情報検索API;;-----/v1/plant/search;;置場情報検索API;;-----/v1/stock-setting/get;;在庫設定情報取得API;;*****10+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-2-----/v1/plant/search;;置場情報検索API;;example-2-----/v1/stock-setting/get;;在庫設定情報取得API;;*****11+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-2*****12+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****13+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****14+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****15+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****16+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****17+++++/v1/product/get-list;;商品情報取得API（List）;;example-1-----/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/v1/plant/search;;置場情報検索API;;example-1-----/v1/stock-setting/get;;在庫設定情報取得API;;example-1");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMBPIRBO120_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMBPIRBO120_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMBPIRBO120_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMBPIRBO120_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMBPIRBO120_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMBPIRBO120_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "6");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-2");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMBPIRBO120_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "7");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMBPIRBO120_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "8");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMBPIRBO120_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMBPIRBO120_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "10");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-2");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMBPIRBO120_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "11");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMBPIRBO120_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "12");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMBPIRBO120_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "13");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMBPIRBO120_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMBPIRBO120_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "15");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMBPIRBO120_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMBPIRBO120_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO120/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "17");

		/* 操作(apiMock) → /v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyMonthlyPoolDateLogicPlantReplaceJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<weeklyMonthlyPoolDateLogicPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_12MONTHS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "○");

	}

}
