package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASAR10020機能確認")
@DisplayName("MASAR10020機能確認")
public class MASAR10010lot3Test {

  @BeforeAll
  public static void initialize() throws Exception {
    RakurakuCore.initialize("dbunit", "MASAR10010lot3");
  }

  @BeforeEach
  public void setUp() throws Exception {
    RakurakuCore.setUp("dbunit", "MASAR10010lot3");
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
  public void testMASAR10010lot3_001() throws Exception {

    RakurakuCore rakurakuCore =
        new RakurakuCore("/MASAR10010lot3/case_001/case_001_", "");// ケース番号の設定

    // ここから自動化打鍵開始
    /* 操作(DB準備) → t_non_payment_management → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_non_payment_management", "データクリア・挿入", "1");

    /* 未入金管理テーブル → m_bill_to → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("m_bill_to", "データクリア・挿入", "1");

    /* 未入金管理テーブル → t_incoming_payment → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment", "データクリア・挿入", "1");

    /* 未入金管理テーブル → t_incoming_payment_unmatch → データクリア・挿入 */
    rakurakuCore.operateDBPrepare("t_incoming_payment_unmatch", "データクリア・挿入", "1");

    /* 操作(api) → 登录 → internal/v1/customer-statement/search → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test → UserLoginInfo */
    rakurakuCore.operateApi("登录", "internal/v1/customer-statement/search", "POST",
        "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&Prefer=example=3&&X-client-program=test",
        "UserLoginInfo",
        "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MASAR10010\\MASAR10010_033.txt");

  }

}
