package com.oscarlin.backend.entity.service;

import com.oscarlin.backend.entity.domain.Group;

import java.util.List;

public interface GroupService {
    Group saveGroup(Group group);
    Group updateGroup(Group group);
    Group findGroupById(String id);
    List<Group> findAll();
    void deleteGroup(String id);
}
