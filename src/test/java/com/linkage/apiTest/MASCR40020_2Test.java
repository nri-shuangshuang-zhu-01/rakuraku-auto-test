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
public class MASCR40020_2Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASCR40020_2");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASCR40020_2");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****2+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@Example-----/internal/v1/bill-to/search;;売掛先情報検索API;;@Example-----/internal/v1/customer/search;;得意先情報検索API;;@Example-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@Example-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****3+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@Example-----/internal/v1/bill-to/search;;売掛先情報検索API;;@Example-----/internal/v1/customer/search;;得意先情報検索API;;@Example-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@Example-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****4+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@Example-----/internal/v1/bill-to/search;;売掛先情報検索API;;@Example-----/internal/v1/customer/search;;得意先情報検索API;;@Example-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@Example-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****5+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****6+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****7+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****8+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****9+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****10+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****11+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****12+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****13+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_BU-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****14+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_BU-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example*****15+++++/internal/v1/subsidiary/get;;現法情報取得API;;MASCR40020_031-----/internal/v1/acceptance-group/search;;検収グループ情報検索API;;@MASCR40020_SSS-----/internal/v1/bill-to/search;;売掛先情報検索API;;@MASCR40020_BU-----/internal/v1/customer/search;;得意先情報検索API;;@MASCR40020_SSS-----/internal/v1/customer/get-list;;得意先情報取得API（List）;;@MASCR40020_SSS-----/internal/v1/ccy/get-list;;通貨情報取得API（List）;;@Example");
	}

	@Test
	@Tag("多数件 66")
	@DisplayName("多数件 66")
	public void testMASCR40020_2_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_001/case_001_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最大値 67")
	@DisplayName("最大値 67")
	public void testMASCR40020_2_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@Example");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=0&creditLimitUsageRateTo=999&creditLimitAmountFrom=0&creditLimitAmountTo=99999999999999999999&creditLimitOverrunsFrom=0&creditLimitOverrunsTo=99999999999999999999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=99999999999999999999", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小值(NULL) 68")
	@DisplayName("最小值(NULL) 68")
	public void testMASCR40020_2_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "3");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@Example");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=0&creditLimitUsageRateTo=999&creditLimitOverrunsFrom=0&creditLimitOverrunsTo=99999999999999999999&bu=BU&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditTotalFrom=0&creditTotalTo=99999999999999999999", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小值(Space) 69")
	@DisplayName("最小值(Space) 69")
	public void testMASCR40020_2_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "4");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "4");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "4");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@Example");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@Example");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=0&creditLimitUsageRateTo=999&creditLimitAmountFrom=0&creditLimitAmountTo=99999999999999999999&creditLimitOverrunsFrom=0&creditLimitOverrunsTo=99999999999999999999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=0&creditTotalTo=99999999999999999999", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理70 billto 降序")
	@DisplayName("ソート処理70 billto 降序")
	public void testMASCR40020_2_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_005/case_005_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_code&sortBy=1&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理71 billto 升序")
	@DisplayName("ソート処理71 billto 升序")
	public void testMASCR40020_2_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_006/case_006_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_code&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理72 bill_to_name 升序")
	@DisplayName("ソート処理72 bill_to_name 升序")
	public void testMASCR40020_2_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_007/case_007_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_name&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理73 credit_usage_rate 升序")
	@DisplayName("ソート処理73 credit_usage_rate 升序")
	public void testMASCR40020_2_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_008/case_008_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_usage_rate&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理74 credit_limit_amt 升序")
	@DisplayName("ソート処理74 credit_limit_amt 升序")
	public void testMASCR40020_2_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_009/case_009_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_limit_amt&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理75 credit_limit_over_runs 升序")
	@DisplayName("ソート処理75 credit_limit_over_runs 升序")
	public void testMASCR40020_2_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_010/case_010_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=credit_limit_over_runs&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理76 trade_receivables 升序")
	@DisplayName("ソート処理76 trade_receivables 升序")
	public void testMASCR40020_2_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_011/case_011_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=trade_receivables&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理77 cell_cd 升序")
	@DisplayName("ソート処理77 cell_cd 升序")
	public void testMASCR40020_2_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_012/case_012_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=cell_cd&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("ソート処理78 bill_to_main_business_unit 升序")
	@DisplayName("ソート処理78 bill_to_main_business_unit 升序")
	public void testMASCR40020_2_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_013/case_013_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_BU");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=bill_to_main_business_unit&sortBy=0&pageNumber=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("79 リクエスト項目No.24:レスポンス種別が1以外の場合")
	@DisplayName("79 リクエスト項目No.24:レスポンス種別が1以外の場合")
	public void testMASCR40020_2_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_014/case_014_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_BU");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=1&displayCount=2&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("80 リクエスト項目No.24:レスポンス種別が1の場合")
	@DisplayName("80 リクエスト項目No.24:レスポンス種別が1の場合")
	public void testMASCR40020_2_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_2/case_015/case_015_", "");// ケース番号の設定

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
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "MASCR40020_031");

		/* 操作(apiMock) → /internal/v1/acceptance-group/search → 検収グループ情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/acceptance-group/search", "検収グループ情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/bill-to/search → 売掛先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/search", "売掛先情報検索API", "@MASCR40020_BU");

		/* 操作(apiMock) → /internal/v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/customer/search", "得意先情報検索API", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API（List）", "@MASCR40020_SSS");

		/* 操作(apiMock) → /internal/v1/ccy/get-list → 通貨情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/ccy/get-list", "通貨情報取得API（List）", "@Example");

		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=1&displayCount=2&responseType=1&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

}
