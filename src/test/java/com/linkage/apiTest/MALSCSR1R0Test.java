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
public class MALSCSR1R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSR1R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSR1R0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****2+++++/internal/v1/area/search;;エリア情報検索API;;2-----/internal/v1/plant/search;;置場情報検索API;;2*****3+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****4+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****5+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****6+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****7+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****8+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****9+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****10+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****11+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****12+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****13+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****14+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****15+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****16+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****17+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****18+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****19+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****20+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****21+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****22+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****23+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****24+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****25+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****26+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****27+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****28+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****29+++++/internal/v1/area/search;;エリア情報検索API;;3-----/internal/v1/plant/search;;置場情報検索API;;*****30+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;3*****31+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****32+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****33+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****34+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****35+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****36+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****37+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****38+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****39+++++/internal/v1/area/search;;エリア情報検索API;;4-----/internal/v1/plant/search;;置場情報検索API;;4*****40+++++/internal/v1/area/search;;エリア情報検索API;;1-----/internal/v1/plant/search;;置場情報検索API;;1*****41+++++/internal/v1/area/search;;エリア情報検索API;;5-----/internal/v1/plant/search;;置場情報検索API;;5");
	}

	@Test
	@Tag("レスポンス情報を1件取得する場合確認")
	@DisplayName("レスポンス情報を1件取得する場合確認")
	public void testMALSCSR1R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("レスポンス情報を複数件取得する場合確認")
	@DisplayName("レスポンス情報を複数件取得する場合確認")
	public void testMALSCSR1R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "27");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "2");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("複数件場合確認")
	@DisplayName("複数件場合確認")
	public void testMALSCSR1R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =02の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =02の場合1件場合確認")
	public void testMALSCSR1R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =03の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =03の場合1件場合確認")
	public void testMALSCSR1R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =04の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =04の場合1件場合確認")
	public void testMALSCSR1R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "6");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =01 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =01 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "7");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =02 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =02 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "8");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =03 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =03 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "9");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =04 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =04 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "10");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =08 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =08 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "11");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =09 1件場合確認")
	@DisplayName("出荷件数集計表示区分 =09 1件場合確認")
	public void testMALSCSR1R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "12");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =07 かつ、調達区分 =01の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =07 かつ、調達区分 =01の場合1件場合確認")
	public void testMALSCSR1R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "13");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =05の場合1件場合確認")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =05の場合1件場合確認")
	public void testMALSCSR1R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "14");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.2を参照0件場合確認")
	@DisplayName("シート「SQLマトリックス」のNo.2を参照0件場合確認")
	public void testMALSCSR1R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "15");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.3を参照0件場合確認")
	@DisplayName("シート「SQLマトリックス」のNo.3を参照0件場合確認")
	public void testMALSCSR1R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2489-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.4を参照0件場合確認")
	@DisplayName("シート「SQLマトリックス」のNo.4を参照0件場合確認")
	public void testMALSCSR1R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=wwww&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.5を参照0件場合確認")
	@DisplayName("シート「SQLマトリックス」のNo.5を参照0件場合確認")
	public void testMALSCSR1R0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "26");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 複数件確認")
	@DisplayName("出荷件数集計表示区分 in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 複数件確認")
	public void testMALSCSR1R0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "16");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 1件確認")
	@DisplayName("出荷件数集計表示区分 =00 1件確認")
	public void testMALSCSR1R0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "17");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 1件場合確認")
	@DisplayName("出荷件数集計表示区分 in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 1件場合確認")
	public void testMALSCSR1R0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "18");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 not in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 1件場合確認")
	@DisplayName("出荷件数集計表示区分 not in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 01 1件場合確認")
	public void testMALSCSR1R0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "19");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 not in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 02 1件場合確認")
	@DisplayName("出荷件数集計表示区分 not in ( 01,02, 03, 04, 08 ) かつ、調達方法区分 = 02 1件場合確認")
	public void testMALSCSR1R0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "20");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 = 09 1件場合確認")
	@DisplayName("出荷件数集計表示区分 = 09 1件場合確認")
	public void testMALSCSR1R0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "21");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最大値場合確認")
	@DisplayName("最大値場合確認")
	public void testMALSCSR1R0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "23");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値（NULL）場合確認")
	@DisplayName("最小値（NULL）場合確認")
	public void testMALSCSR1R0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "24");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値（空白）場合確認")
	@DisplayName("最小値（空白）場合確認")
	public void testMALSCSR1R0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "25");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("エリアマスタ参照APIのレスポンスがエラーの場合確認")
	@DisplayName("エリアマスタ参照APIのレスポンスがエラーの場合確認")
	public void testMALSCSR1R0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "3");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("置場マスタ参照APIのレスポンスがエラーの場合確認")
	@DisplayName("置場マスタ参照APIのレスポンスがエラーの場合確認")
	public void testMALSCSR1R0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "3");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷日別エリア別出荷件数集計情報届け先数取得SQLの処理結果が0件の場合")
	@DisplayName("出荷日別エリア別出荷件数集計情報届け先数取得SQLの処理結果が0件の場合")
	public void testMALSCSR1R0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =00 かつ、調達区分 =02の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =00 かつ、調達区分 =02の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =01 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =01 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "7");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =02 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =02 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "8");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =03 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =03 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "9");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =04 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =04 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "10");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =08 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =08 かつ、調達区分 =01の場合1件場合確認( 海外 )")
	public void testMALSCSR1R0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "11");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 =09 1件場合確認( 海外 )")
	@DisplayName("出荷件数集計表示区分 =09 1件場合確認( 海外 )")
	public void testMALSCSR1R0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "12");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "4");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("出荷件数集計表示区分 = 00 DISTINCT後複数件確認")
	@DisplayName("出荷件数集計表示区分 = 00 DISTINCT後複数件確認")
	public void testMALSCSR1R0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "28");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "1");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

	@Test
	@Tag("合計確認")
	@DisplayName("合計確認")
	public void testMALSCSR1R0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSR1R0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_shipping_date_area_shipment_count_summary → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_shipping_date_area_shipment_count_summary", "データクリア・挿入", "29");

		/* 操作(apiMock) → /internal/v1/area/search → エリア情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/area/search", "エリア情報検索API", "5");

		/* 操作(apiMock) → /internal/v1/plant/search → 置場情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/plant/search", "置場情報検索API", "5");

		/* 操作(api) → 検索 → internal/v1/shipment-info-inq/reference? → GET → X-Client-Program=Test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/shipment-info-inq/reference?shipmentCenter=qqqq&shipmentDate=2021-09-27", "GET", "X-Client-Program=Test", "UserLoginInfo", "-");

	}

}
