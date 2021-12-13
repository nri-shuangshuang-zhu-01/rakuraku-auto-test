package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ02150機能確認")
@DisplayName("MASRQ02150機能確認")
public class MASRQ02150Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ02150");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ02150");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1*****2+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1*****3+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1*****4+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;1*****5+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;record0*****6+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;null*****7+++++/supplier/v1/supplier-user/search;;仕入先コード取得;;empty");
	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASRQ02150_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMASRQ02150_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("不一致の場合")
	@DisplayName("不一致の場合")
	public void testMASRQ02150_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "3");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("仕入先回答ファイルIdnull")
	@DisplayName("仕入先回答ファイルIdnull")
	public void testMASRQ02150_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "4");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "1");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("サプライヤユーザー情報検索API0件")
	@DisplayName("サプライヤユーザー情報検索API0件")
	public void testMASRQ02150_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "record0");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("サプライヤユーザー情報検索API仕入先コードnull")
	@DisplayName("サプライヤユーザー情報検索API仕入先コードnull")
	public void testMASRQ02150_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "null");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

	@Test
	@Tag("サプライヤユーザー情報検索API仕入先コードempty")
	@DisplayName("サプライヤユーザー情報検索API仕入先コードempty")
	public void testMASRQ02150_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02150/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → 仕入先コード取得 */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "仕入先コード取得", "empty");

		/* 操作(api) → 登录 → supplier/v1/supplier-reply-file-url? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "supplier/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&X-Application-Id=string&&X-User-Type=Supplier&&Idempotency-Key=121", "UserLoginInfo", "-");

	}

}
