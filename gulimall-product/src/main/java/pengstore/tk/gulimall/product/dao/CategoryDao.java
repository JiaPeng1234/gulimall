package pengstore.tk.gulimall.product.dao;

import pengstore.tk.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jiapeng
 * @email jiape123456@gmail.com
 * @date 2020-07-27 19:19:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
