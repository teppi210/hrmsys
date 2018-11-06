package com.lss.hrmsys.entity.dao;

import java.util.List;
import java.util.Map;

import com.lss.hrmsys.entity.model.Position;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionDao {

    /** 根据条件查询职位
     *
     * @param map
     * @return
     */
    public List<Position> findPositions(Map<String, Object> map);

    /** 根据条件查询职位数量
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加职位
     *
     * @param position
     * @return
     */
    public Integer addPosition(Position position);

    /** 修改职位
     *
     * @param position
     * @return
     */
    public Integer updatePosition(Position position);

    /** 删除职位
     *
     * @param id
     * @return
     */
    public Integer deletePosition(Integer id);
}