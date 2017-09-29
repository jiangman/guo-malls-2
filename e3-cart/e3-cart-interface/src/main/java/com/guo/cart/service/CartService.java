package com.guo.cart.service;

import java.util.List;

import com.guo.common.utils.E3Result;
import com.guo.pojo.TbItem;


public interface CartService {

	E3Result addCart(long userId, long itemId, int num);
	E3Result mergeCart(long userId, List<TbItem> itemList);
	List<TbItem> getCartList(long userId);
	E3Result updateCartNum(long userId, long itemId, int num);
	E3Result deleteCartItem(long userId, long itemId);
}
