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
public class MALSCSS2B0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS2B0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS2B0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/data-upload/register;;データアップロード登録API;;1-----/internal/v1/ul-purpose-data-download/save;;UL用/UL結果データダウンロード登録・更新API;;1-----/internal/v1/data-upload/save;;データアップロード_ステータス更新API;;1-----/v1/gw-stop-shipment/reference;;出荷・出荷不可参照API;;1-----/v1/gw-stop-shipment/save;;出荷不可_入力更新API;;1-----/v1/file/upload;;汎用ファイルアップロードAPI（DL用ファイル）;;1-----/v1/subsidiary/get;;現法マスタ参照API;;1");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMALSCSS2B0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2B0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → temporary_files → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("temporary_files", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/data-upload/register → データアップロード登録API */
		rakurakuCore.operateMockApi("/internal/v1/data-upload/register", "データアップロード登録API", "1");

		/* 操作(apiMock) → /internal/v1/ul-purpose-data-download/save → UL用/UL結果データダウンロード登録・更新API */
		rakurakuCore.operateMockApi("/internal/v1/ul-purpose-data-download/save", "UL用/UL結果データダウンロード登録・更新API", "1");

		/* 操作(apiMock) → /internal/v1/data-upload/save → データアップロード_ステータス更新API */
		rakurakuCore.operateMockApi("/internal/v1/data-upload/save", "データアップロード_ステータス更新API", "1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/reference → 出荷・出荷不可参照API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/reference", "出荷・出荷不可参照API", "1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可_入力更新API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可_入力更新API", "1");

		/* 操作(apiMock) → /v1/file/upload → 汎用ファイルアップロードAPI（DL用ファイル） */
		rakurakuCore.operateMockApi("/v1/file/upload", "汎用ファイルアップロードAPI（DL用ファイル）", "1");

		/* 操作(apiMock) → /v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stop-shipment/upload → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stop-shipment/upload", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=12345&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a56&&language_code=JPN&&subsidiary_code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS2B0\\MALSCSS2B0.json");

		/* 操作(DB確認) → C_PROCESS_PARAMETER → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_PROCESS_PARAMETER", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → temporary_files → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("temporary_files", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCSS2B0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2B0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMALSCSS2B0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2B0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMALSCSS2B0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2B0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	public void testMALSCSS2B0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS2B0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

}
