package com.decorate.ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 这里将用户输入的日期类型转化为年月日 时分秒的格式
 * 利用convert方法可以对其他格式的数据类型进行转换
 * @author Silence
 *
 */
public class DateConvert implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = simpleDateFormat.parse(source);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
