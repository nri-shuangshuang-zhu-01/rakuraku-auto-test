package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSCR40040")
@DisplayName("MBSCR40040")
public class MBSCR40040Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSCR40040");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSCR40040");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****2+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****3+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****4+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****5+++++/internal/v1/ccy/search;;通貨情報検索API;;4-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****6+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;2-----/internal/v1/rate/get;;レート情報取得API;;1*****7+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;2*****8+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****9+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;2*****10+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****11+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;5*****12+++++/internal/v1/ccy/search;;通貨情報検索API;;2-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****13+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****14+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****15+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****16+++++/internal/v1/ccy/search;;通貨情報検索API;;3-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****17+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;3*****18+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****19+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****20+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****21+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****22+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****23+++++/internal/v1/ccy/search;;通貨情報検索API;;5-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****33+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;6*****34+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;7*****35+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;4*****36+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;1-----/internal/v1/rate/get;;レート情報取得API;;1*****37+++++/internal/v1/ccy/search;;通貨情報検索API;;1-----/internal/v1/bill-to/get-list;;売掛先情報取得API（List）;;4-----/internal/v1/rate/get;;レート情報取得API;;1");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBSCR40040_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBSCR40040_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "7");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBSCR40040_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBSCR40040_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBSCR40040_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBSCR40040_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBSCR40040_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBSCR40040_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBSCR40040_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBSCR40040_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBSCR40040_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBSCR40040_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBSCR40040_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "6");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBSCR40040_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBSCR40040_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBSCR40040_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBSCR40040_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBSCR40040_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBSCR40040_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBSCR40040_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "9");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBSCR40040_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBSCR40040_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "11");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBSCR40040_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "5");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBSCR40040_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST025")
	@DisplayName("TEST025")
	public void testMBSCR40040_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST026")
	@DisplayName("TEST026")
	public void testMBSCR40040_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST027")
	@DisplayName("TEST027")
	public void testMBSCR40040_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST028")
	@DisplayName("TEST028")
	public void testMBSCR40040_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST029")
	@DisplayName("TEST029")
	public void testMBSCR40040_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST030")
	@DisplayName("TEST030")
	public void testMBSCR40040_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST031")
	@DisplayName("TEST031")
	public void testMBSCR40040_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST032")
	@DisplayName("TEST032")
	public void testMBSCR40040_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST033")
	@DisplayName("TEST033")
	public void testMBSCR40040_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST034")
	@DisplayName("TEST034")
	public void testMBSCR40040_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "7");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST035")
	@DisplayName("TEST035")
	public void testMBSCR40040_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST036")
	@DisplayName("TEST036")
	public void testMBSCR40040_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "12");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST037")
	@DisplayName("TEST037")
	public void testMBSCR40040_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40040/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH_SAP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH_SAP", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/ccy/search → 通貨情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/ccy/search", "通貨情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/get-list → 売掛先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get-list", "売掛先情報取得API（List）", "4");

		/* 操作(apiMock) → /internal/v1/rate/get → レート情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/rate/get", "レート情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "incomingPaymentUnmatchSapCcyChangeJob,--subsidiary-code=MJP,--job-execution-id=<jobExecutionId>,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH_SAP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH_SAP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_UNMATCH → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_UNMATCH", "NOT_ASSERT_COLUMN", "〇");

	}

}
