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
public class MACFMCD7R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MACFMCD7R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MACFMCD7R0");
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
	@Tag("シート「SQLマトリックス①」のNo.1を参照１件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.1を参照１件確認")
	public void testMACFMCD7R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.1を参照複数件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.1を参照複数件確認")
	public void testMACFMCD7R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "2");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.2を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.2を参照0件確認")
	public void testMACFMCD7R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.3を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.3を参照0件確認")
	public void testMACFMCD7R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.4を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.4を参照0件確認")
	public void testMACFMCD7R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "4");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.5を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.5を参照0件確認")
	public void testMACFMCD7R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "5");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.6を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.6を参照0件確認")
	public void testMACFMCD7R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "6");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.7を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.7を参照0件確認")
	public void testMACFMCD7R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "7");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.8を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.8を参照0件確認")
	public void testMACFMCD7R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "8");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.9を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.9を参照0件確認")
	public void testMACFMCD7R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "9");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.10を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.10を参照0件確認")
	public void testMACFMCD7R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "10");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("シート「SQLマトリックス①」のNo.11を参照0件確認")
	@DisplayName("シート「SQLマトリックス①」のNo.11を参照0件確認")
	public void testMACFMCD7R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMACFMCD7R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "13");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "13");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "13");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMACFMCD7R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "14");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "14");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "14");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMACFMCD7R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_authority → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_authority", "データクリア・挿入", "15");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "15");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "15");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

	@Test
	@Tag("UL用/UL結果データダウンロードファイル情報リスト取得がエラーこと確認")
	@DisplayName("UL用/UL結果データダウンロードファイル情報リスト取得がエラーこと確認")
	public void testMACFMCD7R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD7R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_large_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_large_classification", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ul_purpose_ul_result_data_download_middle_classification → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ul_purpose_ul_result_data_download_middle_classification", "データクリア・挿入", "1");

		/* 操作(api) → 検索 → internal/v1/ul-data-download-pulldown/get → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/ul-data-download-pulldown/get", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp", "UserLoginInfo", "-");

	}

}
