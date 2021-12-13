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
public class MASAR20020Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20020");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20020");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****2+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****3+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****4+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****5+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****6+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****7+++++/internal/v1/subsidiary/get;;現法情報取得API;;1*****8+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****9+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****10+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****11+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****12+++++/internal/v1/subsidiary/get;;現法情報取得API;;*****13+++++/internal/v1/subsidiary/get;;現法情報取得API;;");
	}

	@Test
	@Tag("リクエストデータが０件の場合")
	@DisplayName("リクエストデータが０件の場合")
	public void testMASAR20020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_001.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("一件(「送信媒体」設定なし空白です)確認")
	@DisplayName("一件(「送信媒体」設定なし空白です)確認")
	public void testMASAR20020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_002.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("複数件(「送信媒体」設定なし空白です)確認")
	@DisplayName("複数件(「送信媒体」設定なし空白です)確認")
	public void testMASAR20020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_003.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("一件(「送信媒体」設定なしnullです)確認")
	@DisplayName("一件(「送信媒体」設定なしnullです)確認")
	public void testMASAR20020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_004.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("一件(「送信媒体」設定なしnullです)確認")
	@DisplayName("一件(「送信媒体」設定なしnullです)確認")
	public void testMASAR20020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "4");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_005.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("一件(「送信媒体」設定あり)確認")
	@DisplayName("一件(「送信媒体」設定あり)確認")
	public void testMASAR20020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "5");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_006.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("一件(「送信媒体」設定あり)確認")
	@DisplayName("一件(「送信媒体」設定あり)確認")
	public void testMASAR20020_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "6");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_007.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMASAR20020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "7");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_008.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMASAR20020_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "8");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_009.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASAR20020_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "9");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_010.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMASAR20020_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "10");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_011.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("DB検索が異常終了すること")
	@DisplayName("DB検索が異常終了すること")
	public void testMASAR20020_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_003.txt");

	}

	@Test
	@Tag("未入金管理テーブルの更新が失敗すること")
	@DisplayName("未入金管理テーブルの更新が失敗すること")
	public void testMASAR20020_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\MASAR20020_013.txt");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → async_tasks → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("async_tasks", "NOT_ASSERT_COLUMN", "〇");

	}

}
