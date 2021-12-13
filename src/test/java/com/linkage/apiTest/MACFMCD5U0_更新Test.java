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
public class MACFMCD5U0_更新Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MACFMCD5U0_更新");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MACFMCD5U0_更新");
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
	public void testMACFMCD5U0_更新_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_001.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_002.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_003.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_004.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_005.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_006.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_007.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "8");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_008.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_009.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "10");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_010.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "11");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_011.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "12");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_012.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "13");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_013.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMACFMCD5U0_更新_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD5U0_更新/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "14");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 共通_データアップロード_ステータス更新API → internal/v1/data-upload/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28 → UserLoginInfo */
		rakurakuCore.operateApi("共通_データアップロード_ステータス更新API", "internal/v1/data-upload/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a28", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD5U0_更新\\MACFMCD5U0_014.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

}
