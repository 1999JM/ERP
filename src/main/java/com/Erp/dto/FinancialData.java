package com.Erp.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class FinancialData {

    private int draw;
    private int recordsTotal;
    private int recordsFiltered;

    private List<FinancialDto> data;

    public List<FinancialDto> getData(){

        if(CollectionUtils.isEmpty(data)){

            data = new ArrayList<FinancialDto>();
        }

        return data;
    }
}
