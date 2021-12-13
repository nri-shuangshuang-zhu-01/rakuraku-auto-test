package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS3R0機能確認")
@DisplayName("MALSCSS3R0機能確認")
public class MALSCSS3R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS3R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS3R0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****2+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****3+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-3-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****4+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****5+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****6+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****7+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****8+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****9+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****10+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****11+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-4-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****12+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-5-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****13+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-6-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****14+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****15+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****16+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-4-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****17+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****18+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-3-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****19+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-4-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****20+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****21+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-3-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****22+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-4-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****23+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****24+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-3-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****25+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-4-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****26+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****27+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-3-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****28+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-4-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****29+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****30+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-3*****31+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-4*****32+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****33+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****34+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****35+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****36+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****37+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-7-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-5-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****38+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-4-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****39+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-5-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-2-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****40+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-2-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-2-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-2-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-2-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-5-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-2-----/internal/v1/code/search;;コードマスタ参照API;;example-2*****41+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-5-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****42+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-5*****43+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****44+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****45+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****46+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****47+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****48+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****49+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****50+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****51+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****52+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****53+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****54+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****55+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****56+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****57+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****58+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****59+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****60+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****61+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****62+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****63+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****64+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****65+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****66+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****67+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****68+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****69+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****70+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****71+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****72+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****73+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****74+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****75+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****76+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****77+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****78+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****79+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1*****80+++++/newtonApi/shipmentfailsearch;;出荷不可受注発注検索API;;example-1-----/internal/v1/product-classification/get-list;;製品分類情報取得API（List）;;example-1-----/internal/v1/supplier/get-list;;仕入先情報取得API（List）;;example-1-----/internal/v1/plant/get-list;;置場情報取得API（List）;;example-1-----/internal/v1/brand/get-list;;ブランド情報取得API（List）;;example-1-----/internal/v1/slip-type/get-list;;伝区マスタ参照API;;example-1-----/internal/v1/code/search;;コードマスタ参照API;;example-1");
	}

	@Test
	@Tag("test001")
	@DisplayName("test001")
	public void testMALSCSS3R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test002")
	@DisplayName("test002")
	public void testMALSCSS3R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R1.json");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMALSCSS3R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-3");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMALSCSS3R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMALSCSS3R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "5");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMALSCSS3R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "6");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMALSCSS3R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "7");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMALSCSS3R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "8");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMALSCSS3R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "9");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMALSCSS3R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMALSCSS3R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-4");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMALSCSS3R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-5");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMALSCSS3R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-6");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMALSCSS3R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMALSCSS3R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMALSCSS3R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMALSCSS3R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test018")
	@DisplayName("test018")
	public void testMALSCSS3R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test019")
	@DisplayName("test019")
	public void testMALSCSS3R0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test020")
	@DisplayName("test020")
	public void testMALSCSS3R0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test021")
	@DisplayName("test021")
	public void testMALSCSS3R0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test022")
	@DisplayName("test022")
	public void testMALSCSS3R0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test023")
	@DisplayName("test023")
	public void testMALSCSS3R0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test024")
	@DisplayName("test024")
	public void testMALSCSS3R0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-3");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test025")
	@DisplayName("test025")
	public void testMALSCSS3R0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-4");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test026")
	@DisplayName("test026")
	public void testMALSCSS3R0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test027")
	@DisplayName("test027")
	public void testMALSCSS3R0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test028")
	@DisplayName("test028")
	public void testMALSCSS3R0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test029")
	@DisplayName("test029")
	public void testMALSCSS3R0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test030")
	@DisplayName("test030")
	public void testMALSCSS3R0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-3");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test031")
	@DisplayName("test031")
	public void testMALSCSS3R0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-4");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test032")
	@DisplayName("test032")
	public void testMALSCSS3R0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "10");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test033")
	@DisplayName("test033")
	public void testMALSCSS3R0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "11");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test034")
	@DisplayName("test034")
	public void testMALSCSS3R0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "12");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test035")
	@DisplayName("test035")
	public void testMALSCSS3R0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "13");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test036")
	@DisplayName("test036")
	public void testMALSCSS3R0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "14");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test037")
	@DisplayName("test037")
	public void testMALSCSS3R0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "15");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-7");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R2.json");

	}

	@Test
	@Tag("test038")
	@DisplayName("test038")
	public void testMALSCSS3R0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R3.json");

	}

	@Test
	@Tag("test039")
	@DisplayName("test039")
	public void testMALSCSS3R0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R4.json");

	}

	@Test
	@Tag("test040")
	@DisplayName("test040")
	public void testMALSCSS3R0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "16");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-5");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-2");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=2", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R5.json");

	}

	@Test
	@Tag("test041")
	@DisplayName("test041")
	public void testMALSCSS3R0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R6.json");

	}

	@Test
	@Tag("test042")
	@DisplayName("test042")
	public void testMALSCSS3R0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-5");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R7.json");

	}

	@Test
	@Tag("test043")
	@DisplayName("test043")
	public void testMALSCSS3R0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R8.json");

	}

	@Test
	@Tag("test044")
	@DisplayName("test044")
	public void testMALSCSS3R0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R9.json");

	}

	@Test
	@Tag("test045")
	@DisplayName("test045")
	public void testMALSCSS3R0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R10.json");

	}

	@Test
	@Tag("test046")
	@DisplayName("test046")
	public void testMALSCSS3R0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R11.json");

	}

	@Test
	@Tag("test047")
	@DisplayName("test047")
	public void testMALSCSS3R0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R12.json");

	}

	@Test
	@Tag("test048")
	@DisplayName("test048")
	public void testMALSCSS3R0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R13.json");

	}

	@Test
	@Tag("test049")
	@DisplayName("test049")
	public void testMALSCSS3R0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R14.json");

	}

	@Test
	@Tag("test050")
	@DisplayName("test050")
	public void testMALSCSS3R0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R15.json");

	}

	@Test
	@Tag("test051")
	@DisplayName("test051")
	public void testMALSCSS3R0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R16.json");

	}

	@Test
	@Tag("test052")
	@DisplayName("test052")
	public void testMALSCSS3R0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R17.json");

	}

	@Test
	@Tag("test053")
	@DisplayName("test053")
	public void testMALSCSS3R0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R18.json");

	}

	@Test
	@Tag("test054")
	@DisplayName("test054")
	public void testMALSCSS3R0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R19.json");

	}

	@Test
	@Tag("test055")
	@DisplayName("test055")
	public void testMALSCSS3R0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R20.json");

	}

	@Test
	@Tag("test056")
	@DisplayName("test056")
	public void testMALSCSS3R0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R21.json");

	}

	@Test
	@Tag("test057")
	@DisplayName("test057")
	public void testMALSCSS3R0_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R22.json");

	}

	@Test
	@Tag("test058")
	@DisplayName("test058")
	public void testMALSCSS3R0_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R23.json");

	}

	@Test
	@Tag("test059")
	@DisplayName("test059")
	public void testMALSCSS3R0_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R24.json");

	}

	@Test
	@Tag("test060")
	@DisplayName("test060")
	public void testMALSCSS3R0_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R25.json");

	}

	@Test
	@Tag("test061")
	@DisplayName("test061")
	public void testMALSCSS3R0_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R26.json");

	}

	@Test
	@Tag("test062")
	@DisplayName("test062")
	public void testMALSCSS3R0_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R27.json");

	}

	@Test
	@Tag("test063")
	@DisplayName("test063")
	public void testMALSCSS3R0_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R28.json");

	}

	@Test
	@Tag("test064")
	@DisplayName("test064")
	public void testMALSCSS3R0_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R29.json");

	}

	@Test
	@Tag("test065")
	@DisplayName("test065")
	public void testMALSCSS3R0_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R30.json");

	}

	@Test
	@Tag("test066")
	@DisplayName("test066")
	public void testMALSCSS3R0_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R31.json");

	}

	@Test
	@Tag("test067")
	@DisplayName("test067")
	public void testMALSCSS3R0_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R32.json");

	}

	@Test
	@Tag("test068")
	@DisplayName("test068")
	public void testMALSCSS3R0_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test069")
	@DisplayName("test069")
	public void testMALSCSS3R0_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test070")
	@DisplayName("test070")
	public void testMALSCSS3R0_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R0.json");

	}

	@Test
	@Tag("test071")
	@DisplayName("test071")
	public void testMALSCSS3R0_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R33.json");

	}

	@Test
	@Tag("test072")
	@DisplayName("test072")
	public void testMALSCSS3R0_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R34.json");

	}

	@Test
	@Tag("test073")
	@DisplayName("test073")
	public void testMALSCSS3R0_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R35.json");

	}

	@Test
	@Tag("test074")
	@DisplayName("test074")
	public void testMALSCSS3R0_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R36.json");

	}

	@Test
	@Tag("test075")
	@DisplayName("test075")
	public void testMALSCSS3R0_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R37.json");

	}

	@Test
	@Tag("test076")
	@DisplayName("test076")
	public void testMALSCSS3R0_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R38.json");

	}

	@Test
	@Tag("test077")
	@DisplayName("test077")
	public void testMALSCSS3R0_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R39.json");

	}

	@Test
	@Tag("test078")
	@DisplayName("test078")
	public void testMALSCSS3R0_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R40.json");

	}

	@Test
	@Tag("test079")
	@DisplayName("test079")
	public void testMALSCSS3R0_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R41.json");

	}

	@Test
	@Tag("test080")
	@DisplayName("test080")
	public void testMALSCSS3R0_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3R0/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailsearch → 出荷不可受注発注検索API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailsearch", "出荷不可受注発注検索API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランド情報取得API（List） */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランド情報取得API（List）", "example-1");

		/* 操作(apiMock) → /internal/v1/slip-type/get-list → 伝区マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/slip-type/get-list", "伝区マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/code/search → コードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/code/search", "コードマスタ参照API", "example-1");

		/* 操作(api) → 参照 → internal/v1/stop-shipment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("参照", "internal/v1/stop-shipment/reference?offset=1&limit=1&sortby2=1&sortby=1", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3R0\\MALSCSS3R42.json");

	}

}
