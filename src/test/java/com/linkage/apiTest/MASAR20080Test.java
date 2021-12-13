package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR20080機能確認")
@DisplayName("MASAR20080機能確認")
public class MASAR20080Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20080");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20080");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/report/print;;帳票作成API;;-----/internal/v1/report/find;;詳細情報取得API;;1-----/internal/v1/report/download;;帳票ファイル取得API;;-----/v1/mail-template/preview;;メールプレビューAPI;;1-----/v1/mail/send;;メール送信API;;1-----/v1/fax/send;;FAX送信API;;1*****2+++++/internal/v1/subsidiary/get;;現法情報取得API;;1-----/internal/v1/report/print;;帳票作成API;;-----/internal/v1/report/find;;詳細情報取得API;;1-----/internal/v1/report/download;;帳票ファイル取得API;;-----/v1/mail-template/preview;;メールプレビューAPI;;1-----/v1/mail/send;;メール送信API;;1-----/v1/fax/send;;FAX送信API;;1");
	}

	@Test
	@Tag("現法情報取得1")
	@DisplayName("現法情報取得1")
	public void testMASAR20080_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20080/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/report/find → 詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "詳細情報取得API", "1");

		/* 操作(apiMock) → /v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "1");

		/* 操作(apiMock) → /v1/fax/send → FAX送信API */
		rakurakuCore.operateMockApi("/v1/fax/send", "FAX送信API", "1");

		/* 操作(api) → 登录 → internal/v1/dunning-letter-download/issue → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=11137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/dunning-letter-download/issue", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=11137", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20080\\001.txt");

		/* 操作(DB確認) → t_reprint → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_reprint", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("現法情報取得2")
	@DisplayName("現法情報取得2")
	public void testMASAR20080_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20080/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/report/find → 詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "詳細情報取得API", "1");

		/* 操作(apiMock) → /v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/v1/mail-template/preview", "メールプレビューAPI", "1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "1");

		/* 操作(apiMock) → /v1/fax/send → FAX送信API */
		rakurakuCore.operateMockApi("/v1/fax/send", "FAX送信API", "1");

		/* 操作(api) → 登录 → internal/v1/dunning-letter-download/issue → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=11137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/dunning-letter-download/issue", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=11137", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20080\\002.txt");

		/* 操作(DB確認) → t_reprint → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_reprint", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → t_non_payment_management → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_non_payment_management", "NOT_ASSERT_COLUMN", "〇");

	}

}
