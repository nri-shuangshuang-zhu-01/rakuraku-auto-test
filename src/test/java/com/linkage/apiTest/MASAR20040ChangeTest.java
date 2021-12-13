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
public class MASAR20040ChangeTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR20040Change");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR20040Change");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("999+++++/v1/subsidiary/get;;現法情報取得API;;@Example-----/v1/report/print;;帳票作成API;;@Example-----/v1/report/find;;詳細情報取得API;;@Example-----/v1/report/download;;帳票ファイル取得API;;@Example-----/v1/mail-template/preview;;メールプレビューAPI;;@Example-----/v1/mail/send;;メール送信API;;@Example-----/v1/fax/send;;FAX送信API;;@Example");
	}

	@Test
	@Tag("変更98")
	@DisplayName("変更98")
	public void testMASAR20040Change_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040Change/case_001/case_001_", "");// ケース番号の設定

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
	public void testMASAR20040Change_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR20040Change/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bank → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bank", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_dunning_letter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_dunning_letter", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_ar_report_setting → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_ar_report_setting", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_reprint → DELETE_ALL */
		rakurakuCore.operateDBPrepare("t_reprint", "DELETE_ALL", "1");

	}

}
