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
public class MASCR00010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASCR00010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASCR00010");
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
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testMASCR00010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_001.txt");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMASCR00010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_002.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_003.txt");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMASCR00010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "4");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_004.txt");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMASCR00010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "5");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_005.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "6");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_006.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "7");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_007.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "8");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_008.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "9");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_009.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "10");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_010.txt");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMASCR00010_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "11");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_011.txt");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMASCR00010_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "12");

		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_012.txt");

	}

	@Test
	public void testMASCR00010_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR00010/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 検索 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=test&&x-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASCR00010_与信\\MASCR00010_012.txt");

	}

}
