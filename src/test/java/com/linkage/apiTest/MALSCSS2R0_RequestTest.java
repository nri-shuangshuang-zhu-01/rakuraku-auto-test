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
public class MALSCSS2R0_RequestTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS2R0_Request");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS2R0_Request");
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
	@Tag("業務シーン区分Null")
	@DisplayName("業務シーン区分Null")
	public void testMALSCSS2R0_Request_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001Request.txt");

	}

	@Test
	@Tag("業務シーン区分最大值")
	@DisplayName("業務シーン区分最大值")
	public void testMALSCSS2R0_Request_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_002Request.txt");

	}

	@Test
	@Tag("置場コード最大值")
	@DisplayName("置場コード最大值")
	public void testMALSCSS2R0_Request_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_003Request.txt");

	}

	@Test
	@Tag("仕入先コード半角")
	@DisplayName("仕入先コード半角")
	public void testMALSCSS2R0_Request_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_004Request.txt");

	}

	@Test
	@Tag("仕入先コード英数字")
	@DisplayName("仕入先コード英数字")
	public void testMALSCSS2R0_Request_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_005Request.txt");

	}

	@Test
	@Tag("仕入先コード最大值")
	@DisplayName("仕入先コード最大值")
	public void testMALSCSS2R0_Request_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_006Request.txt");

	}

	@Test
	@Tag("出荷不可入荷日(FROM) null ")
	@DisplayName("出荷不可入荷日(FROM) null ")
	public void testMALSCSS2R0_Request_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_007Request.txt");

	}

	@Test
	@Tag("出荷不可入荷日(FROM) 日付")
	@DisplayName("出荷不可入荷日(FROM) 日付")
	public void testMALSCSS2R0_Request_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_008Request.txt");

	}

	@Test
	@Tag("出荷不可入荷日(FROM) 最大值")
	@DisplayName("出荷不可入荷日(FROM) 最大值")
	public void testMALSCSS2R0_Request_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_009Request.txt");

	}

	@Test
	@Tag("出荷不可入荷日(TO)日付")
	@DisplayName("出荷不可入荷日(TO)日付")
	public void testMALSCSS2R0_Request_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_010Request.txt");

	}

	@Test
	@Tag("出荷不可入荷日(TO)最大值")
	@DisplayName("出荷不可入荷日(TO)最大值")
	public void testMALSCSS2R0_Request_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_011Request.txt");

	}

	@Test
	@Tag("グローバル番号半角")
	@DisplayName("グローバル番号半角")
	public void testMALSCSS2R0_Request_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_012Request.txt");

	}

	@Test
	@Tag("グローバル番号英数字")
	@DisplayName("グローバル番号英数字")
	public void testMALSCSS2R0_Request_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_013Request.txt");

	}

	@Test
	@Tag("グローバル番号最大值")
	@DisplayName("グローバル番号最大值")
	public void testMALSCSS2R0_Request_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_014Request.txt");

	}

	@Test
	@Tag("出荷不可出荷日(FROM)null")
	@DisplayName("出荷不可出荷日(FROM)null")
	public void testMALSCSS2R0_Request_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_015Request.txt");

	}

	@Test
	@Tag("出荷不可出荷日(FROM)日付")
	@DisplayName("出荷不可出荷日(FROM)日付")
	public void testMALSCSS2R0_Request_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_016Request.txt");

	}

	@Test
	@Tag("17出荷不可出荷日(FROM)最大值")
	@DisplayName("17出荷不可出荷日(FROM)最大值")
	public void testMALSCSS2R0_Request_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_017Request.txt");

	}

	@Test
	@Tag("18出荷不可出荷日(TO) 日付 ")
	@DisplayName("18出荷不可出荷日(TO) 日付 ")
	public void testMALSCSS2R0_Request_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_018Request.txt");

	}

	@Test
	@Tag("19出荷不可出荷日(TO) 最大值")
	@DisplayName("19出荷不可出荷日(TO) 最大值")
	public void testMALSCSS2R0_Request_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_019Request.txt");

	}

	@Test
	@Tag("20 得意先コード半角")
	@DisplayName("20 得意先コード半角")
	public void testMALSCSS2R0_Request_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_020Request.txt");

	}

	@Test
	@Tag("21 得意先コード英数字")
	@DisplayName("21 得意先コード英数字")
	public void testMALSCSS2R0_Request_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_021Request.txt");

	}

	@Test
	@Tag("22 得意先コード最大值")
	@DisplayName("22 得意先コード最大值")
	public void testMALSCSS2R0_Request_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_022Request.txt");

	}

	@Test
	@Tag("23伝区コード 半角")
	@DisplayName("23伝区コード 半角")
	public void testMALSCSS2R0_Request_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_023Request.txt");

	}

	@Test
	@Tag("24伝区コード 数字")
	@DisplayName("24伝区コード 数字")
	public void testMALSCSS2R0_Request_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_024Request.txt");

	}

	@Test
	@Tag("25伝区コード 最大值")
	@DisplayName("25伝区コード 最大值")
	public void testMALSCSS2R0_Request_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_025Request.txt");

	}

	@Test
	@Tag("26伝票送付区分 半角")
	@DisplayName("26伝票送付区分 半角")
	public void testMALSCSS2R0_Request_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_026Request.txt");

	}

	@Test
	@Tag("27伝票送付区分 最大值")
	@DisplayName("27伝票送付区分 最大值")
	public void testMALSCSS2R0_Request_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_027Request.txt");

	}

	@Test
	@Tag("28出荷不可状態区分")
	@DisplayName("28出荷不可状態区分")
	public void testMALSCSS2R0_Request_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_028Request.txt");

	}

	@Test
	@Tag("29Supplier I/V No 半角")
	@DisplayName("29Supplier I/V No 半角")
	public void testMALSCSS2R0_Request_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\29.txt");

	}

	@Test
	@Tag("30Supplier I/V No 英数字")
	@DisplayName("30Supplier I/V No 英数字")
	public void testMALSCSS2R0_Request_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\30.txt");

	}

	@Test
	@Tag("31Supplier I/V No 最大值")
	@DisplayName("31Supplier I/V No 最大值")
	public void testMALSCSS2R0_Request_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\31.txt");

	}

	@Test
	@Tag("32市場コード 半角")
	@DisplayName("32市場コード 半角")
	public void testMALSCSS2R0_Request_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\32.txt");

	}

	@Test
	@Tag("33市場コード 英数字")
	@DisplayName("33市場コード 英数字")
	public void testMALSCSS2R0_Request_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\33.txt");

	}

	@Test
	@Tag("34市場コード 最大值")
	@DisplayName("34市場コード 最大值")
	public void testMALSCSS2R0_Request_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\34.txt");

	}

	@Test
	@Tag("35連絡リスト 最大值")
	@DisplayName("35連絡リスト 最大值")
	public void testMALSCSS2R0_Request_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\35.txt");

	}

	@Test
	@Tag("36登録者ID 半角")
	@DisplayName("36登録者ID 半角")
	public void testMALSCSS2R0_Request_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\36.txt");

	}

	@Test
	@Tag("37登録者ID 英数字")
	@DisplayName("37登録者ID 英数字")
	public void testMALSCSS2R0_Request_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\37.txt");

	}

	@Test
	@Tag("38登録者ID 最大值")
	@DisplayName("38登録者ID 最大值")
	public void testMALSCSS2R0_Request_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\38.txt");

	}

	@Test
	@Tag("39 受注状態区分 最大值")
	@DisplayName("39 受注状態区分 最大值")
	public void testMALSCSS2R0_Request_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\39.txt");

	}

	@Test
	@Tag("40照会対象区分 最大值")
	@DisplayName("40照会対象区分 最大值")
	public void testMALSCSS2R0_Request_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\40.txt");

	}

	@Test
	@Tag("41ストークコード 最大值")
	@DisplayName("41ストークコード 最大值")
	public void testMALSCSS2R0_Request_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\41.txt");

	}

	@Test
	@Tag("42出荷方法コード 最大值")
	@DisplayName("42出荷方法コード 最大值")
	public void testMALSCSS2R0_Request_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\42.txt");

	}

	@Test
	@Tag("43在庫区分 最大值")
	@DisplayName("43在庫区分 最大值")
	public void testMALSCSS2R0_Request_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\43.txt");

	}

	@Test
	@Tag("44参照最大件数 数字")
	@DisplayName("44参照最大件数 数字")
	public void testMALSCSS2R0_Request_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("45取得開始位置 null")
	@DisplayName("45取得開始位置 null")
	public void testMALSCSS2R0_Request_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?limit=22&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("46返却件数 null")
	@DisplayName("46返却件数 null")
	public void testMALSCSS2R0_Request_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&sortby=sort1&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("47ソート順1 null")
	@DisplayName("47ソート順1 null")
	public void testMALSCSS2R0_Request_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby2=sort2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

	@Test
	@Tag("48ソート順2 null")
	@DisplayName("48ソート順2 null")
	public void testMALSCSS2R0_Request_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2R0_Request/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stop-shipment/bulk-reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/bulk-reference?offset=12&limit=22&sortby=sort1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a48", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2R0\\MALSCSS2R0_001.txt");

	}

}
