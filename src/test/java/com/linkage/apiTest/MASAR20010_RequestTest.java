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
public class MASAR20010_RequestTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20010_Request");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20010_Request");
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
	@Tag("日付 null")
	@DisplayName("日付 null")
	public void testMASAR20010_Request_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\1.txt");

	}

	@Test
	@Tag("入金状況 null")
	@DisplayName("入金状況 null")
	public void testMASAR20010_Request_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\2.txt");

	}

	@Test
	@Tag("レベル null")
	@DisplayName("レベル null")
	public void testMASAR20010_Request_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\3.txt");

	}

	@Test
	@Tag("督促レベル/タイトルレベル null")
	@DisplayName("督促レベル/タイトルレベル null")
	public void testMASAR20010_Request_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\4.txt");

	}

	@Test
	@Tag("取引状態 null")
	@DisplayName("取引状態 null")
	public void testMASAR20010_Request_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\5.txt");

	}

	@Test
	@Tag("現法コード null")
	@DisplayName("現法コード null")
	public void testMASAR20010_Request_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\6.txt");

	}

	@Test
	@Tag("システム日付 null")
	@DisplayName("システム日付 null")
	public void testMASAR20010_Request_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\7.txt");

	}

	@Test
	@Tag("ソート項目 null")
	@DisplayName("ソート項目 null")
	public void testMASAR20010_Request_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\8.txt");

	}

	@Test
	@Tag("ソート順序 null")
	@DisplayName("ソート順序 null")
	public void testMASAR20010_Request_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\9.txt");

	}

	@Test
	@Tag("ページ番号 null")
	@DisplayName("ページ番号 null")
	public void testMASAR20010_Request_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\10.txt");

	}

	@Test
	@Tag("表示件数 null")
	@DisplayName("表示件数 null")
	public void testMASAR20010_Request_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\11.txt");

	}

	@Test
	@Tag("レスポンス種別 null")
	@DisplayName("レスポンス種別 null")
	public void testMASAR20010_Request_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20010_Request/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/non-payment/get → POST → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/non-payment/get", "POST", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=temp&&Content-Type=application/json", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR20010\\12.txt");

	}

}
