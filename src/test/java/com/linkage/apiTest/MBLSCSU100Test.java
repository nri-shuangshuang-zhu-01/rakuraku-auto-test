package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("出荷済みイベント発行バッチ")
@DisplayName("出荷済みイベント発行バッチ")
public class MBLSCSU100Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLSCSU100");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLSCSU100");
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
	@Tag("出荷済みイベント発行バッチ1")
	@DisplayName("出荷済みイベント発行バッチ1")
	public void testMBLSCSU100_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("出荷済みイベント発行バッチ2")
	@DisplayName("出荷済みイベント発行バッチ2")
	public void testMBLSCSU100_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "2");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("出荷済みイベント発行バッチ3")
	@DisplayName("出荷済みイベント発行バッチ3")
	public void testMBLSCSU100_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "3");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("出荷済みイベント発行バッチ4")
	@DisplayName("出荷済みイベント発行バッチ4")
	public void testMBLSCSU100_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

	}

	@Test
	@Tag("出荷済みイベント発行バッチ5")
	@DisplayName("出荷済みイベント発行バッチ5")
	public void testMBLSCSU100_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "5");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

	}

	@Test
	@Tag("出荷済みイベント発行バッチ6")
	@DisplayName("出荷済みイベント発行バッチ6")
	public void testMBLSCSU100_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSU100/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_EVENT_SEND_SHIPMENT_ACTUAL_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shipmentCompleteJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

	}

}
