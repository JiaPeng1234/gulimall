package pengstore.tk.gulimall.coupon.dao;

import pengstore.tk.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author jiapeng
 * @email jiape123456@gmail.com
 * @date 2020-07-28 13:30:46
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
