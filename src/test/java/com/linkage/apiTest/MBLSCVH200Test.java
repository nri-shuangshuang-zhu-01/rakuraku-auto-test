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
public class MBLSCVH200Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLSCVH200");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLSCVH200");
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
	public void testMBLSCVH200_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "7");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "8");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "11");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "12");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "13");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "14");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "15");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "16");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "17");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "18");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "19");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "20");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "21");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "24");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "27");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "28");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "29");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "30");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "11");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "31");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "12");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "32");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "13");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "33");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "34");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "15");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "16");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "17");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "18");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "19");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "20");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "21");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "22");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "DELETE_ALL", "37");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_receiving_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_receiving_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "38");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "39");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "40");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "41");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "42");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "43");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → DELETE_ALL */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "DELETE_ALL", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → t_holding_list_create_shipment_actual_replica → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_holding_list_create_shipment_actual_replica", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "23");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "44");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "23");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "24");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "45");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "24");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCVH200_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCVH200/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_holding_list_create_receiving_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_receiving_actual_replica", "データクリア・挿入", "25");

		/* 操作(DB準備) → t_holding_list_create_shipment_actual_replica → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_holding_list_create_shipment_actual_replica", "データクリア・挿入", "46");

		/* 操作(DB準備) → T_RECEIVED_NOT_SHIPPED_MTO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_RECEIVED_NOT_SHIPPED_MTO", "データクリア・挿入", "25");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createReceivedNotShippedMtoJob,--job-execution-id=JOB001,--subsidiary-code=JPN,--job-net-id=100,--operation-date=20211201");

		/* 操作(DB確認) → T_RECEIVED_NOT_SHIPPED_MTO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_RECEIVED_NOT_SHIPPED_MTO", "NOT_ASSERT_COLUMN", "〇");

	}

}
