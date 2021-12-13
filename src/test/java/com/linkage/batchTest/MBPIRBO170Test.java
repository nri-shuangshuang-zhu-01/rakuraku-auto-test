package com.linkage.batchTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MBPIRBO170機能確認")
@DisplayName("MBPIRBO170機能確認")
public class MBPIRBO170Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MBPIRBO170");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MBPIRBO170");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****5+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****6+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;2-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****7+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;2-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****8+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;2-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****9+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;3-----/internal/v1/product/get-list;;商品情報取得API（List）;;3-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;3-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****10+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;99-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****11+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;99-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****12+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;99-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****13+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;99*****15+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;4-----/internal/v1/product/get-list;;商品情報取得API（List）;;4-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;4-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****16+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;4-----/internal/v1/product/get-list;;商品情報取得API（List）;;4-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;4-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****17+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;4-----/internal/v1/product/get-list;;商品情報取得API（List）;;5-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;4-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****18+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;3-----/internal/v1/product/get-list;;商品情報取得API（List）;;3-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;3-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****19+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;3-----/internal/v1/product/get-list;;商品情報取得API（List）;;3-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;3-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****20+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;3-----/internal/v1/product/get-list;;商品情報取得API（List）;;3-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;3-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****21+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;5-----/internal/v1/product/get-list;;商品情報取得API（List）;;6-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****22+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;5-----/internal/v1/product/get-list;;商品情報取得API（List）;;6-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****23+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****24+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;7-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****25+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****26+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****31+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;2-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****32+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;2-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****33+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;2-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****34+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****35+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;1-----/internal/v1/product/get-list;;商品情報取得API（List）;;1-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;1-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;1*****36+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;99*****37+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****38+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****39+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****40+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;99-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****41+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;37-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****42+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;38-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****43+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;99-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****44+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;37-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****45+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;38-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****46+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;99-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****47+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;37-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****48+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;38-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****49+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;99*****50+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;36-----/internal/v1/product/get-list;;商品情報取得API（List）;;36-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;36-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;36*****51+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;-----/internal/v1/stock-info/check;;在庫情報参照API;;39-----/internal/v1/product/get-list;;商品情報取得API（List）;;39-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;39-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;-----/internal/v1/stock-info/update;;在庫情報更新API;;39*****52+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;52-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****54+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;999-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****55+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;55-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****56+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;56-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****57+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;52-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****58+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;52-----/internal/v1/stock-info/check;;在庫情報参照API;;52-----/internal/v1/product/get-list;;商品情報取得API（List）;;52-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;52-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;52-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;52-----/internal/v1/stock-info/update;;在庫情報更新API;;52*****59+++++/internal/v1/stock-setting/search;;在庫設定情報検索API;;59-----/internal/v1/stock-info/check;;在庫情報参照API;;59-----/internal/v1/product/get-list;;商品情報取得API（List）;;59-----/internal/v1/product-supplier/search;;商品別仕入先情報検索API;;59-----/internal/v1/io-supply-means-control/get-list;;IO調達方法管理情報取得API（List）;;59-----/internal/v1/supplier-delivery-days/get-list;;仕入先配送日数情報取得API（List）;;59-----/internal/v1/stock-info/update;;在庫情報更新API;;52");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMBPIRBO170_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMBPIRBO170_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMBPIRBO170_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMBPIRBO170_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMBPIRBO170_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20120101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMBPIRBO170_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMBPIRBO170_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMBPIRBO170_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMBPIRBO170_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMBPIRBO170_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "99");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMBPIRBO170_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "99");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMBPIRBO170_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "99");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMBPIRBO170_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "99");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMBPIRBO170_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=,--subsidiary-code=,--job-net-id=,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMBPIRBO170_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "4");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMBPIRBO170_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "4");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMBPIRBO170_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "4");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "5");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "4");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test018")
	@DisplayName("test018")
	public void testMBPIRBO170_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "18");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test019")
	@DisplayName("test019")
	public void testMBPIRBO170_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "19");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "18");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test020")
	@DisplayName("test020")
	public void testMBPIRBO170_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "18");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "20");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "18");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "3");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "3");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test021")
	@DisplayName("test021")
	public void testMBPIRBO170_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "5");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "6");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test022")
	@DisplayName("test022")
	public void testMBPIRBO170_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "5");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "6");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20210324,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test023")
	@DisplayName("test023")
	public void testMBPIRBO170_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test024")
	@DisplayName("test024")
	public void testMBPIRBO170_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "7");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test025")
	@DisplayName("test025")
	public void testMBPIRBO170_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "25");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test026")
	@DisplayName("test026")
	public void testMBPIRBO170_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "26");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test027")
	@DisplayName("test027")
	public void testMBPIRBO170_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test028")
	@DisplayName("test028")
	public void testMBPIRBO170_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test029")
	@DisplayName("test029")
	public void testMBPIRBO170_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220101,--subsidiary-code=JPN,--job-net-id=,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test030")
	@DisplayName("test030")
	public void testMBPIRBO170_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=,--subsidiary-code=,--job-net-id=,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test031")
	@DisplayName("test031")
	public void testMBPIRBO170_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test032")
	@DisplayName("test032")
	public void testMBPIRBO170_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "2");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test033")
	@DisplayName("test033")
	public void testMBPIRBO170_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "2");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test034")
	@DisplayName("test034")
	public void testMBPIRBO170_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test035")
	@DisplayName("test035")
	public void testMBPIRBO170_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "35");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "1");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "23");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "1");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "1");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "1");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=JPN,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test036")
	@DisplayName("test036")
	public void testMBPIRBO170_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "99");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test037")
	@DisplayName("test037")
	public void testMBPIRBO170_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test038")
	@DisplayName("test038")
	public void testMBPIRBO170_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test039")
	@DisplayName("test039")
	public void testMBPIRBO170_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test040")
	@DisplayName("test040")
	public void testMBPIRBO170_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "99");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test041")
	@DisplayName("test041")
	public void testMBPIRBO170_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "37");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test042")
	@DisplayName("test042")
	public void testMBPIRBO170_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "38");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test043")
	@DisplayName("test043")
	public void testMBPIRBO170_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "99");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test044")
	@DisplayName("test044")
	public void testMBPIRBO170_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "37");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test045")
	@DisplayName("test045")
	public void testMBPIRBO170_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "38");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test046")
	@DisplayName("test046")
	public void testMBPIRBO170_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "99");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test047")
	@DisplayName("test047")
	public void testMBPIRBO170_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "37");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test048")
	@DisplayName("test048")
	public void testMBPIRBO170_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "38");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test049")
	@DisplayName("test049")
	public void testMBPIRBO170_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "99");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test050")
	@DisplayName("test050")
	public void testMBPIRBO170_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "50");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "36");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "36");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "36");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test051")
	@DisplayName("test051")
	public void testMBPIRBO170_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "50");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "36");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "36");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "39");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "39");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "39");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "39");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=MJP,--job-net-id=12345,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test052")
	@DisplayName("test052")
	public void testMBPIRBO170_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "52");

		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=2,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test053")
	@DisplayName("test053")
	public void testMBPIRBO170_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test054")
	@DisplayName("test054")
	public void testMBPIRBO170_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "999");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=2,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test055")
	@DisplayName("test055")
	public void testMBPIRBO170_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "55");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=2,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test056")
	@DisplayName("test056")
	public void testMBPIRBO170_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "56");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=2,--job-execution-id=<weeklyReorderPointCalculationJob>");

	}

	@Test
	@Tag("test057")
	@DisplayName("test057")
	public void testMBPIRBO170_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "52");

		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=7,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test058")
	@DisplayName("test058")
	public void testMBPIRBO170_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "52");

		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "52");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "52");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "52");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=14,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

	@Test
	@Tag("test059")
	@DisplayName("test059")
	public void testMBPIRBO170_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MBPIRBO170/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → T_SAFETY_COEFFICIENT → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_SAFETY_COEFFICIENT", "データクリア・挿入", "52");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "データクリア・挿入", "59");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "データクリア・挿入", "59");

		/* 操作(DB準備) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "データクリア・挿入", "52");

		/* 操作(apiMock) → /internal/v1/stock-setting/search → 在庫設定情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/stock-setting/search", "在庫設定情報検索API", "59");

		/* 操作(apiMock) → /internal/v1/stock-info/check → 在庫情報参照API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/check", "在庫情報参照API", "59");

		/* 操作(apiMock) → /internal/v1/product/get-list → 商品情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product/get-list", "商品情報取得API（List）", "59");

		/* 操作(apiMock) → /internal/v1/product-supplier/search → 商品別仕入先情報検索API */
		rakurakuCore.operateMockApi("/internal/v1/product-supplier/search", "商品別仕入先情報検索API", "59");

		/* 操作(apiMock) → /internal/v1/io-supply-means-control/get-list → IO調達方法管理情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/io-supply-means-control/get-list", "IO調達方法管理情報取得API（List）", "59");

		/* 操作(apiMock) → /internal/v1/supplier-delivery-days/get-list → 仕入先配送日数情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier-delivery-days/get-list", "仕入先配送日数情報取得API（List）", "59");

		/* 操作(apiMock) → /internal/v1/stock-info/update → 在庫情報更新API */
		rakurakuCore.operateMockApi("/internal/v1/stock-info/update", "在庫情報更新API", "52");

		/* 操作(バッチ) → 契約取得バッチ */
		rakurakuCore.operateBatch("契約取得バッチ","〇" , "weeklyReorderPointCalculationJob,--operation-date=20220601,--subsidiary-code=TIW,--job-id=12345,--pieces-threshold=4,--job-execution-id=<weeklyReorderPointCalculationJob>");

		/* 操作(DB確認) → T_SAFETY_COEFFICIENT → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_SAFETY_COEFFICIENT", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_DEMAND_FORECAST → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_DEMAND_FORECAST", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_WEEKLY", "NOT_ASSERT_COLUMN", "〇");

		/* 操作(DB確認) → T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY → NOT_ASSERT_COLUMN */
		rakurakuCore.operateDBConfirm("T_WEEKLY_REORDER_POINT_POOL_DATA_MONTHLY", "NOT_ASSERT_COLUMN", "〇");

	}

}
