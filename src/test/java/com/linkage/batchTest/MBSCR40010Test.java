package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSCR40010機能確認")
@DisplayName("MBSCR40010機能確認")
public class MBSCR40010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSCR40010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSCR40010");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****2+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****3+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****4+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****5+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****6+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****7+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****8+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****9+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****10+++++/internal/v1/subsidiary/get;;現法情報取得API;;4*****11+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****12+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****13+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****14+++++/internal/v1/subsidiary/get;;現法情報取得API;;3*****15+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****16+++++/internal/v1/subsidiary/get;;現法情報取得API;;5*****17+++++/internal/v1/subsidiary/get;;現法情報取得API;;6*****18+++++/internal/v1/subsidiary/get;;現法情報取得API;;6*****19+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****20+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****21+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****22+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****23+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****24+++++/internal/v1/subsidiary/get;;現法情報取得API;;2*****25+++++/internal/v1/subsidiary/get;;現法情報取得API;;2");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMBSCR40010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMBSCR40010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMBSCR40010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMBSCR40010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMBSCR40010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMBSCR40010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMBSCR40010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMBSCR40010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMBSCR40010_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMBSCR40010_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMBSCR40010_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMBSCR40010_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMBSCR40010_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "15");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "15");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMBSCR40010_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMBSCR40010_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMBSCR40010_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "18");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "18");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMBSCR40010_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "19");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "19");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test018")
	@DisplayName("test018")
	public void testMBSCR40010_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "20");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "20");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test019")
	@DisplayName("test019")
	public void testMBSCR40010_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test020")
	@DisplayName("test020")
	public void testMBSCR40010_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test021")
	@DisplayName("test021")
	public void testMBSCR40010_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test022")
	@DisplayName("test022")
	public void testMBSCR40010_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "24");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test023")
	@DisplayName("test023")
	public void testMBSCR40010_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test024")
	@DisplayName("test024")
	public void testMBSCR40010_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test025")
	@DisplayName("test025")
	public void testMBSCR40010_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "27");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=20210811,--job-execution-id=MBSCR40010,--job-net-id=<jobNetId>");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

}
