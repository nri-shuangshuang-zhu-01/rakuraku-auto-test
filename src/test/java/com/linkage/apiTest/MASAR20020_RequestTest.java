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
public class MASAR20020_RequestTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20020_Request");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20020_Request");
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
	@Tag("売掛先コード null")
	@DisplayName("売掛先コード null")
	public void testMASAR20020_Request_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\1.txt");

	}

	@Test
	@Tag("レベル null")
	@DisplayName("レベル null")
	public void testMASAR20020_Request_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\2.txt");

	}

	@Test
	@Tag("遅延日数 null")
	@DisplayName("遅延日数 null")
	public void testMASAR20020_Request_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\3.txt");

	}

	@Test
	@Tag("Invoice番号null")
	@DisplayName("Invoice番号null")
	public void testMASAR20020_Request_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\4.txt");

	}

	@Test
	@Tag("Invoice発行日 null")
	@DisplayName("Invoice発行日 null")
	public void testMASAR20020_Request_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\5.txt");

	}

	@Test
	@Tag("現法コード null")
	@DisplayName("現法コード null")
	public void testMASAR20020_Request_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\6.txt");

	}

	@Test
	@Tag("ログインユーザ null")
	@DisplayName("ログインユーザ null")
	public void testMASAR20020_Request_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\7.txt");

	}

	@Test
	@Tag("支払約束日 null")
	@DisplayName("支払約束日 null")
	public void testMASAR20020_Request_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\8.txt");

	}

	@Test
	@Tag("督促状出力区分 null")
	@DisplayName("督促状出力区分 null")
	public void testMASAR20020_Request_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\9.txt");

	}

	@Test
	@Tag("listNUll")
	@DisplayName("listNUll")
	public void testMASAR20020_Request_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20020_Request/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment-level/up → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment-level/up", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a11", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20020\\10.txt");

	}

}
