package cn.yukismimi.service;

import cn.yukismimi.entity.Status;

import java.util.List;

public interface StatusService {

    void addStatus(Status status);

    void removeStatusById(int id);

    void modifyStatus(Status status);

    Status findById(int id);

    Status findByName(String name);

    List<Status> findStatusList();
}
