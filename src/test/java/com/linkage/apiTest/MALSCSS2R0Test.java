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
public class MALSCSS2R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS2R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS2R0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****2+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;2-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;2-----/internal/v1/code/search;;コード情報検索API;;2*****3+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;3-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;3-----/internal/v1/plant/get-list;;置場情報取得API（List）;;3-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;3-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;3-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;2-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;3-----/internal/v1/code/search;;コード情報検索API;;3*****4+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;6-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;6-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****5+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****6+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****7+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****8+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;1*****9+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;4-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;-----/internal/v1/plant/get-list;;置場情報取得API（List）;;-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****10+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;4-----/internal/v1/plant/get-list;;置場情報取得API（List）;;-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****11+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;4-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****12+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;4-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****13+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;4-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****14+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;4-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;*****15+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;4-----/internal/v1/code/search;;コード情報検索API;;*****16+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;1-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;1-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;1-----/internal/v1/code/search;;コード情報検索API;;4*****17+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;5-----/internal/v1/plant/get-list;;置場情報取得API（List）;;5-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;5-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;5-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;5-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;5-----/internal/v1/code/search;;コード情報検索API;;5*****18+++++/newtonApi/shipmentfailsearch;;出荷不可検索(MS→GW);;5-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;-----/internal/v1/plant/get-list;;置場情報取得API（List）;;-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;-----/internal/v1/reason-type/get-list;;理由区分情報取得API（List）;;-----/internal/v1/slip-type/get-list;;伝票区分情報取得API（List）;;-----/internal/v1/code/search;;コード情報検索API;;");
	}

	@Test
	@Tag("受注状態が1(未変更)1件確認")
	@DisplayName("受注状態が1(未変更)1件確認")
	public void testMALSCSS2R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("受注状態が2(変更済)1件確認")
	@DisplayName("受注状態が2(変更済)1件確認")
	public void testMALSCSS2R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "2");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_002.txt");

	}

	@Test
	@Tag("受注状態が3(削除)複数件確認")
	@DisplayName("受注状態が3(削除)複数件確認")
	public void testMALSCSS2R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "3");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "3");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_003.txt");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMALSCSS2R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "6");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_004.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCSS2R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_005.txt");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMALSCSS2R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_006.txt");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMALSCSS2R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_007.txt");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMALSCSS2R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_008.txt");

	}

	@Test
	@Tag("出荷不可受注発注検索APIのレスポンスがエラーこと確認")
	@DisplayName("出荷不可受注発注検索APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("製品分類マスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("製品分類マスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("置場マスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("置場マスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("仕入先マスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("仕入先マスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("ブランドマスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("ブランドマスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("理由区分マスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("理由区分マスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("伝票区分マスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("伝票区分マスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("コードマスタ参照APIのレスポンスがエラーこと確認")
	@DisplayName("コードマスタ参照APIのレスポンスがエラーこと確認")
	public void testMALSCSS2R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "4");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("API呼出0件確認")
	@DisplayName("API呼出0件確認")
	public void testMALSCSS2R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝票区分情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝票区分情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/code/search → コード情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コード情報検索API", "5");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("最大参照件数確認")
	@DisplayName("最大参照件数確認")
	public void testMALSCSS2R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可検索(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可検索(MS→GW)", "5");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

}
