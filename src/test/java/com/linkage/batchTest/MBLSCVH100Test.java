package com.linkage.batchTest;

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
public class MBLSCVH100Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLSCVH100");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLSCVH100");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****2+++++/v1/MAPPOPO250;;発注情報照会API;;example-2-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-2-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-2-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-2*****3+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****4+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****5+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****6+++++/v1/MAPPOPO250;;発注情報照会API;;example-3-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****7+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-3-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****8+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-3-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****9+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-8-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-3-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****10+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-3-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****11+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****12+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-3*****13+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****14+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****15+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-1-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****16+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-4-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-1*****17+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-5-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-4*****18+++++/v1/MAPPOPO250;;発注情報照会API;;example-2-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-2-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-2-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-2*****19+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-5-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-4*****20+++++/v1/MAPPOPO250;;発注情報照会API;;example-4-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-6-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-5*****21+++++/v1/MAPPOPO250;;発注情報照会API;;example-5-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-7-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-4-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-5-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-6*****22+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-8-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-4*****23+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-9-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-4*****24+++++/v1/MAPPOPO250;;発注情報照会API;;example-1-----/internal/v1/sales-order/search;;受注明細情報照会API;;example-10-----/internal/v1/subsidiary/get;;現法マスタ参照API;;example-1-----/internal/v1/ginner-info/get-list;;統合インナーコード変換API;;example-1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/ship-to/get-list;;配送先マスタ参照API;;example-4");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBLSCVH100_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBLSCVH100_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "2");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBLSCVH100_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBLSCVH100_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBLSCVH100_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBLSCVH100_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-3");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBLSCVH100_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBLSCVH100_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBLSCVH100_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-8");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-3");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBLSCVH100_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBLSCVH100_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBLSCVH100_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBLSCVH100_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBLSCVH100_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "4");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBLSCVH100_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "5");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBLSCVH100_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-4");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBLSCVH100_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-5");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBLSCVH100_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "6");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBLSCVH100_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-5");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBLSCVH100_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-4");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-6");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBLSCVH100_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "7");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-5");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-7");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBLSCVH100_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-8");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBLSCVH100_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-9");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBLSCVH100_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH100/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_HOLDING_LIST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDING_LIST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/MAPPOPO250 → 発注情報照会API */
		rakurakuCore.operateMockApi("/v1/MAPPOPO250", "発注情報照会API", "example-1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細情報照会API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細情報照会API", "example-10");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → 統合インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "統合インナーコード変換API", "example-1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get-list → 配送先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get-list", "配送先マスタ参照API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "holdingListRegisterJob,--job-execution-id=JOB001,--user-code=999,--subsidiary-code=JPN,--operation-date=20210101");

		/* 操作(DB確認) → T_HOLDING_LIST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDING_LIST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_HOLDINGLIST_M_PRODUCT_CONTROL_DEPT_GINNER_CONTROL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

}
