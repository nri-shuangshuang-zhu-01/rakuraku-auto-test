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
public class MACFMCD2P0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MACFMCD2P0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MACFMCD2P0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****2+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****3+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****4+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****5+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****6+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****7+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****8+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****9+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1*****10+++++internal/v1/presigned-url/convert;;PresignedURL変換API;;example-1");
	}

	@Test
	public void testMACFMCD2P0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "1");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "1");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\02.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "3");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "3");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request _min.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "4");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "4");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_m.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "5");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "5");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "6");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "6");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "7");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "7");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "8");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "8");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "9");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "9");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\MACFMCD2P0_request_max.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD2P0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD2P0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "データクリア・挿入", "10");

		/* 操作(DB準備) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "データクリア・挿入", "10");

		/* 操作(DB準備) → IDEMPOTENT_REQUESTS → DELETE_ALL */
		rakurakuCore.operateDBPrepare("IDEMPOTENT_REQUESTS", "DELETE_ALL", "1");

		/* 操作(apiMock) → internal/v1/presigned-url/convert → PresignedURL変換API */
		rakurakuCore.operateMockApi("internal/v1/presigned-url/convert", "PresignedURL変換API", "example-1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/excute → Post → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/excute", "Post", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a01", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD2P0\\02.txt");

		/* 操作(DB確認) → C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_FILE", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("M_UL_PURPOSE_UL_RESULT_DATA_DOWNLOAD_AUTHORITY", "NOT_ASSERT_COLUMN", "〇");

	}

}
