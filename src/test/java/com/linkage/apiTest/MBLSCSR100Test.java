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
public class MBLSCSR100Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBLSCSR100");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBLSCSR100");
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
	public void testMBLSCSR100_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "5");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "6");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "7");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "7");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "8");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "8");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "9");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "9");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=08,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "10");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "10");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=07,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "11");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "11");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=01,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "12");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=02,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "13");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=03,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "14");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=04,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "15");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "15");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=00,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "16");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "16");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "17");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "17");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "18");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "19");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=08,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "20");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=07,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "21");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "21");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "22");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "22");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "23");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "24");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "24");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "25");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "26");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "27");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "28");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "28");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "29");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "29");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMBLSCSR100_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBLSCSR100/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPPING_DATE_AREA_SHIPMENT_COUNT_SUMMARY", "データクリア・挿入", "30");

		/* 操作(DB準備) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "データクリア・挿入", "30");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "shippingDateAreaShipmentCountSummaryJob,--operation-date=20210921,--subsidiary-code=JPN,--job-execution-id=JOB001,--operation-target-date=5,--operation-target-type=09,--job-net-id=100");

		/* 操作(DB確認) → T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_COUNT_BEFORE_SUMMARY_REPLICA", "NOT_ASSERT_COLUMN", "〇");

	}

}
