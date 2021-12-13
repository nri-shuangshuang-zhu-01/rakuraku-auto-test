package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR00020機能確認")
@DisplayName("MASAR00020機能確認")
public class MASAR00020Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASAR00020");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASAR00020");
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
	public void testMASAR00020_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test02")
	@DisplayName("test02")
	public void testMASAR00020_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "2");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2019-09-09&createDateTo=2022-09-09&reportType=1&outputStatus=1&pageNumber=2&displayCount=2&searchKeyWord=1&createUserId=JPN&billToCode=1", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test03")
	@DisplayName("test03")
	public void testMASAR00020_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "3");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-01-01&createDateTo=2021-09-09&reportType=1&outputStatus=1&pageNumber=1&displayCount=1&searchKeyWord=1&createUserId=JPN&billToCode=1", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test04")
	@DisplayName("test04")
	public void testMASAR00020_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "4");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?subsidiaryCode=JPN&displayCount=1&outputType=1&createDateFrom=2021-09-09&createDateTo=2021-09-09&pageNumber=1&reportType=11&outputStatus=2", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test05")
	@DisplayName("test05")
	public void testMASAR00020_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "5");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?subsidiaryCode=JPN&displayCount=1&outputType=1&createDateFrom=2021-09-09&createDateTo=2021-09-09&pageNumber=1&createUserId=JP&reportType=11&outputStatus=2&searchKeyWord=4&billToCode=a", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test06")
	@DisplayName("test06")
	public void testMASAR00020_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "6");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?subsidiaryCode=CHN&displayCount=1&outputType=1&createDateFrom=2021-09-09&createDateTo=2021-09-09&pageNumber=1&createUserId=JP&reportType=11&outputStatus=2&searchKeyWord=4&billToCode=a", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test07")
	@DisplayName("test07")
	public void testMASAR00020_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "7");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test08")
	@DisplayName("test08")
	public void testMASAR00020_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "8");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test09")
	@DisplayName("test09")
	public void testMASAR00020_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "9");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test10")
	@DisplayName("test10")
	public void testMASAR00020_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "10");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test11")
	@DisplayName("test11")
	public void testMASAR00020_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "11");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test12")
	@DisplayName("test12")
	public void testMASAR00020_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "12");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test13")
	@DisplayName("test13")
	public void testMASAR00020_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "13");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=PN&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test14")
	@DisplayName("test14")
	public void testMASAR00020_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "14");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test15")
	@DisplayName("test15")
	public void testMASAR00020_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "15");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=2&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test16")
	@DisplayName("test16")
	public void testMASAR00020_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "16");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=3&displayCount=2&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test17")
	@DisplayName("test17")
	public void testMASAR00020_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "16");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=10&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test18")
	@DisplayName("test18")
	public void testMASAR00020_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=0&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test19")
	@DisplayName("test19")
	public void testMASAR00020_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "17");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=2&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test20")
	@DisplayName("test20")
	public void testMASAR00020_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "18");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=10&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test21")
	@DisplayName("test21")
	public void testMASAR00020_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "19");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=2&displayCount=3&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test22")
	@DisplayName("test22")
	public void testMASAR00020_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test23")
	@DisplayName("test23")
	public void testMASAR00020_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test24")
	@DisplayName("test24")
	public void testMASAR00020_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test25")
	@DisplayName("test25")
	public void testMASAR00020_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test26")
	@DisplayName("test26")
	public void testMASAR00020_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test27")
	@DisplayName("test27")
	public void testMASAR00020_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test28")
	@DisplayName("test28")
	public void testMASAR00020_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test29")
	@DisplayName("test29")
	public void testMASAR00020_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&displayCount=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test30")
	@DisplayName("test30")
	public void testMASAR00020_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test31")
	@DisplayName("test31")
	public void testMASAR00020_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "20");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=asdaaaaaaaaaaaaaaaaaaaaaaaaaaaww&createUserId=aaab&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test32")
	@DisplayName("test32")
	public void testMASAR00020_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "21");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=1&searchKeyWord=4&createUserId=JPN&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test33")
	@DisplayName("test33")
	public void testMASAR00020_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "1");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2021-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=1&displayCount=0&searchKeyWord=4&createUserId=JPN&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

	@Test
	@Tag("test34")
	@DisplayName("test34")
	public void testMASAR00020_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASAR00020/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_REPRINT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_REPRINT", "データクリア・挿入", "16");

		/* 操作(api) → 检索 → internal/v1/reprint/get? → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("检索", "internal/v1/reprint/get?outputType=1&subsidiaryCode=JPN&createDateFrom=2020-09-09&createDateTo=2021-09-09&reportType=11&outputStatus=2&pageNumber=4&displayCount=2&searchKeyWord=4&createUserId=JPN01&billToCode=aaa", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "-");

	}

}
