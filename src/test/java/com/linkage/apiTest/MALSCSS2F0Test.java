package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS2F0機能確認")
@DisplayName("MALSCSS2F0機能確認")
public class MALSCSS2F0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS2F0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS2F0");
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
	@Tag("test017")
	@DisplayName("test017")
	public void testMALSCSS2F0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → async_tasks → DELETE_ALL */
		rakurakuCore.operateDBPrepare("async_tasks", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F17.json");

	}

	@Test
	@Tag("test018")
	@DisplayName("test018")
	public void testMALSCSS2F0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F18.json");

	}

	@Test
	@Tag("test019")
	@DisplayName("test019")
	public void testMALSCSS2F0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F19.json");

	}

	@Test
	@Tag("test020")
	@DisplayName("test020")
	public void testMALSCSS2F0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F20.json");

	}

	@Test
	@Tag("test021")
	@DisplayName("test021")
	public void testMALSCSS2F0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F21.json");

	}

	@Test
	@Tag("test022")
	@DisplayName("test022")
	public void testMALSCSS2F0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F22.json");

	}

	@Test
	@Tag("test023")
	@DisplayName("test023")
	public void testMALSCSS2F0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F23.json");

	}

	@Test
	@Tag("test024")
	@DisplayName("test024")
	public void testMALSCSS2F0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F24.json");

	}

	@Test
	@Tag("test025")
	@DisplayName("test025")
	public void testMALSCSS2F0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F25.json");

	}

	@Test
	@Tag("test026")
	@DisplayName("test026")
	public void testMALSCSS2F0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F26.json");

	}

	@Test
	@Tag("test027")
	@DisplayName("test027")
	public void testMALSCSS2F0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F27.json");

	}

	@Test
	@Tag("test028")
	@DisplayName("test028")
	public void testMALSCSS2F0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F28.json");

	}

	@Test
	@Tag("test029")
	@DisplayName("test029")
	public void testMALSCSS2F0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F29.json");

	}

	@Test
	@Tag("test030")
	@DisplayName("test030")
	public void testMALSCSS2F0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F30.json");

	}

	@Test
	@Tag("test031")
	@DisplayName("test031")
	public void testMALSCSS2F0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F31.json");

	}

	@Test
	@Tag("test032")
	@DisplayName("test032")
	public void testMALSCSS2F0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F32.json");

	}

	@Test
	@Tag("test033")
	@DisplayName("test033")
	public void testMALSCSS2F0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F33.json");

	}

	@Test
	@Tag("test034")
	@DisplayName("test034")
	public void testMALSCSS2F0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F34.json");

	}

	@Test
	@Tag("test035")
	@DisplayName("test035")
	public void testMALSCSS2F0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F35.json");

	}

	@Test
	@Tag("test036")
	@DisplayName("test036")
	public void testMALSCSS2F0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F36.json");

	}

	@Test
	@Tag("test037")
	@DisplayName("test037")
	public void testMALSCSS2F0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F37.json");

	}

	@Test
	@Tag("test038")
	@DisplayName("test038")
	public void testMALSCSS2F0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F38.json");

	}

	@Test
	@Tag("test039")
	@DisplayName("test039")
	public void testMALSCSS2F0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F39.json");

	}

	@Test
	@Tag("test040")
	@DisplayName("test040")
	public void testMALSCSS2F0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2F0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/download → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/download", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2F0\\MALSCSS2F40.json");

	}

}
