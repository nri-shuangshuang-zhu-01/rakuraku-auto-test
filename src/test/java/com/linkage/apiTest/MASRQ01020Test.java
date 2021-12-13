package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01020機能確認")
@DisplayName("MASRQ01020機能確認")
public class MASRQ01020Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01020");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01020");
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
	public void testMASRQ01020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=3&offset=2", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMASRQ01020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "2");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMASRQ01020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "3");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=&generalPurposeKey3=&generalPurposeKey4=&generalPurposeKey5=&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMASRQ01020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "4");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMASRQ01020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "5");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMASRQ01020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "6");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMASRQ01020_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "7");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMASRQ01020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "8");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMASRQ01020_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "9");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMASRQ01020_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "10");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMASRQ01020_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "11");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMASRQ01020_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "12");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=keykeykeykeykeykey11&generalPurposeKey2=keykeykeykeykeykey22&generalPurposeKey3=keykeykeykeykeykey33&generalPurposeKey4=keykeykeykeykeykey44&generalPurposeKey5=keykeykeykeykeykey55&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMASRQ01020_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "13");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=k&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMASRQ01020_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "14");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=k&limit=1&offset=0", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMASRQ01020_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "15");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=3&offset=2", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMASRQ01020_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01020/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "16");

		/* 操作(api) → 納期型番確認コード検索 → internal/v1/lead-time-product-inquiry-code/search → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string */
		rakurakuCore.operateApi("納期型番確認コード検索", "internal/v1/lead-time-product-inquiry-code/search?generalPurposeKey1=key1&generalPurposeKey2=key2&generalPurposeKey3=key3&generalPurposeKey4=key4&generalPurposeKey5=key5&limit=3&offset=2", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-User-Type=System&&X-Auth-Id=string&&x-datadog-trace-id=string&&Authorization=string&&Cache-Control=string&&X-Client-Program=string", "", "-");

	}

}
