package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR20040機能確認")
@DisplayName("MASAR20040機能確認")
public class MASAR20040NEWTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20040NEW");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20040NEW");
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
	@Tag("最大値AF")
	@DisplayName("最大値AF")
	public void testMASAR20040NEW_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("最小值NullAF")
	@DisplayName("最小值NullAF")
	public void testMASAR20040NEW_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("未入金管理検索結果件数：0件AF")
	@DisplayName("未入金管理検索結果件数：0件AF")
	public void testMASAR20040NEW_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("Case41に対してAF")
	@DisplayName("Case41に対してAF")
	public void testMASAR20040NEW_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("Case43に対してAM")
	@DisplayName("Case43に対してAM")
	public void testMASAR20040NEW_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "5");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	public void testMASAR20040NEW_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
	}

	@Test
	@Tag("Case44に対してAM")
	@DisplayName("Case44に対してAM")
	public void testMASAR20040NEW_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

	@Test
	@Tag("未入金管理検索結果件数：0件AF")
	@DisplayName("未入金管理検索結果件数：0件AF")
	public void testMASAR20040NEW_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040NEW/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "8");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

}
