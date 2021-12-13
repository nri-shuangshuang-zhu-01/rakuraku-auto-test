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
public class MALSCVA1U0_RequestTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCVA1U0_Request");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCVA1U0_Request");
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
	@Tag("1伝票日付 null")
	@DisplayName("1伝票日付 null")
	public void testMALSCVA1U0_Request_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\1.txt");

	}

	@Test
	@Tag("2伝票日付 日付")
	@DisplayName("2伝票日付 日付")
	public void testMALSCVA1U0_Request_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\2.txt");

	}

	@Test
	@Tag("3伝票日付 最大值")
	@DisplayName("3伝票日付 最大值")
	public void testMALSCVA1U0_Request_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\3.txt");

	}

	@Test
	@Tag("4伝票日付 最小值")
	@DisplayName("4伝票日付 最小值")
	public void testMALSCVA1U0_Request_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\4.txt");

	}

	@Test
	@Tag("5運用日付 null")
	@DisplayName("5運用日付 null")
	public void testMALSCVA1U0_Request_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\5.txt");

	}

	@Test
	@Tag("6運用日付 日付")
	@DisplayName("6運用日付 日付")
	public void testMALSCVA1U0_Request_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\6.txt");

	}

	@Test
	@Tag("7運用日付 最大值")
	@DisplayName("7運用日付 最大值")
	public void testMALSCVA1U0_Request_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\7.txt");

	}

	@Test
	@Tag("8運用日付 最小值")
	@DisplayName("8運用日付 最小值")
	public void testMALSCVA1U0_Request_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\8.txt");

	}

	@Test
	@Tag("9在庫タイプ半角")
	@DisplayName("9在庫タイプ半角")
	public void testMALSCVA1U0_Request_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\9.txt");

	}

	@Test
	@Tag("10在庫タイプ最大值")
	@DisplayName("10在庫タイプ最大值")
	public void testMALSCVA1U0_Request_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\10.txt");

	}

	@Test
	@Tag("11在庫タイプnull")
	@DisplayName("11在庫タイプnull")
	public void testMALSCVA1U0_Request_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\11.txt");

	}

	@Test
	@Tag("12入力日 null")
	@DisplayName("12入力日 null")
	public void testMALSCVA1U0_Request_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\12.txt");

	}

	@Test
	@Tag("13入力日 日付")
	@DisplayName("13入力日 日付")
	public void testMALSCVA1U0_Request_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\13.txt");

	}

	@Test
	@Tag("14入力日 最大值 ")
	@DisplayName("14入力日 最大值 ")
	public void testMALSCVA1U0_Request_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\14.txt");

	}

	@Test
	@Tag("15入力日 最小值")
	@DisplayName("15入力日 最小值")
	public void testMALSCVA1U0_Request_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\15.txt");

	}

	@Test
	@Tag("16入力时间 null")
	@DisplayName("16入力时间 null")
	public void testMALSCVA1U0_Request_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\16.txt");

	}

	@Test
	@Tag("17入力时间 半角")
	@DisplayName("17入力时间 半角")
	public void testMALSCVA1U0_Request_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\17.txt");

	}

	@Test
	@Tag("18置場コード null")
	@DisplayName("18置場コード null")
	public void testMALSCVA1U0_Request_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\18.txt");

	}

	@Test
	@Tag("19置場コード 半角")
	@DisplayName("19置場コード 半角")
	public void testMALSCVA1U0_Request_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\19.txt");

	}

	@Test
	@Tag("20置場コード 最大值")
	@DisplayName("20置場コード 最大值")
	public void testMALSCVA1U0_Request_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\20.txt");

	}

	@Test
	@Tag("21置場名null")
	@DisplayName("21置場名null")
	public void testMALSCVA1U0_Request_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\21.txt");

	}

	@Test
	@Tag("22置場名 最大值")
	@DisplayName("22置場名 最大值")
	public void testMALSCVA1U0_Request_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\22.txt");

	}

	@Test
	@Tag("23保管場所コード  null")
	@DisplayName("23保管場所コード  null")
	public void testMALSCVA1U0_Request_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\23.txt");

	}

	@Test
	@Tag("24保管場所コード 半角")
	@DisplayName("24保管場所コード 半角")
	public void testMALSCVA1U0_Request_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\24.txt");

	}

	@Test
	@Tag("25保管場所コード  最大值")
	@DisplayName("25保管場所コード  最大值")
	public void testMALSCVA1U0_Request_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\25.txt");

	}

	@Test
	@Tag("26保管場所名 null")
	@DisplayName("26保管場所名 null")
	public void testMALSCVA1U0_Request_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\26.txt");

	}

	@Test
	@Tag("27保管場所名 最大值")
	@DisplayName("27保管場所名 最大值")
	public void testMALSCVA1U0_Request_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\27.txt");

	}

	@Test
	@Tag("28ID  null")
	@DisplayName("28ID  null")
	public void testMALSCVA1U0_Request_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\28.txt");

	}

	@Test
	@Tag("29ID 半角")
	@DisplayName("29ID 半角")
	public void testMALSCVA1U0_Request_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\29.txt");

	}

	@Test
	@Tag("30ID 英数字")
	@DisplayName("30ID 英数字")
	public void testMALSCVA1U0_Request_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\30.txt");

	}

	@Test
	@Tag("31ID 最大值")
	@DisplayName("31ID 最大值")
	public void testMALSCVA1U0_Request_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\31.txt");

	}

	@Test
	@Tag("32理由区分 null")
	@DisplayName("32理由区分 null")
	public void testMALSCVA1U0_Request_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\32.txt");

	}

	@Test
	@Tag("33理由区分 半角")
	@DisplayName("33理由区分 半角")
	public void testMALSCVA1U0_Request_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\33.txt");

	}

	@Test
	@Tag("34理由区分 最大值")
	@DisplayName("34理由区分 最大值")
	public void testMALSCVA1U0_Request_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\34.txt");

	}

	@Test
	@Tag("35理由区分名 null")
	@DisplayName("35理由区分名 null")
	public void testMALSCVA1U0_Request_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\35.txt");

	}

	@Test
	@Tag("36理由区分名 最大值")
	@DisplayName("36理由区分名 最大值")
	public void testMALSCVA1U0_Request_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\36.txt");

	}

	@Test
	@Tag("37処理モード 半角")
	@DisplayName("37処理モード 半角")
	public void testMALSCVA1U0_Request_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\37.txt");

	}

	@Test
	@Tag("38処理モード 最大值")
	@DisplayName("38処理モード 最大值")
	public void testMALSCVA1U0_Request_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\38.txt");

	}

	@Test
	@Tag("39処理モード名 半角")
	@DisplayName("39処理モード名 半角")
	public void testMALSCVA1U0_Request_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\39.txt");

	}

	@Test
	@Tag("40処理モード名 最大值")
	@DisplayName("40処理モード名 最大值")
	public void testMALSCVA1U0_Request_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\40.txt");

	}

	@Test
	@Tag("41責任部署コード null")
	@DisplayName("41責任部署コード null")
	public void testMALSCVA1U0_Request_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\41.txt");

	}

	@Test
	@Tag("42責任部署コード英数字")
	@DisplayName("42責任部署コード英数字")
	public void testMALSCVA1U0_Request_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\42.txt");

	}

	@Test
	@Tag("43責任部署コード最大值4")
	@DisplayName("43責任部署コード最大值4")
	public void testMALSCVA1U0_Request_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\43.txt");

	}

	@Test
	@Tag("44 責任部署名 null")
	@DisplayName("44 責任部署名 null")
	public void testMALSCVA1U0_Request_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\44.txt");

	}

	@Test
	@Tag("45 責任部署名 英数字")
	@DisplayName("45 責任部署名 英数字")
	public void testMALSCVA1U0_Request_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\45.txt");

	}

	@Test
	@Tag("46 責任部署名 最大值45")
	@DisplayName("46 責任部署名 最大值45")
	public void testMALSCVA1U0_Request_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\46.txt");

	}

	@Test
	@Tag("47 商品コード null")
	@DisplayName("47 商品コード null")
	public void testMALSCVA1U0_Request_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\47.txt");

	}

	@Test
	@Tag("48 商品コード 最大值 78")
	@DisplayName("48 商品コード 最大值 78")
	public void testMALSCVA1U0_Request_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\48.txt");

	}

	@Test
	@Tag("49統合インナーコードnull")
	@DisplayName("49統合インナーコードnull")
	public void testMALSCVA1U0_Request_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\49.txt");

	}

	@Test
	@Tag("50統合インナーコード半角")
	@DisplayName("50統合インナーコード半角")
	public void testMALSCVA1U0_Request_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\50.txt");

	}

	@Test
	@Tag("51統合インナーコード英数字")
	@DisplayName("51統合インナーコード英数字")
	public void testMALSCVA1U0_Request_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\51.txt");

	}

	@Test
	@Tag("52統合インナーコード最大值 14")
	@DisplayName("52統合インナーコード最大值 14")
	public void testMALSCVA1U0_Request_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\52.txt");

	}

	@Test
	@Tag("53ブランドコード null")
	@DisplayName("53ブランドコード null")
	public void testMALSCVA1U0_Request_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\53.txt");

	}

	@Test
	@Tag("54ブランドコード半角")
	@DisplayName("54ブランドコード半角")
	public void testMALSCVA1U0_Request_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\54.txt");

	}

	@Test
	@Tag("55ブランドコード英数字")
	@DisplayName("55ブランドコード英数字")
	public void testMALSCVA1U0_Request_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\55.txt");

	}

	@Test
	@Tag("56ブランドコード4")
	@DisplayName("56ブランドコード4")
	public void testMALSCVA1U0_Request_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\56.txt");

	}

	@Test
	@Tag("57ブランド名null")
	@DisplayName("57ブランド名null")
	public void testMALSCVA1U0_Request_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\57.txt");

	}

	@Test
	@Tag("58ブランド名半角")
	@DisplayName("58ブランド名半角")
	public void testMALSCVA1U0_Request_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\58.txt");

	}

	@Test
	@Tag("59ブランド名英数字")
	@DisplayName("59ブランド名英数字")
	public void testMALSCVA1U0_Request_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\59.txt");

	}

	@Test
	@Tag("60ブランド名最大值 60")
	@DisplayName("60ブランド名最大值 60")
	public void testMALSCVA1U0_Request_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\60.txt");

	}

	@Test
	@Tag("61  現在庫数 数字")
	@DisplayName("61  現在庫数 数字")
	public void testMALSCVA1U0_Request_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\61.txt");

	}

	@Test
	@Tag("62  現在庫数 最大值7")
	@DisplayName("62  現在庫数 最大值7")
	public void testMALSCVA1U0_Request_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\62.txt");

	}

	@Test
	@Tag("63 在庫差分数 数字 ")
	@DisplayName("63 在庫差分数 数字 ")
	public void testMALSCVA1U0_Request_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\63.txt");

	}

	@Test
	@Tag("64 在庫差分数 最大值7 ")
	@DisplayName("64 在庫差分数 最大值7 ")
	public void testMALSCVA1U0_Request_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\64.txt");

	}

	@Test
	@Tag("65 通貨 null")
	@DisplayName("65 通貨 null")
	public void testMALSCVA1U0_Request_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\65.txt");

	}

	@Test
	@Tag("66 通貨 半角")
	@DisplayName("66 通貨 半角")
	public void testMALSCVA1U0_Request_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\66.txt");

	}

	@Test
	@Tag("67 最大值 3")
	@DisplayName("67 最大值 3")
	public void testMALSCVA1U0_Request_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\67.txt");

	}

	@Test
	@Tag("68 商品所管部門コード null")
	@DisplayName("68 商品所管部門コード null")
	public void testMALSCVA1U0_Request_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\68.txt");

	}

	@Test
	@Tag("69 商品所管部門コード 半角")
	@DisplayName("69 商品所管部門コード 半角")
	public void testMALSCVA1U0_Request_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\69.txt");

	}

	@Test
	@Tag("70 商品所管部門コード 6")
	@DisplayName("70 商品所管部門コード 6")
	public void testMALSCVA1U0_Request_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\70.txt");

	}

	@Test
	@Tag("71 商品所管部門名 null")
	@DisplayName("71 商品所管部門名 null")
	public void testMALSCVA1U0_Request_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\71.txt");

	}

	@Test
	@Tag("72 商品所管部門名 最大值 240")
	@DisplayName("72 商品所管部門名 最大值 240")
	public void testMALSCVA1U0_Request_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\72.txt");

	}

	@Test
	@Tag("73 調整前現在庫数 null")
	@DisplayName("73 調整前現在庫数 null")
	public void testMALSCVA1U0_Request_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\73.txt");

	}

	@Test
	@Tag("74 調整前現在庫数 数字")
	@DisplayName("74 調整前現在庫数 数字")
	public void testMALSCVA1U0_Request_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\74.txt");

	}

	@Test
	@Tag("75 調整前現在庫数 最大值 7")
	@DisplayName("75 調整前現在庫数 最大值 7")
	public void testMALSCVA1U0_Request_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\75.txt");

	}

	@Test
	@Tag("76 調整後現在庫数 null")
	@DisplayName("76 調整後現在庫数 null")
	public void testMALSCVA1U0_Request_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\76.txt");

	}

	@Test
	@Tag("77 調整後現在庫数 数字")
	@DisplayName("77 調整後現在庫数 数字")
	public void testMALSCVA1U0_Request_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\77.txt");

	}

	@Test
	@Tag("78 調整後現在庫数  最大值7")
	@DisplayName("78 調整後現在庫数  最大值7")
	public void testMALSCVA1U0_Request_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\78.txt");

	}

	@Test
	@Tag("79 評価単価 null")
	@DisplayName("79 評価単価 null")
	public void testMALSCVA1U0_Request_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\79.txt");

	}

	@Test
	@Tag("80 評価単価 数字")
	@DisplayName("80 評価単価 数字")
	public void testMALSCVA1U0_Request_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\80.txt");

	}

	@Test
	@Tag("81 評価単価 最大值")
	@DisplayName("81 評価単価 最大值")
	public void testMALSCVA1U0_Request_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\81.txt");

	}

	@Test
	@Tag("82 市場コード null")
	@DisplayName("82 市場コード null")
	public void testMALSCVA1U0_Request_082() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_082/case_082_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\82.txt");

	}

	@Test
	@Tag("83 市場コード 数字")
	@DisplayName("83 市場コード 数字")
	public void testMALSCVA1U0_Request_083() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0_Request/case_083/case_083_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\83.txt");

	}

}
