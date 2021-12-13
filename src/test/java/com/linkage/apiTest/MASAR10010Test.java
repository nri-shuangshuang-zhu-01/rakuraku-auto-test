package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR10010機能確認")
@DisplayName("MASAR10010機能確認")
public class MASAR10010Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR10010");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR10010");
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
	@Tag("CustomerStatement情報取得1")
	@DisplayName("CustomerStatement情報取得1")
	public void testMASAR10010_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_001.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得2")
	@DisplayName("CustomerStatement情報取得2")
	public void testMASAR10010_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "2");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "2");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_002.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得3")
	@DisplayName("CustomerStatement情報取得3")
	public void testMASAR10010_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "3");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "3");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_003.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得4")
	@DisplayName("CustomerStatement情報取得4")
	public void testMASAR10010_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "4");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "4");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_004.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得5")
	@DisplayName("CustomerStatement情報取得5")
	public void testMASAR10010_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "5");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "5");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_005.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得6")
	@DisplayName("CustomerStatement情報取得6")
	public void testMASAR10010_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "6");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "6");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_006.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得7")
	@DisplayName("CustomerStatement情報取得7")
	public void testMASAR10010_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "7");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "7");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_007.txt");

	}

	@Test
	@Tag("CustomerStatement情報取得8")
	@DisplayName("CustomerStatement情報取得8")
	public void testMASAR10010_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR10010/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_incoming_payment → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_incoming_payment_unmatch → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "8");

		/* 操作(DB準備) → m_bill_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "8");

		/* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_008.txt");

	}

}
