package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS3P0機能確認")
@DisplayName("MALSCSS3P0機能確認")
public class MALSCSS3P0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS3P0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS3P0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("");
		//RakurakuCore.release("1+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****2+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****3+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-3*****4+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-4*****5+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****6+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****7+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****8+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****9+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****10+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****11+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****12+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****13+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****14+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****15+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-2-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****16+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****17+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****18+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****19+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****20+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****21+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****22+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****23+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****24+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****25+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****26+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****27+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****28+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****29+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****30+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****31+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****32+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****33+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****34+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****35+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****36+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****37+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****38+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****39+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****40+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****41+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****42+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****43+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****44+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****45+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****46+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****47+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****48+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****49+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****50+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****51+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****52+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****53+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****54+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****55+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****56+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****57+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****58+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****59+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****60+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****61+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****62+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****63+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****64+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****65+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****66+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****67+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****68+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****69+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****70+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****71+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****72+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****73+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/customer/get-list;;得意先情報取得API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-2*****74+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****75+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****76+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****77+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-3-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****78+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-4-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****79+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****80+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-3-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****81+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-4-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****82+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****83+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****84+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****85+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****86+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****87+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****88+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****89+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-3-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****90+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-2-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****91+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-2-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****92+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-3-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-1*****93+++++/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/customer/get-list;;得意先情報取得API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/interna/v1/mail-template/preview;;メールプレビューAPI;;example-1-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;example-1-----/internal/v1/report/print;;帳票作成API;;example-1-----/internal/v1/report/download;;帳票ファイル取得API呼出;;example-1-----/v1/mail/send;;メール送信API;;example-1-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;example-5*****No+++++/newtonApi/shipmentfailview;;出荷不可参照API;;操作(api)-----/internal/v1/product-classification/get-list;;製品分類マスタ参照API;;-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;-----/internal/v1/customer/get-list;;得意先情報取得API;;-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;-----/internal/v1/plant/get-list;;置場マスタ参照API;;-----/interna/v1/mail-template/preview;;メールプレビューAPI;;-----/internal/v1/report/find;;帳票テンプレート詳細情報取得API;;-----/internal/v1/report/print;;帳票作成API;;-----/internal/v1/report/download;;帳票ファイル取得API呼出;;-----/v1/mail/send;;メール送信API;;-----/v1/gw-stop-shipment/save;;出荷不可入力更新(MFS→GW)API;;");
	}

	@Test
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMALSCSS3P0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0002")
	@DisplayName("test0002")
	public void testMALSCSS3P0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0003")
	@DisplayName("test0003")
	public void testMALSCSS3P0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-3");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0004")
	@DisplayName("test0004")
	public void testMALSCSS3P0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-4");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0005")
	@DisplayName("test0005")
	public void testMALSCSS3P0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0006")
	@DisplayName("test0006")
	public void testMALSCSS3P0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0007")
	@DisplayName("test0007")
	public void testMALSCSS3P0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "3");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0008")
	@DisplayName("test0008")
	public void testMALSCSS3P0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "4");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0009")
	@DisplayName("test0009")
	public void testMALSCSS3P0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0010")
	@DisplayName("test0010")
	public void testMALSCSS3P0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0011")
	@DisplayName("test0011")
	public void testMALSCSS3P0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0012")
	@DisplayName("test0012")
	public void testMALSCSS3P0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0013")
	@DisplayName("test0013")
	public void testMALSCSS3P0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "5");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0014")
	@DisplayName("test0014")
	public void testMALSCSS3P0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "6");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0015")
	@DisplayName("test0015")
	public void testMALSCSS3P0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "7");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "7");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-2");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0016")
	@DisplayName("test0016")
	public void testMALSCSS3P0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "8");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "8");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0017")
	@DisplayName("test0017")
	public void testMALSCSS3P0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "9");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "9");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0018")
	@DisplayName("test0018")
	public void testMALSCSS3P0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "10");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "10");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0019")
	@DisplayName("test0019")
	public void testMALSCSS3P0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "11");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "11");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0020")
	@DisplayName("test0020")
	public void testMALSCSS3P0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "12");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "12");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0021")
	@DisplayName("test0021")
	public void testMALSCSS3P0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "13");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "13");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0022")
	@DisplayName("test0022")
	public void testMALSCSS3P0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "14");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "14");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0023")
	@DisplayName("test0023")
	public void testMALSCSS3P0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "15");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "15");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0024")
	@DisplayName("test0024")
	public void testMALSCSS3P0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "16");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "16");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0025")
	@DisplayName("test0025")
	public void testMALSCSS3P0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "17");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "17");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P02.json");

	}

	@Test
	@Tag("test0026")
	@DisplayName("test0026")
	public void testMALSCSS3P0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "18");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P03.json");

	}

	@Test
	@Tag("test0027")
	@DisplayName("test0027")
	public void testMALSCSS3P0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "18");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "18");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P04.json");

	}

	@Test
	@Tag("test0028")
	@DisplayName("test0028")
	public void testMALSCSS3P0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0029")
	@DisplayName("test0029")
	public void testMALSCSS3P0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0030")
	@DisplayName("test0030")
	public void testMALSCSS3P0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P05.json");

	}

	@Test
	@Tag("test0031")
	@DisplayName("test0031")
	public void testMALSCSS3P0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P06.json");

	}

	@Test
	@Tag("test0032")
	@DisplayName("test0032")
	public void testMALSCSS3P0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P07.json");

	}

	@Test
	@Tag("test0033")
	@DisplayName("test0033")
	public void testMALSCSS3P0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P08.json");

	}

	@Test
	@Tag("test0034")
	@DisplayName("test0034")
	public void testMALSCSS3P0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P09.json");

	}

	@Test
	@Tag("test0035")
	@DisplayName("test0035")
	public void testMALSCSS3P0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P10.json");

	}

	@Test
	@Tag("test0036")
	@DisplayName("test0036")
	public void testMALSCSS3P0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P11.json");

	}

	@Test
	@Tag("test0037")
	@DisplayName("test0037")
	public void testMALSCSS3P0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P12.json");

	}

	@Test
	@Tag("test0038")
	@DisplayName("test0038")
	public void testMALSCSS3P0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P13.json");

	}

	@Test
	@Tag("test0039")
	@DisplayName("test0039")
	public void testMALSCSS3P0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P14.json");

	}

	@Test
	@Tag("test0040")
	@DisplayName("test0040")
	public void testMALSCSS3P0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P15.json");

	}

	@Test
	@Tag("test0041")
	@DisplayName("test0041")
	public void testMALSCSS3P0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P16.json");

	}

	@Test
	@Tag("test0042")
	@DisplayName("test0042")
	public void testMALSCSS3P0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P17.json");

	}

	@Test
	@Tag("test0043")
	@DisplayName("test0043")
	public void testMALSCSS3P0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P18.json");

	}

	@Test
	@Tag("test0044")
	@DisplayName("test0044")
	public void testMALSCSS3P0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P19.json");

	}

	@Test
	@Tag("test0045")
	@DisplayName("test0045")
	public void testMALSCSS3P0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P20.json");

	}

	@Test
	@Tag("test0046")
	@DisplayName("test0046")
	public void testMALSCSS3P0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P21.json");

	}

	@Test
	@Tag("test0047")
	@DisplayName("test0047")
	public void testMALSCSS3P0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P22.json");

	}

	@Test
	@Tag("test0048")
	@DisplayName("test0048")
	public void testMALSCSS3P0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P23.json");

	}

	@Test
	@Tag("test0049")
	@DisplayName("test0049")
	public void testMALSCSS3P0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P24.json");

	}

	@Test
	@Tag("test0050")
	@DisplayName("test0050")
	public void testMALSCSS3P0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P25.json");

	}

	@Test
	@Tag("test0051")
	@DisplayName("test0051")
	public void testMALSCSS3P0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P26.json");

	}

	@Test
	@Tag("test0052")
	@DisplayName("test0052")
	public void testMALSCSS3P0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P27.json");

	}

	@Test
	@Tag("test0053")
	@DisplayName("test0053")
	public void testMALSCSS3P0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P28.json");

	}

	@Test
	@Tag("test0054")
	@DisplayName("test0054")
	public void testMALSCSS3P0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P29.json");

	}

	@Test
	@Tag("test0055")
	@DisplayName("test0055")
	public void testMALSCSS3P0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P30.json");

	}

	@Test
	@Tag("test0056")
	@DisplayName("test0056")
	public void testMALSCSS3P0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P31.json");

	}

	@Test
	@Tag("test0057")
	@DisplayName("test0057")
	public void testMALSCSS3P0_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P32.json");

	}

	@Test
	@Tag("test0058")
	@DisplayName("test0058")
	public void testMALSCSS3P0_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P33.json");

	}

	@Test
	@Tag("test0059")
	@DisplayName("test0059")
	public void testMALSCSS3P0_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P34.json");

	}

	@Test
	@Tag("test0060")
	@DisplayName("test0060")
	public void testMALSCSS3P0_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P35.json");

	}

	@Test
	@Tag("test0061")
	@DisplayName("test0061")
	public void testMALSCSS3P0_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0062")
	@DisplayName("test0062")
	public void testMALSCSS3P0_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0063")
	@DisplayName("test0063")
	public void testMALSCSS3P0_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0064")
	@DisplayName("test0064")
	public void testMALSCSS3P0_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P01.json");

	}

	@Test
	@Tag("test0065")
	@DisplayName("test0065")
	public void testMALSCSS3P0_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P36.json");

	}

	@Test
	@Tag("test0066")
	@DisplayName("test0066")
	public void testMALSCSS3P0_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P37.json");

	}

	@Test
	@Tag("test0067")
	@DisplayName("test0067")
	public void testMALSCSS3P0_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P38.json");

	}

	@Test
	@Tag("test0068")
	@DisplayName("test0068")
	public void testMALSCSS3P0_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P39.json");

	}

	@Test
	@Tag("test0069")
	@DisplayName("test0069")
	public void testMALSCSS3P0_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P40.json");

	}

	@Test
	@Tag("test0070")
	@DisplayName("test0070")
	public void testMALSCSS3P0_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0071")
	@DisplayName("test0071")
	public void testMALSCSS3P0_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0072")
	@DisplayName("test0072")
	public void testMALSCSS3P0_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0073")
	@DisplayName("test0073")
	public void testMALSCSS3P0_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-2");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	@Tag("test0074")
	@DisplayName("test0074")
	public void testMALSCSS3P0_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P01.json");

	}

	@Test
	@Tag("test0075")
	@DisplayName("test0075")
	public void testMALSCSS3P0_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "21");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P01.json");

	}

	@Test
	@Tag("test0076")
	@DisplayName("test0076")
	public void testMALSCSS3P0_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P01.json");

	}

	@Test
	public void testMALSCSS3P0_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_082() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_082/case_082_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_083() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_083/case_083_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_084() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_084/case_084_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_085() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_085/case_085_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_086() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_086/case_086_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_087() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_087/case_087_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_088() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_088/case_088_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_089() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_089/case_089_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-3");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_090() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_090/case_090_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_091() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_091/case_091_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-2");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_092() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_092/case_092_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-3");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-1");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

	@Test
	public void testMALSCSS3P0_093() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS3P0/case_093/case_093_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "6");

		/* 操作(DB準備) → c_email_function → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_function", "データクリア・挿入", "19");

		/* 操作(DB準備) → c_email_send_group → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_send_group", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_to → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_to", "データクリア・挿入", "20");

		/* 操作(DB準備) → c_email_template → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_email_template", "データクリア・挿入", "20");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/product-classification/get-list → 製品分類マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/product-classification/get-list", "製品分類マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /interna/v1/mail-template/preview → メールプレビューAPI */
		rakurakuCore.operateMockApi("/interna/v1/mail-template/preview", "メールプレビューAPI", "example-1");

		/* 操作(apiMock) → /internal/v1/report/find → 帳票テンプレート詳細情報取得API */
		rakurakuCore.operateMockApi("/internal/v1/report/find", "帳票テンプレート詳細情報取得API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/print → 帳票作成API */
		rakurakuCore.operateMockApi("/internal/v1/report/print", "帳票作成API", "example-1");

		/* 操作(apiMock) → /internal/v1/report/download → 帳票ファイル取得API呼出 */
		rakurakuCore.operateMockApi("/internal/v1/report/download", "帳票ファイル取得API呼出", "example-1");

		/* 操作(apiMock) → /v1/mail/send → メール送信API */
		rakurakuCore.operateMockApi("/v1/mail/send", "メール送信API", "example-1");

		/* 操作(apiMock) → /v1/gw-stop-shipment/save → 出荷不可入力更新(MFS→GW)API */
		rakurakuCore.operateMockApi("/v1/gw-stop-shipment/save", "出荷不可入力更新(MFS→GW)API", "example-5");

		/* 操作(api) → 印刷 → internal/v1/stop-shipment/print → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("印刷", "internal/v1/stop-shipment/print", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS3P0\\MALSCSS3P00.json");

	}

}
