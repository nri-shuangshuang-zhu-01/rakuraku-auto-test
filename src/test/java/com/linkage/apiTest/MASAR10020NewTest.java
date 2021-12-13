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
public class MASAR10020NewTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR10020New");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR10020New");
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
	@Tag("現法情報取得1件を検索エビデンスNo.05１")
	@DisplayName("現法情報取得1件を検索エビデンスNo.05１")
	public void testMASAR10020New_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10020New/case_001/case_001_", "");// ケース番号の設定

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
