CREATE DATABASE WFZY_DB char set utf8
drop database WFZY_DB
USE WFZY_DB
-- 活动表
create table activity(
	activity_Id INT(11) AUTO_INCREMENT PRIMARY KEY comment "自增ID",
    url text not null,
    imageUrl text not null,
    title varchar(15) not null,
	intro text not null,
    `conText` text ,
    activity_type int(2) not null,
    createtime datetime not null,
    startTime datetime not null,
    endTime datetime not null,
    activityStatus tinyint(4) default 1 
)
-- 用户表
drop table users
CREATE TABLE `users`(
`userId` INT(11) AUTO_INCREMENT PRIMARY KEY comment "自增ID  用户ID",
`loginName` VARCHAR(20) NOT NULL comment "user账号" , -- user账号
`loginPwd`  VARCHAR(50) NOT NULL comment "user密码", -- user密码
`userType`  TINYINT(4) DEFAULT 0 check(userType in (0,1)) ,-- "用户类型 0:普通会员 1:门店用户",
`userSex`   TINYINT(4) DEFAULT 0 check(userSex in (0,1,2)),--  "性别 	0:保密 1：男 2：女"
`userName`  VARCHAR(20) NOT NULL comment "用户昵称" ,-- 用户昵称
`trueName`  VARCHAR(100) comment "真实姓名",-- 用户真实名字
`brithday`  date comment "生日", -- 生日
`userPhoto` VARCHAR(200) comment "会员头像", -- 用户头像
`userQQ`	VARCHAR(15) comment "用户QQ", -- 用户QQ
`userPhone` VARCHAR(15) comment "手机", -- 用户手机
`userEmail` VARCHAR(50) comment "邮箱", -- 用户邮箱
`lastIP`	VARCHAR(20)  comment "最后登录IP", -- 最后登录IP
`lastTime`	datetime comment "最后登录时间",	-- 最后登录时间
`userStatus` tinyint(4) default 1 check(userStatus in(0,1)), -- "账号状态 	0:停用 1:启用"
`dataFlag`	tinyint(4) default 1 check(dataFlag in (1,-1)), -- "删除标志 	-1:删除 1:有效"
`createTime` datetime not null -- 创建时间
) default charset=utf8

-- 用户地址表
drop table userAddress
create table userAddress(
 addressId int(11) AUTO_INCREMENT primary key comment "自增ID  地址ID",
 userId int(11) not null comment "自增ID  用户ID(外键 引用users表中的主键userId)",
 userName varchar(50) not null comment "收货人名称",
 userPhone varchar(20) not null comment "收货人手机",
 userAdd varchar(255) not null comment "详细地址",
 isDefault tinyint(4) default 0 check(isDefault in(0,1)), -- comment "是否默认地址 	0:否 1:是"
 dataFlag tinyint(4) default 1 check(dataFlag in(-1,1)),-- comment "有效状态 	1：有效 -1：无效"
 createTime datetime not  null  comment "创建时间",
 foreign key(userId) references users(userId)
) default charset=utf8


-- 银行表（wfzy_banks）
create table banks(
bankId    int(11)  AUTO_INCREMENT primary  key  comment "自增ID  银行ID" ,
bankName   varchar(50)  not null   comment "银行名称" ,
dataFlag   tinyint(4)   default 1  not null   comment "有效状态  1:有效 -1:无效" ,
createTime   datetime   comment "创建时间" 
) default charset=utf8
-- 店铺-----------------------------------------------------------------------------------------------------
select * from shopClassify
-- 店铺分类表（wfzy_shop_classify）
create table shopClassify(
shopClassifyId  int(11)  AUTO_INCREMENT primary  key  comment "自增ID 店铺分类" ,
parentId  int(11)  not null  comment "父ID" , 
shopClassifyName   varchar(100)  not null  comment "分类名称" ,
shopClassifySort   int(11)  default 0 comment "排序号" ,
dataFlag   tinyint(4) default 1  comment "删除标志 1:有效 -1：删除" ,
createTime  datetime   not null  comment "建立时间"
) default charset=utf8


-- 店铺表（wfzy_shops）
drop table shops
create table shops(
shopId    int(11)  AUTO_INCREMENT primary  key  comment "自增ID  店铺ID" ,  
shopClassifyId int(11) not null comment "分类Id",
shopSn   varchar(20)  not null  comment "门店编号" ,
userId   int(11)  not null  comment "门店所有人ID (外键 引用users表中的主键userId)" , 
isSelf  tinyint(4)   default 0  not null   comment "是否自营 	1:自营 0:非自营" ,
shopName  varchar(100)   not null   comment "门店名称" ,
shopkeeper  varchar(50)  not null   comment "店主" ,
shopTelephone  varchar(20)   not null   comment "店主手机号" ,
shopImg  varchar(150)   not null   comment "门店图标" ,
shopWangWang   varchar(50)   not null   comment "旺旺号" ,
shopAddress  varchar(255)    not null   comment "门店地址" ,
bankId  int(11)   not null   comment "银行ID(外键 引用banks表中的主键bankId)" , 
bankNo  varchar(20)   not null   comment "银行卡号" ,
bankUserName  varchar(50)    not null   comment "银行卡所有人名称" ,
isInvoice  tinyint(4)   default 0  not null   comment "能否开发票 	1:能 0:不能" ,
invoiceRemarks   varchar(255)    comment "发票说明" ,
serviceStartTime   time   default '08:30:00'   not null   comment "服务开始营业时间" ,
serviceEndTime   time   default '22:30:00'   not null   comment "服务停止营业时间" ,
shopAtive    tinyint(4)   default 0  not null   comment "门店工作状态 	1:营业中 0：休息中" ,
shopStatus   tinyint(4)   default 0  not null   comment "门店状态 	-2:已停止 -1:拒绝 0：未审核 1:已审核" ,
statusDesc   varchar(255)    comment "状态说明 	一般用于停止和拒绝说明" ,
dataFlag   tinyint(4)   default 1  not null   comment "删除标志  -1:删除 1:有效" ,
createTime   datetime   not null   comment "创建时间" ,
shopMoney  decimal(11,2)   default 0.00   comment "商家钱包" ,
lockMoney  decimal(11,2)   default 0.00   comment "冻结金额" ,
noSettledOrderNum   int(11)  default 0    comment "未结算的订单数" ,
foreign key(userId) references users(userId),
foreign key(bankId) references banks(bankId),
foreign key(shopClassifyId) references shopClassify(shopClassifyId)
) default charset=utf8

select * from shopapplys
-- ----开店申请表（wst_shop_applys）
drop table shopapplys
create table shopApplys(
ShoppApplyId   int(11) AUTO_INCREMENT  primary  key  comment "自增ID  开店申请ID" , 
userId   int(11)   not null comment "申请用户ID (外键 引用users表中的主键userId)" , 
linkman   varchar(50)   not null  comment "联系人" ,
phoneNo   varchar(50)   not null  comment "手机号码" ,
applyDesc   varchar(255)   not null  comment "申请说明" ,
applyStatus  tinyint(4)  default 0  not null  comment "状态 	-1:申请失败 0:申请中 1:已处理" ,
handleDesc   text  comment "处理结果说明" ,
shopId   int(11)    not null  comment "申请开通的店铺Id (外键 引用shops表中的主键shopId)" ,
dataFlag   tinyint(4)  default 1  not null  comment "删除标志 	-1:删除 1:有效" ,
createTime  datetime  not null  comment "创建时间" ,
foreign key(userId) references users(userId),
foreign key(shopId) references shops(shopId)
) default charset=utf8

-- 店铺评分表（wfzy_shop_scores）
drop table shopScores
create table shopScores(
scoreId   int(11) AUTO_INCREMENT  primary  key  comment "自增ID 店铺评分ID" ,
shopId   int(11)  not null  comment "店铺Id (外键 引用shops表中的主键shopId)" ,  
totalScore  int(11)  default 0.0 comment "总评分" , 
totalUsers  int(11)  default 0  comment "总评评分用户数" , 
goodsScore  int(11)  default 0.0  comment "商品评分" , 
goodsUsers  int(11)  default 0  comment "商品评分用户数" , 
serviceScore  int(11)  default 0  comment "服务评分" , 
serviceUsers  int(11)  default 0 comment "服务评分用户数" , 
timeScore  int(11)  default 0  comment "时效评分" , 
timeUsers  int(11)  default 0  comment "时效评分用户数" , 
foreign key(shopId) references shops(shopId)
) default charset=utf8


-- 商品-----------------------------------------------------------------------------------------------------
-- 商品分类表  （wfzy_goods_classify）
drop table goodsClassify
create table goodsClassify(
goodsClassifyId   int(11) AUTO_INCREMENT  primary  key  comment "自增ID  商品分类ID" , 
goodsClassifyParentId   int(11)  not null comment "父ID" ,
goodsClassifyName  varchar(20)  not null comment "分类名称" ,
goodsClassifySort  int(11)  default 0 comment "排序号" ,
dataFlag tinyint(4) default 1 comment "删除标志 1 有效 -1：删除",
createTime  datetime  not null comment "建立时间" 
) default charset=utf8


-- 商品表  （wfzy_goods）
drop table goods
create table goods(
goodsId  int(11)  AUTO_INCREMENT primary  key  comment "自增ID  商品ID" , 
shopId  int(11)  not null  comment "自增ID  店铺ID(外键 引用shops表中的主键shopId)",
goodsClassifyId int(11) not null comment "商品分类ID",
goodsSn  varchar(20)  not null  comment "商品编号" ,
productNo  varchar(20)  not null  comment "商品货号" ,
goodsName  varchar(50)  not null  comment "商品名称" ,
goodsImg  varchar(250)  not null  comment "商品图片" ,
goodsDesc  text  not null  comment "商品描述" ,
goodsStatus  tinyint(4) default 0  not null  comment "商品状态 	-1:违规 0:未审核 1:已审核" , 
saleTime  datetime  not null  comment "上架时间" ,
visitNum  int(11)   default 0 comment "访问量" ,
appraiseNum   int(11)   default 0 comment "评价数",
marketPrice  decimal(11,2)  default 0.00 not null  comment "市场价" ,
shopPrice  decimal(11,2)  default 0.00  not null comment "门店价" ,
saleNum  int(11)  default 0  not null  comment "总销售量" ,
goodsStock  int(11)  default 0  not null  comment "商品总库存量" , 
isSale  tinyint(4) default 1  not null  comment "是否上架 	0:不上架 1:上架" ,  
isBest  tinyint(4) default 0  not null  comment "是否精品 	0:否 1:是" , 
isHot  tinyint(4) default 0  not null  comment "是否热销产品 	0:否 1:是" , 
isNew  tinyint(4) default 0  not null  comment "是否新品 	0:否 1:是" ,
isRecom   tinyint(4) default 0   comment "是否推荐 	0:否 1:是" ,
dataFlag  tinyint(4)  default 1  comment "删除标志 	-1:删除 1:有效" ,
gallery  text	comment "商品相册" ,
createTime  datetime  not null  comment "创建时间",
foreign key(shopId) references shops(shopId),
foreign key(goodsClassifyId) references goodsClassify(goodsClassifyId)
) default charset=utf8

-- 购物车表（wfzy_shopping_carts）
drop table shoppingCarts
create table shoppingCarts(
shoppingCarts  int(11)  AUTO_INCREMENT  primary  key  comment "自增ID  购物车ID",
userId   int(11)  default 0    comment "用户ID(外键 引用users表中的主键userId)",
isCheck   tinyint(4)   default 1  not null  comment "是否选中  0:未选中 1：选中",
goodsId   int(11)  default  0 not null  comment "商品ID(外键 引用goods表中的主键goodsId)",
cartNum   int(11)  default  0 comment "商品数量" ,
foreign key(userId) references users(userId),
foreign key(goodsId) references goods(goodsId)
) default charset=utf8





-- 快递表 （wfzy_express）
drop table express
create table express(
expressId   int(11) AUTO_INCREMENT   primary  key  comment "自增ID  快递ID" ,  
expressName  varchar(50)  not null  comment "快递名称" , 
dataFlag  tinyint(4)  default 1  not null   comment "删除标志 	1：有效 -1：删除" 
) default charset=utf8

--  订单结算表（wfzy_settlements）
drop table settlements
create table settlements(
settlementId  int(11)  AUTO_INCREMENT primary  key  comment "自增ID  订单结算ID" , 
settlementNo  varchar(20)  not null   comment "结算单号" ,
settlementType  tinyint(4)  default 0  not null  comment "结算类型  0：手工结算 1:即时结算" ,
shopId   int(11)   not null  comment "店铺ID(外键 引用shops表中的主键shopId)" , 
accName  varchar(100)  not null   comment "商家开卡银行" ,
accNo   varchar(50)  not null   comment "商家卡号" ,
accUser  varchar(100)  not null   comment "商家持卡人姓名" ,  
areaName    varchar(100)  not null   comment "商家开卡地区" ,  
settlementMoney   decimal(11,2)  default 0.00  not null   comment "商品总金额" ,  
settlementStatus  tinyint(4)  default 0  not null   comment "结算状态 	0:申请结算 1:已结算" , 
settlementTime  datetime  comment "结算处理时间" ,
remarks   varchar(255)   comment "结算备注（商城填写）" ,
createTime   datetime   not null   comment "结算单申请时间" ,
foreign key(shopId) references shops(shopId)
) default charset=utf8


-- 订单---------------------------------------------------------------------------------------------------------------------------
-- 订单表 （wfzy_orders）
create table orders(
orderId  int(11)  AUTO_INCREMENT primary  key  comment "自增ID  订单ID",
orderNo   varchar(50)  not null  comment "订单号编号" , 
shopId   int(11)   not null  comment "店铺ID(外键 引用shops表中的主键shopId)",
userId   int(11)  not null  comment "用户ID(外键 引用users表中的主键userId)" ,
orderStatus  tinyint(4)   default -2  not null  comment "订单状态 	-3:用户拒收 -2:未付款的订单 -1：用户取消 0:待发货 1:配送中 2:用户确认收货" , 
goodsMoney  decimal(11,2)  not null  comment "商品总金额 	商品总价格--未进行任何折扣的总价格" ,
deliverType  tinyint(4)   default 0  not null  comment "收货方式 	0:送货上门 1:自提" ,
deliverMoney  decimal(11,2)  default 0.00   not null  comment "运费 	运费规则按照每家店的规则算。" ,
totalMoney  decimal(11,2)   not null  comment "订单总金额 	包括运费" ,
realTotalMoney  decimal(11,2)  default 0.00   not null  comment "实际订单总金额 	进行各种折扣之后的金额" ,
payType   tinyint(4)   default 0  not null  comment "支付方式 	0:货到付款 1:在线支付" ,
payFrom   int(11)   default 0  not null  comment "支付来源 	1:支付宝，2：微信" ,
isPay   tinyint(4)   default 0  not null  comment "是否支付 	0:未支付 1:已支付" ,
userName   varchar(20)   not null  comment "收货人名称" ,
userAddress  varchar(255)   not null  comment "收件人地址" ,
userPhone  varchar(15)   comment "收件人手机" ,
isInvoice    tinyint(4)   default 0  not null  comment "是否需要发票 	1:需要 0:不需要" ,
orderRemarks   varchar(255)  comment "订单备注" ,
orderSrc   tinyint(4)   default 0  not null  comment "订单来源   0:商城 1:微信 2:手机版 3:安卓App 4:苹果App" ,
isRefund  tinyint(4)   default 0  not null  comment "是否退款 	0:否 1：是" ,
isAppraise  tinyint(4)   default  0 not null  comment "是否点评 	0:未点评 1:已点评" ,
cancelReason  int(11)  default 0   comment "取消原因ID" ,
rejectReason  int(11)  default 0   comment "拒收原因ID" ,
rejectOtherReason   varchar(255)   comment "拒收原因" ,
isClosed   tinyint(4)   default 0  not null  comment "是否订单已完结 	0：未完结 1:已完结" ,
orderunique  varchar(50)   not null  comment "订单流水号" ,
settlementId   int(11)   not null  comment "是否结算，大于0的话则是结算ID  settlementId(外键  引用settlements表中的主键settlementId)" ,  
receiveTime   datetime  comment "收货时间" ,
deliveryTime   datetime  comment "发货时间" ,
expressNo  varchar(20)    comment "快递号" ,
expressId int(11) not null comment "快递公司Id",
tradeNo   varchar(100)   comment "在线支付交易流水" ,
dataFlag    tinyint(4)   default 1  not null  comment "订单有效标志  -1：删除 1:有效" ,
createTime   datetime   not null  comment "下单时间" ,
foreign key(shopId) references shops(shopId),
foreign key(userId) references users(userId),
foreign key(settlementId) references settlements(settlementId),
foreign key(expressId) references express(expressId)
) default charset=utf8

-- 商品评论表 （wfzy_goods_comment）
drop table goodsComment
create table goodsComment(
commentId   int(11)  AUTO_INCREMENT primary  key  comment "自增ID  商品评论ID" ,  
shopId  int(11)     not null  comment "店铺ID(外键 引用shops表中的主键shopId)" ,  
orderId  int(11)    not null  comment "订单ID(外键 引用orders表中的主键orderId)" , 
goodsId  int(11)    not null  comment "（评价对象ID）商品ID(外键 引用goods表中的主键goodsId)" ,  
userId   int(11)    not null comment "用户ID(外键 引用users表中的主键userId)" ,
goodsScore  int(11)  default 0  not null  comment "商品评分" , 
serviceScore   int(11)  default 0  not null  comment "服务评分" , 
timeScore   int(11)  default 0 not null  comment "时效评分" , 
content  text  not null  comment "点评内容" , 
shopReply   text  not null  comment "店铺回复" , 
images  text  not null  comment "上传图片" ,
isShow  tinyint(4) default 1  not null  comment "是否显示  1:显示 0:隐藏" ,
dataFlag  tinyint(4) default 1  not null  comment "有效状态 	1:有效 -1:无效" ,
createTime  datetime  not null  comment "创建时间" ,
replyTime   date  comment "商家回复时间" ,
foreign key(shopId) references shops(shopId),
foreign key(orderId) references orders(orderId),
foreign key(goodsId) references goods(goodsId),
foreign key(userId) references users(userId)
) default charset=utf8

-- 订单商品表（wfzy_order_goods）
create table orderGoods(
orderGoodsId   int(11) AUTO_INCREMENT  primary  key  comment "自增ID  订单商品ID" ,
orderId  int(11)  not null  comment "订单ID(外键 引用orders表中的主键orderId)" ,
goodsId  int(11)  not null  comment "商品ID(外键 引用goods表中的主键goodsId)" ,  
goodsNum   int(11)  default 0   not null  comment "商品数量" ,  
goodsPrice  decimal(11,2)  default 0.00   not null  comment "商品价格" ,  
goodsName  varchar(50)  not null   comment "商品名称" , 
goodsImg   varchar(150)  not null   comment "商品图" , 
foreign key(orderId) references orders(orderId),
foreign key(goodsId) references goods(goodsId)
) default charset=utf8

--  订单退款记录表（wfzy_order_refunds）
create table orderRefunds(
orderRefundsId   int(11) AUTO_INCREMENT  primary  key  comment "自增ID  订单退款记录ID" ,  
orderId  int(11)  not null comment "订单ID(外键 引用orders表中的主键orderId)" ,  
refundTo  int(11)  default 0   not null  comment "接收退款用户" ,  
refundTradeNo   varchar(100)   comment "退款流水号" ,
refundRemark  varchar(400)   not null  comment "退款备注" ,
refundTime   datetime   not null  comment "退款时间" ,
refundReson  int(11)  default 0   not null  comment "用户申请退款原因ID" ,  
refundOtherReson   varchar(255)   comment "用户申请退款原因" ,  
backMoney  decimal(11,2)   default 0.00   not null  comment "用户退款金额" , 
shopRejectReason  varchar(255)   comment "店铺不同意拒收原因" ,  
refundStatus  tinyint(4)  default 0  not null  comment "退款状态" ,
createTime   datetime   not null  comment "用户申请退款时间" ,
foreign key(orderId) references orders(orderId)
) default charset=utf8


--


