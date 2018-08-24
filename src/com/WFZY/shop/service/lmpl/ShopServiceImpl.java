package com.WFZY.shop.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.WFZY.mapper.ActivityMapper;
import com.WFZY.mapper.BanksMapper;
import com.WFZY.mapper.ExpressMapper;
import com.WFZY.mapper.ShopclassifyMapper;
import com.WFZY.mapper.ShopsMapper;
import com.WFZY.mapper.ShopsexpressMapper;
import com.WFZY.mapper.UsersMapper;
import com.WFZY.pojo.ActivityExample;
import com.WFZY.pojo.ActivityWithBLOBs;
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

@Service("ShopServiceImpl")
public class ShopServiceImpl implements com.WFZY.shop.service.ShopService {

	@Resource
	private ShopclassifyMapper shopclassifyMapper;
	
	@Resource
	private BanksMapper banksMapper;
	
	@Resource
	private ShopsMapper shopsMapper;
	
	@Resource
	private ShopsexpressMapper shopsexpressMapper;
	
	@Resource
	private UsersMapper usersMapper;
	
	@Resource
	private ExpressMapper expressMapper;

	@Override
	public List<Shopclassify> getShopclassifyName(ShopclassifyExample shopclassify) {
		// TODO Auto-generated method stub
	 return shopclassifyMapper.selectByExample(shopclassify);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int addBanks(Banks record) {
		// TODO Auto-generated method stub
		return banksMapper.insert(record);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int addShops(Shops record) {
		// TODO Auto-generated method stub
		return shopsMapper.insertSelective(record);
	}

	
	
	@Override
	public List<Banks> getBanksID(BanksExample example) {
		// TODO Auto-generated method stub
	 return banksMapper.selectByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Shops> getShopsID(ShopsExample record) {
		// TODO Auto-generated method stub
		return shopsMapper.selectByExample(record);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Users> getUserID(UsersExample record) {
		// TODO Auto-generated method stub
		return usersMapper.selectByExample(record);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int updataShopApply(Shops record) {
		// TODO Auto-generated method stub
		return shopsMapper.updateByPrimaryKeySelective(record);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int updataBanks(Banks record) {
		// TODO Auto-generated method stub
		return banksMapper.updateByPrimaryKeySelective(record);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Shopsexpress> getshopExpress(ShopsexpressExample example) {
		// TODO Auto-generated method stub
		return shopsexpressMapper.selectByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Express> getExpress(ExpressExample example) {
		// TODO Auto-generated method stub
		return expressMapper.selectByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int delectshopsExpress(ShopsexpressExample example) {
		// TODO Auto-generated method stub
		return shopsexpressMapper.deleteByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int insertshopsExpress(Shopsexpress record) {
		// TODO Auto-generated method stub
		return shopsexpressMapper.insertSelective(record);
	}
	
}
