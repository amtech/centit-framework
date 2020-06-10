package com.centit.framework.core.controller;

import com.centit.support.algorithm.DatetimeOpt;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.util.Date;

public class DatePropertiesEditor extends PropertiesEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.isBlank(text)) {
            super.setValue(null);
        } else {
            Date value = DatetimeOpt.smartPraseDate(text);
            setValue(value);
        }
    }

}
