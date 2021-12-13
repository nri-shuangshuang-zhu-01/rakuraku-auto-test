package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ11040機能確認")
@DisplayName("MASRQ11040機能確認")
public class MASRQ11040Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ11040");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ11040");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****2+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****3+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;null-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****4+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;null-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****5+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;record0-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****6+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;null*****7+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;record0*****8+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****9+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****10+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****11+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****12+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****13+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****14+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****15+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****16+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****17+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****18+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;2*****19+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****20+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****21+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****22+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****23+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****24+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****25+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****26+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1*****27+++++/internal/v1/customer-admin-cell/search;;送信先メールアドレス（TO）取得;;1-----/internal/v1/supplier/get;;仕入先メールアドレス取得;;1");
	}

	@Test
	@Tag("得意先管理セル紐付マスタ情報取得1件確認")
	@DisplayName("得意先管理セル紐付マスタ情報取得1件確認")
	public void testMASRQ11040_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("得意先管理セル紐付マスタ情報取得複数件確認")
	@DisplayName("得意先管理セル紐付マスタ情報取得複数件確認")
	public void testMASRQ11040_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("得意先管理セル紐付マスタ情報取得0件確認")
	@DisplayName("得意先管理セル紐付マスタ情報取得0件確認")
	public void testMASRQ11040_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "null");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("送信先メールアドレス（TO）取得0件確認")
	@DisplayName("送信先メールアドレス（TO）取得0件確認")
	public void testMASRQ11040_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "null");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("送信先メールアドレス（TO）取得null")
	@DisplayName("送信先メールアドレス（TO）取得null")
	public void testMASRQ11040_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "record0");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("仕入先メールアドレス取得0件確認")
	@DisplayName("仕入先メールアドレス取得0件確認")
	public void testMASRQ11040_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "null");

	}

	@Test
	@Tag("仕入先メールアドレス取得null")
	@DisplayName("仕入先メールアドレス取得null")
	public void testMASRQ11040_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "record0");

	}

	@Test
	@Tag("メールテンプレートID取得0件確認")
	@DisplayName("メールテンプレートID取得0件確認")
	public void testMASRQ11040_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("1")
	@DisplayName("1")
	public void testMASRQ11040_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("2")
	@DisplayName("2")
	public void testMASRQ11040_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("3")
	@DisplayName("3")
	public void testMASRQ11040_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("4")
	@DisplayName("4")
	public void testMASRQ11040_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("5")
	@DisplayName("5")
	public void testMASRQ11040_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("6")
	@DisplayName("6")
	public void testMASRQ11040_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	@Tag("7")
	@DisplayName("7")
	public void testMASRQ11040_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	public void testMASRQ11040_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	public void testMASRQ11040_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	public void testMASRQ11040_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "2");

	}

	@Test
	public void testMASRQ11040_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

	@Test
	public void testMASRQ11040_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ11040/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → m_customer_admin_cell_link → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_customer_admin_cell_link", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/customer-admin-cell/search → 送信先メールアドレス（TO）取得 */
		rakurakuCore.operateMockApi("/internal/v1/customer-admin-cell/search", "送信先メールアドレス（TO）取得", "1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先メールアドレス取得 */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先メールアドレス取得", "1");

	}

}
