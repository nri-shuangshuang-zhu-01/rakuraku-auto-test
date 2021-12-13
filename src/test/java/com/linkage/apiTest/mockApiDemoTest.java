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
public class mockApiDemoTest {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","mockApiDemo");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","mockApiDemo");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/v1/area/search;;エリアマスタ参照API;;2-----/v1/plant/search;;置場マスタ参照API;;3*****2+++++/v1/area/search;;エリアマスタ参照API;;3-----/v1/plant/search;;置場マスタ参照API;;2");
	}

	@Test
	@Tag("一件確認")
	@DisplayName("一件確認")
	public void testmockApiDemo_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockApiDemo/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始


		/* 操作(apiMock) → /v1/area/search → エリアマスタ参照API */
		rakurakuCore.operateMockApi("/v1/area/search", "エリアマスタ参照API", "2");

		/* 操作(apiMock) → /v1/plant/search → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場マスタ参照API", "3");

		/* 操作(api) → 登录 → v1/shipmentDataInquery/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive → UserLoginInfo */
		rakurakuCore.operateApi("登录", "v1/shipmentDataInquery/search?subsidiaryCode=MJP&shipmentDate=2020-01-02&shipmentCenter=AABB", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive", "UserLoginInfo", "-");

		/* 操作(api確認) → v1/shipmentDataInquery/search?subsidiaryCode=MJP&shipmentDate=2020-01-02&shipmentCenter=AABB → NOT_ASSERT_COLUMN,stock1stSubtotal,recRecQtySubtotal */
		rakurakuCore.operateApiConfirm("v1/shipmentDataInquery/search?subsidiaryCode=MJP&shipmentDate=2020-01-02&shipmentCenter=AABB", "NOT_ASSERT_COLUMN,stock1stSubtotal,recRecQtySubtotal", "D:\\pleiades\\workspace\\rakuraku-auto-test\\testdata\\test.json");


	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testmockApiDemo_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/mockApiDemo/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → TEST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("TEST", "データクリア・挿入", "2");

		/* 操作(apiMock) → /v1/area/search → エリアマスタ参照API */
		rakurakuCore.operateMockApi("/v1/area/search", "エリアマスタ参照API", "3");

		/* 操作(apiMock) → /v1/plant/search → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/v1/plant/search", "置場マスタ参照API", "2");

		/* 操作(api) → 登录 → v1/shipmentDataInquery/search? → GET → User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive → UserLoginInfo */
		rakurakuCore.operateApi("登录", "v1/shipmentDataInquery/search?", "GET", "User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive", "UserLoginInfo", "-");

		/* 操作(api確認) → v1/shipmentDataInquery/search? → NOT_ASSERT_COLUMN,stock1stSubtotal,recRecQtySubtotal */
		rakurakuCore.operateApiConfirm("v1/shipmentDataInquery/search?", "NOT_ASSERT_COLUMN,stock1stSubtotal,recRecQtySubtotal", "D:\\pleiades\\workspace\\rakuraku-auto-test\\testdata\\test.json");

		/* 操作(DB確認) → TEST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("TEST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","" , "〇");

	}

}
