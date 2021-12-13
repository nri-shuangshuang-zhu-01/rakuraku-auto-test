package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01212機能確認")
@DisplayName("MASRQ01212機能確認")
public class MASRQ01212Test {

//	@BeforeAll
//	public static void initialize() throws Exception {
//		RakurakuCore.initialize("dbunit","MASRQ01212");
//	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01212");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1*****2+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-2*****3+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-3*****4+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1*****5+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-3*****6+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-1*****7+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-6*****8+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-7*****9+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-4*****10+++++/internal/v1/supplier/get;;仕入先情報取得API;;example-5");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMASRQ01212_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121201.json");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMASRQ01212_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-2");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121201.json");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01212_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-3");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121201.json");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01212_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121202.json");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01212_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-3");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121202.json");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01212_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121203.json");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMASRQ01212_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-6");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121204.json");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMASRQ01212_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-7");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121205.json");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMASRQ01212_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-4");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121201.json");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMASRQ01212_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01212/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-5");

		/* 操作(api) → 参照 → internal/v1/supplier-request/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset */
		rakurakuCore.operateApi("参照", "internal/v1/supplier-request/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1&&Authorization=Authorization&&X-Client-program=offset", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01212\\MASRQ0121201.json");

	}

}
