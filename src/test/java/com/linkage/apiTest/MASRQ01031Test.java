package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01031機能確認")
@DisplayName("MASRQ01031機能確認")
public class MASRQ01031Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01031");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01031");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****2+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****3+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****4+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****5+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****6+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****7+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****8+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****9+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****10+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****11+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****12+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****13+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****14+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****15+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****16+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****17+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****18+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****19+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****20+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****21+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****22+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****23+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****24+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****25+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****26+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****27+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****28+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****29+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-2-----/internal/v1/customer/get;;得意先情報取得API;;example-2-----/internal/v1/ship-to/get;;配送先情報取得API;;example-2-----/internal/v1/brand/get;;ブランド情報取得API;;example-2-----/internal/v1/plant/get;;置場情報取得API;;example-2-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****30+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-3-----/internal/v1/customer/get;;得意先情報取得API;;example-3-----/internal/v1/ship-to/get;;配送先情報取得API;;example-3-----/internal/v1/brand/get;;ブランド情報取得API;;example-3-----/internal/v1/plant/get;;置場情報取得API;;example-3-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1*****31+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1-----/internal/v1/calendar/search;;カレンダー情報検索API;;example-1");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMASRQ01031_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMASRQ01031_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345677&leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01031_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "11");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "12");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "13");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "15");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "16");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "17");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "18");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "19");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "20");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "21");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "22");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "23");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "24");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "25");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "26");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "28");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "29");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "29");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "29");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "30");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "30");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "30");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

	@Test
	public void testMASRQ01031_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01031/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "31");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "31");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "31");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "31");

		/* 操作(DB準備) → t_delete → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_delete", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_remind_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_remind_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/calendar/search → カレンダー情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/calendar/search", "カレンダー情報検索API", "example-1");

		/* 操作(api) → 型番訂正・納期確認履歴検索 → internal/v1/lead-time-product-inquiry-history/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("型番訂正・納期確認履歴検索", "internal/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=12345678&updateCount=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "-");

	}

}
