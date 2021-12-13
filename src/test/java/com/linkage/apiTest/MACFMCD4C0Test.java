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
public class MACFMCD4C0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MACFMCD4C0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MACFMCD4C0");
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
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testMACFMCD4C0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_001.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("nextval以外の場合0件確認")
	@DisplayName("nextval以外の場合0件確認")
	public void testMACFMCD4C0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_001.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(NULL)確認")
	@DisplayName("最小値(NULL)確認")
	public void testMACFMCD4C0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "3");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_003.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最小値(空白)確認")
	@DisplayName("最小値(空白)確認")
	public void testMACFMCD4C0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_004.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("最大値確認")
	@DisplayName("最大値確認")
	public void testMACFMCD4C0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_data_upload_exclusive_control → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_data_upload_exclusive_control", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_005.txt");

		/* 操作(DB確認) → t_data_upload_exclusive_control → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("t_data_upload_exclusive_control", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("登録0件確認")
	@DisplayName("登録0件確認")
	public void testMACFMCD4C0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MACFMCD4C0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(api) → 検索 → internal/v1/data-upload/register → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350 → UserLoginInfo */
		rakurakuCore.operateApi("検索", "internal/v1/data-upload/register", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&x-Client-Program=temp&&Idempotency-Key=11111350", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MACFMCD4C0\\MACFMCD4C0_001.txt");

	}

}
