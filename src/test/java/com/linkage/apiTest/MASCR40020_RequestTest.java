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
public class MASCR40020_RequestTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASCR40020_Request");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASCR40020_Request");
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
	@Tag("Request現法コードNULL")
	@DisplayName("Request現法コードNULL")
	public void testMASCR40020_Request_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("Request　ソート項目　NULL")
	@DisplayName("Request　ソート項目　NULL")
	public void testMASCR40020_Request_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortBy=1&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("Request　ソート番号　NULL")
	@DisplayName("Request　ソート番号　NULL")
	public void testMASCR40020_Request_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&pageNumber=2&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("Request　ページ番号　NULL")
	@DisplayName("Request　ページ番号　NULL")
	public void testMASCR40020_Request_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&displayCount=10&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("Request　表示件数　NULL")
	@DisplayName("Request　表示件数　NULL")
	public void testMASCR40020_Request_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&responseType=0&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

	@Test
	@Tag("Request　レスボス種別　NULL")
	@DisplayName("Request　レスボス種別　NULL")
	public void testMASCR40020_Request_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASCR40020_Request/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 登录 → internal/v1/credit-over-limit/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/credit-over-limit/search?subsidiaryCode=TIW&sortByColumn=billToCode&sortBy=1&pageNumber=2&displayCount=10&code1=売掛先コード&code2From=860582&code3To=860584&code4=558814&cellCode=AAAB&creditLimitUsageRateFrom=1&creditLimitUsageRateTo=999&creditLimitAmountFrom=1&creditLimitAmountTo=999&creditLimitOverrunsFrom=1&creditLimitOverrunsTo=999&bu=BU&creditCheckFlg=1&settlementMethod=1&accountsReceivableName=SHIM BO SEON&creditLimitOverProcessType=1&creditTotalFrom=1&creditTotalTo=1000", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-client-program=test&&Idempotency-Key=1137", "UserLoginInfo", "-");

	}

}
