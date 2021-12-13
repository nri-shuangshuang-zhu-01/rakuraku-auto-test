package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS1C0機能確認")
@DisplayName("MALSCSS1C0機能確認")
public class MALSCSS1C0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS1C0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS1C0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****2+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****3+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-3-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****4+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****5+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-5-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-5-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-5-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****6+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****7+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****8+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****9+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****10+++++/internal/v1/sales-order/search;;受注明細参照API;;example-3-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****11+++++/internal/v1/sales-order/search;;受注明細参照API;;example-4-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****12+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****13+++++/internal/v1/sales-order/search;;受注明細参照API;;example-5-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****14+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****15+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****16+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****17+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****18+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****19+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****20+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****21+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-3-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****22+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****23+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****24+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****25+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****26+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****27+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****28+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****29+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****30+++++/internal/v1/sales-order/search;;受注明細参照API;;example-7-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****31+++++/internal/v1/sales-order/search;;受注明細参照API;;example-8-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****32+++++/internal/v1/sales-order/search;;受注明細参照API;;example-9-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****33+++++/internal/v1/sales-order/search;;受注明細参照API;;example-10-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****34+++++/internal/v1/sales-order/search;;受注明細参照API;;example-11-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****35+++++/internal/v1/sales-order/search;;受注明細参照API;;example-12-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****36+++++/internal/v1/sales-order/search;;受注明細参照API;;example-13-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****37+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****38+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****39+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****40+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-9-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****41+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-10-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****42+++++/internal/v1/sales-order/search;;受注明細参照API;;example-14-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-3-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****43+++++/internal/v1/sales-order/search;;受注明細参照API;;example-15-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-3-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****44+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-11-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****45+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-12-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****46+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-13-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****47+++++/internal/v1/sales-order/search;;受注明細参照API;;example-14-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****48+++++/internal/v1/sales-order/search;;受注明細参照API;;example-15-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****49+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-18-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-5-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-5-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****50+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-14-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-5-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-5-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****51+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-21-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-5-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-5-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-6*****52+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-15-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-3*****53+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-16-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-4*****54+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-17-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-5*****55+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-19-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-6*****56+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****57+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2*****58+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****59+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****60+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****61+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****62+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****63+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****64+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****65+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****66+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****67+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-20-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-8*****68+++++/internal/v1/sales-order/search;;受注明細参照API;;example-16-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****69+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-22-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****70+++++/internal/v1/sales-order/search;;受注明細参照API;;example-17-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-23-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****71+++++/internal/v1/sales-order/search;;受注明細参照API;;example-18-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****72+++++/internal/v1/sales-order/search;;受注明細参照API;;example-19-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****73+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-7-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****74+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****75+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-7-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****76+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-7-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****77+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****78+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-7-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****79+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****80+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-3-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1*****81+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-9");
	}

	@Test
	@Tag("1件確認")
	@DisplayName("1件確認")
	public void testMALSCSS1C0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "", "/internal/v1/closing-time/get-list");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("複数件確認")
	@DisplayName("複数件確認")
	public void testMALSCSS1C0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C01.json");

	}

	@Test
	@Tag("test003")
	@DisplayName("test003")
	public void testMALSCSS1C0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test004")
	@DisplayName("test004")
	public void testMALSCSS1C0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test005")
	@DisplayName("test005")
	public void testMALSCSS1C0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C04.json");

	}

	@Test
	@Tag("test006")
	@DisplayName("test006")
	public void testMALSCSS1C0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "2");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test007")
	@DisplayName("test007")
	public void testMALSCSS1C0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "3");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test008")
	@DisplayName("test008")
	public void testMALSCSS1C0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "3");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test009")
	@DisplayName("test009")
	public void testMALSCSS1C0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "4");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test010")
	@DisplayName("test010")
	public void testMALSCSS1C0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-3");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test011")
	@DisplayName("test011")
	public void testMALSCSS1C0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-4");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test012")
	@DisplayName("test012")
	public void testMALSCSS1C0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test013")
	@DisplayName("test013")
	public void testMALSCSS1C0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-5");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test014")
	@DisplayName("test014")
	public void testMALSCSS1C0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test015")
	@DisplayName("test015")
	public void testMALSCSS1C0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test016")
	@DisplayName("test016")
	public void testMALSCSS1C0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test017")
	@DisplayName("test017")
	public void testMALSCSS1C0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test018")
	@DisplayName("test018")
	public void testMALSCSS1C0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test019")
	@DisplayName("test019")
	public void testMALSCSS1C0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test020")
	@DisplayName("test020")
	public void testMALSCSS1C0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test021")
	@DisplayName("test021")
	public void testMALSCSS1C0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test022")
	@DisplayName("test022")
	public void testMALSCSS1C0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "4");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test023")
	@DisplayName("test023")
	public void testMALSCSS1C0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "5");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test024")
	@DisplayName("test024")
	public void testMALSCSS1C0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "6");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test025")
	@DisplayName("test025")
	public void testMALSCSS1C0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test026")
	@DisplayName("test026")
	public void testMALSCSS1C0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test027")
	@DisplayName("test027")
	public void testMALSCSS1C0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "6");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test028")
	@DisplayName("test028")
	public void testMALSCSS1C0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "7");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test029")
	@DisplayName("test029")
	public void testMALSCSS1C0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C05.json");

	}

	@Test
	@Tag("test030")
	@DisplayName("test030")
	public void testMALSCSS1C0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-7");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test031")
	@DisplayName("test031")
	public void testMALSCSS1C0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-8");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test032")
	@DisplayName("test032")
	public void testMALSCSS1C0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-9");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test033")
	@DisplayName("test033")
	public void testMALSCSS1C0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-10");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test034")
	@DisplayName("test034")
	public void testMALSCSS1C0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-11");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test035")
	@DisplayName("test035")
	public void testMALSCSS1C0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-12");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test036")
	@DisplayName("test036")
	public void testMALSCSS1C0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-13");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test037")
	@DisplayName("test037")
	public void testMALSCSS1C0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test038")
	@DisplayName("test038")
	public void testMALSCSS1C0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test039")
	@DisplayName("test039")
	public void testMALSCSS1C0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test040")
	@DisplayName("test040")
	public void testMALSCSS1C0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-9");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test041")
	@DisplayName("test041")
	public void testMALSCSS1C0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-10");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test042")
	@DisplayName("test042")
	public void testMALSCSS1C0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-14");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test043")
	@DisplayName("test043")
	public void testMALSCSS1C0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-15");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C02.json");

	}

	@Test
	@Tag("test044")
	@DisplayName("test044")
	public void testMALSCSS1C0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-11");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test045")
	@DisplayName("test045")
	public void testMALSCSS1C0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-12");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test046")
	@DisplayName("test046")
	public void testMALSCSS1C0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-13");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test047")
	@DisplayName("test047")
	public void testMALSCSS1C0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "9");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-14");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test048")
	@DisplayName("test048")
	public void testMALSCSS1C0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-15");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-4");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C03.json");

	}

	@Test
	@Tag("test049")
	@DisplayName("test049")
	public void testMALSCSS1C0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-18");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C04.json");

	}

	@Test
	@Tag("test050")
	@DisplayName("test050")
	public void testMALSCSS1C0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "7");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-14");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C04.json");

	}

	@Test
	@Tag("test051")
	@DisplayName("test051")
	public void testMALSCSS1C0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-21");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-5");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-6");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C04.json");

	}

	@Test
	@Tag("test052")
	@DisplayName("test052")
	public void testMALSCSS1C0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-15");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-3");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test053")
	@DisplayName("test053")
	public void testMALSCSS1C0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-16");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-4");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test054")
	@DisplayName("test054")
	public void testMALSCSS1C0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-17");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-5");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test055")
	@DisplayName("test055")
	public void testMALSCSS1C0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-19");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-6");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test056")
	@DisplayName("test056")
	public void testMALSCSS1C0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "5");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test057")
	@DisplayName("test057")
	public void testMALSCSS1C0_057() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_057/case_057_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "2");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test058")
	@DisplayName("test058")
	public void testMALSCSS1C0_058() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_058/case_058_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C06.json");

	}

	@Test
	@Tag("test059")
	@DisplayName("test059")
	public void testMALSCSS1C0_059() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_059/case_059_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C07.json");

	}

	@Test
	@Tag("test060")
	@DisplayName("test060")
	public void testMALSCSS1C0_060() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_060/case_060_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C08.json");

	}

	@Test
	@Tag("test061")
	@DisplayName("test061")
	public void testMALSCSS1C0_061() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_061/case_061_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C09.json");

	}

	@Test
	@Tag("test062")
	@DisplayName("test062")
	public void testMALSCSS1C0_062() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_062/case_062_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C10.json");

	}

	@Test
	@Tag("test063")
	@DisplayName("test063")
	public void testMALSCSS1C0_063() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_063/case_063_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C11.json");

	}

	@Test
	@Tag("test064")
	@DisplayName("test064")
	public void testMALSCSS1C0_064() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_064/case_064_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C12.json");

	}

	@Test
	@Tag("test065")
	@DisplayName("test065")
	public void testMALSCSS1C0_065() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_065/case_065_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C13.json");

	}

	@Test
	@Tag("test066")
	@DisplayName("test066")
	public void testMALSCSS1C0_066() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_066/case_066_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C14.json");

	}

	@Test
	@Tag("test067")
	@DisplayName("test067")
	public void testMALSCSS1C0_067() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_067/case_067_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-20");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-8");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C15.json");

	}

	@Test
	@Tag("test068")
	@DisplayName("test068")
	public void testMALSCSS1C0_068() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_068/case_068_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "8");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-16");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test069")
	@DisplayName("test069")
	public void testMALSCSS1C0_069() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_069/case_069_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "7");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-22");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	@Tag("test070")
	@DisplayName("test070")
	public void testMALSCSS1C0_070() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_070/case_070_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "9");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "9");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-17");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-23");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_071() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_071/case_071_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-18");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_072() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_072/case_072_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-19");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_073() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_073/case_073_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_074() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_074/case_074_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_075() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_075/case_075_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_076() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_076/case_076_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_077() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_077/case_077_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_078() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_078/case_078_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_079() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_079/case_079_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_080() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_080/case_080_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-3");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

	@Test
	public void testMALSCSS1C0_081() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1C0/case_081/case_081_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → C_PROCESS_PARAMETER → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_PROCESS_PARAMETER", "データクリア・挿入", "1");

		/* 操作(DB準備) → C_SCREEN_FIELD_DISPLAY → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("C_SCREEN_FIELD_DISPLAY", "データクリア・挿入", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-9");

		/* 操作(api) → 入力チェック → internal/v1/stop-shipment/check → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1 */
		rakurakuCore.operateApi("入力チェック", "internal/v1/stop-shipment/check", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=1", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1C0\\MALSCSS1C00.json");

	}

}
