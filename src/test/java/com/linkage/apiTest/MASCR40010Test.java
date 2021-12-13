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
public class MASCR40010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASCR40010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASCR40010");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_1-----/v1/customer/get;;得意先情報取得API;;MASCR40010_1-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_1-----/v1/customer/search;;得意先情報検索API;;MASCR40010_1-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****2+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****3+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_3-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****4+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;------/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****5+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;------/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****6+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;------/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****7+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;------;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****8+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_8-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****9+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****10+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_10-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****11+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_11-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****12+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****13+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****14+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_2-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****15+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_15-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****16+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_16-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;*****17+++++/internal/v1/subsidiary/get;;現法制御情報取得API;;MASCR40010_17-----/v1/customer/get;;得意先情報取得API;;MASCR40010_2-----/internal/v1/bill-to/get;;売掛先情報取得API;;MASCR40010_2-----/v1/customer/search;;得意先情報検索API;;MASCR40010_2-----;;;;-----MASCR40010_8;;MASCR40010_11;;-----売掛先情報取得API;;得意先情報取得API;;-----NULL;;NULL;;");
	}

	@Test
	public void testMASCR40010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_1");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_1");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_1");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_1");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH9&totalAmount=100000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=100000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_3");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "-");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "-");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "-");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "-");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_8");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "9");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_10");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_11");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "12");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "13");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SAME_DAY_SO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAME_DAY_SO", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_SO_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SO_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "2");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "14");

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_15");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_16");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

	@Test
	public void testMASCR40010_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40010/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
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

		/* 操作(DB準備) → M_CREDIT_LIMIT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_CREDIT_LIMIT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法制御情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法制御情報取得API", "MASCR40010_17");

		/* 操作(apiMock) → /v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/v1/customer/get", "得意先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /internal/v1/bill-to/get → 売掛先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/bill-to/get", "売掛先情報取得API", "MASCR40010_2");

		/* 操作(apiMock) → /v1/customer/search → 得意先情報検索API */
		rakurakuCore.operateMockApi("/v1/customer/search", "得意先情報検索API", "MASCR40010_2");

		/* 操作(api) → 登录 → internal/v1/credit-limit/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-limit/check?subsidiaryCode=TIW&customerCode=BOSCH8&totalAmount=10000&settlementMethod=123", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123457", "UserLoginInfo", "-");

	}

}
