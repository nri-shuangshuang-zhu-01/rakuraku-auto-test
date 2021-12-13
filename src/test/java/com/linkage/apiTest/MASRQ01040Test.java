package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01040機能確認")
@DisplayName("MASRQ01040機能確認")
public class MASRQ01040Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01040");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01040");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/customer/get;;得意先情報取得API;;1*****2+++++/internal/v1/customer/get;;得意先情報取得API;;2*****3+++++/internal/v1/customer/get;;得意先情報取得API;;3*****4+++++/internal/v1/customer/get;;得意先情報取得API;;4*****5+++++/internal/v1/customer/get;;得意先情報取得API;;5*****6+++++/internal/v1/customer/get;;得意先情報取得API;;6*****7+++++/internal/v1/customer/get;;得意先情報取得API;;7");
	}

	@Test
	@Tag("取得した得意先情報.サービス停止区分＝1（受注停止）の場合")
	@DisplayName("取得した得意先情報.サービス停止区分＝1（受注停止）の場合")
	public void testMASRQ01040_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "1");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("取得した得意先情報.サービス停止区分＝W（注意顧客）の場合")
	@DisplayName("取得した得意先情報.サービス停止区分＝W（注意顧客）の場合")
	public void testMASRQ01040_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "2");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("取得した得意先情報.サービス停止区分＝E（取引停止）の場合")
	@DisplayName("取得した得意先情報.サービス停止区分＝E（取引停止）の場合")
	public void testMASRQ01040_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "3");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("上記以外の場合")
	@DisplayName("上記以外の場合")
	public void testMASRQ01040_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "4");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("レスポンス情報を取得複数件のする場合")
	@DisplayName("レスポンス情報を取得複数件のする場合")
	public void testMASRQ01040_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "5");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("レスポンスを取得しないの場合")
	@DisplayName("レスポンスを取得しないの場合")
	public void testMASRQ01040_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "6");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

	@Test
	@Tag("レスポンスを取得しないの場合2")
	@DisplayName("レスポンスを取得しないの場合2")
	public void testMASRQ01040_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01040/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "7");

		/* 操作(api) → 登录 → internal/v1/customer-lead-time-product-inquiry/check? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-lead-time-product-inquiry/check?customerCode=BOSCH9", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&x-User-Type=System&&x-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&CacheControl=string", "UserLoginInfo", "-");

	}

}
