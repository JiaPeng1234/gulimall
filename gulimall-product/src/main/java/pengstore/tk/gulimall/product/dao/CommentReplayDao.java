package pengstore.tk.gulimall.product.dao;

import pengstore.tk.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jiapeng
 * @email jiape123456@gmail.com
 * @date 2020-07-27 19:19:37
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
