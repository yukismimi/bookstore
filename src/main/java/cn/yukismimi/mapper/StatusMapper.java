package cn.yukismimi.mapper;

import cn.yukismimi.entity.Status;

import java.util.List;

public interface StatusMapper {

    void addStatus(Status status);

    void removeStatusById(int id);

    void modifyStatus(Status status);

    Status findById(int id);

    Status findByName(String name);

    List<Status> findStatusList();
}
