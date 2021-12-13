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
public class MASAR20010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20010");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/ccy/search;;通貨情報取得API;;1*****2+++++/v1/ccy/search;;通貨情報取得API;;1*****3+++++/v1/ccy/search;;通貨情報取得API;;1*****4+++++/v1/ccy/search;;通貨情報取得API;;1*****5+++++/v1/ccy/search;;通貨情報取得API;;1*****6+++++/v1/ccy/search;;通貨情報取得API;;1*****7+++++/v1/ccy/search;;通貨情報取得API;;1*****8+++++/v1/ccy/search;;通貨情報取得API;;1*****9+++++/v1/ccy/search;;通貨情報取得API;;1*****10+++++/v1/ccy/search;;通貨情報取得API;;1*****11+++++/v1/ccy/search;;通貨情報取得API;;1*****12+++++/v1/ccy/search;;通貨情報取得API;;1*****13+++++/v1/ccy/search;;通貨情報取得API;;1*****14+++++/v1/ccy/search;;通貨情報取得API;;1*****15+++++/v1/ccy/search;;通貨情報取得API;;1*****16+++++/v1/ccy/search;;通貨情報取得API;;1*****17+++++/v1/ccy/search;;通貨情報取得API;;1*****18+++++/v1/ccy/search;;通貨情報取得API;;1*****19+++++/v1/ccy/search;;通貨情報取得API;;1*****20+++++/v1/ccy/search;;通貨情報取得API;;1*****21+++++/v1/ccy/search;;通貨情報取得API;;1*****22+++++/v1/ccy/search;;通貨情報取得API;;1*****23+++++/v1/ccy/search;;通貨情報取得API;;1*****24+++++/v1/ccy/search;;通貨情報取得API;;1*****25+++++/v1/ccy/search;;通貨情報取得API;;1*****26+++++/v1/ccy/search;;通貨情報取得API;;1*****27+++++/v1/ccy/search;;通貨情報取得API;;3*****28+++++/v1/ccy/search;;通貨情報取得API;;1*****29+++++/v1/ccy/search;;通貨情報取得API;;1*****30+++++/v1/ccy/search;;通貨情報取得API;;1*****31+++++/v1/ccy/search;;通貨情報取得API;;1*****32+++++/v1/ccy/search;;通貨情報取得API;;1*****33+++++/v1/ccy/search;;通貨情報取得API;;1*****34+++++/v1/ccy/search;;通貨情報取得API;;1*****35+++++/v1/ccy/search;;通貨情報取得API;;1*****36+++++/v1/ccy/search;;通貨情報取得API;;1*****37+++++/v1/ccy/search;;通貨情報取得API;;1*****38+++++/v1/ccy/search;;通貨情報取得API;;1*****39+++++/v1/ccy/search;;通貨情報取得API;;1*****40+++++/v1/ccy/search;;通貨情報取得API;;1*****41+++++/v1/ccy/search;;通貨情報取得API;;1*****42+++++/v1/ccy/search;;通貨情報取得API;;1*****43+++++/v1/ccy/search;;通貨情報取得API;;1*****44+++++/v1/ccy/search;;通貨情報取得API;;1*****45+++++/v1/ccy/search;;通貨情報取得API;;1*****46+++++/v1/ccy/search;;通貨情報取得API;;1*****47+++++/v1/ccy/search;;通貨情報取得API;;1*****48+++++/v1/ccy/search;;通貨情報取得API;;1*****49+++++/v1/ccy/search;;通貨情報取得API;;1*****50+++++/v1/ccy/search;;通貨情報取得API;;1*****51+++++/v1/ccy/search;;通貨情報取得API;;1*****52+++++/v1/ccy/search;;通貨情報取得API;;1*****54+++++/v1/ccy/search;;通貨情報取得API;;1*****53+++++/v1/ccy/search;;通貨情報取得API;;1*****54+++++/v1/ccy/search;;通貨情報取得API;;1*****55+++++/v1/ccy/search;;通貨情報取得API;;1*****56+++++/v1/ccy/search;;通貨情報取得API;;1*****57+++++/v1/ccy/search;;通貨情報取得API;;1*****58+++++/v1/ccy/search;;通貨情報取得API;;1*****59+++++/v1/ccy/search;;通貨情報取得API;;1*****60+++++/v1/ccy/search;;通貨情報取得API;;1*****61+++++/v1/ccy/search;;通貨情報取得API;;1*****62+++++/v1/ccy/search;;通貨情報取得API;;1*****63+++++/v1/ccy/search;;通貨情報取得API;;1*****64+++++/v1/ccy/search;;通貨情報取得API;;1*****65+++++/v1/ccy/search;;通貨情報取得API;;1*****66+++++/v1/ccy/search;;通貨情報取得API;;1*****67+++++/v1/ccy/search;;通貨情報取得API;;1*****68+++++/v1/ccy/search;;通貨情報取得API;;1*****69+++++/v1/ccy/search;;通貨情報取得API;;1*****70+++++/v1/ccy/search;;通貨情報取得API;;1*****71+++++/v1/ccy/search;;通貨情報取得API;;1*****72+++++/v1/ccy/search;;通貨情報取得API;;1*****73+++++/v1/ccy/search;;通貨情報取得API;;1*****74+++++/v1/ccy/search;;通貨情報取得API;;1*****75+++++/v1/ccy/search;;通貨情報取得API;;1*****76+++++/v1/ccy/search;;通貨情報取得API;;1*****77+++++/v1/ccy/search;;通貨情報取得API;;1*****78+++++/v1/ccy/search;;通貨情報取得API;;1*****79+++++/v1/ccy/search;;通貨情報取得API;;1*****80+++++/v1/ccy/search;;通貨情報取得API;;1*****81+++++/v1/ccy/search;;通貨情報取得API;;1*****82+++++/v1/ccy/search;;通貨情報取得API;;1*****83+++++/v1/ccy/search;;通貨情報取得API;;1*****84+++++/v1/ccy/search;;通貨情報取得API;;2*****85+++++/v1/ccy/search;;通貨情報取得API;;1*****86+++++/v1/ccy/search;;通貨情報取得API;;1*****87+++++/v1/ccy/search;;通貨情報取得API;;1*****88+++++/v1/ccy/search;;通貨情報取得API;;1*****89+++++/v1/ccy/search;;通貨情報取得API;;1");
	}

	@Test
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testMASAR20010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_001.txt");

	}

	@Test
	public void testMASAR20010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "2");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_002.txt");

	}

	@Test
	public void testMASAR20010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "3");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_003.txt");

	}

	@Test
	public void testMASAR20010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "4");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_004.txt");

	}

	@Test
	public void testMASAR20010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "5");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_005.txt");

	}

	@Test
	public void testMASAR20010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "6");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_006.txt");

	}

	@Test
	public void testMASAR20010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "7");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_007.txt");

	}

	@Test
	public void testMASAR20010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "8");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_008.txt");

	}

	@Test
	public void testMASAR20010_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "9");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_009.txt");

	}

	@Test
	public void testMASAR20010_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "10");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_010.txt");

	}

	@Test
	public void testMASAR20010_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "11");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "11");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_011.txt");

	}

	@Test
	public void testMASAR20010_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "12");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "12");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_012.txt");

	}

	@Test
	public void testMASAR20010_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "13");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "13");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_013.txt");

	}

	@Test
	public void testMASAR20010_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "14");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "14");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_014.txt");

	}

	@Test
	public void testMASAR20010_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "15");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "15");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_015.txt");

	}

	@Test
	public void testMASAR20010_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "16");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "16");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_016.txt");

	}

	@Test
	public void testMASAR20010_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "17");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "17");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_017.txt");

	}

	@Test
	public void testMASAR20010_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "18");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "18");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_018.txt");

	}

	@Test
	public void testMASAR20010_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "19");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "19");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_019.txt");

	}

	@Test
	public void testMASAR20010_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "20");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "20");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_020.txt");

	}

	@Test
	public void testMASAR20010_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "21");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "21");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_021.txt");

	}

	@Test
	public void testMASAR20010_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "22");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "22");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_022.txt");

	}

	@Test
	public void testMASAR20010_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "23");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "23");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_023.txt");

	}

	@Test
	public void testMASAR20010_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "24");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "24");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_024.txt");

	}

	@Test
	public void testMASAR20010_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "25");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "25");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_025.txt");

	}

	@Test
	@Tag("12")
	@DisplayName("12")
	public void testMASAR20010_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "26");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "26");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_026.txt");

	}

	@Test
	public void testMASAR20010_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "27");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "27");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "3");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_027.txt");

	}

	@Test
	public void testMASAR20010_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "28");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "28");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_028.txt");

	}

	@Test
	public void testMASAR20010_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "29");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "29");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_029.txt");

	}

	@Test
	public void testMASAR20010_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "30");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "30");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_030.txt");

	}

	@Test
	public void testMASAR20010_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "31");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "31");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_031.txt");

	}

	@Test
	public void testMASAR20010_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "32");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "32");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_032.txt");

	}

	@Test
	public void testMASAR20010_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "33");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "33");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_033.txt");

	}

	@Test
	public void testMASAR20010_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "34");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "34");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_034.txt");

	}

	@Test
	public void testMASAR20010_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "35");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "35");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_035.txt");

	}

	@Test
	public void testMASAR20010_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "36");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "36");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_036.txt");

	}

	@Test
	public void testMASAR20010_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "37");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "37");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_037.txt");

	}

	@Test
	public void testMASAR20010_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "38");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "38");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_038.txt");

	}

	@Test
	public void testMASAR20010_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "39");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "39");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_039.txt");

	}

	@Test
	public void testMASAR20010_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "40");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "40");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_040.txt");

	}

	@Test
	public void testMASAR20010_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "41");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "41");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_041.txt");

	}

	@Test
	public void testMASAR20010_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "42");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "42");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_042.txt");

	}

	@Test
	public void testMASAR20010_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "43");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "43");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_043.txt");

	}

	@Test
	public void testMASAR20010_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "44");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "44");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_044.txt");

	}

	@Test
	public void testMASAR20010_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "45");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "45");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_045.txt");

	}

	@Test
	public void testMASAR20010_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "46");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "46");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_046.txt");

	}

	@Test
	public void testMASAR20010_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "47");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "47");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_047.txt");

	}

	@Test
	public void testMASAR20010_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "48");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "48");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_048.txt");

	}

	@Test
	public void testMASAR20010_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "49");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "49");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_049.txt");

	}

	@Test
	public void testMASAR20010_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "50");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "50");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_050.txt");

	}

	@Test
	public void testMASAR20010_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "51");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "51");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_051.txt");

	}

	@Test
	@Tag("9")
	@DisplayName("9")
	public void testMASAR20010_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "52");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "52");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_052.txt");

	}

	@Test
	public void testMASAR20010_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "53");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "53");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_053.txt");

	}

	@Test
	public void testMASAR20010_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "54");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "54");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_054.txt");

	}

	@Test
	public void testMASAR20010_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "55");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "55");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_055.txt");

	}

	@Test
	public void testMASAR20010_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "56");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "56");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_056.txt");

	}

	@Test
	public void testMASAR20010_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "57");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "57");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_057.txt");

	}

	@Test
	public void testMASAR20010_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "58");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "58");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_058.txt");

	}

	@Test
	public void testMASAR20010_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "59");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "59");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_059.txt");

	}

	@Test
	public void testMASAR20010_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "60");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "60");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_060.txt");

	}

	@Test
	public void testMASAR20010_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "61");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "61");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_061.txt");

	}

	@Test
	public void testMASAR20010_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "62");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "62");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_062.txt");

	}

	@Test
	public void testMASAR20010_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "63");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "63");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_063.txt");

	}

	@Test
	public void testMASAR20010_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "64");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "64");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_064.txt");

	}

	@Test
	public void testMASAR20010_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "65");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "65");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_065.txt");

	}

	@Test
	public void testMASAR20010_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "66");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "66");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_066.txt");

	}

	@Test
	public void testMASAR20010_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "67");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "67");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_067.txt");

	}

	@Test
	public void testMASAR20010_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "68");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "68");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_068.txt");

	}

	@Test
	public void testMASAR20010_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "69");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "69");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_069.txt");

	}

	@Test
	public void testMASAR20010_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "70");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "70");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_070.txt");

	}

	@Test
	public void testMASAR20010_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "71");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "71");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_071.txt");

	}

	@Test
	public void testMASAR20010_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "72");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "72");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_072.txt");

	}

	@Test
	public void testMASAR20010_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "73");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "73");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_073.txt");

	}

	@Test
	public void testMASAR20010_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "74");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "74");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_074.txt");

	}

	@Test
	public void testMASAR20010_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "75");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "75");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_075.txt");

	}

	@Test
	public void testMASAR20010_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "76");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "76");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_076.txt");

	}

	@Test
	public void testMASAR20010_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "77");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "77");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_077.txt");

	}

	@Test
	public void testMASAR20010_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "78");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "78");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_078.txt");

	}

	@Test
	public void testMASAR20010_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "79");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "79");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_079.txt");

	}

	@Test
	public void testMASAR20010_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "80");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "80");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_080.txt");

	}

	@Test
	public void testMASAR20010_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "81");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "81");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_081.txt");

	}

	@Test
	public void testMASAR20010_082() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_082/case_082_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "82");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "82");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_082.txt");

	}

	@Test
	public void testMASAR20010_083() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_083/case_083_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "83");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "83");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_083.txt");

	}

	@Test
	public void testMASAR20010_084() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_084/case_084_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "84");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "84");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "2");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_084.txt");

	}

	@Test
	public void testMASAR20010_085() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_085/case_085_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "85");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "85");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_085.txt");

	}

	@Test
	public void testMASAR20010_086() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_086/case_086_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "86");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "86");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_086.txt");

	}

	@Test
	public void testMASAR20010_087() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_087/case_087_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "87");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "87");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_087.txt");

	}

	@Test
	public void testMASAR20010_088() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010/case_088/case_088_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "88");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "88");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\MASAR20010_088.txt");

	}

}
