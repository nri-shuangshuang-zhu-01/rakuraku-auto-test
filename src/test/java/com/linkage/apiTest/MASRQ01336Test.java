package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01336機能確認")
@DisplayName("MASRQ01336機能確認")
public class MASRQ01336Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01336");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01336");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****2+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****3+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****4+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****5+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****6+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****7+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****8+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1*****9+++++/internal/v1/report/download;;帳票基盤サービス・ファイル取得API;;example-1");
	}

	@Test
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMASRQ01336_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMASRQ01336_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01336_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01336_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01336_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01336_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMASRQ01336_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMASRQ01336_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "6");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMASRQ01336_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01336/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_send_history → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_history", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_inquiry_send_attachment_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_send_attachment_file", "データクリア・挿入", "7");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票基盤サービス・ファイル取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票基盤サービス・ファイル取得API", "example-1");

		/* 操作(api) → 調整問合せ書(見積)URL取得 → internal/v1/so-inquiry-form-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222 */
		rakurakuCore.operateApi("調整問合せ書(見積)URL取得", "internal/v1/so-inquiry-form-url?inquirySendId=11111112&fileId=12-345-678-90-2", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=11111111111&&Idempotency-Key=5a037a9e-2500-4724-a005-997a1ab13003&&Authorization=2222222222", "", "-");

	}

}
