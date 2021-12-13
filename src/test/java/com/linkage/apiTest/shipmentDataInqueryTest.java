package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("Example機能確認1")
@DisplayName("Example機能確認1")
public class shipmentDataInqueryTest {

	@BeforeAll
	public static void initialize() throws Exception {
		//RakurakuCore.initialize("dbunit","shipmentDataInquery");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","shipmentDataInquery");
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
	public void testshipmentDataInquery_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/shipmentDataInquery/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_ARRIVAL_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_ARRIVAL_RESULT_LOG", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SHIPMENT_RESULT_LOG → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SHIPMENT_RESULT_LOG", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ → D:\\shipment-control-service\\shipment-control-batch\\build\\libs\\shipment-control-batch-1.0.0-SNAPSHOT.jarD:\\shipment-control-service\\shipment-control-batch\\build\\libs\\shipment-control-batch-1.0.0-SNAPSHOT.jar */
		rakurakuCore.operateBatch("契約取得バッチ", "D:\\shipment-control-service\\shipment-control-batch\\build\\libs\\shipment-control-batch-1.0.0-SNAPSHOT.jarD:\\shipment-control-service\\shipment-control-batch\\build\\libs\\shipment-control-batch-1.0.0-SNAPSHOT.jar", "arrivalShipmentTotalJob, --job-id=12345, --operation-date=20210709,--subsidiary-code=101, --job-net-id=100");

		/* 操作(DB確認) → T_ARRIVAL_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_ARRIVAL_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_SHIPMENT_RESULT_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SHIPMENT_RESULT_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

}
