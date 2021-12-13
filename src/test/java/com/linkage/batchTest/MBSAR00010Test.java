package com.linkage.batchTest;

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
public class MBSAR00010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBSAR00010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBSAR00010");
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
	@Tag("test01")
	@DisplayName("test01")
	public void testMBSAR00010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12345");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test02")
	@DisplayName("test02")
	public void testMBSAR00010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "2");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12346");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test03")
	@DisplayName("test03")
	public void testMBSAR00010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "3");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12347");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test04")
	@DisplayName("test04")
	public void testMBSAR00010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "4");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12348");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test05")
	@DisplayName("test05")
	public void testMBSAR00010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "5");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12349");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test06")
	@DisplayName("test06")
	public void testMBSAR00010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBSAR00010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "6");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "deleteReprintDataJob,--subsidiary-code=JPN,--job-execution-id=12350");

		/* 操作(DB確認) → T_REPRINT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_REPRINT", "NOT_ASSERT_COLUMN", "〇");

	}

}
