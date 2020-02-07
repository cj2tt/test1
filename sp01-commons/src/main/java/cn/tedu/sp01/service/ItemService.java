package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String OrderId);
	void decreaseNumbers(List<Item> list);
	
}
