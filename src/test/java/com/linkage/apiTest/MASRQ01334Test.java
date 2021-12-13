package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01334機能確認")
@DisplayName("MASRQ01334機能確認")
public class MASRQ01334Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01334");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01334");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/brand/get;;ブランド情報取得API;;1-----/internal/v1/sales-order/search;;受注検索API;;1-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;1-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;1-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;1*****2+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****3+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****4+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****5+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****6+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****7+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****8+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****9+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****10+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;*****11+++++/v1/subsidiary/get;;現法情報取得API;;-----/internal/v1/brand/get;;ブランド情報取得API;;-----/internal/v1/sales-order/search;;受注検索API;;-----/internal/v1/report/print;;帳票APIサービス・帳票作成API;;-----/internal/v1/report/find;;帳票基盤サービス・詳細情報取得API;;-----/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;");
	}

	@Test
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMASRQ01334_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(apiMock) → /v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票APIサービス・帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票APIサービス・帳票作成API", "1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票基盤サービス・詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票基盤サービス・詳細情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	@Tag("test0002")
	@DisplayName("test0002")
	public void testMASRQ01334_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	@Tag("test0003")
	@DisplayName("test0003")
	public void testMASRQ01334_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "10");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "11");

		/* 操作(api) → 調整問合せ書(注文)生成依頼 → internal/v1/so-inquiry-form/generate/request → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼", "internal/v1/so-inquiry-form/generate/request", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Authorization=Authorization&&X-Client-Program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01334\\MASRQ01334-1.json");

	}

	@Test
	public void testMASRQ01334_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMASRQ01334_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01334/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

}
