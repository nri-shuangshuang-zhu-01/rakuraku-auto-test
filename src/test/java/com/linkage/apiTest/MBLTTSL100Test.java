package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBLTTSL100")
@DisplayName("MBLTTSL100")
public class MBLTTSL100Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLTTSL100");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLTTSL100");
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
	public void testMBLTTSL100_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBLTTSL100_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBLTTSL100_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBLTTSL100_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBLTTSL100_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBLTTSL100_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBLTTSL100_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBLTTSL100_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBLTTSL100_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBLTTSL100_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBLTTSL100_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBLTTSL100_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBLTTSL100_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBLTTSL100_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBLTTSL100_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "11");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBLTTSL100_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBLTTSL100_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "13");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBLTTSL100_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "16");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "43");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBLTTSL100_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "16");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBLTTSL100_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "15");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBLTTSL100_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBLTTSL100_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "17");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBLTTSL100_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "18");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBLTTSL100_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "21");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST025")
	@DisplayName("TEST025")
	public void testMBLTTSL100_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "19");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST026")
	@DisplayName("TEST026")
	public void testMBLTTSL100_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "20");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "44");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST027")
	@DisplayName("TEST027")
	public void testMBLTTSL100_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "22");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST028")
	@DisplayName("TEST028")
	public void testMBLTTSL100_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "22");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST029")
	@DisplayName("TEST029")
	public void testMBLTTSL100_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "11");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST030")
	@DisplayName("TEST030")
	public void testMBLTTSL100_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST031")
	@DisplayName("TEST031")
	public void testMBLTTSL100_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST032")
	@DisplayName("TEST032")
	public void testMBLTTSL100_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST033")
	@DisplayName("TEST033")
	public void testMBLTTSL100_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST034")
	@DisplayName("TEST034")
	public void testMBLTTSL100_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST035")
	@DisplayName("TEST035")
	public void testMBLTTSL100_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST036")
	@DisplayName("TEST036")
	public void testMBLTTSL100_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST037")
	@DisplayName("TEST037")
	public void testMBLTTSL100_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "24");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST038")
	@DisplayName("TEST038")
	public void testMBLTTSL100_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "24");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST039")
	@DisplayName("TEST039")
	public void testMBLTTSL100_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "25");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST040")
	@DisplayName("TEST040")
	public void testMBLTTSL100_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "25");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST041")
	@DisplayName("TEST041")
	public void testMBLTTSL100_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "25");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST042")
	@DisplayName("TEST042")
	public void testMBLTTSL100_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST043")
	@DisplayName("TEST043")
	public void testMBLTTSL100_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "27");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST044")
	@DisplayName("TEST044")
	public void testMBLTTSL100_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "28");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST045")
	@DisplayName("TEST045")
	public void testMBLTTSL100_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "29");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST046")
	@DisplayName("TEST046")
	public void testMBLTTSL100_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "30");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST047")
	@DisplayName("TEST047")
	public void testMBLTTSL100_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "31");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST048")
	@DisplayName("TEST048")
	public void testMBLTTSL100_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "32");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST049")
	@DisplayName("TEST049")
	public void testMBLTTSL100_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST050")
	@DisplayName("TEST050")
	public void testMBLTTSL100_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST051")
	@DisplayName("TEST051")
	public void testMBLTTSL100_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST052")
	@DisplayName("TEST052")
	public void testMBLTTSL100_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST053")
	@DisplayName("TEST053")
	public void testMBLTTSL100_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "37");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST054")
	@DisplayName("TEST054")
	public void testMBLTTSL100_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "38");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST055")
	@DisplayName("TEST055")
	public void testMBLTTSL100_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "26");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST056")
	@DisplayName("TEST056")
	public void testMBLTTSL100_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "39");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST057")
	@DisplayName("TEST057")
	public void testMBLTTSL100_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "27");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "40");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST058")
	@DisplayName("TEST058")
	public void testMBLTTSL100_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "27");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "41");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST059")
	@DisplayName("TEST059")
	public void testMBLTTSL100_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "28");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "42");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("TEST060")
	@DisplayName("TEST060")
	public void testMBLTTSL100_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLTTSL100/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_REPLICA", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_CARRIER_INVOICE_RECEIVE_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE_RECEIVE_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → PRODUCED_EVENTS_2 → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("PRODUCED_EVENTS_2", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "carrierInvoiceRegisterJob,--operation-date=20210709,--subsidiary-code=JPN,--job-net-id=100,--job-execution-id=<jobExecutionId>");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_REPLICA", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

}
