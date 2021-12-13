package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCCM1R0")
@DisplayName("MALSCCM1R0")
public class MALSCCM1R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCCM1R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCCM1R0");
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
	public void testMALSCCM1R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMALSCCM1R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test02.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "3");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMALSCCM1R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "4");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test03.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMALSCCM1R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "5");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test04.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMALSCCM1R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "6");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test05.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "7");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "8");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "9");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "10");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "11");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("0件確認")
	@DisplayName("0件確認")
	public void testMALSCCM1R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "12");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test01.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.03")
	@DisplayName("No.03")
	public void testMALSCCM1R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "13");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test05.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.04")
	@DisplayName("No.04")
	public void testMALSCCM1R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "14");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test06.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.05")
	@DisplayName("No.05")
	public void testMALSCCM1R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "15");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test07.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.06")
	@DisplayName("No.06")
	public void testMALSCCM1R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "16");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test08.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.07")
	@DisplayName("No.07")
	public void testMALSCCM1R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "17");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test09.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.09")
	@DisplayName("No.09")
	public void testMALSCCM1R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "18");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test10.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.10")
	@DisplayName("No.10")
	public void testMALSCCM1R0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "19");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test11.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.11")
	@DisplayName("No.11")
	public void testMALSCCM1R0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "20");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test12.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.12")
	@DisplayName("No.12")
	public void testMALSCCM1R0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "21");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test13.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("No.13")
	@DisplayName("No.13")
	public void testMALSCCM1R0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCM1R0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "22");

		/* 操作(api) → 登录 → internal/v1/screen-field-display/get → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/screen-field-display/get", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCCM1R0\\test14.txt");

		/* 操作(DB確認) → C_SCREEN_FIELD_DISPLAY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("C_SCREEN_FIELD_DISPLAY", "NOT_ASSERT_COLUMN", "〇");

	}

}
