package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO140機能確認")
@DisplayName("MBPIRBO140機能確認")
public class MBPIRBO140Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO140");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO140");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****2+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-2-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****3+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****4+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-3-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****5+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-3-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****6+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-2-----/internal/v1/plant/search;;置場情報検索API;;example-2-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****7+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-2*****8+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****9+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****10+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****11+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****12+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****13+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****14+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****15+++++/internal/v1/product/get-list;;商品情報取得API（List）;;URL異常-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****16+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****17+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****18+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****19+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****20+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****21+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****22+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****23+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****24+++++/internal/v1/product/get-list;;商品情報取得API（List）;;-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****25+++++/internal/v1/product/get-list;;商品情報取得API（List）;;URL異常-----/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****26+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****27+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****28+++++/internal/v1/product/get-list;;商品情報取得API（List）;;example-1-----/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBPIRBO140_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBPIRBO140_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBPIRBO140_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBPIRBO140_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=TIW,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBPIRBO140_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBPIRBO140_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBPIRBO140_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBPIRBO140_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBPIRBO140_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBPIRBO140_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--subsidiary-code=JPN,--job-net-id=NetId1235,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBPIRBO140_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--job-net-id=NetId1236,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBPIRBO140_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBPIRBO140_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBPIRBO140_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBPIRBO140_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBPIRBO140_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBPIRBO140_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBPIRBO140_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBPIRBO140_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBPIRBO140_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--subsidiary-code=JPN,--job-net-id=NetId1235,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBPIRBO140_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--job-net-id=NetId1236,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBPIRBO140_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBPIRBO140_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBPIRBO140_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST025")
	@DisplayName("TEST025")
	public void testMBPIRBO140_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST026")
	@DisplayName("TEST026")
	public void testMBPIRBO140_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST027")
	@DisplayName("TEST027")
	public void testMBPIRBO140_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("TEST028")
	@DisplayName("TEST028")
	public void testMBPIRBO140_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO140/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "weeklyPoolDataLogicalPlantReplaceJob,--operation-date=20221010,--subsidiary-code=JPN,--job-net-id=NetId1234,--job-execution-id=<weeklyPoolDataLogicalPlantReplaceJob>");

		/* 操作(DB確認) → T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_ACTUAL_POOL_DATA_FOR_52WEEKS", "NOT_ASSERT_COLUMN", "○");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "○");

	}

}
