package uniform.sierra.hellospringboot.domain.repository;

import org.apache.ibatis.annotations.Mapper;

import uniform.sierra.hellospringboot.domain.model.HelloHistory;

@Mapper
public interface HelloHistoryRepository {
    void insert(HelloHistory entity);

    void update(HelloHistory entity);

    HelloHistory selectByName(String name);
}
