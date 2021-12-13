package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("在庫調整_更新")
@DisplayName("在庫調整_更新")
public class MALSCVA1U0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCVA1U0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCVA1U0");
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
	public void testMALSCVA1U0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test02.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test03.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test04.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test05.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "6");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test06.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "7");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "8");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "9");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "10");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "11");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "12");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "13");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "14");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "15");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "16");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "17");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "18");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "21");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "21");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "21");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "21");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "22");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "22");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "22");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "22");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "23");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "23");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "23");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "23");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "24");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "24");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "24");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "24");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "25");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "25");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "25");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "25");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "26");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "26");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "26");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "26");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test07.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "27");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "27");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "27");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "27");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test17.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "28");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "28");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "28");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "28");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "29");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "29");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "29");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "29");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "30");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "30");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "30");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "30");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "31");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "31");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "31");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "31");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "32");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "32");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "32");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "32");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "33");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "33");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "33");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "33");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test08.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "34");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "34");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "34");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "34");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test01.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "35");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "35");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "35");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "35");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test03.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "36");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "36");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "36");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "36");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\test05.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	public void testMALSCVA1U0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1U0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "37");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "37");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "37");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "37");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=test&&Idempotency-Key=tes24S3242qgj327525&&X-Language-Code=JPN&&X-Subsidiary-Code=JPN", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1U0\\変更.txt");

		/* 操作(DB確認) → c_email_function → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_function", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_send_group → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_send_group", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_template → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_template", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → c_email_to → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("c_email_to", "NOT_ASSERT_COLUMN", "〇");

	}

}
