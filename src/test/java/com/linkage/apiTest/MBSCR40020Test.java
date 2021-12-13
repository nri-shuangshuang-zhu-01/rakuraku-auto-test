package com.linkage.apiTest;

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
public class MBSCR40020Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSCR40020");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSCR40020");
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
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBSCR40020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBSCR40020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBSCR40020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBSCR40020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBSCR40020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBSCR40020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBSCR40020_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBSCR40020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "soBalanceSummaryJob,--operation-date=20210709,--subsidiary-code=MJP,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SO_BALANCE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SO_BALANCE", "NOT_ASSERT_COLUMN", "〇");

	}

}
