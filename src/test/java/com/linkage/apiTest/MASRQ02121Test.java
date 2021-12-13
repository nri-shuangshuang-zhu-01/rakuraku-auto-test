package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ02121機能確認")
@DisplayName("MASRQ02121機能確認")
public class MASRQ02121Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ02121");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ02121");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****2+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****3+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****4+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****5+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****6+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****7+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****8+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****9+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****10+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****11+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****12+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****13+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****14+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****15+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****16+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****17+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****18+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****19+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****20+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****21+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****22+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****23+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****24+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****25+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****26+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****27+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;2-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****28+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;record0-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****29+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;record0-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****30+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;record0-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****31+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;record0-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****32+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;record0-----/internal/v1/plant/get;;置場情報取得API;;1*****33+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;record0*****34+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;type1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****35+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****36+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****37+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1*****38+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1-----/internal/v1/supplier/get;;仕入先情報取得API;;1-----/internal/v1/customer/get;;得意先情報取得API;;1-----/internal/v1/ship-to/get;;配送先情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/plant/get;;置場情報取得API;;1");
	}

	@Test
	@Tag("納期型番確認情報取得複数件")
	@DisplayName("納期型番確認情報取得複数件")
	public void testMASRQ02121_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認情報取得1件")
	@DisplayName("納期型番確認情報取得1件")
	public void testMASRQ02121_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 依頼回答履歴.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 依頼回答履歴.納期型番確認ID")
	public void testMASRQ02121_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 依頼回答履歴.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 依頼回答履歴.現法コード")
	public void testMASRQ02121_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 確定見積ヘッダ.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 確定見積ヘッダ.納期型番確認ID")
	public void testMASRQ02121_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 確定見積ヘッダ.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 確定見積ヘッダ.現法コード")
	public void testMASRQ02121_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 確定見積明細.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 確定見積明細.納期型番確認ID")
	public void testMASRQ02121_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 確定見積明細.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 確定見積明細.現法コード")
	public void testMASRQ02121_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 承認.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 承認.納期型番確認ID")
	public void testMASRQ02121_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 承認.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 承認.現法コード")
	public void testMASRQ02121_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ チェックメッセージ履歴.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ チェックメッセージ履歴.納期型番確認ID")
	public void testMASRQ02121_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ チェックメッセージ履歴.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ チェックメッセージ履歴.現法コード")
	public void testMASRQ02121_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 一括分納履歴.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 一括分納履歴.納期型番確認ID")
	public void testMASRQ02121_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 一括分納履歴.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 一括分納履歴.現法コード")
	public void testMASRQ02121_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 確定受注明細.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 確定受注明細.納期型番確認ID")
	public void testMASRQ02121_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 確定受注明細.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 確定受注明細.現法コード")
	public void testMASRQ02121_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ 確定受注ヘッダ.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ 確定受注ヘッダ.納期型番確認ID")
	public void testMASRQ02121_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 確定受注ヘッダ.現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 確定受注ヘッダ.現法コード")
	public void testMASRQ02121_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.現法コード ≠ 指定された現法コード")
	@DisplayName("納期型番確認履歴.現法コード ≠ 指定された現法コード")
	public void testMASRQ02121_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("納期型番確認履歴.納期型番確認ID ≠ リクエスト項目.納期型番確認ID")
	@DisplayName("納期型番確認履歴.納期型番確認ID ≠ リクエスト項目.納期型番確認ID")
	public void testMASRQ02121_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=102&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("依頼回答履歴.更新回数 ≠ リクエスト項目.更新回数")
	@DisplayName("依頼回答履歴.更新回数 ≠ リクエスト項目.更新回数")
	public void testMASRQ02121_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=1", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("リクエスト項目.更新回数=空白の場合")
	@DisplayName("リクエスト項目.更新回数=空白の場合")
	public void testMASRQ02121_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("リクエスト項目.更新回数=NULLの場合")
	@DisplayName("リクエスト項目.更新回数=NULLの場合")
	public void testMASRQ02121_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最大値")
	@DisplayName("最大値")
	public void testMASRQ02121_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値(NULL)")
	@DisplayName("最小値(NULL)")
	public void testMASRQ02121_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値(空白)")
	@DisplayName("最小値(空白)")
	public void testMASRQ02121_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("仕入先コード取得複数件")
	@DisplayName("仕入先コード取得複数件")
	public void testMASRQ02121_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "2");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("仕入先コード取得0件")
	@DisplayName("仕入先コード取得0件")
	public void testMASRQ02121_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "record0");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("仕入先メールアドレス取得0件")
	@DisplayName("仕入先メールアドレス取得0件")
	public void testMASRQ02121_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "record0");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("得意先情報取得API取得0件")
	@DisplayName("得意先情報取得API取得0件")
	public void testMASRQ02121_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "record0");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("配送先情報取得API取得0件")
	@DisplayName("配送先情報取得API取得0件")
	public void testMASRQ02121_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "record0");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ブランド情報取得API取得0件")
	@DisplayName("ブランド情報取得API取得0件")
	public void testMASRQ02121_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "record0");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("置場情報取得API取得0件")
	@DisplayName("置場情報取得API取得0件")
	public void testMASRQ02121_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "record0");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("仕入先情報取得.顧客情報非開示区分が0以外の場合")
	@DisplayName("仕入先情報取得.顧客情報非開示区分が0以外の場合")
	public void testMASRQ02121_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "type1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("メーカー依頼日付＋「２時間」＞閉め時間（20：20）の場合")
	@DisplayName("メーカー依頼日付＋「２時間」＞閉め時間（20：20）の場合")
	public void testMASRQ02121_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("メーカー依頼日付＋「２時間」=閉め時間（20：20）の場合")
	@DisplayName("メーカー依頼日付＋「２時間」=閉め時間（20：20）の場合")
	public void testMASRQ02121_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

	@Test
	@Tag("依頼回答履歴.仕入先コード ≠ 認証情報.仕入先コード")
	@DisplayName("依頼回答履歴.仕入先コード ≠ 認証情報.仕入先コード")
	public void testMASRQ02121_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02121/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply_history", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "1");

		/* 操作(api) → 检索 → supplier/v1/lead-time-product-inquiry-history/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier → UserLoginInfo */
		rakurakuCore.operateApi("检索", "supplier/v1/lead-time-product-inquiry-history/search?leadTimeProductInquiryId=101&updateCount=0", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=offset&&Idempotency-Key=string&&X-User-Type=Supplier", "UserLoginInfo", "-");

	}

}
