

package com.example.sun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sun.pojo.AppointmentApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface AppointmentApplyMapper extends BaseMapper<AppointmentApply>
{

     List selectPdfList(@Param("ybid") String s);

    List selectPdfByYytm(@Param("ybid")String s);

    List selectPdfUrl(String s, String s1, String s2);

    List<AppointmentApply> selectPdfBySfzh(@Param("ybid")String ybid);
}
