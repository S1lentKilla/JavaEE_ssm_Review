package com.haust.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DataConverter implements Converter<String, Date> {
    private String datePattern = "yyyy-MM-dd";
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(s);
        } catch (Exception e) {
            throw new IllegalArgumentException("无效的日期格式，请使用这种格式："+datePattern);
        }
    }
}
