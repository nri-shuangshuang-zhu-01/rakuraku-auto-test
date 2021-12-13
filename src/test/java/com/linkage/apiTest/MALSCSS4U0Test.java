package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS4U0機能確認")
@DisplayName("MALSCSS4U0機能確認")
public class MALSCSS4U0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS4U0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS4U0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-1-----/internal/v1/plant/get-list;;置場情報取得API;;example-1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-5*****2+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-2-----/internal/v1/plant/get-list;;置場情報取得API;;example-2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-2-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-1*****3+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-2-----/internal/v1/plant/get-list;;置場情報取得API;;example-2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-2*****4+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-2-----/internal/v1/plant/get-list;;置場情報取得API;;example-2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-3*****5+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-2-----/internal/v1/plant/get-list;;置場情報取得API;;example-2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-1*****6+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-2-----/internal/v1/plant/get-list;;置場情報取得API;;example-2-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-2-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-6*****7+++++/newtonApi/shipmentfailsearch;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API;;example-1-----/internal/v1/plant/get-list;;置場情報取得API;;example-1-----/internal/v1/mail-template/preview;;メールプレビューAPI;;-----/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print1;;帳票作成API;;-----/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MFS→GW)API;;example-7");
	}

	@Test
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMALSCSS4U0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-5");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U00.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0002")
	@DisplayName("test0002")
	public void testMALSCSS4U0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-2");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U02.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0003")
	@DisplayName("test0003")
	public void testMALSCSS4U0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U03.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0004")
	@DisplayName("test0004")
	public void testMALSCSS4U0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-3");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U04.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0005")
	@DisplayName("test0005")
	public void testMALSCSS4U0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U05.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0006")
	@DisplayName("test0006")
	public void testMALSCSS4U0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-2");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-2");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-6");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U02.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test0007")
	@DisplayName("test0007")
	public void testMALSCSS4U0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS4U0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MFS→GW)API", "example-7");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/cancel → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/cancel", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=200", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS4U0\\MALSCSS4U00.json");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

}
