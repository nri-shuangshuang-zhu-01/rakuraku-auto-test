package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01240機能確認")
@DisplayName("MASRQ01240機能確認")
public class MASRQ01240Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01240");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01240");
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
	@Tag("test001")
	@DisplayName("test001")
	public void testMASRQ01240_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "7");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMASRQ01240_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01240_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "3");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01240_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "4");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01240_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "5");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01240_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01240/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "6");

		/* 操作(api) → URL取得 → internal/v1/supplier-reply-file-url → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string */
		rakurakuCore.operateApi("URL取得", "internal/v1/supplier-reply-file-url?leadTimeProductInquiryId=101", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string", "", "-");

	}

}
