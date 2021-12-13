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
public class MALSCCD1R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCCD1R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCCD1R0");
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
	public void testMALSCCD1R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCD1R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → Presigned URL変換API → internal/v1/presigned-url/convert? → GET → X-client-program=test&&Idempotency-Key=25523 → Presigned URL */
		rakurakuCore.operateApi("Presigned URL変換API", "internal/v1/presigned-url/convert?filePath=test/1.txt", "GET", "X-client-program=test&&Idempotency-Key=25523", "Presigned URL", "-");

	}

	@Test
	public void testMALSCCD1R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCCD1R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(api) → Presigned URL変換API → internal/v1/presigned-url/convert? → GET → X-client-program=test&&Idempotency-Key=25523 → Presigned URL */
		rakurakuCore.operateApi("Presigned URL変換API", "internal/v1/presigned-url/convert?filePath=", "GET", "X-client-program=test&&Idempotency-Key=25523", "Presigned URL", "-");

	}

}
