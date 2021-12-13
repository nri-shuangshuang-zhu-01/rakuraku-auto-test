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
public class mockBatchDemo1Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","mockBatchDemo1");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","mockBatchDemo1");
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
	public void testmockBatchDemo1_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo1/case_001/case_001_", "");// ケース番号の設定

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
	public void testmockBatchDemo1_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockBatchDemo1/case_002/case_002_", "");// ケース番号の設定

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


}
