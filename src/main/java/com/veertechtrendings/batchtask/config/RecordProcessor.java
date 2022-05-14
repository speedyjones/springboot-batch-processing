package com.veertechtrendings.batchtask.config;

import com.veertechtrendings.batchtask.Records;
import org.springframework.batch.item.ItemProcessor;

public class RecordProcessor implements ItemProcessor<Records,Records> {
    @Override
    public Records process(Records records) throws Exception {
        return records;
    }
}
