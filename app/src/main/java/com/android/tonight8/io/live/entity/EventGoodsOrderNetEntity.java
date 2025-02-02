package com.android.tonight8.io.live.entity;

import com.android.tonight8.dao.model.live.EventGoodsOrder;
import com.android.tonight8.io.net.NetEntityBase;

public class EventGoodsOrderNetEntity extends NetEntityBase {
	/** 商品订单详情 */
	private EventGoodsOrder eventGoodsOrder;

	public EventGoodsOrder getEventGoodsOrder() {
		return eventGoodsOrder;
	}

	public void setEventGoodsOrder(EventGoodsOrder eventGoodsOrder) {
		this.eventGoodsOrder = eventGoodsOrder;
	}

	@Override
	public String toString() {
		return "EventGoodsOrderNetEntity [eventGoodsOrder=" + eventGoodsOrder
				+ "]";
	}

}
