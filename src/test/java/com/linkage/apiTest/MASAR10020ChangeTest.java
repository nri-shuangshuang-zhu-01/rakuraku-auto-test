package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR10020機能確認")
@DisplayName("MASAR10020機能確認")
public class MASAR10020ChangeTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR10020Change");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR10020Change");
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
	@Tag("case001变更Fax")
	@DisplayName("case001变更Fax")
	public void testMASAR10020Change_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case002变更AM")
	@DisplayName("case002变更AM")
	public void testMASAR10020Change_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case003大于3000件AM")
	@DisplayName("case003大于3000件AM")
	public void testMASAR10020Change_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case004_'CustomerStatement情報取得0件场合")
	@DisplayName("case004_'CustomerStatement情報取得0件场合")
	public void testMASAR10020Change_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case005_'CustomerStatementAM场合_送信先情報(売掛先メールアドレス（TO)Null")
	@DisplayName("case005_'CustomerStatementAM场合_送信先情報(売掛先メールアドレス（TO)Null")
	public void testMASAR10020Change_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "5");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case005_'CustomerStatementAM场合_送信先情報(売掛先FAX番号  Null")
	@DisplayName("case005_'CustomerStatementAM场合_送信先情報(売掛先FAX番号  Null")
	public void testMASAR10020Change_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "6");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("Case11_CustomerStatement基本情報取得 0 件")
	@DisplayName("Case11_CustomerStatement基本情報取得 0 件")
	public void testMASAR10020Change_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "7");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("Case45")
	@DisplayName("Case45")
	public void testMASAR10020Change_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("Case46(172)")
	@DisplayName("Case46(172)")
	public void testMASAR10020Change_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case055最大值")
	@DisplayName("case055最大值")
	public void testMASAR10020Change_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "10");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "10");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "10");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("case055NUll")
	@DisplayName("case055NUll")
	public void testMASAR10020Change_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "11");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "11");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "11");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "11");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "11");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "11");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("No.003(New)")
	@DisplayName("No.003(New)")
	public void testMASAR10020Change_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020Change/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 未入金管理テーブル → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 未入金管理テーブル → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

}
