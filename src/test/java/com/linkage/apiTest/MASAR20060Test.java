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
public class MASAR20060Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20060");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20060");
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
	public void testMASAR20060_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始R
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_001.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_003.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_004.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_001.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_002.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_001.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_007.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMASAR20060_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_001.txt");

	}

	@Test
	public void testMASAR20060_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20060/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-program=123456&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a57", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20060\\MASAR20060_008.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

}
