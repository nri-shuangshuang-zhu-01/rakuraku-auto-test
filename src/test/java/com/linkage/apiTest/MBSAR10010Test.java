package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSAR10010")
@DisplayName("MBSAR10010")
public class MBSAR10010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSAR10010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSAR10010");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/sales-order/search;;受注検索API;;1-----/v1/file/upload;;;;1*****2+++++/internal/v1/sales-order/search;;受注検索API;;2-----/v1/file/upload;;;;1*****3+++++/internal/v1/sales-order/search;;受注検索API;;3-----/v1/file/upload;;;;1*****4+++++/internal/v1/sales-order/search;;受注検索API;;4-----/v1/file/upload;;;;1*****5+++++/internal/v1/sales-order/search;;受注検索API;;5-----/v1/file/upload;;;;1*****6+++++/internal/v1/sales-order/search;;受注検索API;;6-----/v1/file/upload;;;;1*****7+++++/internal/v1/sales-order/search;;受注検索API;;7-----/v1/file/upload;;;;1*****8+++++/internal/v1/sales-order/search;;受注検索API;;8-----/v1/file/upload;;;;1*****9+++++/internal/v1/sales-order/search;;受注検索API;;9-----/v1/file/upload;;;;1");
	}

	@Test
	@Tag("TEST001")
	@DisplayName("TEST001")
	public void testMBSAR10010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "1");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST002")
	@DisplayName("TEST002")
	public void testMBSAR10010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "2");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST003")
	@DisplayName("TEST003")
	public void testMBSAR10010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "3");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST004")
	@DisplayName("TEST004")
	public void testMBSAR10010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "4");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST005")
	@DisplayName("TEST005")
	public void testMBSAR10010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "5");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST006")
	@DisplayName("TEST006")
	public void testMBSAR10010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "6");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST007")
	@DisplayName("TEST007")
	public void testMBSAR10010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "7");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST008")
	@DisplayName("TEST008")
	public void testMBSAR10010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "8");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

	@Test
	@Tag("TEST009")
	@DisplayName("TEST009")
	public void testMBSAR10010_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR10010/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注検索API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注検索API", "9");

		/* 操作(apiMock) → /v1/file/upload */
		rakurakuCore.operateMockApi("/v1/file/upload", "", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "createRedBlackVoucherDataJob,--job-execution-id=12345,--operation-date=2021-09-11,--subsidiary-code=MJP");

	}

}
