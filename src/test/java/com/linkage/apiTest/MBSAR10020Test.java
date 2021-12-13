package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSAR10020")
@DisplayName("MBSAR10020")
public class MBSAR10020Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSAR10020");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSAR10020");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****2+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****3+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****4+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****5+++++/internal/v1/ccy/search;;通貨情報検索API;;4-----/internal/v1/rate/get;;レート情報取得API;;1*****6+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****7+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;2*****8+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****9+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;2*****10+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****11+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****12+++++/internal/v1/ccy/search;;通貨情報検索API;;2-----/internal/v1/rate/get;;レート情報取得API;;1*****13+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****14+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****15+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****16+++++/internal/v1/ccy/search;;通貨情報検索API;;3-----/internal/v1/rate/get;;レート情報取得API;;1*****17+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;3*****18+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****19+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****20+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****21+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****22+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****23+++++/internal/v1/ccy/search;;通貨情報検索API;;5-----/internal/v1/rate/get;;レート情報取得API;;1*****24+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****25+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;6*****26+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/rate/get;;レート情報取得API;;7");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBSAR10020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBSAR10020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBSAR10020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBSAR10020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBSAR10020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBSAR10020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBSAR10020_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBSAR10020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBSAR10020_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBSAR10020_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBSAR10020_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBSAR10020_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBSAR10020_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBSAR10020_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBSAR10020_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBSAR10020_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBSAR10020_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBSAR10020_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBSAR10020_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBSAR10020_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBSAR10020_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBSAR10020_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "11");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBSAR10020_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "5");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBSAR10020_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST025")
	@DisplayName("TEST025")
	public void testMBSAR10020_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST026")
	@DisplayName("TEST026")
	public void testMBSAR10020_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10020/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "7");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=100");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

}
