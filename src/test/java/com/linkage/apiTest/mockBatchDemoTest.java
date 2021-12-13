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
public class mockBatchDemoTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","mockBatchDemo");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","mockBatchDemo");
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
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testmockBatchDemo_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "1");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "1");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

//		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "2");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "2");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "2");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "2");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220201,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "3");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220301,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "4");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "4");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220401,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "5");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "5");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220501,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "6");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "6");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220601,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "7");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "7");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220701,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "8");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "8");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220801,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "9");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "9");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220901,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "10");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "10");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20221001,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "11");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "11");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20221101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "12");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "12");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20221201,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "13");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "13");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "14");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "14");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210201,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "15");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "15");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210301,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "16");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "16");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210401,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "17");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "17");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210501,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "18");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "18");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210601,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "19");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "19");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210701,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "20");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "20");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210801,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "21");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "21");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210901,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "22");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "22");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20211001,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "23");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "23");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20211101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "3");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "24");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "24");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20211201,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "26");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220110,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "27");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "27");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "28");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "29");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "28");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testmockBatchDemo_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_STOCK_SETTING → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_STOCK_SETTING", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_ARRIVAL_SHIPMENT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_SHIPMENT_LOG", "データクリア・挿入", "29");

		/* 操作(DB準備) → T_SHIPMENT_FREQUENCY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_FREQUENCY", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_ARRIVAL_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_ARRIVAL_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → B_SHIPMENT_RESULT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("B_SHIPMENT_RESULT", "データクリア・挿入", "25");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → カスタマイズSQL */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "カスタマイズSQL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20220101,--subsidiary-code=CHN, --job-net-id=JOB001");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_STOCK_SETTING → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_STOCK_SETTING", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_ARRIVAL_SHIPMENT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_SHIPMENT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_FREQUENCY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_FREQUENCY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_ARRIVAL_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_ARRIVAL_RESULT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → B_SHIPMENT_RESULT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("B_SHIPMENT_RESULT", "NOT_ASSERT_COLUMN", "〇");

	}

}
