package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MACFMCD1R0機能確認")
@DisplayName("MACFMCD1R0機能確認")
public class MACFMCD1R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MACFMCD1R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MACFMCD1R0");
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
	@Tag("シート「SQLマトリックス」のNo.1を参照１件確認")
	@DisplayName("シート「SQLマトリックス」のNo.1を参照１件確認")
	public void testMACFMCD1R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_001.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.1を参照複数件確認")
	@DisplayName("シート「SQLマトリックス」のNo.1を参照複数件確認")
	public void testMACFMCD1R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_016.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.2を参照１件確認")
	@DisplayName("シート「SQLマトリックス」のNo.2を参照１件確認")
	public void testMACFMCD1R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_003.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.3を参照１件確認")
	@DisplayName("シート「SQLマトリックス」のNo.3を参照１件確認")
	public void testMACFMCD1R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_004.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.4を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.4を参照0件確認")
	public void testMACFMCD1R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "4");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.5を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.5を参照0件確認")
	public void testMACFMCD1R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "5");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.6を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.6を参照0件確認")
	public void testMACFMCD1R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "6");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.7を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.7を参照0件確認")
	public void testMACFMCD1R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "4");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "7");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.8を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.8を参照0件確認")
	public void testMACFMCD1R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_008.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.9を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.9を参照0件確認")
	public void testMACFMCD1R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_009.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.10を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.10を参照0件確認")
	public void testMACFMCD1R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_010.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.11を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.11を参照0件確認")
	public void testMACFMCD1R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_011.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.12を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.12を参照0件確認")
	public void testMACFMCD1R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_012.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.13を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.13を参照0件確認")
	public void testMACFMCD1R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "13");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.16，NO.23を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.16，NO.23を参照0件確認")
	public void testMACFMCD1R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.17，NO.24を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.17，NO.24を参照0件確認")
	public void testMACFMCD1R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.18，NO.25を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.18，NO.25を参照0件確認")
	public void testMACFMCD1R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.19，NO.26を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.19，NO.26を参照0件確認")
	public void testMACFMCD1R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.20，NO.27を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.20，NO.27を参照0件確認")
	public void testMACFMCD1R0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.21，NO.28を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.21，NO.28を参照0件確認")
	public void testMACFMCD1R0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.15を参照１件確認")
	@DisplayName("シート「SQLマトリックス」のNo.15を参照１件確認")
	public void testMACFMCD1R0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_021.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.15を参照複数件確認")
	@DisplayName("シート「SQLマトリックス」のNo.15を参照複数件確認")
	public void testMACFMCD1R0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_022.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMACFMCD1R0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "23");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "23");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "23");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_023.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMACFMCD1R0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "24");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "24");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "24");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_024.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMACFMCD1R0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "25");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "25");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "25");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_025.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("取得開始位置1確認")
	@DisplayName("取得開始位置1確認")
	public void testMACFMCD1R0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("取得開始位置2確認")
	@DisplayName("取得開始位置2確認")
	public void testMACFMCD1R0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=2&limit=3&sortby2=controlSeqNumber&sortby=createDate", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("取得開始位置3確認")
	@DisplayName("取得開始位置3確認")
	public void testMACFMCD1R0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=3&limit=3&sortby2=controlSeqNumber&sortby=createDate DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("取得開始位置4確認")
	@DisplayName("取得開始位置4確認")
	public void testMACFMCD1R0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=4&limit=1&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("最大数の範囲内確認")
	@DisplayName("最大数の範囲内確認")
	public void testMACFMCD1R0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_030.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("権限コード確認")
	@DisplayName("権限コード確認")
	public void testMACFMCD1R0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("statusCode複数件確認")
	@DisplayName("statusCode複数件確認")
	public void testMACFMCD1R0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=statusCode", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("statusCode DESC複数件確認")
	@DisplayName("statusCode DESC複数件確認")
	public void testMACFMCD1R0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=statusCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　sortby=dataCode３件確認")
	@DisplayName("　　sortby=dataCode３件確認")
	public void testMACFMCD1R0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=dataCode", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　sortby=mailAddress３件確認")
	@DisplayName("　　sortby=mailAddress３件確認")
	public void testMACFMCD1R0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=mailAddress", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　sortby=mailAddress DESC３件確認")
	@DisplayName("　　sortby=mailAddress DESC３件確認")
	public void testMACFMCD1R0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=mailAddress DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　　sortby=fileName３件確認")
	@DisplayName("　　　sortby=fileName３件確認")
	public void testMACFMCD1R0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=fileName", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　sortby=fileName DESC３件確認")
	@DisplayName("　　sortby=fileName DESC３件確認")
	public void testMACFMCD1R0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=3&sortby2=controlSeqNumber&sortby=fileName DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("　　sortby2=controlSeqNumber4件確認")
	@DisplayName("　　sortby2=controlSeqNumber4件確認")
	public void testMACFMCD1R0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=4&sortby2=controlSeqNumber&sortby=null", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_026.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("UL用/UL結果データダウンロードファイル制御参照情報が2件取得される場合")
	@DisplayName("UL用/UL結果データダウンロードファイル制御参照情報が2件取得される場合")
	public void testMACFMCD1R0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "26");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=2&limit=3&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_040.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("变更1")
	@DisplayName("变更1")
	public void testMACFMCD1R0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "41");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "41");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "41");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_055.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("变更2")
	@DisplayName("变更2")
	public void testMACFMCD1R0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "42");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "42");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "42");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_056.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("变更3")
	@DisplayName("变更3")
	public void testMACFMCD1R0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "43");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "43");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "43");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_057.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("变更4")
	@DisplayName("变更4")
	public void testMACFMCD1R0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "44");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "44");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "44");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_058.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("リクエストのメールアドレスに値が設定されている場合確認")
	@DisplayName("リクエストのメールアドレスに値が設定されている場合確認")
	public void testMACFMCD1R0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_031.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("リクエストのデータコードに値が設定されている場合確認")
	@DisplayName("リクエストのデータコードに値が設定されている場合確認")
	public void testMACFMCD1R0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_032.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("リクエストのファイル名に値が設定されている場合確認")
	@DisplayName("リクエストのファイル名に値が設定されている場合確認")
	public void testMACFMCD1R0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_033.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」の変更NO.14を参照確認")
	@DisplayName("シート「SQLマトリックス」の変更NO.14を参照確認")
	public void testMACFMCD1R0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_034.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

	@Test
	@Tag("シート「SQLマトリックス」のNo.変更NO.15を参照0件確認")
	@DisplayName("シート「SQLマトリックス」のNo.変更NO.15を参照0件確認")
	public void testMACFMCD1R0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD1R0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_ul_purpose_ul_result_data_download_file → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_ul_purpose_ul_result_data_download_file", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "45");

		/* 操作(api) → 登录 → internal/v1/ul-purpose-data-download/reference? → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/ul-purpose-data-download/reference?offset=1&limit=20&sortby2=controlSeqNumber&sortby=dataCode DESC", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=4a037a9e-2500-4724-a005-997a1ab13a55", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD1R0\\MACFMCD1R0_005.txt");

		/* 操作(DB確認) → c_screen_field_display */
		rakurakuCore.operateDBConfirm("c_screen_field_display", "", "〇");

		/* 操作(DB確認) → c_ul_purpose_ul_result_data_download_file */
		rakurakuCore.operateDBConfirm("c_ul_purpose_ul_result_data_download_file", "", "〇");

		/* 操作(DB確認) → m_ul_purpose_ul_result_data_download_authority */
		rakurakuCore.operateDBConfirm("m_ul_purpose_ul_result_data_download_authority", "", "〇");

	}

}
