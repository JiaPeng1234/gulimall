package pengstore.tk.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pengstore.tk.common.utils.PageUtils;
import pengstore.tk.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author jiapeng
 * @email jiape123456@gmail.com
 * @date 2020-07-27 19:19:38
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

