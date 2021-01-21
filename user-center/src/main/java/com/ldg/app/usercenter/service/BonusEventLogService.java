package com.ldg.app.usercenter.service;

import com.ldg.app.usercenter.entity.BonusEventLog;
import java.util.List;

/**
 * 积分变更记录表(BonusEventLog)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 16:51:03
 */
public interface BonusEventLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BonusEventLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BonusEventLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bonusEventLog 实例对象
     * @return 实例对象
     */
    BonusEventLog insert(BonusEventLog bonusEventLog);

    /**
     * 修改数据
     *
     * @param bonusEventLog 实例对象
     * @return 实例对象
     */
    BonusEventLog update(BonusEventLog bonusEventLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}