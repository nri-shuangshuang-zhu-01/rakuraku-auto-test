package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("未入金管理データ消込")
@DisplayName("未入金管理データ消込")
public class MBSAR20020Test {

//	@BeforeAll
//	public static void initialize() throws Exception {
//		RakurakuCore.initialize("dbunit","MBSAR20020");
//	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSAR20020");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/ccy/search;;通貨情報検索API;;1*****2+++++/v1/ccy/search;;通貨情報検索API;;1*****3+++++/v1/ccy/search;;通貨情報検索API;;1*****4+++++/v1/ccy/search;;通貨情報検索API;;1*****5+++++/v1/ccy/search;;通貨情報検索API;;1*****6+++++/v1/ccy/search;;通貨情報検索API;;1*****7+++++/v1/ccy/search;;通貨情報検索API;;1*****8+++++/v1/ccy/search;;通貨情報検索API;;1*****9+++++/v1/ccy/search;;通貨情報検索API;;2*****10+++++/v1/ccy/search;;通貨情報検索API;;1*****11+++++/v1/ccy/search;;通貨情報検索API;;1*****12+++++/v1/ccy/search;;通貨情報検索API;;1*****13+++++/v1/ccy/search;;通貨情報検索API;;1*****14+++++/v1/ccy/search;;通貨情報検索API;;1*****15+++++/v1/ccy/search;;通貨情報検索API;;1*****16+++++/v1/ccy/search;;通貨情報検索API;;1*****17+++++/v1/ccy/search;;通貨情報検索API;;1*****18+++++/v1/ccy/search;;通貨情報検索API;;1*****19+++++/v1/ccy/search;;通貨情報検索API;;1*****20+++++/v1/ccy/search;;通貨情報検索API;;1*****21+++++/v1/ccy/search;;通貨情報検索API;;1*****22+++++/v1/ccy/search;;通貨情報検索API;;1*****23+++++/v1/ccy/search;;通貨情報検索API;;1*****24+++++/v1/ccy/search;;通貨情報検索API;;1*****25+++++/v1/ccy/search;;通貨情報検索API;;1*****26+++++/v1/ccy/search;;通貨情報検索API;;1");
	}

	@Test
	public void testMBSAR20020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20210905,--subsidiary-code=BBQ,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200705,--subsidiary-code=IOP,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "4");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20210705,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "5");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20180705,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "6");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20190720,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}


	@Test
	public void testMBSAR20020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "8");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20210907,--subsidiary-code=BBQ,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "12");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "15");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "16");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "17");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "18");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20190905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "19");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20210905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "21");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "22");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "23");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "24");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "24");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "25");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20200905,--subsidiary-code=MSR,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBSAR20020_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR20020/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "26");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /v1/ccy/search */
		rakurakuCore.operateMockApi("/v1/ccy/search", "", " ");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "reconciliationNonPaymentManagementJob,--job-execution-id=12345,--operation-date=20220905,--subsidiary-code=TIW,--job-net-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

	}

}
