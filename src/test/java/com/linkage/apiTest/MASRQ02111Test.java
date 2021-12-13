package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ02111機能確認")
@DisplayName("MASRQ02111機能確認")
public class MASRQ02111Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ02111");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ02111");
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
	@Tag("test001")
	@DisplayName("test001")
	public void testMASRQ02111_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02111/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → データ削除・挿入 */
		rakurakuCore.operateDBPrepare("idempotent_requests", "データ削除・挿入", "1");

		/* 操作(api) → 参照 → supplier/v1/supplier-lead-time-inquiry-form/generate/request/result? → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&X-Application-Id=string&&Authorization=2222222222&&Idempotency-Key=a001 */
		rakurakuCore.operateApi("参照", "supplier/v1/supplier-lead-time-inquiry-form/generate/request/result?idempotencyKey=a001", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&X-Application-Id=string&&Authorization=2222222222&&Idempotency-Key=a001", "", "-");

	}

}
