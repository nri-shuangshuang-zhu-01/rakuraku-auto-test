package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCVA1R0機能確認")
@DisplayName("MALSCVA1R0機能確認")
public class MALSCVA1R0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCVA1R0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCVA1R0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****2+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****3+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****4+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****5+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****6+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****7+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;5-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;5-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****8+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****9+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;3-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****10+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;3-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****11+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****12+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;3-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****13+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;3-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****14+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;3-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****15+++++/internal/v1/subsidiary/get;;現法マスタ参照API;; -----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;3*****16+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;2-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****17+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;4-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****18+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****19+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****20+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;4-----/internal/v1/product/search;;商品マスタ参照API;;5-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;4-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;4-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;4-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;4*****21+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;4-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****22+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;5-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****23+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****24+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;4-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****25+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;3-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;4-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****26+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;4-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****27+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;1-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;4*****28+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****29+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****30+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****31+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;11-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;5-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;5-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****32+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****33+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****34+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****35+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****36+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****37+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****38+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****39+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****40+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****41+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****42+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****43+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****44+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****45+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****46+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****47+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****48+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****49+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****50+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****51+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****52+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****53+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****54+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****55+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****56+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****57+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****58+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****59+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****60+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****61+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****62+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****63+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****64+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****65+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;12-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****66+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;1-----/internal/v1/product/search;;商品マスタ参照API;;13-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;1-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;1*****67+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****68+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;11-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;5-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;5-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****69+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****70+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****71+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****72+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****73+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****74+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****75+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****76+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;record0-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****77+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;record0-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****78+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;record0-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****79+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;record0-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****80+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;record0-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****81+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;record0-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****82+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;record0*****83+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****84+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;6-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****85+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;7-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****86+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;0-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****87+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;11-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****88+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;11-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****89+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;11-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****90+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;11*****91+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;11-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****92+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;3*****93+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;3-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****94+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****95+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2*****96+++++/internal/v1/subsidiary/get;;現法マスタ参照API;;4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;2-----/internal/v1/product/search;;商品マスタ参照API;;1-----/internal/v1/product-control-department/get-list;;商品所管部門マスタ;;2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;2-----/internal/v1/ginner-info/get-list;;インナーコード変換API;;2-----/internal/v1/type-code/get-list;;タイプコードマスタ参照API;;2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;2");
	}

	@Test
	@Tag("test01")
	@DisplayName("test01")
	public void testMALSCVA1R0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test02")
	@DisplayName("test02")
	public void testMALSCVA1R0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test03")
	@DisplayName("test03")
	public void testMALSCVA1R0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test04")
	@DisplayName("test04")
	public void testMALSCVA1R0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test05")
	@DisplayName("test05")
	public void testMALSCVA1R0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test06")
	@DisplayName("test06")
	public void testMALSCVA1R0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_004.txt");

	}

	@Test
	@Tag("test07")
	@DisplayName("test07")
	public void testMALSCVA1R0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "5");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "5");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_006.txt");

	}

	@Test
	@Tag("test08")
	@DisplayName("test08")
	public void testMALSCVA1R0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test09")
	@DisplayName("test09")
	public void testMALSCVA1R0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test10")
	@DisplayName("test10")
	public void testMALSCVA1R0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test11")
	@DisplayName("test11")
	public void testMALSCVA1R0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test12")
	@DisplayName("test12")
	public void testMALSCVA1R0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test13")
	@DisplayName("test13")
	public void testMALSCVA1R0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "3");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test14")
	@DisplayName("test14")
	public void testMALSCVA1R0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test15")
	@DisplayName("test15")
	public void testMALSCVA1R0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", " ");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "3");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test16")
	@DisplayName("test16")
	public void testMALSCVA1R0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test17")
	@DisplayName("test17")
	public void testMALSCVA1R0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test18")
	@DisplayName("test18")
	public void testMALSCVA1R0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test19")
	@DisplayName("test19")
	public void testMALSCVA1R0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test20")
	@DisplayName("test20")
	public void testMALSCVA1R0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "5");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "4");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "4");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test21")
	@DisplayName("test21")
	public void testMALSCVA1R0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test22")
	@DisplayName("test22")
	public void testMALSCVA1R0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "5");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test23")
	@DisplayName("test23")
	public void testMALSCVA1R0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test24")
	@DisplayName("test24")
	public void testMALSCVA1R0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test25")
	@DisplayName("test25")
	public void testMALSCVA1R0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "4");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test26")
	@DisplayName("test26")
	public void testMALSCVA1R0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test27")
	@DisplayName("test27")
	public void testMALSCVA1R0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "4");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test28")
	@DisplayName("test28")
	public void testMALSCVA1R0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_002.txt");

	}

	@Test
	@Tag("test29")
	@DisplayName("test29")
	public void testMALSCVA1R0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_007.txt");

	}

	@Test
	@Tag("test30")
	@DisplayName("test30")
	public void testMALSCVA1R0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_008.txt");

	}

	@Test
	@Tag("test31")
	@DisplayName("test31")
	public void testMALSCVA1R0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "11");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "5");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "5");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test32")
	@DisplayName("test32")
	public void testMALSCVA1R0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_errproductCode.txt");

	}

	@Test
	@Tag("test33")
	@DisplayName("test33")
	public void testMALSCVA1R0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_errginnerCode.txt");

	}

	@Test
	@Tag("test34")
	@DisplayName("test34")
	public void testMALSCVA1R0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_plantCode.txt");

	}

	@Test
	@Tag("test35")
	@DisplayName("test35")
	public void testMALSCVA1R0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_reasonType.txt");

	}

	@Test
	@Tag("test36")
	@DisplayName("test36")
	public void testMALSCVA1R0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_reasonType2.txt");

	}

	@Test
	@Tag("test37")
	@DisplayName("test37")
	public void testMALSCVA1R0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_responsibilityDepartmentCode.txt");

	}

	@Test
	@Tag("test38")
	@DisplayName("test38")
	public void testMALSCVA1R0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_responsibilityDepartmentCode2.txt");

	}

	@Test
	@Tag("test39")
	@DisplayName("test39")
	public void testMALSCVA1R0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_processMode.txt");

	}

	@Test
	@Tag("test40")
	@DisplayName("test40")
	public void testMALSCVA1R0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_processMode2.txt");

	}

	@Test
	@Tag("test41")
	@DisplayName("test41")
	public void testMALSCVA1R0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_ginnerCode.txt");

	}

	@Test
	@Tag("test42")
	@DisplayName("test42")
	public void testMALSCVA1R0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_ginnerCode2.txt");

	}

	@Test
	@Tag("test43")
	@DisplayName("test43")
	public void testMALSCVA1R0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_brandCode.txt");

	}

	@Test
	@Tag("test44")
	@DisplayName("test44")
	public void testMALSCVA1R0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_brandCode2.txt");

	}

	@Test
	@Tag("test45")
	@DisplayName("test45")
	public void testMALSCVA1R0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_currentStockQty.txt");

	}

	@Test
	@Tag("test46")
	@DisplayName("test46")
	public void testMALSCVA1R0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_currentStockQty2.txt");

	}

	@Test
	@Tag("test47")
	@DisplayName("test47")
	public void testMALSCVA1R0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_stockDifferenceQty.txt");

	}

	@Test
	@Tag("test48")
	@DisplayName("test48")
	public void testMALSCVA1R0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_stockDifferenceQty2.txt");

	}

	@Test
	@Tag("test49")
	@DisplayName("test49")
	public void testMALSCVA1R0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_nullbusinessSceneType.txt");

	}

	@Test
	@Tag("test50")
	@DisplayName("test50")
	public void testMALSCVA1R0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_nullplantCode.txt");

	}

	@Test
	@Tag("test51")
	@DisplayName("test51")
	public void testMALSCVA1R0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_nullreasonType.txt");

	}

	@Test
	@Tag("test52")
	@DisplayName("test52")
	public void testMALSCVA1R0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_nullresponsibilityDepartmentCode.txt");

	}

	@Test
	@Tag("test53")
	@DisplayName("test53")
	public void testMALSCVA1R0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_productCode.txt");

	}

	@Test
	@Tag("test54")
	@DisplayName("test54")
	public void testMALSCVA1R0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_nullbrandCode.txt");

	}

	@Test
	@Tag("test55")
	@DisplayName("test55")
	public void testMALSCVA1R0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_businessSceneType3.txt");

	}

	@Test
	@Tag("test56")
	@DisplayName("test56")
	public void testMALSCVA1R0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_plantCode5.txt");

	}

	@Test
	@Tag("test57")
	@DisplayName("test57")
	public void testMALSCVA1R0_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_reasonType6.txt");

	}

	@Test
	@Tag("test58")
	@DisplayName("test58")
	public void testMALSCVA1R0_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_responsibilityDepartmentCode5.txt");

	}

	@Test
	@Tag("test59")
	@DisplayName("test59")
	public void testMALSCVA1R0_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_processMode3.txt");

	}

	@Test
	@Tag("test60")
	@DisplayName("test60")
	public void testMALSCVA1R0_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_ginnerCode15.txt");

	}

	@Test
	@Tag("test61")
	@DisplayName("test61")
	public void testMALSCVA1R0_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_productCode79.txt");

	}

	@Test
	@Tag("test62")
	@DisplayName("test62")
	public void testMALSCVA1R0_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_brandCode5.txt");

	}

	@Test
	@Tag("test63")
	@DisplayName("test63")
	public void testMALSCVA1R0_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_currentStockQty8.txt");

	}

	@Test
	@Tag("test64")
	@DisplayName("test64")
	public void testMALSCVA1R0_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_stockDifferenceQty8.txt");

	}

	@Test
	@Tag("test65")
	@DisplayName("test65")
	public void testMALSCVA1R0_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "12");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_productlist.txt");

	}

	@Test
	@Tag("test66")
	@DisplayName("test66")
	public void testMALSCVA1R0_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "13");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "1");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "1");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_brandCodelist.txt");

	}

	@Test
	@Tag("test67")
	@DisplayName("test67")
	public void testMALSCVA1R0_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test68")
	@DisplayName("test68")
	public void testMALSCVA1R0_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "11");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "5");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "5");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test69")
	@DisplayName("test69")
	public void testMALSCVA1R0_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_null.txt");

	}

	@Test
	@Tag("test70")
	@DisplayName("test70")
	public void testMALSCVA1R0_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_1productCode.txt");

	}

	@Test
	@Tag("test71")
	@DisplayName("test71")
	public void testMALSCVA1R0_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_2productCode.txt");

	}

	@Test
	@Tag("test72")
	@DisplayName("test72")
	public void testMALSCVA1R0_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_3productCode.txt");

	}

	@Test
	@Tag("test73")
	@DisplayName("test73")
	public void testMALSCVA1R0_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_2productCode.txt");

	}

	@Test
	@Tag("test74")
	@DisplayName("test74")
	public void testMALSCVA1R0_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_4productCode.txt");

	}

	@Test
	@Tag("test75")
	@DisplayName("test75")
	public void testMALSCVA1R0_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_5productCode.txt");

	}

	@Test
	@Tag("test76")
	@DisplayName("test76")
	public void testMALSCVA1R0_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "record0");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test77")
	@DisplayName("test77")
	public void testMALSCVA1R0_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "record0");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test78")
	@DisplayName("test78")
	public void testMALSCVA1R0_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "record0");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test79")
	@DisplayName("test79")
	public void testMALSCVA1R0_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "record0");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test80")
	@DisplayName("test80")
	public void testMALSCVA1R0_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "record0");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test81")
	@DisplayName("test81")
	public void testMALSCVA1R0_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "record0");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test82")
	@DisplayName("test82")
	public void testMALSCVA1R0_082() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_082/case_082_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "record0");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test83")
	@DisplayName("test83")
	public void testMALSCVA1R0_083() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_083/case_083_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_003.txt");

	}

	@Test
	@Tag("test84")
	@DisplayName("test84")
	public void testMALSCVA1R0_084() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_084/case_084_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "6");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test85")
	@DisplayName("test85")
	public void testMALSCVA1R0_085() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_085/case_085_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "7");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test86")
	@DisplayName("test86")
	public void testMALSCVA1R0_086() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_086/case_086_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "0");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test87")
	@DisplayName("test87")
	public void testMALSCVA1R0_087() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_087/case_087_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "11");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test88")
	@DisplayName("test88")
	public void testMALSCVA1R0_088() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_088/case_088_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "11");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test89")
	@DisplayName("test89")
	public void testMALSCVA1R0_089() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_089/case_089_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "11");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test90")
	@DisplayName("test90")
	public void testMALSCVA1R0_090() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_090/case_090_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "11");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test91")
	@DisplayName("test91")
	public void testMALSCVA1R0_091() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_091/case_091_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "11");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test92")
	@DisplayName("test92")
	public void testMALSCVA1R0_092() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_092/case_092_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "3");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test93")
	@DisplayName("test93")
	public void testMALSCVA1R0_093() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_093/case_093_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "3");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test94")
	@DisplayName("test94")
	public void testMALSCVA1R0_094() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_094/case_094_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test95")
	@DisplayName("test95")
	public void testMALSCVA1R0_095() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_095/case_095_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

	@Test
	@Tag("test96")
	@DisplayName("test96")
	public void testMALSCVA1R0_096() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCVA1R0/case_096/case_096_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/subsidiary/get → 現法マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/subsidiary/get", "現法マスタ参照API", "4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product/search → 商品マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product/search", "商品マスタ参照API", "1");

		/* 操作(apiMock) → /internal/v1/product-control-department/get-list → 商品所管部門マスタ */
		rakurakuCore.operateMockApi("/internal/v1/product-control-department/get-list", "商品所管部門マスタ", "2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/ginner-info/get-list → インナーコード変換API */
		rakurakuCore.operateMockApi("/internal/v1/ginner-info/get-list", "インナーコード変換API", "2");

		/* 操作(apiMock) → /internal/v1/type-code/get-list → タイプコードマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/type-code/get-list", "タイプコードマスタ参照API", "2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "2");

		/* 操作(api) → 登录 → internal/v1/stock-adjustment/reference → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1 → UserLoginInfo */
		rakurakuCore.operateApi("登录", "internal/v1/stock-adjustment/reference", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.26.10&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1", "UserLoginInfo", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCVA1R0\\MALSCVA1R0_001.txt");

	}

}
