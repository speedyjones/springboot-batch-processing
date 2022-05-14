package com.veertechtrendings.batchtask.respository;

import com.veertechtrendings.batchtask.Records;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Records, Integer> {
}
