package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSCR40030機能確認")
@DisplayName("MBSCR40030機能確認")
public class MBSCR40030Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSCR40030");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSCR40030");
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
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMBSCR40030_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=20211009,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMBSCR40030_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=20211009,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMBSCR40030_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=20211009,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("1件確認2")
	@DisplayName("1件確認2")
	public void testMBSCR40030_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=20211010,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("起動パラメータ：空白の場合 ")
	@DisplayName("起動パラメータ：空白の場合 ")
	public void testMBSCR40030_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("起動パラメータ：空白の場合 ")
	@DisplayName("起動パラメータ：空白の場合 ")
	public void testMBSCR40030_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--operation-date=,--subsidiary-code=,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("起動パラメータ：nullの場合")
	@DisplayName("起動パラメータ：nullの場合")
	public void testMBSCR40030_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--subsidiary-code=JPN,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("起動パラメータ：nullの場合2")
	@DisplayName("起動パラメータ：nullの場合2")
	public void testMBSCR40030_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40030/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "creditManagementDateProcessJob,--job-execution-id=<creditManagementDateProcessJob>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SAME_DAY_SO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAME_DAY_SO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

}
