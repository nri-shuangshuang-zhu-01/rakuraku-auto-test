package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;


@Tag("MASRQ01341機能確認")
@DisplayName("MASRQ01341機能確認")
public class MASRQ01341Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01341");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01341");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****2+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****3+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****4+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****5+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****6+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;2-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****7+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;null-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****8+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;record0-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****9+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;null-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****10+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;null-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****11+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;null-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****12+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;null*****13+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****14+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****15+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****16+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****17+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****18+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;2-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****19+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;2-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****20+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****21+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****22+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;2*****23+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****24+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****25+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****26+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1*****27+++++/internal/v1/customer/get;;顧客管理サービス.得意先情報取得API;;1-----/internal/v1/mail/send;;A4 メール送信;;1-----/internal/v1/mail/find;;A3 詳細情報取得(受信メール／送信メール);;1-----/internal/v1/fax/send;;A4 FAX送信;;1-----/internal/v1/fax/find;;A2 詳細情報取得(受信/送信);;1");
	}

	@Test
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMASRQ01341_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認1")
	@DisplayName("0件確認1")
	public void testMASRQ01341_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認2")
	@DisplayName("0件確認2")
	public void testMASRQ01341_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(NULL)")
	@DisplayName("最小値(NULL)")
	public void testMASRQ01341_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(空白)")
	@DisplayName("最小値(空白)")
	public void testMASRQ01341_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("得意先情報取得API2")
	@DisplayName("得意先情報取得API2")
	public void testMASRQ01341_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "2");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("得意先情報取得APInull")
	@DisplayName("得意先情報取得APInull")
	public void testMASRQ01341_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "null");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("得意先情報取得API0")
	@DisplayName("得意先情報取得API0")
	public void testMASRQ01341_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "record0");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A4 メール送信null")
	@DisplayName("A4 メール送信null")
	public void testMASRQ01341_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "null");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A3 詳細情報取得(受信メール／送信メール)null")
	@DisplayName("A3 詳細情報取得(受信メール／送信メール)null")
	public void testMASRQ01341_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "null");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A4 FAX送信null")
	@DisplayName("A4 FAX送信null")
	public void testMASRQ01341_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "null");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text02.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A2 詳細情報取得(受信/送信)null")
	@DisplayName("A2 詳細情報取得(受信/送信)null")
	public void testMASRQ01341_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "null");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text02.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("2")
	@DisplayName("2")
	public void testMASRQ01341_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text02.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("3")
	@DisplayName("3")
	public void testMASRQ01341_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text03.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト.メールアドレス（TO）＝ 空の場合")
	@DisplayName("リクエスト.メールアドレス（TO）＝ 空の場合")
	public void testMASRQ01341_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_emailAddressToempty.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト.メールアドレス（TO）＝ NULLの場合")
	@DisplayName("リクエスト.メールアドレス（TO）＝ NULLの場合")
	public void testMASRQ01341_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_emailAddressTonull.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("ダウンロードできない場合")
	@DisplayName("ダウンロードできない場合")
	public void testMASRQ01341_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_attachFileIdListerr.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag(" メール送信API2")
	@DisplayName(" メール送信API2")
	public void testMASRQ01341_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "2");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A3 詳細情報取得(受信メール／送信メール)2")
	@DisplayName("A3 詳細情報取得(受信メール／送信メール)2")
	public void testMASRQ01341_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "2");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト.FAX番号 ＝ 空の場合")
	@DisplayName("リクエスト.FAX番号 ＝ 空の場合")
	public void testMASRQ01341_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_faxempty.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト.FAX番号 ＝ NULLの場合")
	@DisplayName("リクエスト.FAX番号 ＝ NULLの場合")
	public void testMASRQ01341_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_faxnull.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("A2 詳細情報取得(受信/送信)2件")
	@DisplayName("A2 詳細情報取得(受信/送信)2件")
	public void testMASRQ01341_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "2");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text02.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト 空の場合")
	@DisplayName("リクエスト 空の場合")
	public void testMASRQ01341_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_textempty.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("リクエスト NULLの場合")
	@DisplayName("リクエスト NULLの場合")
	public void testMASRQ01341_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_textnull.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("list")
	@DisplayName("list")
	public void testMASRQ01341_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text01list.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("S3")
	@DisplayName("S3")
	public void testMASRQ01341_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_attachFileIdListerr.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("49")
	@DisplayName("49")
	public void testMASRQ01341_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01341/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_customer_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_customer_inquiry", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer/get → 顧客管理サービス.得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "顧客管理サービス.得意先情報取得API", "1");

		/* 操作(apiMock) → /internal/v1/mail/send → A4 メール送信 */
		rakurakuCore.operateMockApi("/internal/v1/mail/send", "A4 メール送信", "1");

		/*   → /internal/v1/mail/find → A3 詳細情報取得(受信メール／送信メール) */
		rakurakuCore.operateMockApi("/internal/v1/mail/find", "A3 詳細情報取得(受信メール／送信メール)", "1");

		/*   → /internal/v1/fax/send → A4 FAX送信 */
		rakurakuCore.operateMockApi("/internal/v1/fax/send", "A4 FAX送信", "1");

		/*   → /internal/v1/fax/find → A2 詳細情報取得(受信/送信) */
		rakurakuCore.operateMockApi("/internal/v1/fax/find", "A2 詳細情報取得(受信/送信)", "1");

		/* 操作(api) → 通知送信 → internal/v1/notification/send → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id */
		rakurakuCore.operateApi("通知送信", "internal/v1/notification/send", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=offset&&Idempotency-Key=string&&X-Application-Id=X-Application-Id", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASRQ01341\\MASRQ01341_text49.txt");

		/* 操作(DB確認) → T_INQUIRY_SEND_HISTORY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_HISTORY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_TO", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_TO_EMAIL_ADDRESS_CC", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INQUIRY_SEND_ATTACHMENT_FILE → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INQUIRY_SEND_ATTACHMENT_FILE", "NOT_ASSERT_COLUMN", "〇");

	}

}
