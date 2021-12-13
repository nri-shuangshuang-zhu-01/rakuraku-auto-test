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
public class MASCR40020変更Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASCR40020変更");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASCR40020変更");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****2+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****3+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****4+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****5+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****6+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****7+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****8+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****9+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****10+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****11+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****12+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1*****13+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;1-----/internal/v1/bill-to/search;;売掛先情報検索API;;1-----/internal/v1/customer/search;;得意先情報検索API;;1-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;1-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;1");
	}

	@Test
	@Tag("1件場合")
	@DisplayName("1件場合")
	public void testMASCR40020変更_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=2&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("bill_to_code場合")
	@DisplayName("bill_to_code場合")
	public void testMASCR40020変更_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_code&sortBy=1&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("bill_to_name場合")
	@DisplayName("bill_to_name場合")
	public void testMASCR40020変更_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_name&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("credit_usage_rate場合")
	@DisplayName("credit_usage_rate場合")
	public void testMASCR40020変更_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_usage_rate&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("credit_limit_amt場合")
	@DisplayName("credit_limit_amt場合")
	public void testMASCR40020変更_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_limit_amt&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("credit_limit_over_amt場合")
	@DisplayName("credit_limit_over_amt場合")
	public void testMASCR40020変更_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_limit_over_amt&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("trade_receivables場合")
	@DisplayName("trade_receivables場合")
	public void testMASCR40020変更_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=trade_receivables&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("cell_cd場合")
	@DisplayName("cell_cd場合")
	public void testMASCR40020変更_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=cell_cd&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("bill_to_main_business_unit場合")
	@DisplayName("bill_to_main_business_unit場合")
	public void testMASCR40020変更_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_main_business_unit&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=2&code2From=860582&code3To=860584&code4=860001&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("コード1がA")
	@DisplayName("コード1がA")
	public void testMASCR40020変更_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=A&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("コード1が1")
	@DisplayName("コード1が1")
	public void testMASCR40020変更_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=1&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("コード1が2")
	@DisplayName("コード1が2")
	public void testMASCR40020変更_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=2&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("コード1が3")
	@DisplayName("コード1が3")
	public void testMASCR40020変更_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020変更/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "1");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=3&code2From=860000&code3To=860010&code4=860001,860002,860003&cellCode=&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

}
