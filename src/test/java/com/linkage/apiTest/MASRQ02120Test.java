package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MASRQ02120機能確認")
@DisplayName("MASRQ02120機能確認")
public class MASRQ02120Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MASRQ02120");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MASRQ02120");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****2+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****3+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****4+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****5+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****6+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****7+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****8+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****9+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****10+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****11+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****12+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****13+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****14+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****15+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****16+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****17+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****18+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****19+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****20+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****21+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****22+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****23+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****24+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****25+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****26+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****27+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****28+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****29+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****30+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****31+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****32+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****33+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****34+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****35+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****36+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****37+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****38+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****39+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****40+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****41+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-2-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****42+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-2-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****43+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-2-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****44+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-2-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****45+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-2-----/internal/v1/plant/get;;置場情報取得API;;example-1*****46+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-2*****47+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****48+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****49+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****50+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****51+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-3-----/internal/v1/customer/get;;得意先情報取得API;;example-3-----/internal/v1/ship-to/get;;配送先情報取得API;;example-3-----/internal/v1/brand/get;;ブランド情報取得API;;example-3-----/internal/v1/plant/get;;置場情報取得API;;example-1*****52+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-4-----/internal/v1/customer/get;;得意先情報取得API;;example-4-----/internal/v1/ship-to/get;;配送先情報取得API;;example-4-----/internal/v1/brand/get;;ブランド情報取得API;;example-4-----/internal/v1/plant/get;;置場情報取得API;;example-1*****53+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-5-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****54+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****55+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****56+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-5-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****57+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1*****58+++++/supplier/v1/supplier-user/search;;サプライヤユーザ情報検索API;;example-1-----/internal/v1/supplier/get;;仕入先情報取得API;;example-1-----/internal/v1/customer/get;;得意先情報取得API;;example-1-----/internal/v1/ship-to/get;;配送先情報取得API;;example-1-----/internal/v1/brand/get;;ブランド情報取得API;;example-1-----/internal/v1/plant/get;;置場情報取得API;;example-1");
	}

	@Test
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMASRQ02120_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0002")
	@DisplayName("test0002")
	public void testMASRQ02120_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0003")
	@DisplayName("test0003")
	public void testMASRQ02120_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0004")
	@DisplayName("test0004")
	public void testMASRQ02120_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0005")
	@DisplayName("test0005")
	public void testMASRQ02120_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0006")
	@DisplayName("test0006")
	public void testMASRQ02120_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0007")
	@DisplayName("test0007")
	public void testMASRQ02120_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0008")
	@DisplayName("test0008")
	public void testMASRQ02120_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0009")
	@DisplayName("test0009")
	public void testMASRQ02120_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0010")
	@DisplayName("test0010")
	public void testMASRQ02120_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0011")
	@DisplayName("test0011")
	public void testMASRQ02120_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0012")
	@DisplayName("test0012")
	public void testMASRQ02120_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0013")
	@DisplayName("test0013")
	public void testMASRQ02120_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0014")
	@DisplayName("test0014")
	public void testMASRQ02120_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "11");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0015")
	@DisplayName("test0015")
	public void testMASRQ02120_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "12");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0016")
	@DisplayName("test0016")
	public void testMASRQ02120_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0017")
	@DisplayName("test0017")
	public void testMASRQ02120_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0018")
	@DisplayName("test0018")
	public void testMASRQ02120_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0019")
	@DisplayName("test0019")
	public void testMASRQ02120_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0020")
	@DisplayName("test0020")
	public void testMASRQ02120_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "13");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0021")
	@DisplayName("test0021")
	public void testMASRQ02120_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0022")
	@DisplayName("test0022")
	public void testMASRQ02120_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "15");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0023")
	@DisplayName("test0023")
	public void testMASRQ02120_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0024")
	@DisplayName("test0024")
	public void testMASRQ02120_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0025")
	@DisplayName("test0025")
	public void testMASRQ02120_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0026")
	@DisplayName("test0026")
	public void testMASRQ02120_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0027")
	@DisplayName("test0027")
	public void testMASRQ02120_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0028")
	@DisplayName("test0028")
	public void testMASRQ02120_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0029")
	@DisplayName("test0029")
	public void testMASRQ02120_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0030")
	@DisplayName("test0030")
	public void testMASRQ02120_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0031")
	@DisplayName("test0031")
	public void testMASRQ02120_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0032")
	@DisplayName("test0032")
	public void testMASRQ02120_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0033")
	@DisplayName("test0033")
	public void testMASRQ02120_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0034")
	@DisplayName("test0034")
	public void testMASRQ02120_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0035")
	@DisplayName("test0035")
	public void testMASRQ02120_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0036")
	@DisplayName("test0036")
	public void testMASRQ02120_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0037")
	@DisplayName("test0037")
	public void testMASRQ02120_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "2");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0038")
	@DisplayName("test0038")
	public void testMASRQ02120_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "3");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0039")
	@DisplayName("test0039")
	public void testMASRQ02120_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0supplierCode=A001", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0040")
	@DisplayName("test0040")
	public void testMASRQ02120_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=&leadTimeProductInquiryReceiveNumber=&customerCode=awer54&leadTimeProductInquiryStatus=&leadTimeProductInquiryStage=&leadTimeProductInquiryType=&productCode=&marketCode=&supplierCode=A001&requestVsdFrom=&requestVsdTo=&supplierRequestDateTimeFrom=&supplierRequestDateTimeTo=&shipToCode=tyrt65&brandCode=&globalNumber=asd68885123456&customerType=", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0041")
	@DisplayName("test0041")
	public void testMASRQ02120_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0042")
	@DisplayName("test0042")
	public void testMASRQ02120_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0043")
	@DisplayName("test0043")
	public void testMASRQ02120_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0044")
	@DisplayName("test0044")
	public void testMASRQ02120_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0045")
	@DisplayName("test0045")
	public void testMASRQ02120_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0046")
	@DisplayName("test0046")
	public void testMASRQ02120_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-2");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0047")
	@DisplayName("test0047")
	public void testMASRQ02120_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "16");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "11");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "4");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "2");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01&limit=3&offset=2&leadTimeProductInquiryId=102&leadTimeProductInquiryId=103&leadTimeProductInquiryId=104&leadTimeProductInquiryId=105&leadTimeProductInquiryId=106", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0048")
	@DisplayName("test0048")
	public void testMASRQ02120_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "17");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "12");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01&limit=3&offset=2&leadTimeProductInquiryId=102&leadTimeProductInquiryId=103&leadTimeProductInquiryId=104&leadTimeProductInquiryId=105", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0049")
	@DisplayName("test0049")
	public void testMASRQ02120_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "18");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "13");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01&limit=3&offset=2&leadTimeProductInquiryId=102&leadTimeProductInquiryId=103&leadTimeProductInquiryId=104", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0050")
	@DisplayName("test0050")
	public void testMASRQ02120_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "19");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "14");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "5");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "3");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=rtestasfd987rtestasfd987rtestasfd987rtestasfd987rtestartestatestartestatestart&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0051")
	@DisplayName("test0051")
	public void testMASRQ02120_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "20");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "15");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "6");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "4");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?supplierCode=A001", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0052")
	@DisplayName("test0052")
	public void testMASRQ02120_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "21");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "16");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "7");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "5");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-4");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?updateCount=''&leadTimeProductInquiryReceiveNumber=''&productCode=''&marketCode=''&supplierCode='A001''&brandCode=''&customerType=''", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0053")
	@DisplayName("test0053")
	public void testMASRQ02120_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "17");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-5");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0054")
	@DisplayName("test0054")
	public void testMASRQ02120_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "18");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0055")
	@DisplayName("test0055")
	public void testMASRQ02120_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0056")
	@DisplayName("test0056")
	public void testMASRQ02120_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "8");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-5");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0057")
	@DisplayName("test0057")
	public void testMASRQ02120_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "9");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

	@Test
	@Tag("test0058")
	@DisplayName("test0058")
	public void testMASRQ02120_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MASRQ02120/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → t_lead_time_product_inquiry → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_lead_time_product_inquiry", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_inquiry_reply → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_inquiry_reply", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_quote_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_quote_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_approve → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_approve", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_check_message → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_check_message", "データクリア・挿入", "10");

		/* 操作(DB準備) → t_bulk_partial_delivery → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_bulk_partial_delivery", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_detail → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_detail", "データクリア・挿入", "1");

		/* 操作(DB準備) → t_so_header → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("t_so_header", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_lt_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_lt_screen_field_display", "データクリア・挿入", "1");

		/* 操作(apiMock) → /supplier/v1/supplier-user/search → サプライヤユーザ情報検索API */
		rakurakuCore.operateMockApi("/supplier/v1/supplier-user/search", "サプライヤユーザ情報検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get → 仕入先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get", "仕入先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/ship-to/get → 配送先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/ship-to/get", "配送先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get → ブランド情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get", "ブランド情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get → 置場情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get", "置場情報取得API", "example-1");

		/* 操作(api) → 納期確認検索(サプライヤ) → supplier/v1/lead-time-product-inquiry/search → GET → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier */
		rakurakuCore.operateApi("納期確認検索(サプライヤ)", "supplier/v1/lead-time-product-inquiry/search?leadTimeProductInquiryId=101&updateCount=0&soType=1&leadTimeProductInquiryReceiveNumber=acd654&customerCode=awer54&leadTimeProductInquiryStatus=1&leadTimeProductInquiryStage=01&leadTimeProductInquiryType=1&productCode=ijioohj56465&marketCode=01&supplierCode=A001&requestVsdFrom=2021-10-16&requestVsdTo=2021-12-16&supplierRequestDateTimeFrom=2000-09-06T01:30:00.000-05:00&supplierRequestDateTimeTo=2022-12-06T01:30:00.000-05:00&shipToCode=tyrt65&brandCode=2211&globalNumber=asd68885123456&customerType=01", "GET", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=string&&Idempotency-Key=string&&X-Application-Id=string&&X-User-Type=Supplier", "", "-");

	}

}
