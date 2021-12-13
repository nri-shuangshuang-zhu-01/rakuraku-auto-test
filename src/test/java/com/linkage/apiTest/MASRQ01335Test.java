package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ01335機能確認")
@DisplayName("MASRQ01335機能確認")
public class MASRQ01335Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ01335");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ01335");
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
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMASRQ01335_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ01335/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → 調整問合せ書(注文)生成依頼結果取得 → internal/v1/so-inquiry-form/generate/request/result → GET → User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string&&Idempotency-Key=a001 */
		rakurakuCore.operateApi("調整問合せ書(注文)生成依頼結果取得", "internal/v1/so-inquiry-form/generate/request/result?idempotencyKey=a001", "GET", "User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Application-Id=string&&X-Client-Program=string&&Idempotency-Key=a001", "", "-");

	}

}
