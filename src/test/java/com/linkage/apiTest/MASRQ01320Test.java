package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01320機能確認")
@DisplayName("MASRQ01320機能確認")
public class MASRQ01320Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01320");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01320");
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
	@Tag("test001")
	@DisplayName("test001")
	public void testMASRQ01320_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132001.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMASRQ01320_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01320_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132003.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01320_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132004.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01320_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132005.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01320_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132006.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMASRQ01320_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132007.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMASRQ01320_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132008.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMASRQ01320_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132001.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMASRQ01320_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMASRQ01320_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "11");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMASRQ01320_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "12");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMASRQ01320_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "13");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMASRQ01320_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "14");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMASRQ01320_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01320/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_customer_inquiry_detail → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_customer_inquiry_detail", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_customer_inquiry → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_lead_time_product_customer_inquiry", "DELETE_ALL", "1");

		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "15");

		/* 操作(DB準備) → produced_events_1 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_1", "DELETE_ALL", "1");

		/* 操作(DB準備) → produced_events_2 → DELETE_ALL */
		rakurakuCore.operateDBPrepare("produced_events_2", "DELETE_ALL", "1");

		/* 操作(api) → 参照 → internal/v1/customer-inquiry/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222 */
		rakurakuCore.operateApi("参照", "internal/v1/customer-inquiry/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13001&&Authorization=2222222222", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01320\\MASRQ0132002.json");

		/* 操作(DB確認) → t_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_customer_inquiry_detail → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_customer_inquiry_detail", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_customer_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_customer_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_lead_time_product_inquiry → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_lead_time_product_inquiry", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_1 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_1", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → produced_events_2 → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("produced_events_2", "NOT_ASSERT_COLUMN", "〇");

	}

}
