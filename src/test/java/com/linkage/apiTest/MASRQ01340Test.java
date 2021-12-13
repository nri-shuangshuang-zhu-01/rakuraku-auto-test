package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01340機能確認")
@DisplayName("MASRQ01340機能確認")
public class MASRQ01340Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01340");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01340");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****2+++++/internal/v1/product/search;;商品情報検索API;;2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****3+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****4+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****5+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****6+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****7+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****8+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****9+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****10+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****11+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****12+++++/internal/v1/product/search;;商品情報検索API;;3-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****13+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;2*****14+++++/internal/v1/product/search;;商品情報検索API;;4-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****15+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****16+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****17+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****18+++++/internal/v1/product/search;;商品情報検索API;;5-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****19+++++/internal/v1/product/search;;商品情報検索API;;1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1*****20+++++/internal/v1/product/search;;商品情報検索API;;6-----/internal/v1/mail-template/preview;;メールプレビューAPI;;1");
	}

	@Test
	@Tag("test01")
	@DisplayName("test01")
	public void testMASRQ01340_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test02")
	@DisplayName("test02")
	public void testMASRQ01340_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test03")
	@DisplayName("test03")
	public void testMASRQ01340_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test04")
	@DisplayName("test04")
	public void testMASRQ01340_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test05")
	@DisplayName("test05")
	public void testMASRQ01340_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test06")
	@DisplayName("test06")
	public void testMASRQ01340_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test07")
	@DisplayName("test07")
	public void testMASRQ01340_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test08")
	@DisplayName("test08")
	public void testMASRQ01340_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test09")
	@DisplayName("test09")
	public void testMASRQ01340_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test10")
	@DisplayName("test10")
	public void testMASRQ01340_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test11")
	@DisplayName("test11")
	public void testMASRQ01340_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test12")
	@DisplayName("test12")
	public void testMASRQ01340_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test13")
	@DisplayName("test13")
	public void testMASRQ01340_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "2");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test14")
	@DisplayName("test14")
	public void testMASRQ01340_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test15")
	@DisplayName("test15")
	public void testMASRQ01340_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test16")
	@DisplayName("test16")
	public void testMASRQ01340_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test17")
	@DisplayName("test17")
	public void testMASRQ01340_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test18")
	@DisplayName("test18")
	public void testMASRQ01340_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "5");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test19")
	@DisplayName("test19")
	public void testMASRQ01340_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "6");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

	@Test
	@Tag("test20")
	@DisplayName("test20")
	public void testMASRQ01340_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01340/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品情報検索API", "6");

		/* 操作(apiMock) → /internal/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/internal/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(api) → 检索 → internal/v1/notification-body/create → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/notification-body/create", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01340\\test1.txt");

	}

}
