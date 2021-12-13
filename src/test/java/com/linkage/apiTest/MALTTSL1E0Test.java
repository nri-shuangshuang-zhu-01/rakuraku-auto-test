package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

public class MALTTSL1E0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALTTSL1E0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALTTSL1E0");
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
	@Tag("test01")
	@DisplayName("test01")
	public void testMALTTSL1E0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test1.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test02")
	@DisplayName("test02")
	public void testMALTTSL1E0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test2.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test03")
	@DisplayName("test03")
	public void testMALTTSL1E0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test3.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test04")
	@DisplayName("test04")
	public void testMALTTSL1E0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test4.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test05")
	@DisplayName("test05")
	public void testMALTTSL1E0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test5.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test06")
	@DisplayName("test06")
	public void testMALTTSL1E0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test6.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → PRODUCED_EVENTS_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("PRODUCED_EVENTS_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test07")
	@DisplayName("test07")
	public void testMALTTSL1E0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test7.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test08")
	@DisplayName("test08")
	public void testMALTTSL1E0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test8.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test09")
	@DisplayName("test09")
	public void testMALTTSL1E0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test9.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test10")
	@DisplayName("test10")
	public void testMALTTSL1E0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test10.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test11")
	@DisplayName("test11")
	public void testMALTTSL1E0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test11.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test12")
	@DisplayName("test12")
	public void testMALTTSL1E0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test12.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test13")
	@DisplayName("test13")
	public void testMALTTSL1E0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test13.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test14")
	@DisplayName("test14")
	public void testMALTTSL1E0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test14.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test15")
	@DisplayName("test15")
	public void testMALTTSL1E0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test15.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test16")
	@DisplayName("test16")
	public void testMALTTSL1E0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test16.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test17")
	@DisplayName("test17")
	public void testMALTTSL1E0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test17.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test18")
	@DisplayName("test18")
	public void testMALTTSL1E0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test18.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test19")
	@DisplayName("test19")
	public void testMALTTSL1E0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test19.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test20")
	@DisplayName("test20")
	public void testMALTTSL1E0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test20.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test21")
	@DisplayName("test21")
	public void testMALTTSL1E0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "8");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test21.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test22")
	@DisplayName("test22")
	public void testMALTTSL1E0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test22.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test23")
	@DisplayName("test23")
	public void testMALTTSL1E0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test23.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test24")
	@DisplayName("test24")
	public void testMALTTSL1E0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test24.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test25")
	@DisplayName("test25")
	public void testMALTTSL1E0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test25.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test26")
	@DisplayName("test26")
	public void testMALTTSL1E0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "10");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test26.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test27")
	@DisplayName("test27")
	public void testMALTTSL1E0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test27.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test28")
	@DisplayName("test28")
	public void testMALTTSL1E0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test28.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test29")
	@DisplayName("test29")
	public void testMALTTSL1E0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test29.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test30")
	@DisplayName("test30")
	public void testMALTTSL1E0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test30.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test31")
	@DisplayName("test31")
	public void testMALTTSL1E0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test31.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test32")
	@DisplayName("test32")
	public void testMALTTSL1E0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test32.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test33")
	@DisplayName("test33")
	public void testMALTTSL1E0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "11");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test33.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test34")
	@DisplayName("test34")
	public void testMALTTSL1E0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test34.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test35")
	@DisplayName("test35")
	public void testMALTTSL1E0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "13");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test35.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test36")
	@DisplayName("test36")
	public void testMALTTSL1E0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "12");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test36.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test37")
	@DisplayName("test37")
	public void testMALTTSL1E0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "14");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test37.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test38")
	@DisplayName("test38")
	public void testMALTTSL1E0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "15");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test38.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test39")
	@DisplayName("test39")
	public void testMALTTSL1E0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "16");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test39.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test40")
	@DisplayName("test40")
	public void testMALTTSL1E0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "17");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test40.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test41")
	@DisplayName("test41")
	public void testMALTTSL1E0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "18");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test41.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test42")
	@DisplayName("test42")
	public void testMALTTSL1E0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "19");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test42.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test43")
	@DisplayName("test43")
	public void testMALTTSL1E0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "20");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test43.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test44")
	@DisplayName("test44")
	public void testMALTTSL1E0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "21");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test44.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test45")
	@DisplayName("test45")
	public void testMALTTSL1E0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "22");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test45.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test46")
	@DisplayName("test46")
	public void testMALTTSL1E0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "23");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test46.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test47")
	@DisplayName("test47")
	public void testMALTTSL1E0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test47.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test48")
	@DisplayName("test48")
	public void testMALTTSL1E0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "24");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test48.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test49")
	@DisplayName("test49")
	public void testMALTTSL1E0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "25");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test49.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test50")
	@DisplayName("test50")
	public void testMALTTSL1E0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "19");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test50.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test51")
	@DisplayName("test51")
	public void testMALTTSL1E0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "20");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test51.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test52")
	@DisplayName("test52")
	public void testMALTTSL1E0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "21");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test52.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test53")
	@DisplayName("test53")
	public void testMALTTSL1E0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "3");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test53.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test54")
	@DisplayName("test54")
	public void testMALTTSL1E0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "26");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test54.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test55")
	@DisplayName("test55")
	public void testMALTTSL1E0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "27");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test55.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test56")
	@DisplayName("test56")
	public void testMALTTSL1E0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "28");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test56.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test57")
	@DisplayName("test57")
	public void testMALTTSL1E0_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test57.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test58")
	@DisplayName("test58")
	public void testMALTTSL1E0_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test58.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test59")
	@DisplayName("test59")
	public void testMALTTSL1E0_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test59.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test60")
	@DisplayName("test60")
	public void testMALTTSL1E0_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test60.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test61")
	@DisplayName("test61")
	public void testMALTTSL1E0_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test61.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test62")
	@DisplayName("test62")
	public void testMALTTSL1E0_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test62.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test63")
	@DisplayName("test63")
	public void testMALTTSL1E0_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test63.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test64")
	@DisplayName("test64")
	public void testMALTTSL1E0_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test64.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test65")
	@DisplayName("test65")
	public void testMALTTSL1E0_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test65.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test66")
	@DisplayName("test66")
	public void testMALTTSL1E0_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test66.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test67")
	@DisplayName("test67")
	public void testMALTTSL1E0_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test67.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test68")
	@DisplayName("test68")
	public void testMALTTSL1E0_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test68.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test69")
	@DisplayName("test69")
	public void testMALTTSL1E0_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test69.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test70")
	@DisplayName("test70")
	public void testMALTTSL1E0_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test70.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test71")
	@DisplayName("test71")
	public void testMALTTSL1E0_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test71.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test72")
	@DisplayName("test72")
	public void testMALTTSL1E0_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test72.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test73")
	@DisplayName("test73")
	public void testMALTTSL1E0_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test73.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test74")
	@DisplayName("test74")
	public void testMALTTSL1E0_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test74.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test75")
	@DisplayName("test75")
	public void testMALTTSL1E0_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test75.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test76")
	@DisplayName("test76")
	public void testMALTTSL1E0_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test76.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test77")
	@DisplayName("test77")
	public void testMALTTSL1E0_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test77.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test78")
	@DisplayName("test78")
	public void testMALTTSL1E0_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test78.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test79")
	@DisplayName("test79")
	public void testMALTTSL1E0_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test79.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test80")
	@DisplayName("test80")
	public void testMALTTSL1E0_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test80.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test81")
	@DisplayName("test81")
	public void testMALTTSL1E0_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test81.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test82")
	@DisplayName("test82")
	public void testMALTTSL1E0_082() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_082/case_082_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test82.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test83")
	@DisplayName("test83")
	public void testMALTTSL1E0_083() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_083/case_083_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test83.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test84")
	@DisplayName("test84")
	public void testMALTTSL1E0_084() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_084/case_084_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test84.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test85")
	@DisplayName("test85")
	public void testMALTTSL1E0_085() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_085/case_085_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test85.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test86")
	@DisplayName("test86")
	public void testMALTTSL1E0_086() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_086/case_086_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test86.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test87")
	@DisplayName("test87")
	public void testMALTTSL1E0_087() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_087/case_087_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test87.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test88")
	@DisplayName("test88")
	public void testMALTTSL1E0_088() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_088/case_088_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test88.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test89")
	@DisplayName("test89")
	public void testMALTTSL1E0_089() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_089/case_089_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test89.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test90")
	@DisplayName("test90")
	public void testMALTTSL1E0_090() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_090/case_090_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test90.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test91")
	@DisplayName("test91")
	public void testMALTTSL1E0_091() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_091/case_091_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test91.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test92")
	@DisplayName("test92")
	public void testMALTTSL1E0_092() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_092/case_092_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test92.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test93")
	@DisplayName("test93")
	public void testMALTTSL1E0_093() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_093/case_093_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test93.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test94")
	@DisplayName("test94")
	public void testMALTTSL1E0_094() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_094/case_094_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test94.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test95")
	@DisplayName("test95")
	public void testMALTTSL1E0_095() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_095/case_095_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test95.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test96")
	@DisplayName("test96")
	public void testMALTTSL1E0_096() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_096/case_096_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test96.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test97")
	@DisplayName("test97")
	public void testMALTTSL1E0_097() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_097/case_097_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test97.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test98")
	@DisplayName("test98")
	public void testMALTTSL1E0_098() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_098/case_098_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test98.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test99")
	@DisplayName("test99")
	public void testMALTTSL1E0_099() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_099/case_099_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test99.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test100")
	@DisplayName("test100")
	public void testMALTTSL1E0_100() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_100/case_100_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test100.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test101")
	@DisplayName("test101")
	public void testMALTTSL1E0_101() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_101/case_101_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test101.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test102")
	@DisplayName("test102")
	public void testMALTTSL1E0_102() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_102/case_102_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test102.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test103")
	@DisplayName("test103")
	public void testMALTTSL1E0_103() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_103/case_103_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test103.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test104")
	@DisplayName("test104")
	public void testMALTTSL1E0_104() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_104/case_104_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test104.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test105")
	@DisplayName("test105")
	public void testMALTTSL1E0_105() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_105/case_105_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test105.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test106")
	@DisplayName("test106")
	public void testMALTTSL1E0_106() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_106/case_106_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test106.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test107")
	@DisplayName("test107")
	public void testMALTTSL1E0_107() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_107/case_107_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test107.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test108")
	@DisplayName("test108")
	public void testMALTTSL1E0_108() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_108/case_108_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test108.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test109")
	@DisplayName("test109")
	public void testMALTTSL1E0_109() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_109/case_109_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test109.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test110")
	@DisplayName("test110")
	public void testMALTTSL1E0_110() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_110/case_110_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test110.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test111")
	@DisplayName("test111")
	public void testMALTTSL1E0_111() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_111/case_111_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test111.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test112")
	@DisplayName("test112")
	public void testMALTTSL1E0_112() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_112/case_112_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test112.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test113")
	@DisplayName("test113")
	public void testMALTTSL1E0_113() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_113/case_113_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test113.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test114")
	@DisplayName("test114")
	public void testMALTTSL1E0_114() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_114/case_114_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test114.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test115")
	@DisplayName("test115")
	public void testMALTTSL1E0_115() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_115/case_115_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test115.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test116")
	@DisplayName("test116")
	public void testMALTTSL1E0_116() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_116/case_116_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test116.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test117")
	@DisplayName("test117")
	public void testMALTTSL1E0_117() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_117/case_117_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test117.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test118")
	@DisplayName("test118")
	public void testMALTTSL1E0_118() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_118/case_118_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test118.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test119")
	@DisplayName("test119")
	public void testMALTTSL1E0_119() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_119/case_119_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test119.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test120")
	@DisplayName("test120")
	public void testMALTTSL1E0_120() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_120/case_120_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test120.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test121")
	@DisplayName("test121")
	public void testMALTTSL1E0_121() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_121/case_121_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test121.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test122")
	@DisplayName("test122")
	public void testMALTTSL1E0_122() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_122/case_122_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test122.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test123")
	@DisplayName("test123")
	public void testMALTTSL1E0_123() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_123/case_123_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test123.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test124")
	@DisplayName("test124")
	public void testMALTTSL1E0_124() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_124/case_124_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test124.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test125")
	@DisplayName("test125")
	public void testMALTTSL1E0_125() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_125/case_125_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test125.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test126")
	@DisplayName("test126")
	public void testMALTTSL1E0_126() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_126/case_126_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test126.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test127")
	@DisplayName("test127")
	public void testMALTTSL1E0_127() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_127/case_127_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test127.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test128")
	@DisplayName("test128")
	public void testMALTTSL1E0_128() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_128/case_128_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "5");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test2.txt");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALTTSL1E0_129() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_129/case_129_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	@Tag("test130")
	@DisplayName("test130")
	public void testMALTTSL1E0_130() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_130/case_130_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test131")
	@DisplayName("test131")
	public void testMALTTSL1E0_131() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_131/case_131_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test129.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test132")
	@DisplayName("test132")
	public void testMALTTSL1E0_132() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_132/case_132_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test133")
	@DisplayName("test133")
	public void testMALTTSL1E0_133() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_133/case_133_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test134")
	@DisplayName("test134")
	public void testMALTTSL1E0_134() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_134/case_134_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test130.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test135")
	@DisplayName("test135")
	public void testMALTTSL1E0_135() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_135/case_135_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test129.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test136")
	@DisplayName("test136")
	public void testMALTTSL1E0_136() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_136/case_136_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test131.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test137")
	@DisplayName("test137")
	public void testMALTTSL1E0_137() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_137/case_137_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test138")
	@DisplayName("test138")
	public void testMALTTSL1E0_138() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_138/case_138_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test129.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test139")
	@DisplayName("test139")
	public void testMALTTSL1E0_139() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_139/case_139_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test140")
	@DisplayName("test140")
	public void testMALTTSL1E0_140() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_140/case_140_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test128.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test141")
	@DisplayName("test141")
	public void testMALTTSL1E0_141() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_141/case_141_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test130.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test142")
	@DisplayName("test142")
	public void testMALTTSL1E0_142() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_142/case_142_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test129.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test143")
	@DisplayName("test143")
	public void testMALTTSL1E0_143() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALTTSL1E0/case_143/case_143_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CARRIER_INVOICE_PRIORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CARRIER_INVOICE_PRIORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_CARRIER_INVOICE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_CARRIER_INVOICE", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/next-business-day/search → 翌営業日取得API */
		rakurakuCore.operateMockApi("/internal/v1/next-business-day/search", "翌営業日取得API", "example-1");

		/* 操作(api) → 登录 → supplier/v1/carrier-invoice/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/carrier-invoice/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Idempotency-Key=1&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALTTSL1E0\\test131.json");

		/* 操作(DB確認) → M_CARRIER_INVOICE_PRIORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_CARRIER_INVOICE_PRIORITY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_CARRIER_INVOICE_RECEIVE_LOG → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_CARRIER_INVOICE_RECEIVE_LOG", "NOT_ASSERT_COLUMN", "〇");

	}

}
