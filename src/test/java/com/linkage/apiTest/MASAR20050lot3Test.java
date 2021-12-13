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
public class MASAR20050lot3Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20050lot3");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20050lot3");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/ccy/search;;通貨情報取得API;;@Example*****2+++++/v1/ccy/search;;通貨情報取得API;;@Example*****3+++++/v1/ccy/search;;通貨情報取得API;;@Example*****4+++++/v1/ccy/search;;通貨情報取得API;;@Example*****5+++++/v1/ccy/search;;通貨情報取得API;;@Example*****6+++++/v1/ccy/search;;通貨情報取得API;;@Example*****7+++++/v1/ccy/search;;通貨情報取得API;;@Example*****8+++++/v1/ccy/search;;通貨情報取得API;;@Example*****9+++++/v1/ccy/search;;通貨情報取得API;;@Example");
	}

	@Test
	public void testMASAR20050lot3_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "2");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=InvoiceNo&invoiceNumber=&invoiceStatus=Close", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "4");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "5");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "6");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "7");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "8");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "8");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20050lot3_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20050lot3/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_BILL_TO → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_BILL_TO", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_ACCEPTANCE_GROUP → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_ACCEPTANCE_GROUP", "データクリア・挿入", "9");

		/* 操作(DB準備) → m_incoming_payment_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_incoming_payment_group", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /v1/ccy/search → 通貨情報取得API */
		rakurakuCore.operateMockApi("/v1/ccy/search", "通貨情報取得API", "@Example");

		/* 操作(api) → 登录 → internal/v1/non-payment-detail/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-detail/get?subsidiaryCode=MJP&billToCode=526466&startIndex=1&responseCount=5&sortOrder=invoiceNumber.&invoiceNumber=002&invoiceStatus=Open", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=6a037a9e-2500-4724-a005-998a1ab13a46", "UserLoginInfo", "-");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_BILL_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_BILL_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_ACCEPTANCE_GROUP → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_ACCEPTANCE_GROUP", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → m_incoming_payment_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("m_incoming_payment_group", "NOT_ASSERT_COLUMN", "〇");

	}

}
