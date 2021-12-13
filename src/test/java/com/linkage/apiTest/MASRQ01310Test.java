package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01310機能確認")
@DisplayName("MASRQ01310機能確認")
public class MASRQ01310Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01310");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01310");
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
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMASRQ01310_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMASRQ01310_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456&leadTimeProductInquiryId=123457&leadTimeProductInquiryId=123458", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01310_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01310_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01310_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=111", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01310_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=111", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMASRQ01310_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMASRQ01310_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMASRQ01310_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMASRQ01310_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMASRQ01310_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "11");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMASRQ01310_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "12");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMASRQ01310_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "13");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMASRQ01310_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMASRQ01310_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "15");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMASRQ01310_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "16");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMASRQ01310_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01310/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "17");

		/* 操作(api) → 入力チェック → internal/v1/customer-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/customer-inquiry/search?leadTimeProductInquiryId=123456", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=111", "", "-");

	}

}
