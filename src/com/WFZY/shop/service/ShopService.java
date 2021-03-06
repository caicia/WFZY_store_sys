package com.WFZY.shop.service;

import java.util.List;

import com.WFZY.pojo.Banks;
import com.WFZY.pojo.BanksExample;
import com.WFZY.pojo.Express;
import com.WFZY.pojo.ExpressExample;
import com.WFZY.pojo.Shopclassify;
import com.WFZY.pojo.ShopclassifyExample;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.Shopsexpress;
import com.WFZY.pojo.ShopsexpressExample;
import com.WFZY.pojo.Users;
import com.WFZY.pojo.UsersExample;

public interface ShopService {

	public List<Shopclassify> getShopclassifyName(ShopclassifyExample shopclassify);

	public int addBanks(Banks record);

	public int addShops(Shops record);


	public List<Banks> getBanksID(BanksExample example);

	public List<Shops> getShopsID(ShopsExample record);

	public List<Users> getUserID(UsersExample record);

	public int updataShopApply(Shops record);

	public int updataBanks(Banks record);

	public List<Shopsexpress> getshopExpress(ShopsexpressExample example);

	public List<Express> getExpress(ExpressExample example);

	public int delectshopsExpress(ShopsexpressExample example);

	public int insertshopsExpress(Shopsexpress record);

	
	
}
