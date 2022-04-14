package com.home.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        DateFormat format = null;
        try {
            if(StringUtils.isEmpty(s)){
                throw new NullPointerException("请输入要转换的日期");
            }
            format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(s);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("输入日期有误");
        }
    }
}
