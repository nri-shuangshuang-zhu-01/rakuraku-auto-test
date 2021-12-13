package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR20030機能確認")
@DisplayName("MASAR20030機能確認")
public class MASAR20030Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20030");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20030");
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
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testMASAR20030_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_001.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMASAR20030_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_002.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASAR20030_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_003.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMASAR20030_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_004.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMASAR20030_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_005.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMASAR20030_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_006.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

	@Test
	@Tag("DB検索が正常終了しないの場合確認")
	@DisplayName("DB検索が正常終了しないの場合確認")
	public void testMASAR20030_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_002.txt");

	}

	@Test
	@Tag("未入金管理テーブルの更新が成功しないの場合確認")
	@DisplayName("未入金管理テーブルの更新が成功しないの場合確認")
	public void testMASAR20030_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20030/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/down → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/down", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20030\\MASAR20030_001.txt");

		/* 操作(DB確認) → T_NON_PAYMENT_MANAGEMENT */
		rakurakuCore.operateDBConfirm("T_NON_PAYMENT_MANAGEMENT", "", "〇");

	}

}
