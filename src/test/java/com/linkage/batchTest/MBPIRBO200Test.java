package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO200")
@DisplayName("MBPIRBO200")
public class MBPIRBO200Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO200");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO200");
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
	public void testMBPIRBO200_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBPIRBO200_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBPIRBO200_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBPIRBO200_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBPIRBO200_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBPIRBO200_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBPIRBO200_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBPIRBO200_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBPIRBO200_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBPIRBO200_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBPIRBO200_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO200/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteWeeklyReorderPointDemandForecastDataJob,--subsidiary-code=TIW,--job-net-id=12345,--job-execution-id=12345");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

	}

}
