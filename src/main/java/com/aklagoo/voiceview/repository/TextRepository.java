package com.aklagoo.voiceview.repository;
import org.springframework.data.repository.Repository;
import java.util.Optional;

public interface TextRepository extends Repository<Text, Long> {
    Text save(Text text);
    Optional<Text> findById(Long id);
}
