package com.linkage.apiTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.linkage.rakuraku.core.RakurakuCore;

@Tag("MALSCSS1U0機能確認")
@DisplayName("MALSCSS1U0機能確認")
public class MALSCSS1U0Test {

	@BeforeAll
	public static void initialize() throws Exception {
		RakurakuCore.initialize("dbunit","MALSCSS1U0");
	}

	@BeforeEach
	public void setUp() throws Exception {
		RakurakuCore.setUp("dbunit","MALSCSS1U0");
	}

	@AfterEach
	public void tearDown() throws Exception {
		RakurakuCore.tearDown();
	}

	@AfterAll
	public static void release() throws Exception {
		RakurakuCore.release("1+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****2+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-2-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-2*****3+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****4+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****5+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-3-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-3-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-3-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-3-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-3-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-2*****6+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****7+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****8+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-4-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-4-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-4-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-4-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-4-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-2*****9+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****10+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****11+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-5-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-5-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-5-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-5-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-5-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-2*****12+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****13+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****14+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****15+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****16+++++/internal/v1/sales-order/search;;受注明細参照API;;example-2-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-9-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-2-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-2-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-2-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-2-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-2-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-2-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-2*****17+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-3*****18+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-4*****19+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-3*****20+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-6-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-4*****21+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-3*****22+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-7-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-4*****23+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-3*****24+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-8-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-6-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-6-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-6-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-6-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-4*****25+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****26+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****27+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****28+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****29+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****30+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****31+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****32+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****33+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****34+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****35+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****36+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****37+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****38+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****39+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****40+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****41+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****42+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****43+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****44+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****45+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****46+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****47+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****48+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****49+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****50+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****51+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****52+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****53+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****54+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****55+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1*****56+++++/internal/v1/sales-order/search;;受注明細参照API;;example-1-----/newtonApi/shipmentfailview;;出荷不可参照API;;example-1-----/internal/v1/customer/get-list;;得意先マスタ参照API;;example-1-----/internal/v1/supplier/get-list;;仕入先マスタ参照API;;example-1-----/internal/v1/plant/get-list;;置場マスタ参照API;;example-1-----/internal/v1/brand/get-list;;ブランドマスタ参照API;;example-1-----/internal/v1/reason-type/get-list;;理由区分マスタ参照API;;example-1-----/internal/v1/closing-time/get-list;;締め時刻マスタ参照API;;example-1-----/newtonApi/shipmentfailupdateSynchronous;;出荷不可入力更新(MS→GW);;example-1");
	}

	@Test
	@Tag("test0001")
	@DisplayName("test0001")
	public void testMALSCSS1U0_001() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_001/case_001_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U00.json");

	}

	@Test
	@Tag("test0002")
	@DisplayName("test0002")
	public void testMALSCSS1U0_002() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_002/case_002_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U01.json");

	}

	@Test
	@Tag("test0003")
	@DisplayName("test0003")
	public void testMALSCSS1U0_003() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_003/case_003_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U02.json");

	}

	@Test
	@Tag("test0004")
	@DisplayName("test0004")
	public void testMALSCSS1U0_004() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_004/case_004_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U03.json");

	}

	@Test
	@Tag("test0005")
	@DisplayName("test0005")
	public void testMALSCSS1U0_005() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_005/case_005_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U04.json");

	}

	@Test
	@Tag("test0006")
	@DisplayName("test0006")
	public void testMALSCSS1U0_006() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_006/case_006_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U05.json");

	}

	@Test
	@Tag("test0007")
	@DisplayName("test0007")
	public void testMALSCSS1U0_007() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_007/case_007_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U06.json");

	}

	@Test
	@Tag("test0008")
	@DisplayName("test0008")
	public void testMALSCSS1U0_008() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_008/case_008_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U07.json");

	}

	@Test
	@Tag("test0009")
	@DisplayName("test0009")
	public void testMALSCSS1U0_009() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_009/case_009_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U08.json");

	}

	@Test
	@Tag("test0010")
	@DisplayName("test0010")
	public void testMALSCSS1U0_010() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_010/case_010_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U09.json");

	}

	@Test
	@Tag("test0011")
	@DisplayName("test0011")
	public void testMALSCSS1U0_011() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_011/case_011_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-2");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U10.json");

	}

	@Test
	@Tag("test0012")
	@DisplayName("test0012")
	public void testMALSCSS1U0_012() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_012/case_012_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U00.json");

	}

	@Test
	@Tag("test0013")
	@DisplayName("test0013")
	public void testMALSCSS1U0_013() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_013/case_013_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U02.json");

	}

	@Test
	@Tag("test0014")
	@DisplayName("test0014")
	public void testMALSCSS1U0_014() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_014/case_014_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U05.json");

	}

	@Test
	@Tag("test0015")
	@DisplayName("test0015")
	public void testMALSCSS1U0_015() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_015/case_015_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "2");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U08.json");

	}

	@Test
	@Tag("test0016")
	@DisplayName("test0016")
	public void testMALSCSS1U0_016() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_016/case_016_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-2");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-9");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-2");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U01.json");

	}

	@Test
	@Tag("test0017")
	@DisplayName("test0017")
	public void testMALSCSS1U0_017() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_017/case_017_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-3");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U00.json");

	}

	@Test
	@Tag("test0018")
	@DisplayName("test0018")
	public void testMALSCSS1U0_018() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_018/case_018_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-4");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U00.json");

	}

	@Test
	@Tag("test0019")
	@DisplayName("test0019")
	public void testMALSCSS1U0_019() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_019/case_019_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-3");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U02.json");

	}

	@Test
	@Tag("test0020")
	@DisplayName("test0020")
	public void testMALSCSS1U0_020() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_020/case_020_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-4");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U02.json");

	}

	@Test
	@Tag("test0021")
	@DisplayName("test0021")
	public void testMALSCSS1U0_021() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_021/case_021_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-3");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U05.json");

	}

	@Test
	@Tag("test0022")
	@DisplayName("test0022")
	public void testMALSCSS1U0_022() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_022/case_022_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-7");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-4");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U05.json");

	}

	@Test
	@Tag("test0023")
	@DisplayName("test0023")
	public void testMALSCSS1U0_023() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_023/case_023_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-3");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U08.json");

	}

	@Test
	@Tag("test0024")
	@DisplayName("test0024")
	public void testMALSCSS1U0_024() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_024/case_024_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

		/* 操作(apiMock) → /internal/v1/sales-order/search → 受注明細参照API */
		rakurakuCore.operateMockApi("/internal/v1/sales-order/search", "受注明細参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailview → 出荷不可参照API */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailview", "出荷不可参照API", "example-8");

		/* 操作(apiMock) → /internal/v1/customer/get-list → 得意先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/customer/get-list", "得意先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/supplier/get-list → 仕入先マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/supplier/get-list", "仕入先マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/plant/get-list → 置場マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/plant/get-list", "置場マスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/brand/get-list → ブランドマスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/brand/get-list", "ブランドマスタ参照API", "example-6");

		/* 操作(apiMock) → /internal/v1/reason-type/get-list → 理由区分マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/reason-type/get-list", "理由区分マスタ参照API", "example-1");

		/* 操作(apiMock) → /internal/v1/closing-time/get-list → 締め時刻マスタ参照API */
		rakurakuCore.operateMockApi("/internal/v1/closing-time/get-list", "締め時刻マスタ参照API", "example-1");

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-4");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U08.json");

	}

	@Test
	@Tag("test0025")
	@DisplayName("test0025")
	public void testMALSCSS1U0_025() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_025/case_025_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U11.json");

	}

	@Test
	@Tag("test0026")
	@DisplayName("test0026")
	public void testMALSCSS1U0_026() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_026/case_026_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U12.json");

	}

	@Test
	@Tag("test0027")
	@DisplayName("test0027")
	public void testMALSCSS1U0_027() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_027/case_027_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "1");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U13.json");

	}

	@Test
	@Tag("test0028")
	@DisplayName("test0028")
	public void testMALSCSS1U0_028() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_028/case_028_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U14.json");

	}

	@Test
	@Tag("test0029")
	@DisplayName("test0029")
	public void testMALSCSS1U0_029() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_029/case_029_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U15.json");

	}

	@Test
	@Tag("test0030")
	@DisplayName("test0030")
	public void testMALSCSS1U0_030() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_030/case_030_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U16.json");

	}

	@Test
	@Tag("test0031")
	@DisplayName("test0031")
	public void testMALSCSS1U0_031() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_031/case_031_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U17.json");

	}

	@Test
	@Tag("test0032")
	@DisplayName("test0032")
	public void testMALSCSS1U0_032() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_032/case_032_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U18.json");

	}

	@Test
	@Tag("test0033")
	@DisplayName("test0033")
	public void testMALSCSS1U0_033() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_033/case_033_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U19.json");

	}

	@Test
	@Tag("test0034")
	@DisplayName("test0034")
	public void testMALSCSS1U0_034() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_034/case_034_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U20.json");

	}

	@Test
	@Tag("test0035")
	@DisplayName("test0035")
	public void testMALSCSS1U0_035() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_035/case_035_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U21.json");

	}

	@Test
	@Tag("test0036")
	@DisplayName("test0036")
	public void testMALSCSS1U0_036() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_036/case_036_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U22.json");

	}

	@Test
	@Tag("test0037")
	@DisplayName("test0037")
	public void testMALSCSS1U0_037() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_037/case_037_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U23.json");

	}

	@Test
	@Tag("test0038")
	@DisplayName("test0038")
	public void testMALSCSS1U0_038() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_038/case_038_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U24.json");

	}

	@Test
	@Tag("test0039")
	@DisplayName("test0039")
	public void testMALSCSS1U0_039() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_039/case_039_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U25.json");

	}

	@Test
	@Tag("test0040")
	@DisplayName("test0040")
	public void testMALSCSS1U0_040() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_040/case_040_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U26.json");

	}

	@Test
	@Tag("test0041")
	@DisplayName("test0041")
	public void testMALSCSS1U0_041() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_041/case_041_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U27.json");

	}

	@Test
	@Tag("test0042")
	@DisplayName("test0042")
	public void testMALSCSS1U0_042() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_042/case_042_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U28.json");

	}

	@Test
	@Tag("test0043")
	@DisplayName("test0043")
	public void testMALSCSS1U0_043() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_043/case_043_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U29.json");

	}

	@Test
	@Tag("test0044")
	@DisplayName("test0044")
	public void testMALSCSS1U0_044() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_044/case_044_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U30.json");

	}

	@Test
	@Tag("test0045")
	@DisplayName("test0045")
	public void testMALSCSS1U0_045() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_045/case_045_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U31.json");

	}

	@Test
	@Tag("test0046")
	@DisplayName("test0046")
	public void testMALSCSS1U0_046() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_046/case_046_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U32.json");

	}

	@Test
	@Tag("test0047")
	@DisplayName("test0047")
	public void testMALSCSS1U0_047() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_047/case_047_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U33.json");

	}

	@Test
	@Tag("test0048")
	@DisplayName("test0048")
	public void testMALSCSS1U0_048() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_048/case_048_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U34.json");

	}

	@Test
	@Tag("test0049")
	@DisplayName("test0049")
	public void testMALSCSS1U0_049() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_049/case_049_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U35.json");

	}

	@Test
	@Tag("test0050")
	@DisplayName("test0050")
	public void testMALSCSS1U0_050() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_050/case_050_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U36.json");

	}

	@Test
	@Tag("test0051")
	@DisplayName("test0051")
	public void testMALSCSS1U0_051() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_051/case_051_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U37.json");

	}

	@Test
	@Tag("test0052")
	@DisplayName("test0052")
	public void testMALSCSS1U0_052() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_052/case_052_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U38.json");

	}

	@Test
	@Tag("test0053")
	@DisplayName("test0053")
	public void testMALSCSS1U0_053() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_053/case_053_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U39.json");

	}

	@Test
	@Tag("test0054")
	@DisplayName("test0054")
	public void testMALSCSS1U0_054() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_054/case_054_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "1");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "4");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U40.json");

	}

	@Test
	@Tag("test0055-new正常系")
	@DisplayName("test0055-new正常系")
	public void testMALSCSS1U0_055() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_055/case_055_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U41.json");

	}

	@Test
	@Tag("test0056")
	@DisplayName("test0056")
	public void testMALSCSS1U0_056() throws Exception {

		RakurakuCore rakurakuCore = new RakurakuCore("/MALSCSS1U0/case_056/case_056_", "");// ケース番号の設定

		// ここから自動化打鍵開始
		/* 操作(DB準備) → c_screen_field_display → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_screen_field_display", "データクリア・挿入", "3");

		/* 操作(DB準備) → c_process_parameter → データクリア・挿入 */
		rakurakuCore.operateDBPrepare("c_process_parameter", "データクリア・挿入", "5");

		/* 操作(DB準備) → idempotent_requests → DELETE_ALL */
		rakurakuCore.operateDBPrepare("idempotent_requests", "DELETE_ALL", "1");

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

		/* 操作(apiMock) → /newtonApi/shipmentfailupdateSynchronous → 出荷不可入力更新(MS→GW) */
		rakurakuCore.operateMockApi("/newtonApi/shipmentfailupdateSynchronous", "出荷不可入力更新(MS→GW)", "example-1");

		/* 操作(api) → 入力更新 → internal/v1/stop-shipment/save → POST → Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=* /*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2 */
		rakurakuCore.operateApi("入力更新", "internal/v1/stop-shipment/save", "POST", "Content-Type=application/json&&User-Agent=PostmanRuntime/7.28.4&&Accept=*/*&&Accept-Encoding=gzip, deflate, br&&Connection=keep-alive&&X-Client-Program=1&&Idempotency-Key=2", "", "D:\\pleiades\\workspace\\rakuraku-auto-test\\PostBody\\MALSCSS1U0\\MALSCSS1U42.json");

	}

}
