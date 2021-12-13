package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO180機能確認")
@DisplayName("MBPIRBO180機能確認")
public class MBPIRBO180Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO180");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO180");
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
	@Tag("test001")
	@DisplayName("test001")
	public void testMBPIRBO180_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMBPIRBO180_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMBPIRBO180_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMBPIRBO180_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMBPIRBO180_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMBPIRBO180_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMBPIRBO180_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "7");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMBPIRBO180_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "8");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMBPIRBO180_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMBPIRBO180_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMBPIRBO180_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "11");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMBPIRBO180_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "12");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMBPIRBO180_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "13");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMBPIRBO180_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO180/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "データクリア・挿入", "14");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","○" , "exclusionCaseWeeklyRemoveProcessJob,--operation-date=20210101,--subsidiary-code=TIW,--job-net-id=54321,--job-execution-id=<exclusionCaseWeeklyRemoveProcessJob>");

		/* 操作(DB確認) → M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_WEEKLY_REORDER_POINT_EXCLUDE_CONDITION", "NOT_ASSERT_COLUMN", "○");

	}

}
