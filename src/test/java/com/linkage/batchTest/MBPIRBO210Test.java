package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO210")
@DisplayName("MBPIRBO210")
public class MBPIRBO210Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO210");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO210");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****2+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-2-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****3+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-3-----/internal/v1/plant/search;;置場情報検索API;;example-2-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****4+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;URL異常-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****5+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;URL異常-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****6+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****7+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****8+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****9+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-2*****10+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;URL異常*****11+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****12+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****13+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-3*****14+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-4*****15+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****16+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****17+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****18+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****19+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****20+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****21+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****22+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****23+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****24+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****25+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****26+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****27+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****28+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****29+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****30+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-3-----/internal/v1/plant/search;;置場情報検索API;;example-2-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****31+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-2*****32+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;URL異常-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****33+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;URL異常-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****34+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;URL異常*****35+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****36+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;example-1-----/internal/v1/plant/search;;置場情報検索API;;example-1-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;*****37+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****38+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****39+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****40+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****41+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****42+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****43+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****44+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1*****45+++++/internal/v1/delivery-destination/search;;納入先情報検索API;;-----/internal/v1/plant/search;;置場情報検索API;;-----/internal/v1/stock-setting/get;;在庫設定情報取得API;;example-1");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBPIRBO210_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBPIRBO210_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBPIRBO210_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBPIRBO210_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBPIRBO210_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBPIRBO210_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBPIRBO210_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBPIRBO210_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBPIRBO210_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST010")
	@DisplayName("TEST010")
	public void testMBPIRBO210_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST011")
	@DisplayName("TEST011")
	public void testMBPIRBO210_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=2=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST012")
	@DisplayName("TEST012")
	public void testMBPIRBO210_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=1,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=2=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST013")
	@DisplayName("TEST013")
	public void testMBPIRBO210_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=2=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST014")
	@DisplayName("TEST014")
	public void testMBPIRBO210_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=2=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST015")
	@DisplayName("TEST015")
	public void testMBPIRBO210_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST016")
	@DisplayName("TEST016")
	public void testMBPIRBO210_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST017")
	@DisplayName("TEST017")
	public void testMBPIRBO210_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST018")
	@DisplayName("TEST018")
	public void testMBPIRBO210_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST019")
	@DisplayName("TEST019")
	public void testMBPIRBO210_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST020")
	@DisplayName("TEST020")
	public void testMBPIRBO210_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST021")
	@DisplayName("TEST021")
	public void testMBPIRBO210_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST022")
	@DisplayName("TEST022")
	public void testMBPIRBO210_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST023")
	@DisplayName("TEST023")
	public void testMBPIRBO210_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST024")
	@DisplayName("TEST024")
	public void testMBPIRBO210_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST025")
	@DisplayName("TEST025")
	public void testMBPIRBO210_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST026")
	@DisplayName("TEST026")
	public void testMBPIRBO210_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST027")
	@DisplayName("TEST027")
	public void testMBPIRBO210_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=2345,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST028")
	@DisplayName("TEST028")
	public void testMBPIRBO210_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST029")
	@DisplayName("TEST029")
	public void testMBPIRBO210_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST030")
	@DisplayName("TEST030")
	public void testMBPIRBO210_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST031")
	@DisplayName("TEST031")
	public void testMBPIRBO210_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST032")
	@DisplayName("TEST032")
	public void testMBPIRBO210_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST033")
	@DisplayName("TEST033")
	public void testMBPIRBO210_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST034")
	@DisplayName("TEST034")
	public void testMBPIRBO210_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "URL異常");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST035")
	@DisplayName("TEST035")
	public void testMBPIRBO210_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--implement-div=1,--process-type=0,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST036")
	@DisplayName("TEST036")
	public void testMBPIRBO210_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/delivery-destination/search → 納入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/delivery-destination/search", "納入先情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=1,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST037")
	@DisplayName("TEST037")
	public void testMBPIRBO210_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST038")
	@DisplayName("TEST038")
	public void testMBPIRBO210_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST039")
	@DisplayName("TEST039")
	public void testMBPIRBO210_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST040")
	@DisplayName("TEST040")
	public void testMBPIRBO210_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST041")
	@DisplayName("TEST041")
	public void testMBPIRBO210_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST042")
	@DisplayName("TEST042")
	public void testMBPIRBO210_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST043")
	@DisplayName("TEST043")
	public void testMBPIRBO210_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--implement-div=2,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST044")
	@DisplayName("TEST044")
	public void testMBPIRBO210_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--subsidiary-code=JPN,--process-type=0,--ginner-code=12345678901234,--plant-code=1234,--delivery-div=1,--deli-map=1=1234,--plant-list=0001,--job-execution-id=MBPIRBO210");

	}

	@Test
	@Tag("TEST045")
	@DisplayName("TEST045")
	public void testMBPIRBO210_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO210/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/get → 在庫設定情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/get", "在庫設定情報取得API", "example-1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "repaintShipmentRecordPoolPlantJob,--job-execution-id=MBPIRBO210");

	}

}
