package pengstore.tk.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pengstore.tk.common.utils.PageUtils;
import pengstore.tk.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author jiapeng
 * @email jiape123456@gmail.com
 * @date 2020-07-28 13:30:46
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

