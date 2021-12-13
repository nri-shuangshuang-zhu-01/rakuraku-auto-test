package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBSCR40010機能確認")
@DisplayName("MBSCR40010機能確認")
public class MBSCR40010変更Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSCR40010変更");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSCR40010変更");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法情報取得API;;1");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMBSCR40010変更_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSCR40010変更/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_INCOMING_PAYMENT_UNMATCH → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_UNMATCH", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_NON_PAYMENT_MANAGEMENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_NON_PAYMENT_MANAGEMENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_AR_BALANCE_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_AR_BALANCE_SUMMARY", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_CREDIT_LIMIT_MANAGEMENT_SUMMARY_DATE", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_INCOMING_PAYMENT_SUMMARY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_INCOMING_PAYMENT_SUMMARY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法情報取得API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "arBalanceSummaryJob,--operation-date=23000812,--job-execution-id=MBSCR40010,--subsidiary-code=TIW");

		/* 操作(DB確認) → T_AR_BALANCE_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_AR_BALANCE_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_INCOMING_PAYMENT_SUMMARY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_INCOMING_PAYMENT_SUMMARY", "NOT_ASSERT_COLUMN", "〇");

	}

}
