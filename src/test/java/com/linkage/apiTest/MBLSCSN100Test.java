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
public class MBLSCSN100Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLSCSN100");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLSCSN100");
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
	public void testMBLSCSN100_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_event_send_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_event_send_receiving_actual_replica", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalCompletedShipmentJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → t_event_send_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_event_send_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMBLSCSN100_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_event_send_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_event_send_receiving_actual_replica", "データクリア・挿入", "2");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalCompletedShipmentJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → t_event_send_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_event_send_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMBLSCSN100_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_event_send_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_event_send_receiving_actual_replica", "データクリア・挿入", "3");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalCompletedShipmentJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

		/* 操作(DB確認) → t_event_send_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_event_send_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSN100_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalCompletedShipmentJob,--job-execution-id=12345,--subsidiary-code=JPN,--job-net-id=100");

	}

	@Test
	public void testMBLSCSN100_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_event_send_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_event_send_receiving_actual_replica", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arrivalCompletedShipmentJob,--job-execution-id=12345,--subsidiary-code=JPB,--job-net-id=100");

	}

	@Test
	public void testMBLSCSN100_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSN100/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

}
